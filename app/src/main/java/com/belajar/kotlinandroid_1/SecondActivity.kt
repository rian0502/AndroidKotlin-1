package com.belajar.kotlinandroid_1

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private val names = arrayOf("android", "php", "c++", "java")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val actionBar = supportActionBar
        actionBar!!.title = "Halaman Ke-2"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val listView = findViewById<ListView>(R.id.listView)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        listView.adapter = adapter
        listView.onItemClickListener =
            AdapterView.OnItemClickListener { _, _, position, _ ->
                Toast.makeText(applicationContext, names[position], Toast.LENGTH_LONG).show() }
    }
}