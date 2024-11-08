package com.riogonzales.recyclerviewrio

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val tvAuthor = findViewById<TextView>(R.id.tvAuthor)
        val ivPhoto = findViewById<ImageView>(R.id.ivBook)
        val tvDesc = findViewById<TextView>(R.id.tvFillDescription)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val author = intent.getStringExtra(EXTRA_AUTHOR)
        val photo = intent.getStringExtra(EXTRA_PHOTO)
        val desc = intent.getStringExtra(EXTRA_DESCRIPTION)

        tvTitle.text = title
        tvAuthor.text = author
        tvDesc.text = desc
        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().fitCenter())
            .into(ivPhoto)
    }

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_AUTHOR = "extra_author"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_DESCRIPTION = "extra_description"
    }
}