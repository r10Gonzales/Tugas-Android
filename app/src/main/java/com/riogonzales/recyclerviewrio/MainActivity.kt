package com.riogonzales.recyclerviewrio

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRv: Button = findViewById(R.id.button)
        btnRv.setOnClickListener{
            val intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }

        val calculatorButton = findViewById<Button>(R.id.button2)
        calculatorButton.setOnClickListener {
            // Start the MainActivity2 (Calculator Activity)
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        val btnIg: Button = findViewById(R.id.button3)
        btnIg.setOnClickListener{
            val urlIG = "https://www.instagram.com/folkative/"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urlIG))
            startActivity(intent)
        }

        val btnPhone: Button = findViewById(R.id.button4)
        btnPhone.setOnClickListener{
            val intent = Intent(Intent.ACTION_DIAL)
            startActivity(intent)
        }
        val btnData: Button = findViewById(R.id.button5)
        btnData.setOnClickListener {
            val intent = Intent(this, ParcelableActivity::class.java)
            startActivity(intent)
        }


        val bottomNavButton = findViewById<Button>(R.id.button6)
        bottomNavButton.setOnClickListener {
            val intent = Intent(this, BottomNavigationActivity::class.java)
            startActivity(intent)
        }

    }
}