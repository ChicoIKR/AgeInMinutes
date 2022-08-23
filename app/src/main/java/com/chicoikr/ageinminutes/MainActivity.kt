
package com.chicoikr.ageinminutes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker : Button = findViewById(R.id.button)

        btnDatePicker.setOnClickListener {
            Toast.makeText(this, "You clicked select", Toast.LENGTH_LONG).show()
        }
    }
}