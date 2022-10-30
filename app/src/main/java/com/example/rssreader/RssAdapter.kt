package com.example.rssreader

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RssAdapter(private val context: Context, private val rssItems: List<RssItem>) :
    RecyclerView.Adapter<RssAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_rss, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount() = rssItems.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {

//        private val mediaImageView = itemView.findViewById<ImageView>(R.id.mediaImage)
//        private val titleTextView = itemView.findViewById<TextView>(R.id.mediaTitle)
//        private val abstractTextView = itemView.findViewById<TextView>(R.id.mediaAbstract)

        init {
            itemView.setOnClickListener(this)
        }


        override fun onClick(v: View?) {
            // Get selected article

        }
    }
}