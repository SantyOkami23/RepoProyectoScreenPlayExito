package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaDirigirseAlCarrito.CLICK_DIRIGIRSE_AL_CARRITO;

public class DigirseAlCarrito  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(CLICK_DIRIGIRSE_AL_CARRITO)
        );
    }

    public static DigirseAlCarrito digirseAlCarrito(){
        return new DigirseAlCarrito();
    }
}
