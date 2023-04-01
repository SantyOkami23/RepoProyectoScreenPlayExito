package com.sofkau.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.PopUpSeleccionarTipoEnvio.*;

public class SeleccionarTipoDeEnvio  implements Task {

    String seleccionarCiudad ;
    String seleccionarTiendaCiudad  ;

    public SeleccionarTipoDeEnvio enseleccionarCiudad(String seleccionarCiudad){
        this.seleccionarCiudad=seleccionarCiudad;
        return this;
    }

    public SeleccionarTipoDeEnvio enseleccionarTiendaCiudad(String seleccionarTiendaCiudad){
        this.seleccionarTiendaCiudad=seleccionarTiendaCiudad;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on (CLICK_SELECCIONAR_TIPO_ENVIO),

                Click.on(DESPLEGABLE_SELECCIONAR_CIUDAD),
                Enter.theValue(seleccionarCiudad).into(DESPLEGABLE_SELECCIONAR_CIUDAD),
                Hit.the(Keys.ENTER).into(DESPLEGABLE_SELECCIONAR_CIUDAD),


                Click.on(DESPLEGABLE_SELECCIONAR_TIENDA),
                Enter.theValue(seleccionarTiendaCiudad).into(DESPLEGABLE_SELECCIONAR_TIENDA),
                Hit.the(Keys.ENTER).into(DESPLEGABLE_SELECCIONAR_TIENDA),

                Click.on(BOTON_CONFIRMAR_TIPO_ENVIO),
                Click.on(CLICK_CERRAR_POP)
        );
    }




    public static SeleccionarTipoDeEnvio seleccionarTipoDeEnvio(){
        return new SeleccionarTipoDeEnvio();
    }
}
