package ru.citywi.notebook

import Person.array_month_rus
import Person.array_year
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_insert.*

class insertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)
        setTitle(R.string.insert_activity_title)
        textView1.setBackgroundResource(R.drawable.edittext_bg)

        spinner_month.setBackgroundResource(R.drawable.edittext_bg)
        val adapter_spinner_month = ArrayAdapter(this, android.R.layout.simple_spinner_item, array_month_rus)
        adapter_spinner_month.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        spinner_month.adapter = adapter_spinner_month

        spinner_year.setBackgroundResource(R.drawable.edittext_bg)
        val adapter_spinner_year = ArrayAdapter(this,android.R.layout.simple_spinner_item, array_year)
        adapter_spinner_year.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        spinner_year.adapter = adapter_spinner_year


        editTextTextMultiLine.setBackgroundResource(R.drawable.edittext_bg)
        button.setBackgroundResource(R.drawable.button_bg)

    }
}