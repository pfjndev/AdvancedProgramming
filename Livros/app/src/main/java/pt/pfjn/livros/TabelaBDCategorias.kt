package pt.pfjn.livros

import android.database.sqlite.SQLiteDatabase

class TabelaBDCategorias(val db: SQLiteDatabase) {
    fun criaTabela() {
        db.execSQL("CREATE TABLE CATEGORIAS ")
    }
}