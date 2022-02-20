package conta


class ContaCorrente : Conta() {
    override fun depositar(valorDeDeposito: Float, saldo: Float): Float {
       val saldoDeposito = valorDeDeposito + saldo
        println("O valor do seu depositor é $valorDeDeposito")
        println("Estamos adicionando o valor $valorDeDeposito na sua conta bancaria do tipo Corrente")
        mostraSaldo(saldoDeposito)
        return saldoDeposito
    }

    override fun mostraSaldo(saldo: Float) {
        if (saldo >= 0){
            println("$saldo em Conta Corrente")
            println("Seu saldo atual é $saldo")
        }else{
            println("Você está com status devedor pois você deve no momento $saldo")
        }


    }

    override fun sacar(valorDeSaqueSacado: Float, saldo: Float): Float {
        return if (saldo < valorDeSaqueSacado ) {
            println("O seu valor e isuficiente pois seu saldo e de $saldo")
            saldo
        }else{
            println("Você está efetuando um saque no valor de $valorDeSaqueSacado reais")
            val saque = saldo - valorDeSaqueSacado
            mostraSaldo(saque)
            saque
        }
    }

     override fun transferenciaPIX(valor: Float, saldo: Float) {
       val atualizado = saldo - valor
         println("$atualizado")
     }

     override fun transferencia(
         valor: Float, saldo: Float, contaDestino: String, titular: String, banco: String,
         agencia: Int,
         cpfcnpj: Long
     ): Float {
         val atualizado = saldo - valor
         println("$atualizado")
         return saldo - valor
     }

     override fun jurosMensal(saldo: Float, banco: String): Float {
        var bkjuros = 0f
        when(banco){
            "Bradesco" -> bkjuros = saldo * 4.0f
            "Itaú" -> bkjuros = saldo * 1.0f
            "Santander" -> bkjuros = saldo * 3.0f
        }
         println(bkjuros)
        return bkjuros
    }

}