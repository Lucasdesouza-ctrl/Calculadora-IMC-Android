package br.com.calculadoradeimc

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultadoActivity : AppCompatActivity() {

    private lateinit var txtPeso: TextView
    private lateinit var txtAltura: TextView
    private lateinit var txtResultado: TextView
    private lateinit var btnVoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_resultado)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtPeso = findViewById(R.id.txt_peso)
        txtAltura = findViewById(R.id.txt_altura)
        txtResultado = findViewById(R.id.txt_resultado)
        btnVoltar = findViewById(R.id.btn_voltar)

        val bundle = intent.extras

        if (bundle != null) {
            val peso = bundle.getDouble("peso")
            val altura = bundle.getDouble("altura")

            txtPeso.text = "Peso informado $peso Kg"
            txtAltura.text = "Peso informado $altura m"

            val imc = peso / (altura * altura)

            val resultado = if (imc < 18.5) {
                "Baixo"
            } else if (imc in 18.5..24.9) {
                "Normal"
            } else if (imc in 25.0..29.9) {
                "Sobrepeso"
            } else {
                "Obesidade"
            }

            txtResultado.text = resultado
        }

        btnVoltar.setOnClickListener {
            finish()
        }
    }
}