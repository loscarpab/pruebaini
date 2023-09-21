package tienda.productos

class Disco(tituloD:String,
            precioD: Double,
            anyo_publiD: Int,
            var genero: String,
            var grupo: String,
            var stock: Int): Producto(tituloD, precioD, anyo_publiD) {
    // TODO: genero
    override fun toString(): String {
        return "${super.toString()}, genero='$genero', grupo='$grupo', stock=$stock"
    }
}