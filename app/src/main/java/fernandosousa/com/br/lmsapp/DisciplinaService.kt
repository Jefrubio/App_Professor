package fernandosousa.com.br.lmsapp

import android.content.Context

object DisciplinaService {

    fun getDisciplinas (context: Context): List<Disciplina> {
        val disciplinas = mutableListOf<Disciplina>()

        // criar 10 disciplinas
        for (i in 1..10) {
            val d = Disciplina()
            d.nome = "Disciplina $i"
            d.ementa = "Ementa Disciplina $i"
            d.professor = "Professor Disciplina $i"
            d.foto = "https://raw.githubusercontent.com/fesousa/aula-android-kotlin/LMSApp_06_ListasCards/app/src/main/res/drawable-v24/ddm.png"
            disciplinas.add(d)
        }

        return disciplinas
    }

}