package com.sofkau.ui;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDatosCompradorFinalizarCompra {

    public static final Target CAMPO_NOMBRE = Target.the("Campo nombre para finalizar la compra")
            .located(By.id("client-first-name"));

    public static final Target CAMPO_APELLIDOS = Target.the("Campo apellido para finalizar la compra")
            .located(By.id("client-last-name"));

    public static final Target CAMPO_CELULAR = Target.the("Campo celular para finalizar la compra")
            .located(By.id("client-phone"));

    public static final Target CAMPO_NUMERO_CEDULA = Target.the("Campo numero de cedula para finalizar la compra")
            .located(By.id("client-new-document"));

    public static final Target CLICK_ACEPTO_TERMINOS_CONDICIONES = Target.the("Click en aceptar terminos  para finalizar la compra")
            .located(By.xpath("(//input[@type='checkbox'])[3]"));

    public static final Target CLICK_AUTORIZO_TRATAMIENTO_DATOS= Target.the("Click en autotizo tratamiento de datos  para finalizar la compra")
            .located(By.xpath("(//input[@type='checkbox'])[4]"));

    public static final Target CLICK_BOTON_CONTINUAR = Target.the("Boton continuar para finalizar la compra")
            .located(By.id("go-to-shipping"));


}
