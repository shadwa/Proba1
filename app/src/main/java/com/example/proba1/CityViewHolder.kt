package com.example.proba1

import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CityViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    fun bind(city:City){
        val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)
        val sizeTextView: TextView = itemView.findViewById(R.id.size_text_view)
        val squareTextView: TextView = itemView.findViewById(R.id.square_text_view)
        val ratingTextView: TextView = itemView.findViewById(R.id.rating_text_view)

        nameTextView.text=city.name
        sizeTextView.text = city.size.toString()
        squareTextView.text = city.square
        ratingTextView.text = city.rating.toString()
        val squareFormatted = "${city.square} km^2"
        squareTextView.text  = squareFormatted
        val toastButton: Button =itemView.findViewById(R.id.toast_button)
        toastButton.setOnClickListener {
            Toast.makeText(itemView.context,city.name,Toast.LENGTH_LONG).show()
        }
    }

}