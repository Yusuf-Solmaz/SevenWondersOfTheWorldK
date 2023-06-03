package com.yusuf.sevenwondersoftheworld

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

        val choosenWonder = intent.getSerializableExtra("wonder") as Wonder

        binding.imageView.setImageResource(choosenWonder.image)
        binding.textView.text = choosenWonder.placeName
        binding.textView2.text = choosenWonder.cityName
        binding.textView3.text = choosenWonder.info
    }
}