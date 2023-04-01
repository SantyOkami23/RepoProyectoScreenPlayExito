package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
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

                Clear.field(CAMPO_NOMBRE),
                Enter.theValue(nombreComprador).into(CAMPO_NOMBRE),

                Clear.field(CAMPO_APELLIDOS),
                Enter.theValue(apellidoComprador).into(CAMPO_APELLIDOS),

                 //POSIBLE ERROR EN EL QUE SE BORRAN LOS CAMPOS
                Clear.field(CAMPO_CELULAR),
                Enter.theValue(celularComprador).into(CAMPO_CELULAR),

                Clear.field(CAMPO_NUMERO_CEDULA),
                Enter.theValue(numeroCedulaComprador).into(CAMPO_NUMERO_CEDULA),

                Clear.field(CAMPO_NOMBRE),
                Enter.theValue(nombreComprador).into(CAMPO_NOMBRE),

                Clear.field(CAMPO_APELLIDOS),
                Enter.theValue(apellidoComprador).into(CAMPO_APELLIDOS),

                // CLICKS
                Click.on (CLICK_ACEPTO_TERMINOS_CONDICIONES),
                Click.on (CLICK_AUTORIZO_TRATAMIENTO_DATOS),
              //  Click.on (CLICK_ACEPTO_TERMINOS_CONDICIONES),


                Click.on (CLICK_BOTON_CONTINUAR)
              //  Click.on (CLICK_BOTON_CONTINUAR)

        );

    }

    public static LlenarDatosCompradorFinalizarCompra llenarDatosCompradorFinalizarCompra(){
        return new LlenarDatosCompradorFinalizarCompra();
    }


}
