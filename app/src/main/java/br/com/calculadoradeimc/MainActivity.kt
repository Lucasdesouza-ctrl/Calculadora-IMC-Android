package br.com.calculadoradeimc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnCalcular: Button
    private  lateinit var edtPeso: EditText
    private  lateinit var edtAltura: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnCalcular = findViewById(R.id.btn_calcular)
        edtPeso = findViewById(R.id.edt_peso)
        edtAltura = findViewById(R.id.edt_altura)

        btnCalcular.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)

            val peso = edtPeso.text.toString()
            val altura = edtAltura.text.toString()

            if(peso.isNotEmpty() && altura.isNotEmpty()){
                intent.putExtra("peso", peso.toDouble())
                intent.putExtra("altura", altura.toDouble())
                startActivity(intent)
            }else{
                Toast.makeText(this,"Digite peso e altura!",
                    Toast.LENGTH_LONG).show()
            }


        }
    }
}