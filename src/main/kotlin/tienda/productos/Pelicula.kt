package tienda.productos

class Pelicula(tituloP:String,
               precioP: Double,
               anyo_publiP: Int,
               var director: String): Producto(tituloP, precioP, anyo_publiP) {
    override fun toString(): String {
        return "${super.toString()}, director='$director'"
    }
}