Feature: Comprar producto exito
  Yo como usuario de la pagina del Exito
  Quiero poder comprar un producto
  Para poder tenerlo en mi casa

  @ComprarProducto
  Scenario:  Comprar producto exito
    Given El usuario esta en la pagina del exito con su cuenta registrada
    When  Selecciona un producto de una categoria
    Then  Se deberia observar el producto seleccionado en el carrito de compras




