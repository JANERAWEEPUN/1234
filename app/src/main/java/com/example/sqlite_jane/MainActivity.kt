package com.example.sqlite_jane

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.AbsSpinner
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var mSqliteHelper: SQLiteOpenHelper
    private lateinit var mDb: SQLiteDatabase
    private lateinit var mCursor: Cursor
    private lateinit var mSpinner: AbsSpinner
    private lateinit var Password: EditText
    private var _id: Int = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSqliteHelper = SQLiteHelper.getInstance(this)
        mDb = mSqliteHelper.writableDatabase


    }
}