package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaSeccionCuenta.SELECCION_BOTON_MERCADO;

public class SeleccionMercado  implements Task {

    public String TipoMercado= "Mortadela";

    @Override
    public <T extends Actor> void performAs(T actor) {
        Click.on(SELECCION_BOTON_MERCADO);
        Enter.theValue(TipoMercado).into(SELECCION_BOTON_MERCADO);

    }

    public static SeleccionMercado seleccionMercado(){
        return new SeleccionMercado();
    }
}
