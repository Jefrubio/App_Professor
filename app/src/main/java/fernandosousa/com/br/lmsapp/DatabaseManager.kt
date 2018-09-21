package fernandosousa.com.br.lmsapp

import android.arch.persistence.room.Room

object DatabaseManager {

    // singleton
    private var dbInstance: LMSDatabase
    init {
        val appContext = LMSApplication.getInstance().applicationContext
        dbInstance = Room.databaseBuilder(
                appContext, // contexto global
                LMSDatabase::class.java, // Referência da classe do banco
                "lms.sqlite" // nome do arquivo do banco
        ).build()
    }

    fun getDisciplinaDAO(): DisciplinaDAO {
        return dbInstance.disciplinaDAO()
    }
}