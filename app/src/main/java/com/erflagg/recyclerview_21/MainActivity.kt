package com.erflagg.recyclerview_21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.erflagg.recyclerview_21.databinding.ActivityMainBinding
import com.erflagg.recyclerview_21.decorator.MyItemDecorator

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val recyclerView = binding.recyclerView
        val adapter = MyAdapter()
        recyclerView.adapter = adapter
        recyclerView.addItemDecoration(MyItemDecorator())
    }


}