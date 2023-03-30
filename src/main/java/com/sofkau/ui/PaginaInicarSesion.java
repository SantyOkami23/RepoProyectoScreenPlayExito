package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicarSesion {
    public static final Target BOTON_INICIAR_SESION = Target.the("Boton para iniciar sesion")
            .located(By.cssSelector(".vtex-menu-2-x-styledLinkIcon.vtex-menu-2-x-styledLinkIcon--header-link.mh2"));

    public static final Target SELECCION_METODO_INGRESO = Target.the("campo usuario")
            .located(By.xpath("(//li[contains(@class,'vtex-login-2-x-optionsListItem mb3')])[2]"));

    public static final Target CAMPO_EMAIL = Target.the("Campo email iniciar sesion")
            .located(By.xpath("(//input[contains(@placeholder,'Ingresa tu email')])[1]"));


    public static final Target CAMPO_CONTRASENNA= Target.the("Campo contrasenna iniciar sesion")
            .located(By.xpath("//input[@type='password']"));

    public static final Target BOTON_INGRESAR_CUENTA= Target.the("Boton ingresar cuenta")
            .located(By.xpath("//span[contains(text(), 'Entrar')]"));




}
