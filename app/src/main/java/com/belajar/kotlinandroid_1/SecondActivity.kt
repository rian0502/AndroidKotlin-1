package com.belajar.kotlinandroid_1

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val actionBar = supportActionBar
        actionBar!!.title = "Halaman Ke-2"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val listView = findViewById<ListView>(R.id.listView)
        val names = arrayOf("android", "php", "c++", "java")
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, names
        )
        listView.adapter = arrayAdapter
    }
}