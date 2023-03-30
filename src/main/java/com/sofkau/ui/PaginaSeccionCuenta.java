package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSeccionCuenta {

    public static final Target CAMPO_BUSCAR_PRODUCTO= Target.the("Campo para ingresar el tipo de producto")
            .located(By.xpath("//input[@placeholder='Buscar en exito.com']"));

    public static final Target BOTON_LUPA_BUSCAR_PRODUCTO= Target.the("Cliqueable de la lupa para buscar producto")
            .located(By.xpath(" (//button[@class=' vtex-store-components-3-x-searchBarIcon vtex-store-components-3-x-searchBarIcon--search flex items-center pointer bn bg-transparent outline-0 pv0 pl0 pr3'])[1]"));

}
