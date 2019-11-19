package com.example.myapplication

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log
import android.widget.*
import android.widget.Toast.LENGTH_SHORT

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.display_message)
        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val message =  intent.getStringExtra(EXTRA_MESSAGE)

        val textView = findViewById<TextView>(R.id.View_Message).apply {

            text = message
        }

        val array = arrayListOf<Int>()

        array.add(1)
        array.add(2)
        array.add(3)
        array.add(4)
        array.add(5)
        array.add(6)
        array.add(7)
        array.add(8)

   val adapter = ArrayAdapter<Int> (this,android.R.layout.simple_expandable_list_item_1,array)

        val listView : ListView = findViewById(R.id.listView)

        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,"Clicked", LENGTH_SHORT).show()
            val intent = Intent(this,ConstrainstActivity::class.java)
            startActivity(intent)


        }








    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        Log.d("DISPLAY_MESSAGE","BEFORE LANDSCAPE IF")
       if (newConfig.orientation === Configuration.ORIENTATION_LANDSCAPE){
           Toast.makeText(this,"Landscape",LENGTH_SHORT).show()

       }
        else if (newConfig.orientation === Configuration.ORIENTATION_PORTRAIT){
           Toast.makeText(this,"Potrait",LENGTH_SHORT).show()

       }



    }




}
