package com.es.inflearn2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.es.inflearn2.databinding.ActivityMainBinding
import com.es.inflearn2.databinding.CustomActionbarBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var binding2:CustomActionbarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding2= CustomActionbarBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.setDisplayShowCustomEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(false)
        supportActionBar?.setDisplayShowHomeEnabled(false)
        supportActionBar?.setDisplayShowTitleEnabled(false)


        /* 파인드 뷰 방법으로 inflate 구현
           val mainLayout = findViewById<LinearLayout>(R.id.main_layout)
           val topBar= findViewById<RelativeLayout>(R.id.topBar)
           val layoutInflater=getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
           layoutInflater.inflate(R.layout.custom_actionbar, mainLayout, true) // .inflate(넣어야 할 xml, 넣어야 할 xml을 부풀릴? 공간, true)
           }*/

        layoutInflater.inflate(R.layout.custom_actionbar, binding.mainLayout, true)

        /* 파인드 뷰 방법
         val topBar= findViewById<RelativeLayout>(R.id.topBar)
         val textView2 = findViewById<TextView>(R.id.textView2)*/

        binding2.topBar.run {
            binding2.textView2.text = "커스텀 액션바"
            binding2.textView2.setTextColor(Color.BLACK)
        }
    }

}