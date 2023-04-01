package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PopUpSeleccionarTipoEnvio {

    public static final Target CLICK_SELECCIONAR_TIPO_ENVIO = Target.the("Seleccionar tipo de envio")
            .located(By.xpath("//span[@class='exito-geolocation-3-x-addressResult']"));

    public static final Target DESPLEGABLE_SELECCIONAR_CIUDAD = Target.the("Seleccionar ciudad")
            .located(By.xpath("//input[@aria-autocomplete='list']"));

    public static final Target DESPLEGABLE_SELECCIONAR_TIENDA = Target.the("Seleccionar tienda")
            .located(By.xpath("(//input[@type='text' and @aria-autocomplete='list'])[2]"));





    public static final Target BOTON_CONFIRMAR_TIPO_ENVIO = Target.the("Boton seleccionar tipo de envio")
            .located(By.xpath("//button[normalize-space()='Confirmar']"));
    public static final Target CLICK_CERRAR_POP = Target.the("Cerrar PopUp Selección de tipo de envio")
            .located(By.xpath("//*[name()='path' and contains(@data-name,'Path 373')]"));
}
