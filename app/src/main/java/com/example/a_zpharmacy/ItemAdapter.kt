package com.example.a_zpharmacy

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.a_zpharmacy.database.data

class ItemAdapter(private val mList: List<data>, val context: Context) : RecyclerView.Adapter<ItemAdapter.UserViewHolder>() {

    // create new views
    class UserViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        val Name = itemView.findViewById<TextView>(R.id.name)
        val Price = itemView.findViewById<TextView>(R.id.price)



    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(context)
            .inflate(R.layout.item_view, parent, false)

        return UserViewHolder(view)
    }
    // binds the list items to a view
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        val ItemsViewModel = mList[position]



        // sets the name to the textview from our itemHolder class
        holder.Name.text = ItemsViewModel.name

        //sets the price to the textview from our itemHolder class
        holder.Price.text= ItemsViewModel.price.toString()

        holder.itemView.setOnClickListener {
//            listener.onClick(ItemsViewModel)

        }



    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    // Holds the views for adding it to image and text
//    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
//        val imageView: ImageView = itemView.findViewById(R.id.cover)
//        val name: TextView = itemView.findViewById(R.id.name)
//        val price:TextView=itemView.findViewById(R.id.price)
//    }
}
