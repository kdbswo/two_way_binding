package com.example.two_way_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.two_way_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.vm = viewModel
        binding.lifecycleOwner = this

//        var age = 0
//
//        val ageArea = findViewById<TextView>(R.id.ageArea)
//        val plusBtn = findViewById<Button>(R.id.plusBtn)
//
//        plusBtn.setOnClickListener{
//            age++
//            ageArea.text = age.toString()
//        }


    }
}