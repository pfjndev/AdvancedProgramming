package pt.pfjn.livros

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class BDLivrosOpenHelper(
    context: Context?,
    name: String?,
    factory: SQLiteDatabase.CursorFactory?,
    version: Int
) : SQLiteOpenHelper(context, name, factory, version) {
    /**
     * Called when the database is created for the first time
     *
     *
     * @param db The database.
     */
    override fun onCreate(db: SQLiteDatabase) {
        TODO("Not yet implemented")

    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}