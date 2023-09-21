package tienda.clientes

import tienda.productos.Producto

class Cliente_registrado(private var nombre:String,
                         private var apellidos:String,
                         private var DNI_NIF:String,
                         private var telefono:String,
                         saldo:Float,
                         private var descuento: Int = 2): Cliente {

    private var saldo = saldo
        set(value) {
            var saldoMoment = saldo + value
            if (saldo < 100 && saldoMoment > 100) descuento += 5
            if (saldo > 100){
                saldoMoment -= 50
                var descuentoMoment = 7 // descuento por tener + de 100 de saldo
                while (saldoMoment > 100){


                }
            }
            field = value
        }

    override fun aplicarDescuento(producto: Producto): Int {
        return descuento + producto.obtenerDescuento()
    }

    override fun pagar(cantidad: Float): Boolean {
        TODO("Not yet implemented")
    }
    fun valida_dni(): Boolean{
        TODO()
    }
    fun es_VIP(): Boolean{
        TODO()
    }
    fun actualizaDescuento():Any{
        TODO()
    }
}