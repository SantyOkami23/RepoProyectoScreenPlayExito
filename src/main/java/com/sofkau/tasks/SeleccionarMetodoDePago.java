package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaDatosCompradorFinalizarCompra.CAMPO_NOMBRE;
import static com.sofkau.ui.PaginaElegirMetodoDePago.BOTON_FINALIZAR_PAGO;
import static com.sofkau.ui.PaginaElegirMetodoDePago.BOTON_METODO_PAGO_PSE;

public class SeleccionarMetodoDePago implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(BOTON_METODO_PAGO_PSE),
                Click.on(BOTON_FINALIZAR_PAGO)


                );


    }

    public static SeleccionarMetodoDePago seleccionarMetodoDePago(){
        return new SeleccionarMetodoDePago();
    }
}
