package com.torres.trabajoconoperadores

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.torres.trabajoconoperadores.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val miNumero:EditText=findViewById(R.id.editTextText2)
        val miBoton:Button=findViewById(R.id.button)
        val textoResultado:TextView=findViewById(R.id.textView)

        miBoton.setOnClickListener {

            val numeroResltado=miNumero.text.toString().toInt()

            if (numeroResltado<18)
                textoResultado.text="Eres menor de edad"

            else if(numeroResltado>18) textoResultado.text="Eres mayor de Edad"

            else textoResultado.text="Tienes justo 18 años"


        }

    }


}