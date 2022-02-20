package conta

abstract class Conta {

    abstract fun depositar(valor: Float, saldo: Float) : Float

    abstract fun mostraSaldo(saldo: Float)

    abstract fun sacar(valor: Float, saldo: Float):Float

    abstract  fun transferenciaPIX(valor: Float,saldo: Float)

    abstract fun transferencia(
        valor: Float, saldo: Float, contaDestino: String, titular:String,
        banco:String, agencia:Int, cpfcnpj: Long
    ): Float
    abstract fun jurosMensal(saldo: Float, banco: String): Float
}