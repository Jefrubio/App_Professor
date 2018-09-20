package fernandosousa.com.br.lmsapp

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(Disciplina::class), version = 1)
abstract class LMSDatabase: RoomDatabase() {
    abstract fun disciplinaDAO(): DisciplinaDAO
}