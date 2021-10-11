package com.example.latihanhari

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //3 var recyclerview
    //recyclerview
    private lateinit var reclyclerView: RecyclerView
    //recycler adapter
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    //layout manager
    private lateinit var viewManager: RecyclerView.LayoutManager


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        reclyclerView = findViewById(R.id.listData)
        //isi data
        val data = arrayOf<String>(
            "Senin","Selasa","Rabu","Kamis","Jum'at","Sabtu","Ahad"
        )
        //inisialisasi layout
        viewManager = LinearLayoutManager(this)
        //ambil data adapter
        recyclerAdapter = HariAdapter(data)
        //menampilkan adapter ke recycler
        reclyclerView.adapter = recyclerAdapter
        //show data from adapter to layout interface
        reclyclerView.layoutManager = viewManager
    }
}