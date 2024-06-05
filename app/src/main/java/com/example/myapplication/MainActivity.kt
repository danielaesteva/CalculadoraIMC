package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var WelcomeTextView: TextView
    lateinit var bienvenidaButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WelcomeTextView = findViewById(R.id.welcomeTexView)
        bienvenidaButton = findViewById(R.id.bienvenidaButton)

        WelcomeTextView.text = "Bienvenido a mi primera Aplicación"

            bienvenidaButton.setOnClickListener {
                WelcomeTextView.text = "He hecho click en el botón"
                bienvenidaButton.text = "Done"
            }

    }
}