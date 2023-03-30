package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.PaginaSeccionCuenta.*;

public class SeleccionMercado  implements Task {

    public String productoParaBuscar ;

    public SeleccionMercado buscaProducto(String productoParaBuscar){
        this.productoParaBuscar=productoParaBuscar;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_BUSCAR_PRODUCTO),
                Enter.theValue(productoParaBuscar).into(CAMPO_BUSCAR_PRODUCTO),
                Click.on(BOTON_LUPA_BUSCAR_PRODUCTO),
                Hit.the(Keys.ENTER).into(CAMPO_BUSCAR_PRODUCTO)

        );
    }

    public static SeleccionMercado seleccionMercado(){
        return new SeleccionMercado();
    }
}
