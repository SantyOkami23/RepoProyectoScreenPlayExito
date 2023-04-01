package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.sofkau.ui.PaginaDetallesDeTuCompra.TEXTO_DETALLER_DE_TU_COMPRA;

public class MensajePaginaCompra implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return TEXTO_DETALLER_DE_TU_COMPRA.resolveFor(actor).getText();}

    public static MensajePaginaCompra mensajePaginaCompra(){
        return new MensajePaginaCompra();
    }
}
