package com.pandiharshan.listdisplayapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val listView = findViewById<ListView>(R.id.listView)

        val items = arrayOf(
            "Android",
            "Kotlin",
            "Java",
            "XML",
            "RecyclerView",
            "SQLite",
            "Firebase",
            "Jetpack"
        )

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            items
        )

        listView.adapter = adapter
    }
}