package com.emirhan.landmarkbook.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.emirhan.landmarkbook.activity.Detail
import com.emirhan.landmarkbook.databinding.TextRowItemBinding
import com.emirhan.landmarkbook.modal.Landmark
import com.emirhan.landmarkbook.modal.SelectedLandmark

class LandmarkAdapter(private val dataSet: ArrayList<Landmark>) : RecyclerView.Adapter<LandmarkAdapter.ViewHolder>() {

    private lateinit var binding : TextRowItemBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         binding = TextRowItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

        inner class ViewHolder(binding: TextRowItemBinding) : RecyclerView.ViewHolder(binding.root) {
            val textView : TextView = binding.textView

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataSet[position].name

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, Detail::class.java).apply {
                //putExtra("landmark",dataSet[position])
            }
            SelectedLandmark.selectedLandmark = dataSet[position]
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}