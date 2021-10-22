package com.example.eventlistenersample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showButton = findViewById<Button>(R.id.button_show)
        val listener = HelloListener()
        showButton.setOnClickListener(listener)
    }

    private inner class HelloListener : View.OnClickListener {
        override fun onClick(v: View?) {
            val editTextName = findViewById<EditText>(R.id.edit_text_name)
            val outputMessage = findViewById<TextView>(R.id.text_view_message)
            val inputText = editTextName.text.toString()
            outputMessage.text = String.format("%s%s", inputText, getString(R.string.text_view_message))
        }
    }
}