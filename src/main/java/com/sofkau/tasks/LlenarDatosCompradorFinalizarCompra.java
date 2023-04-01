package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import static com.sofkau.ui.PaginaDatosCompradorFinalizarCompra.*;




public class LlenarDatosCompradorFinalizarCompra  implements Task {
    String nombreComprador;
    String apellidoComprador;
    String celularComprador;
    String numeroCedulaComprador;

    public LlenarDatosCompradorFinalizarCompra conElNombre(String nombreComprador){
        this.nombreComprador=nombreComprador;
        return this;
    }

    public LlenarDatosCompradorFinalizarCompra conElApellido(String apellidoComprador){
        this.apellidoComprador=apellidoComprador;
        return this;
    }

    public LlenarDatosCompradorFinalizarCompra conElCelular(String celularComprador){
        this.celularComprador=celularComprador;
        return this;
    }

    public LlenarDatosCompradorFinalizarCompra conElNumeroCedula(String numeroCedulaComprador){
        this.numeroCedulaComprador=numeroCedulaComprador;
        return this;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(nombreComprador).into(CAMPO_NOMBRE),
                Enter.theValue(celularComprador).into(CAMPO_CELULAR),
                Enter.theValue(numeroCedulaComprador).into(CAMPO_NUMERO_CEDULA),

                Enter.theValue(apellidoComprador).into(CAMPO_APELLIDOS),
                Click.on (CLICK_ACEPTO_TERMINOS_CONDICIONES)
             // Click.on (CLICK_AUTORIZO_TRATAMIENTO_DATOS)


        );

    }

    public static LlenarDatosCompradorFinalizarCompra llenarDatosCompradorFinalizarCompra(){
        return new LlenarDatosCompradorFinalizarCompra();
    }


}
