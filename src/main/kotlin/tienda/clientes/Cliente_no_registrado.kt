package tienda.clientes

import tienda.productos.Producto

class Cliente_no_registrado: Cliente {
    override fun aplicarDescuento(producto: Producto):Int{
        return producto.obtenerDescuento()
    }
    override fun pagar(cantidad:Float):Boolean{
        return true
    }

}