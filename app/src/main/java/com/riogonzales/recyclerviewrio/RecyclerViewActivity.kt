package com.riogonzales.recyclerviewrio

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var rvBooks: RecyclerView
    private val list = ArrayList<Book>()  // Inisialisasi variabel list

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        rvBooks = findViewById(R.id.rv_books)
        rvBooks.setHasFixedSize(true)

        list.addAll(BooksData.listData)  // Menambahkan data ke list
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvBooks.layoutManager = LinearLayoutManager(this)
        val listBookAdapter = ListBookAdapter(list)
        rvBooks.adapter = listBookAdapter

        listBookAdapter.setOnItemClickCallback(object : ListBookAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Book) {
                showSelectedBook(data)
            }
        })
    }
    private fun showSelectedBook(book: Book){
        Toast.makeText(this, "Kamu memilih " + book.name, Toast.LENGTH_SHORT).show()

        val moveWithDataIntent = Intent(this@RecyclerViewActivity, DetailActivity::class.java)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_TITLE, book.name)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_AUTHOR, book.author)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_PHOTO, book.photo)
        moveWithDataIntent.putExtra(DetailActivity.EXTRA_DESCRIPTION, book.detail)
        startActivity(moveWithDataIntent)
    }
}