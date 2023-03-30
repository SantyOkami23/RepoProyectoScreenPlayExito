package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.type.TypeValue;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.PaginaInicarSesion.*;


public class IniciarSesion implements Task {
    private String usuariPrueba ;
    private String contrasennaPrueba;

    public IniciarSesion conElUsuario(String usuariPrueba){
        this.usuariPrueba=usuariPrueba;
        return this;
    }

    public IniciarSesion yConLaContrasenna(String contrasennaPrueba){
        this.contrasennaPrueba=contrasennaPrueba;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_INICIAR_SESION),
                Click.on (SELECCION_METODO_INGRESO),
                Click.on (CAMPO_EMAIL),
                Enter.theValue(usuariPrueba).into(CAMPO_EMAIL),
                Enter.theValue(contrasennaPrueba).into(CAMPO_CONTRASENNA),
                Click.on(BOTON_INGRESAR_CUENTA)
        );
    }




    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}
