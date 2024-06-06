package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var heighEditText: EditText
    lateinit var weightEditView: TextView
    lateinit var lesssbutton: Button
    lateinit var addButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        heighEditText = findViewById(R.id.heighEditText)
        weightEditView = findViewById(R.id.weightEditView)
        lesssbutton = findViewById(R.id.lesssbutton)
        addButton = findViewById(R.id.lesssbutton)

        setHigh()
        setHigh()
    }

    fun setHigh() {
        heighEditText.setText(heighEditText.toString())

        fun setWeight
    }
}