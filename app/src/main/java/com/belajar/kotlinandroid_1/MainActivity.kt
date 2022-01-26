package com.belajar.kotlinandroid_1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_submit = findViewById<Button>(R.id.btnSubmit)
        val button_clear = findViewById<Button>(R.id.btnClear)
        val tfnama = findViewById<EditText>(R.id.tfNama)
        val tfwa = findViewById<EditText>(R.id.tfWa)
        val tfemail = findViewById<EditText>(R.id.tfEmail)
        @SuppressLint("WrongViewCast")
        val hasilview = findViewById<TextView>(R.id.tvhasil)

        button_submit.setOnClickListener{
            if (tfnama.text.isEmpty() || tfemail.text.isEmpty() || tfwa.text.isEmpty()){
                Toast.makeText(this@MainActivity,"Isi Form dengan lengkap",Toast.LENGTH_LONG).show()
            }else{
                hasilview.setText("Nama : ${tfnama.text}\nWhatsApp : ${tfwa.text}\nEmail : ${tfemail.text}")
                button_clear.setOnClickListener{
                    tfnama.setText("")
                    tfemail.setText("")
                    tfwa.setText("")
                }
            }
        }
        button_clear.setOnClickListener{
            tfnama.setText("")
            tfemail.setText("")
            tfwa.setText("")
            hasilview.setText("")
        }
    }

}