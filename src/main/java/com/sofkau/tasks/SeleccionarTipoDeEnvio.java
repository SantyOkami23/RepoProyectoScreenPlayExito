package com.sofkau.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import static com.sofkau.ui.PaginaInicarSesion.*;
import static com.sofkau.ui.PopUpSeleccionarTipoEntrega.DESPLEGABLE_SELECCIONAR_CIUDAD;
import static com.sofkau.ui.PopUpSeleccionarTipoEntrega.DESPLEGABLE_SELECCIONAR_TIENDA;

public class SeleccionarTipoDeEnvio  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DESPLEGABLE_SELECCIONAR_CIUDAD),
                Hit.the(Keys.ENTER).into(DESPLEGABLE_SELECCIONAR_CIUDAD),
                Click.on(DESPLEGABLE_SELECCIONAR_TIENDA),
                Hit.the(Keys.ENTER).into(DESPLEGABLE_SELECCIONAR_TIENDA)
        );
    }

    public static SeleccionarTipoDeEnvio seleccionarTipoDeEnvio(){
        return new SeleccionarTipoDeEnvio();
    }
}
