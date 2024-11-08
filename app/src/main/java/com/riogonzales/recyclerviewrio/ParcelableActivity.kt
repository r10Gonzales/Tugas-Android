package com.riogonzales.recyclerviewrio

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ParcelableActivity : AppCompatActivity(),View.OnClickListener {
    private lateinit var editName: EditText
    private lateinit var editUsia: EditText
    private lateinit var btHasil: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parcelable)

        editName = findViewById(R.id.etName)
        editUsia = findViewById(R.id.etUsia)
        btHasil = findViewById(R.id.ibResult)

        btHasil.setOnClickListener(this)

    }
    override fun onClick(v: View?) {
        // Mengambil nilai dari EditText
        val name = editName.text.toString().trim()
        val usia = editUsia.text.toString().toIntOrNull() ?: 0

        // Membuat objek User
        val user = User(name, usia)

        // Mengirim data ke ResultActivity
        val intent = Intent(this, ResultActivity::class.java).apply {
            putExtra("USER_DATA", user)
        }
        startActivity(intent)
    }
}