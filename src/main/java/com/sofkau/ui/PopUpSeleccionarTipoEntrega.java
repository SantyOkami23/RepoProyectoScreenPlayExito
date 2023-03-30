package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PopUpSeleccionarTipoEntrega {

    public static final Target DESPLEGABLE_SELECCIONAR_CIUDAD = Target.the("Seleccionar ciudad")
            .located(By.xpath("//input[@aria-autocomplete='list']"));

    public static final Target DESPLEGABLE_SELECCIONAR_TIENDA = Target.the("Seleccionar tienda")
            .located(By.xpath("(//input[@type='text' and @aria-autocomplete='list'])[2]"));

    public static final Target CLICK_CERRAR_POP = Target.the("Cerrar PopUp")
            .located(By.xpath("//*[name()='path' and contains(@data-name,'Path 373')]"));
}
