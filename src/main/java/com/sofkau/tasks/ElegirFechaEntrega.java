package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaDirigirseAlCarrito.CLICK_DIRIGIRSE_AL_CARRITO;
import static com.sofkau.ui.PaginaElegirFechaEntrega.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class ElegirFechaEntrega  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BOTON_SELECCIONAR_FECHA_ENTREGA),
                WaitUntil.the(BOTON_SELECCIONAR_FECHA_ENTREGA, isCurrentlyVisible()),
                WaitUntil.the(BOTON_SELECCIONAR_FECHA_ENTREGA, isCurrentlyEnabled()),
                WaitUntil.the(BOTON_SELECCIONAR_FECHA_ENTREGA, isClickable()),
                Click.on(BOTON_SELECCIONAR_FECHA_ENTREGA),


                // Parte de seleccionar fecha
                WaitUntil.the(CALENDARIO_DIA, isCurrentlyVisible()),
                WaitUntil.the(CALENDARIO_DIA, isCurrentlyEnabled()),
                WaitUntil.the(CALENDARIO_DIA, isClickable()),
                Click.on(CALENDARIO_DIA),


                WaitUntil.the(BOTON_CONTINUAR_FECHA_ENTREGA, isCurrentlyVisible()),
                WaitUntil.the(BOTON_CONTINUAR_FECHA_ENTREGA, isCurrentlyEnabled()),
                WaitUntil.the(BOTON_CONTINUAR_FECHA_ENTREGA, isClickable()),
                Click.on(BOTON_CONTINUAR_FECHA_ENTREGA)

        );


    }

    public static ElegirFechaEntrega elegirFechaEntrega(){
        return new ElegirFechaEntrega();
    }
}
