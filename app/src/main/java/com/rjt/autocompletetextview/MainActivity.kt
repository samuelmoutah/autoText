package com.rjt.autocompletetextview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {

    val data = arrayOf("Apple", "Banana", "Cherry", "Date", "Ferrari")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ArrayAdapter<String>(this, android.R.layout.select_dialog_item, data)

        val activity = findViewById(R.id.autoCompleteTextView) as AutoCompleteTextView

        activity.threshold = 1
        activity.setAdapter<ArrayAdapter<String>>(adapter)
        activity.setTextColor(Color.RED)




    }
}
