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

    }
}