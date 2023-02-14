package com.example.showpicsumlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.showpicsumlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val button: Button = findViewById(R.id.detail_button)
        button.setOnClickListener {
            val intent = Intent(this, LoremPicsumDetailActivity::class.java)
            startActivity(intent)
        }
    }
}