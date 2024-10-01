package com.example.clase01kt

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.clase01kt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)


        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Log.d("ejerciciokt","onCreate")


        /*Evento click kt*/
        binding.btnMove.setOnClickListener {
            val intent = Intent(this, Destino::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("ejerciciokt","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ejerciciokt","onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ejerciciokt","onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ejerciciokt","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ejerciciokt","onDestroy")
    }
}