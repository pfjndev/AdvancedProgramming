package com.pfjn.pnvapp

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class AdministrationDBTable(private val db: SQLiteDatabase) {
    fun init() {
        db.execSQL("CREATE TABLE $NAME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $FIELD_DESCRIPTION TEXT NOT NULL)")
    }

    companion object {
        const val NAME = "Administration"
        const val FIELD_DESCRIPTION = "Description"
    }
}
