package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDetallesDeTuCompra {
    public static final Target TEXTO_DETALLER_DE_TU_COMPRA = Target.the("Mensaje de detalles de tu compra")
            .located(By.xpath("(//strong[normalize-space()='Detalles de tu compra'])[1]"));

}
