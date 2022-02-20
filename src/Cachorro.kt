class Cachorro : Animal() {//herança entre a classe animal

    override fun mostrarRaca(raca: String) {
        println(message = "A raça é $raca")
    }

    override fun corDoAnimal(cor: String) {
        println(message = "$cor é muito lindo")
    }
    var lo = mostrarRaca("red")
    var listagem = listOf(lo)
}