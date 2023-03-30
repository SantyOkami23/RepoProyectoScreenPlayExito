package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import com.sofkau.tasks.IniciarSesion;
import com.sofkau.tasks.SeleccionMercado;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;

import static com.sofkau.tasks.FiltrarProductoMenorPrecio.filtrarProductoMenorPrecio;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.SeleccionMercado.seleccionMercado;
import static com.sofkau.util.LecturaFileProperties.getUserPasword;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraProductoStepDefinition  extends Configuracion {

    private List<String> credenciales = getUserPasword();

    public CompraProductoStepDefinition() throws IOException {
    }

    @Given("El usuario esta en la pagina del exito con su cuenta registrada")
    public void el_usuario_esta_en_la_pagina_del_exito_con_su_cuenta_registrada() throws InterruptedException {

        configurarNavegador();

        theActorInTheSpotlight().wasAbleTo(
                 new AbrirPaginaInicial()
        );

        theActorInTheSpotlight().attemptsTo(
                iniciarSesion()
                        .conElUsuario(credenciales.get(0))
                        .yConLaContrasenna(credenciales.get(1))

        );
    }


    @When("Selecciona un producto de una categoria")
    public void selecciona_un_producto_de_una_categoria() throws InterruptedException {

        Thread.sleep(5000);
        theActorInTheSpotlight().attemptsTo(
                seleccionMercado()
                        .buscaProducto("Mortadela")
        );

        Thread.sleep(5000);
        theActorInTheSpotlight().attemptsTo(
                filtrarProductoMenorPrecio()

        );





    }



    @Then("Se deberia observar el producto seleccionado en el carrito de compras")
    public void se_deberia_observar_el_producto_seleccionado_en_el_carrito_de_compras() {

    }

}
