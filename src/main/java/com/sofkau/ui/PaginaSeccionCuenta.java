package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSeccionCuenta {

    public static final Target SELECCION_BOTON_MERCADO= Target.the("Boton para ingresar a mercado")
            .located(By.cssSelector("input[placeholder='Buscar en exito.com']"));

}
