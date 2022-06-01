package com.pfjn.pnvapp

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

class VaccinesDBTable(private val db: SQLiteDatabase) {
    fun init() {
        db.execSQL("CREATE TABLE $NAME (${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT, $FIELD_NAME TEXT NOT NULL)")
    }

    companion object {
        const val NAME = "Vaccines"
        const val FIELD_NAME = "Name"
    }
}