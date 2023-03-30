package com.sofkau.ui;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaSeleccionarProductoBuscado  {


    public static final Target CLIQUEABLE_FILTRAR_PRODUCTO = Target.the("Click en filtrar producto")
            .located(By.cssSelector(".vtex-search-result-3-x-orderByText"));
    public static final Target CLIQUEABLE_PRODUCTO_MENOR_COSTO = Target.the("Click en menor costo")
            .located(By.cssSelector("button.hover-bg-muted-5:nth-child(5)"));





}
