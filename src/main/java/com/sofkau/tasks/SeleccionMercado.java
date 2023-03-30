package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.PaginaInicarSesion.*;
import static com.sofkau.ui.PaginaInicarSesion.BOTON_INGRESAR_CUENTA;
import static com.sofkau.ui.PaginaSeccionCuenta.*;

public class SeleccionMercado  implements Task {

    public String TipoMercado= "Mortadela";



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CAMPO_BUSCAR_PRODUCTO),
                Enter.theValue(TipoMercado).into(CAMPO_BUSCAR_PRODUCTO),
                Click.on(BOTON_LUPA_BUSCAR_PRODUCTO),
                Hit.the(Keys.ENTER).into(CAMPO_BUSCAR_PRODUCTO)
               // WaitUntil.the(BOTON_LUPA_BUSCAR_PRODUCTO, isClickable).forNoMoreThan(10).seconds()



        );
    }

    public static SeleccionMercado seleccionMercado(){
        return new SeleccionMercado();
    }
}
