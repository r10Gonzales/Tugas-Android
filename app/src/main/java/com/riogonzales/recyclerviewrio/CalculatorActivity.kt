package com.riogonzales.recyclerviewrio

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val editTextNumber1 = findViewById<EditText>(R.id.editTextNumberDecimal)
        val editTextNumber2 = findViewById<EditText>(R.id.editTextNumberDecimal2)
        val textViewResult = findViewById<TextView>(R.id.tvResult)

        val buttonAdd = findViewById<Button>(R.id.button_add)
        val buttonSubtract = findViewById<Button>(R.id.button_subtract)
        val buttonMultiply = findViewById<Button>(R.id.button_multiply)
        val buttonDivide = findViewById<Button>(R.id.button_divide)

        buttonAdd.setOnClickListener {
            val num1 = editTextNumber1.text.toString().toDoubleOrNull()
            val num2 = editTextNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 + num2
                textViewResult.text = "Result: $result"
            } else {
                textViewResult.text = "Please enter valid numbers"
            }
        }

        buttonSubtract.setOnClickListener {
            val num1 = editTextNumber1.text.toString().toDoubleOrNull()
            val num2 = editTextNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 - num2
                textViewResult.text = "Result: $result"
            } else {
                textViewResult.text = "Please enter valid numbers"
            }
        }

        buttonMultiply.setOnClickListener {
            val num1 = editTextNumber1.text.toString().toDoubleOrNull()
            val num2 = editTextNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                val result = num1 * num2
                textViewResult.text = "Result: $result"
            } else {
                textViewResult.text = "Please enter valid numbers"
            }
        }

        buttonDivide.setOnClickListener {
            val num1 = editTextNumber1.text.toString().toDoubleOrNull()
            val num2 = editTextNumber2.text.toString().toDoubleOrNull()
            if (num1 != null && num2 != null) {
                if (num2 != 0.0) {
                    val result = num1 / num2
                    textViewResult.text = "Result: $result"
                } else {
                    textViewResult.text = "Cannot divide by zero"
                }
            } else {
                textViewResult.text = "Please enter valid numbers"
            }
        }
    }
}