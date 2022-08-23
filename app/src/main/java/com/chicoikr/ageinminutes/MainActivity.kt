
package com.chicoikr.ageinminutes

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    var tvSelectedDate : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker : Button = findViewById(R.id.button)
        tvSelectedDate = findViewById(R.id.textView2)

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
            view, selectedYear, selectedMonth, selectedDayofMonth ->
                Toast.makeText(this, "You selected a date", Toast.LENGTH_LONG).show()

            val selectedDate ="$selectedDayofMonth/${selectedMonth+1}/$selectedYear"

            tvSelectedDate?.text = selectedDate

            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)

            val theDate = sdf.parse(selectedDate)


            },
            year,
            month,
            day
            ).show()



    }
}