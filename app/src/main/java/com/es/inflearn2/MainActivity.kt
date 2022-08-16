package com.es.inflearn2

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import java.util.zip.Inflater


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.setDisplayShowCustomEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(false)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        //layout을 통해 view를 생성한다.
        val mainLayout = findViewById<LinearLayout>(R.id.main_layout)
        val topBar= findViewById<RelativeLayout>(R.id.topBar)
        val layoutInflater=getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        layoutInflater.inflate(R.layout.custom_actionbar, mainLayout, true) // .inflate(넣어야 할 xml, 넣어야 할 xml을 부풀릴? 공간, true)


        val textView2=findViewById<TextView>(R.id.textView2)
        topBar.run{
            textView2.text="커스텀 액션바"
            textView2.setTextColor(Color.BLACK)
        }
    }
}