package com.example.a_zpharmacy


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class CardAdapter (private val mList: List<CardViewModel>,val listener: OnCardItemClickListener) : RecyclerView.Adapter<CardAdapter.MyViewHolder>() {
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.cards, parent, false)

        return MyViewHolder(view)
    }
    // binds the list items to a view
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val ItemsViewModel = mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel.image)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = ItemsViewModel.name

        holder.itemView.setOnClickListener {
            listener.onClick(ItemsViewModel)
        }


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
    class MyViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.cover)
        val textView: TextView = itemView.findViewById(R.id.name)
    }
}
