interface Coquetel{

    var nome : String
    var preco : Double

    fun montar (): Array<String>

}


interface Ingrediente{

    fun compor (indiceItem: Int) : String

}


class Bebida : Ingrediente{

    val bebida = Array<String>(4) {"cachaca"; "rum"; "vodka";"tequila"}

    override fun compor(indiceBebida: Int) : String {
        return bebida[indiceBebida]
    }

}

class Adicional : Ingrediente{
    val adicional = Array<String> (6) {"limao";"refrigerante";"suco"; "leite cond.";"gelo";"acucar"}

    override fun compor (indiceAdicional :Int): String{
        return adicional[indiceAdicional]
    }

}


abstract class IngredienteDecorator : Ingrediente {
    var ingDec = object : Ingrediente {
            override fun compor(indiceItem: Int): String{}
            }

    public IngredienteDecorator(objDec : Ingrediente){
        ingDec : 
    }



}



class Q1 : Coquetel{
     override var nome: String = ""
        get() = field
        set(value) {
            field = value
        }

    override var preco: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    override fun montar(): Array<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}