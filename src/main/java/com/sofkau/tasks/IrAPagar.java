package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaAgregarProductoCarrito.CLICK_SELECCIONAR_PRIMER_PRODUCTO;
import static com.sofkau.ui.PaginaIrAPagar.CLICK_IR_A_PAGAR;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class IrAPagar  implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                WaitUntil.the(CLICK_IR_A_PAGAR, isCurrentlyVisible()),
                WaitUntil.the(CLICK_IR_A_PAGAR, isCurrentlyEnabled()),
                WaitUntil.the(CLICK_IR_A_PAGAR,isClickable()),
                Click.on (CLICK_IR_A_PAGAR)

        );

    }

    public static IrAPagar irAPagar(){
        return new IrAPagar();
    }
}
