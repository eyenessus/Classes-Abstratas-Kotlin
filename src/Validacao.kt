class Validacao {

    fun fulist(lista: List<String>, quantidade: Int) {
        var contador = 0
        while (contador < lista.size){
            println("Exercicio ${lista[contador]} entregue")
            contador++
        }
        if(quantidade == lista.size){
            println("Todos exercicios foram entregues")
        }else
            println("Os exercicios não foram entregues")
    }


    fun validaRMedia(nota1:Int,nota2:Int,nota3:Int,nota4:Int){
        val media = (nota1+nota2+nota3+nota4)/4
        println(media)
    }

    fun adicionarLista(lista: List<String>, elemento:String){
        val liMut = lista.toMutableList()
        liMut.add(elemento)
        liMut.toList()
        println(liMut)

    }

    //dataclass e quando iremos usar para tratar dados

    fun mostrarTabuada(tabuadaDo:Int){
        for (i in 1..10){
            println("$tabuadaDo"+"x "+"$i"+" = " + (tabuadaDo*i))
        }
    }

}