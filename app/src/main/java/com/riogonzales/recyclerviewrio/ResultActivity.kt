package com.riogonzales.recyclerviewrio

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    private lateinit var resName: TextView
    private lateinit var resUsia: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resName = findViewById(R.id.resultName)
        resUsia = findViewById(R.id.resultUsia)

        // Menerima data dari Intent dengan metode yang disesuaikan untuk API level yang lebih baru
        val user = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra("USER_DATA", User::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra("USER_DATA")
        }

        // Menampilkan data yang diterima
        user?.let {
            resName.text = "Name: ${it.name}"
            resUsia.text = "Usia: ${it.usia}"
        }
    }
}