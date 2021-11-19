package com.example.proba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rusNameList: List<String> = listOf("Москва", "Санкт-Петербург", "Новосибирск", "Екатеринбург", "Томск")

        val cityList: List<City> = listOf(
            City("Moskow", 12655000, "2551.9",22),
            City("Saint-Petersburg", 5384300, "1439",29),
            City("Novosibirsk", 1620200, "506.67",76),
            City("Ekaterinburg", 1495100, "495",71),
            City("Tomsk", 569000, "297.2",111)
        )

        val cityRecyclerView: RecyclerView = findViewById(R.id.city_recycler_view)
        cityRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        cityRecyclerView.addItemDecoration(
            DividerItemDecoration(
                this,
                DividerItemDecoration.VERTICAL
            )
        )
        cityRecyclerView.adapter = CityAdapter(cityList)
    }
}