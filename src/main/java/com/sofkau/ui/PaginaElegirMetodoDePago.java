package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaElegirMetodoDePago {

    public static final Target BOTON_METODO_PAGO_PSE = Target.the("Forma de pago por pse")
            .located(By.xpath("//span[text()='PSE']"));

    public static final Target BOTON_FINALIZAR_PAGO = Target.the("Forma de pago por pse")
            .located(By.xpath("(//button[@id='payment-data-submit'])[2]"));



}
