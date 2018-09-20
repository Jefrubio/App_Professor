package fernandosousa.com.br.lmsapp

import android.arch.persistence.room.Room

object DatabaseManager {

    // singleton
    private var dbInstance: LMSDatabase
    init {
        val appContext = LMSApplication.getInstance().applicationContext
        dbInstance = Room.databaseBuilder(
                appContext,
                LMSDatabase::class.java,
                "lms.sqlite"
        ).build()
    }

    fun getDisciplinaDAO(): DisciplinaDAO {
        return dbInstance.disciplinaDAO()
    }
}