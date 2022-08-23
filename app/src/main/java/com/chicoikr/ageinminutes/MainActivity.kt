
package com.chicoikr.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker : Button = findViewById(R.id.button)

        btnDatePicker.setOnClickListener {
            asClicked()

        }
    }
    fun asClicked(){

        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)


        DatePickerDialog(this,DatePickerDialog.OnDateSetListener{
            view, year, month, dayofMonth ->
            Toast.makeText(this, "You selected a date", Toast.LENGTH_LONG).show()
            },
            year,
            month,
            day
            ).show()



    }
}