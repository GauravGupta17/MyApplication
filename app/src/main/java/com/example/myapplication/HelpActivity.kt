package com.example.myapplication

import android.app.Application
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.TaskStackBuilder
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.activity_help.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class HelpActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) = runBlocking  {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        /*   GlobalScope.launch {

                var i =1

                while(true)
                {


                Log.d("GLOBALSCOPE","inside Global scope")
                delay(1000L)
                imLevellist.setImageLevel(i)
                i++
                if(i==7)
                i=0

}
        }






*/






        for (i in 1..6)
            imLevellist.setImageLevel(i)








    }





}
