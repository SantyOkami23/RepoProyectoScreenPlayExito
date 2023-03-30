package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PopUpSeleccionarTipoEntrega {

    public static final Target DESPLEGABLE_SELECCIONAR_CIUDAD = Target.the("Click en menor costo")
            .located(By.xpath("//input[@aria-autocomplete='list']"));

    public static final Target DESPLEGABLE_SELECCIONAR_TIENDA = Target.the("Click en menor costo")
            .located(By.xpath("//input[@aria-autocomplete='list']"));
}
