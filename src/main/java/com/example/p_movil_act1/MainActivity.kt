package com.example.p_movil_act1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.EditText
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var editText3: EditText
    private lateinit var editText4: EditText
    private lateinit var btnAccept: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.imageView)
        editText1 = findViewById(R.id.editText)
        editText2 = findViewById(R.id.editText1_2)
        editText3 = findViewById(R.id.editText2)
        editText4 = findViewById(R.id.editText2_2)
        btnAccept = findViewById(R.id.btnAccept)

        btnAccept.setOnClickListener {
            showImageIfValid()
        }
    }

    private fun showImageIfValid() {
        val text1 = editText1.text.toString().trim()
        val text2 = editText2.text.toString().trim()
        val text3 = editText3.text.toString().trim()
        val text4 = editText4.text.toString().trim()

        if (!text1.isEmpty() && !text2.isEmpty() && !text3.isEmpty() && !text4.isEmpty()) {
            imageView.setImageResource(R.drawable.paloma)
        } else {
            imageView.setImageResource(R.drawable.tache)
            imageView.visibility = View.VISIBLE
        }

        imageView.visibility = View.VISIBLE
        editText1.visibility = View.INVISIBLE
        editText2.visibility = View.INVISIBLE
        editText3.visibility = View.INVISIBLE
        editText4.visibility = View.INVISIBLE
        btnAccept.isEnabled = false
    }
}