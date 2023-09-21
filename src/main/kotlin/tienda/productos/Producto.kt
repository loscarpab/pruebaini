package tienda.productos

abstract class Producto(var titulo:String, var precio:Double, var anyo_publi:Int) {
    var descuento = 0
    fun obtenerDescuento():Int{
        return descuento
    }

    override fun toString(): String {
        return "titulo='$titulo', precio=$precio, anyo_publi=$anyo_publi, descuento=$descuento"
    }
}