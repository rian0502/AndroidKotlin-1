package com.belajar.kotlinandroid_1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.FieldPosition

class SecondActivity : AppCompatActivity() {
    val names = arrayOf("android", "php", "c++", "java")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val actionBar = supportActionBar
        actionBar!!.title = "Halaman Ke-2"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val listView = findViewById<ListView>(R.id.listView)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        listView.adapter = adapter
        listView.onItemClickListener = object : AdapterView.OnItemClickListener{
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ){
                Toast.makeText(applicationContext,"${names[position]}", Toast.LENGTH_LONG).show()
            }
        }
    }
}