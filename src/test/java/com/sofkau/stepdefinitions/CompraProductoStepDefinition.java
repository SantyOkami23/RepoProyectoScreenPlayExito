package com.sofkau.stepdefinitions;
import com.sofkau.questions.MensajePaginaCompra;
import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.tasks.IniciarSesion;
import com.sofkau.tasks.SeleccionMercado;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import java.io.IOException;
import java.util.List;
import static com.google.common.base.Predicates.equalTo;
import static com.sofkau.questions.MensajePaginaCompra.mensajePaginaCompra;
import static com.sofkau.tasks.AgregarProductoCarrito.agregarProductoCarrito;
import static com.sofkau.tasks.DigirseAlCarrito.digirseAlCarrito;
import static com.sofkau.tasks.ElegirFechaEntrega.elegirFechaEntrega;
import static com.sofkau.tasks.FiltrarProductoMenorPrecio.filtrarProductoMenorPrecio;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.IrAPagar.irAPagar;
import static com.sofkau.tasks.LlenarDatosCompradorFinalizarCompra.llenarDatosCompradorFinalizarCompra;
import static com.sofkau.tasks.Refrescar.refrescar;
import static com.sofkau.tasks.SeleccionMercado.seleccionMercado;
import static com.sofkau.tasks.SeleccionarMetodoDePago.seleccionarMetodoDePago;
import static com.sofkau.tasks.SeleccionarTipoDeEnvio.seleccionarTipoDeEnvio;
import static com.sofkau.util.LecturaFileProperties.getUserPasword;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class CompraProductoStepDefinition  extends Configuracion {

    private List<String> credenciales = getUserPasword();

    private static final Logger LOGGER = Logger.getLogger(String.valueOf(CompraProductoStepDefinition.class));
    public CompraProductoStepDefinition() throws IOException {
    }

    @Given("El usuario esta en la pagina del exito con su cuenta registrada")
    public void el_usuario_esta_en_la_pagina_del_exito_con_su_cuenta_registrada() throws InterruptedException {
        try {
            configurarNavegador();

            theActorInTheSpotlight().wasAbleTo(
                    new AbrirPaginaInicial()
            );
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion()
                            .conElUsuario(credenciales.get(0))
                            .yConLaContrasenna(credenciales.get(1))

            );

            LOGGER.info("Es mi placer informarte que se realizo el login correctamente ");

        } catch (Exception e) {
            LOGGER.info("Fallo al momento de hacer el login :c");
            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }



    }


    @When("Selecciona un producto de una categoria")
    public void selecciona_un_producto_de_una_categoria() throws InterruptedException {
        try {

            theActorInTheSpotlight().attemptsTo(
                    seleccionarTipoDeEnvio()
                            .enseleccionarCiudad("Cali")
                            .enseleccionarTiendaCiudad("Exito La Flora")
            );
            LOGGER.info("Seleccion de ciudad y tienda exitosa");

             theActorInTheSpotlight().attemptsTo(
                     seleccionMercado()
                     .buscaProducto("Mortadela"));
            LOGGER.info("Busqueda de producto exitosa");



            theActorInTheSpotlight().attemptsTo(
                    filtrarProductoMenorPrecio());
            LOGGER.info("Filtrado de producto exitoso");

            theActorInTheSpotlight().attemptsTo(
                    agregarProductoCarrito());
            LOGGER.info("Producto agregado al carrito exitosamente");

            theActorInTheSpotlight().attemptsTo(
                    digirseAlCarrito());
            LOGGER.info("Se dirige al carrito de compras exitosamente");



            theActorInTheSpotlight().attemptsTo(
                    irAPagar());
            LOGGER.info("Se dirige a pagar exitosamente");

            theActorInTheSpotlight().attemptsTo(
                    refrescar());
            LOGGER.info("Se refresca la pagina exitosamente");

            theActorInTheSpotlight().attemptsTo(
                    llenarDatosCompradorFinalizarCompra()
                           .conElNombre("Juan")
                           .conElCelular("3148271191")
                           .conElNumeroCedula("1004776890")
                           .conElApellido("Perez"));
            LOGGER.info("Se llenan los datos del comprador exitosamente");


            theActorInTheSpotlight().attemptsTo(
                           elegirFechaEntrega());
                     LOGGER.info("Se elige la fecha de entrega exitosamente");


                     theActorInTheSpotlight().attemptsTo(
                    seleccionarMetodoDePago());
            LOGGER.info("Se selecciona el metodo de pago exitosamente");



            LOGGER.info("Proceso de compra realizdo con exito ");

        } catch (Exception e) {


            LOGGER.warn(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }




    }



    @Then("Se deberia observar el producto seleccionado en el carrito de compras")
    public void se_deberia_observar_el_producto_seleccionado_en_el_carrito_de_compras() {

        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajePaginaCompra(), equalTo("Detalles de tu compra"))

            );


            LOGGER.info("Prueba realizada con exito ");
            quitarDriver();

        } catch (Exception e) {
            LOGGER.info(" Algo paso mal amiguito fallo al realizar la assercion :c");
            Assertions.fail();
            quitarDriver();
        }
        }

    }




