package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaIrAPagar {

    public static final Target CLICK_IR_A_PAGAR = Target.the("Ir a pagar lo que hay en el carrito de compra")
            .located(By.id("cart-to-orderform"));
}
