package com.webrose.punjabtourism

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class DetailPageActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_page)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

       /* val bundle: Bundle? = intent.extras
        val dataList: ArrayList<TourismData>? = bundle?.getParcelableArrayList("data")
        if (dataList != null) {
            Toast.makeText(this,"if case",Toast.LENGTH_SHORT).show()
            val adapter = TourismAdapter(this, ArrayList(dataList))
            recyclerView.adapter = adapter
        }
        else{
            Toast.makeText(this,"else",Toast.LENGTH_SHORT).show()
        }*/
    }
}