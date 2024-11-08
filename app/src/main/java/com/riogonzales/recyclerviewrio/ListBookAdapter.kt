package com.riogonzales.recyclerviewrio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBookAdapter(val listBook: ArrayList<Book>) : RecyclerView.Adapter<ListBookAdapter.ListViewHolder>() {

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvAuthor: TextView = itemView.findViewById(R.id.tv_item_author)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_book, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listBook.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBook[position]

        Glide.with(holder.itemView.context)
            .load(book.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = book.name
        holder.tvAuthor.text = book.author
        holder.tvDetail.text = book.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listBook[holder.absoluteAdapterPosition])
        }
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Book)
    }
}