package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.sofkau.ui.PaginaSeleccionarProductoBuscado.CLIQUEABLE_FILTRAR_PRODUCTO;
import static com.sofkau.ui.PaginaSeleccionarProductoBuscado.CLIQUEABLE_PRODUCTO_MENOR_COSTO;
import static com.sofkau.ui.PopUpSeleccionarTipoEnvio.CLICK_CERRAR_POP;

public class FiltrarProductoMenorPrecio  implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on (CLIQUEABLE_FILTRAR_PRODUCTO),
                Click.on(CLIQUEABLE_PRODUCTO_MENOR_COSTO)
        );
    }

    public static FiltrarProductoMenorPrecio filtrarProductoMenorPrecio(){
        return new FiltrarProductoMenorPrecio();
    }
}
