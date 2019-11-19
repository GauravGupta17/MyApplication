package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.Html.FROM_HTML_MODE_LEGACY
import android.text.Spanned
import kotlinx.android.synthetic.main.activity_settings.*
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class SettingsActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) = runBlocking {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val username = "Gaurav"

        val mailCounnt = 12

        val text =  getString(R.string.welcome_messages , username ,mailCounnt)

        val styleText :Spanned = Html.fromHtml(text,FROM_HTML_MODE_LEGACY)

            tvSettings.setText(styleText)




    }





}
