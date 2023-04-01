package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaAgregarProductoCarrito.CLICK_SELECCIONAR_PRIMER_PRODUCTO;
import static com.sofkau.ui.PaginaSeleccionarProductoBuscado.CLIQUEABLE_FILTRAR_PRODUCTO;
import static com.sofkau.ui.PaginaSeleccionarProductoBuscado.CLIQUEABLE_PRODUCTO_MENOR_COSTO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class AgregarProductoCarrito  implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CLICK_SELECCIONAR_PRIMER_PRODUCTO, isCurrentlyVisible()),
                WaitUntil.the(CLICK_SELECCIONAR_PRIMER_PRODUCTO, isCurrentlyEnabled()),
                WaitUntil.the(CLICK_SELECCIONAR_PRIMER_PRODUCTO,isClickable()),
                Click.on (CLICK_SELECCIONAR_PRIMER_PRODUCTO)
        );
    }

    public static AgregarProductoCarrito agregarProductoCarrito(){
        return new AgregarProductoCarrito();
    }
}
