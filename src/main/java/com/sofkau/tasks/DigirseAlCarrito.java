package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaAgregarProductoCarrito.CLICK_SELECCIONAR_PRIMER_PRODUCTO;
import static com.sofkau.ui.PaginaDirigirseAlCarrito.CLICK_DIRIGIRSE_AL_CARRITO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class DigirseAlCarrito  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CLICK_DIRIGIRSE_AL_CARRITO, isCurrentlyVisible()),
                WaitUntil.the(CLICK_DIRIGIRSE_AL_CARRITO, isCurrentlyEnabled()),
                WaitUntil.the(CLICK_DIRIGIRSE_AL_CARRITO, isClickable()),

                Click.on(CLICK_DIRIGIRSE_AL_CARRITO)
        );
    }

    public static DigirseAlCarrito digirseAlCarrito(){
        return new DigirseAlCarrito();
    }
}
