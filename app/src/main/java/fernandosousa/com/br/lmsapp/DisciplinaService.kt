package fernandosousa.com.br.lmsapp

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.json.JSONArray
import java.net.URL

object DisciplinaService {

    //TROQUE PELO IP DE ONDE ESTÁ O WS
    val host = "http://192.168.1.24:5000"
    val TAG = "WS_LMSApp"

    fun getDisciplinas (context: Context): List<Disciplina> {
        val url = "$host/disciplinas"
        val json = URL(url).readText()

        Log.d(TAG, json)
        return parserJson(json)
    }

    fun parserJson(json: String): List<Disciplina> {
        val type = object : TypeToken<List<Disciplina>>(){}.type
        return Gson().fromJson<List<Disciplina>>(json, type)
    }
}