package com.example.suma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var numberOne: EditText
    lateinit var numberTwo: EditText
    lateinit var btnSum: Button
    lateinit var resultado : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberOne = findViewById<EditText>(R.id.numberOne)
        numberTwo = findViewById<EditText>(R.id.numberTwo)
        btnSum = findViewById<Button>(R.id.btnSum)
        resultado = findViewById(R.id.LlbResultado)

        btnSum.setOnClickListener{
            this.Sumar(numberOne.text.toString().trim(),numberTwo.text.toString().trim())
        }
    }
    fun Sumar(num1:String, num2:String){
        var producto: Float

        if (num1.toString().isEmpty() || num2.toString().isEmpty()) {
            Toast.makeText(this,"Debe completar los datos", Toast.LENGTH_SHORT).show()

        }
        else{
            producto = (num1.toDouble() + num2.toDouble()).toFloat()
            resultado.setText("El resultado de ${num1} + ${num2} = ${producto}")
        }

    }
}