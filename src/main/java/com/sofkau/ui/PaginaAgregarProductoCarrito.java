package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaAgregarProductoCarrito {

    public static final Target CLICK_SELECCIONAR_PRIMER_PRODUCTO = Target.the("Seleccionar tipo de envio")
            .located(By.xpath("(//span[@class='exito-vtex-components-4-x-buttonText' and text()='Agregar'])[1]"));
}
