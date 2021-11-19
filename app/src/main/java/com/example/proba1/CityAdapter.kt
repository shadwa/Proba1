package com.example.proba1

import android.system.Os.bind
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup

class CityAdapter (private val cityList:List<City>): RecyclerView.Adapter<CityViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        var cityListItemView=LayoutInflater.from(parent.context)
            .inflate(R.layout.city_list_item,parent,false)
        return CityViewHolder(cityListItemView)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val city=cityList[position]
        holder.bind(city)
    }

    override fun getItemCount(): Int {
        return cityList.size
    }
}