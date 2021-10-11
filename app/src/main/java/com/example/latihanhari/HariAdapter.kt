package com.example.latihanhari

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HariAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<HariAdapter.HariHolder>() {
    class HariHolder(view: View):RecyclerView.ViewHolder(view) {
        val textView = itemView.findViewById<TextView>(R.id.txtNamaHari)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HariHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.hari_adapter,parent,false
        )
        return HariHolder(view)
    }

    override fun onBindViewHolder(holder: HariHolder, position: Int) {
        holder.textView.text = dataSet[position]
    }

    override fun getItemCount() = dataSet.size
}