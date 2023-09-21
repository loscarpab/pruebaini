package tienda

import tienda.clientes.Cliente
import tienda.productos.Producto

class Tienda_DM(var productos: MutableList<Producto>, var clientes: MutableList<Cliente>) {
    fun buscaProductos(titulo:String):Producto?{
        for (producto in productos){
            if (producto.titulo == titulo) return producto
        }
        return null
    }
    fun compraProducto(numEjemplares: Int): Float{
        TODO()
    }

}