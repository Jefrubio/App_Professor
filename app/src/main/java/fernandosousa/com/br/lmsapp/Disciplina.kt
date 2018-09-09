package fernandosousa.com.br.lmsapp

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.Serializable

class Disciplina : Serializable {

    var id:Long = 0
    var nome = ""
    var ementa = ""
    var foto = ""
    var professor = ""

    override fun toString(): String {
        return "Disciplina(nome='$nome')"
    }

    fun toJson(): String {
        return GsonBuilder().create().toJson(this)
    }
}