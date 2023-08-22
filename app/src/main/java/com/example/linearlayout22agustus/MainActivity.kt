package com.example.linearlayout22agustus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.linearlayout22agustus.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            buttonOK.setOnClickListener{
                var textInput = textInputNama.editableText
                Toast.makeText(this@MainActivity, "Hello " + "$textInput", Toast.LENGTH_LONG).show()
            }
        }
    }
}