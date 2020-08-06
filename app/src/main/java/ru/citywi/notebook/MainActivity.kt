package ru.citywi.notebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
   /*Создать меню*/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menu_main_inteface =  menuInflater
        menu_main_inteface.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.main_menu_1->{
                val intent_insert_actyvity = Intent(this,insertActivity::class.java)
                startActivity(intent_insert_actyvity)
                return true
            }
            R.id.main_menu_1->{

                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

}