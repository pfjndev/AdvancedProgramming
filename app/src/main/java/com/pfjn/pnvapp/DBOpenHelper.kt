package com.pfjn.pnvapp

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBOpenHelper(context: Context?) : SQLiteOpenHelper(context, NAME, null, VERSION) {
    override fun onCreate(db: SQLiteDatabase?) {
        requireNotNull(db)

        DiseasesDBTable(db).init()
        VaccinesDBTable(db).init()
        AdministrationDBTable(db).init()
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    companion object {
        const val NAME = "pnv.db"
        private const val VERSION = 1
    }
}