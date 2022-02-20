import conta.ContaCorrente as ContaCorrente

fun main(){
    val ani = Cachorro()
    ani.mostrarRaca("Lobsomen")

    val anicor = Cachorro()
    anicor.corDoAnimal("azul")

    val pessoabancaria = ContaCorrente()
    val saldo = 1000f //saldo atual

    val saldoAtualizado = pessoabancaria.depositar(180f,saldo)

    pessoabancaria.sacar(300f,saldoAtualizado)

    pessoabancaria.transferenciaPIX(500f,saldo)

    pessoabancaria.transferencia(300f,saldo,"Bradesco","Emerson dos Santos Sousa","Itau",500,52781012882)
    pessoabancaria.jurosMensal(saldo,"Itaú")

    fun love (idade: Int): Int {
        return idade
    }

    val funcaobrasileirachamandofuncaopelavariavel = :: love

    val retornando = ::love
    println(retornando(55))
    println(funcaobrasileirachamandofuncaopelavariavel(2))

    fun abastercer (litros : Int){
        var contadorAbastecimento: Int = 0
        while (contadorAbastecimento <= litros){
            contadorAbastecimento++
            println("Foram abastecido $contadorAbastecimento de gasolina")
        }
    }

    val gazoza = :: abastercer
    println(gazoza(5))


    var lista: List<String> = listOf<String>("Ricardo","Bruno")
    val listaM = mutableListOf<String>("Suzaba","Grossa")
    listaM.add("Ricardo")
    listaM.add("Carlinhos")


    fun listNasa(nome: String,segundoNome:String){
       val listagem = mutableListOf<String>()
       listagem.add(nome)
        listagem.add(segundoNome)
        println(listagem)
    }

    fun listagemNAza(nome: String,segundoNome:String){
        val listagem = listOf<String>(nome,segundoNome)
        println(listagem)
    }

    val nasaVeri = :: listNasa
    nasaVeri("Emerson","Alex")

    println(listagemNAza("Sousa","Cruz"))

val entregueAtiv = listOf<String>("Geografia","Matematica","Portugues")


    val openvali= Validacao()
    openvali.fulist(entregueAtiv,3)

    val operacaoMedia = Validacao()
    operacaoMedia.validaRMedia(10,10,10,10)

    val myset = setOf<String>("Emerson","Sousa") // imutavel
    val mysetOf = mutableSetOf<String>("Gerenias pode ser mudado","Set of pode ser mudado")

    println(myset)
    println(mysetOf)

    var arr = arrayListOf<String>("Emerson","gOZADO")

    val operacion = mapOf<String,String>(Pair("ISWMWMEDOWE","Emerson"))
    println(operacion)



    val li = listOf("Emerson","Diego","Carlos")

    var operacaoMutalve = Validacao()
    operacaoMutalve.adicionarLista(li,"Sou obrigado a adicionar agora")



    operacaoMutalve.mostrarTabuada(10)



    fun veiculo(list: List<String>){
        for (i in list){
            println("$i")
            if (i == i){
                println(i.length)
            }
        }
    }
}