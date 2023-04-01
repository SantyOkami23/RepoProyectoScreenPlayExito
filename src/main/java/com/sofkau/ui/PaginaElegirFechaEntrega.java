package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaElegirFechaEntrega {

    public static final Target BOTON_SELECCIONAR_FECHA_ENTREGA = Target.the("Campo para selecionar fecha de entrega")
            .located(By.id("scheduled-delivery-choose-CompraRecoge_Programado-(ptorecogida_054)"));

    public static final Target CALENDARIO_DIA = Target.the("Campo para selecionar  el dia de fecha de entrega")
            .located(By.xpath("//div[@aria-label='day-3']"));

    public static final Target BOTON_CONTINUAR_FECHA_ENTREGA= Target.the("Boton  para guardar la  fecha de entrega")
            .located(By.id("btn-go-to-payment"));



}
