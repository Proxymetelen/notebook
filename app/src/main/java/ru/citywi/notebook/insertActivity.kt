package ru.citywi.notebook

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_insert.*

class insertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_insert)
        setTitle(R.string.insert_activity_title)
        textView1.setBackgroundResource(R.drawable.edittext_bg)
        textView2.setBackgroundResource(R.drawable.edittext_bg)
        editTextTextMultiLine.setBackgroundResource(R.drawable.edittext_bg)
        button.setBackgroundResource(R.drawable.button_bg)

    }
}