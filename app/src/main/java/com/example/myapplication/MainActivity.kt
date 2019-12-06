package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.view.Menu
import android.widget.*


class MainActivity : AppCompatActivity() {

    private var value = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


        add1.setOnClickListener {
            this.add()
        }
        sub.setOnClickListener {
            this.sub()
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.customtoolbar,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {

        R.id.settings -> {
            val intent = Intent(this,SettingsActivity::class.java)
            startActivity(intent)

            true
        }
        R.id.Help -> {
            val intent = Intent(this,HelpActivity::class.java)
            startActivity(intent)



            true

        }

        else -> {

            super.onOptionsItemSelected(item)

        }
    }


    fun sendMessage(view: View) {
        val editText = findViewById<EditText>(R.id.etMessage)

        val message = editText.text.toString().trim()

        if (message == "") {


            return
        }


        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)

    }

    fun add() {


        value += 1

        tvResult.text = value.toString()


    }

    fun sub() {


        value -= 1

        tvResult.text = value.toString()

    }


}
