package com.yusuf.sevenwondersoftheworld

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yusuf.sevenwondersoftheworld.databinding.ActivitySevenWondersBinding

class SevenWonders : AppCompatActivity() {

    private lateinit var binding: ActivitySevenWondersBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySevenWondersBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent

        lateinit var chosenWonder: Wonder

        if (Build.VERSION.SDK_INT >=33){
            chosenWonder = intent.getSerializableExtra("wonder",Wonder::class.java)!!
        }
        else{
            chosenWonder = intent.getSerializableExtra("wonder")!! as Wonder
        }

        binding.imageView.setImageResource(chosenWonder.image)
        binding.textView.text = chosenWonder.placeName
        binding.textView2.text = chosenWonder.cityName
        binding.textView3.text = chosenWonder.info
    }
}