package com.sofkau.ui;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSeleccionarProductoBuscado  {

    public static final Target CLIQUEABLE_PRODUCTO_MENOR_COSTO = Target.the("Click en menor costo")
            .located(By.xpath("(//button[normalize-space()='Menor precio primero'])[1]"));

}
