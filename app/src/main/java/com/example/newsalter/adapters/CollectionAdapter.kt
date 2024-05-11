package com.example.newsalter.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.newsalter.R
import com.example.newsalter.models.CollectionModel
import com.google.android.material.imageview.ShapeableImageView

class CollectionAdapter(val content:Context,val collectionList:ArrayList<CollectionModel>):
    RecyclerView.Adapter<CollectionAdapter.InternalRowViewHolder>()  {


    inner  class  InternalRowViewHolder(view:View):RecyclerView.ViewHolder(view){
        val image=view.findViewById<ImageView>(R.id.shapeableImageView)
        val collectionName:TextView=view.findViewById(R.id.collectionName)




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InternalRowViewHolder {

        return  InternalRowViewHolder(LayoutInflater.from(content).inflate(R.layout.collection_row,parent,false))

    }

    override fun getItemCount(): Int {
        return  collectionList.size
    }

    override fun onBindViewHolder(holder: InternalRowViewHolder, position: Int) {
        val obj=collectionList[position]
        holder.collectionName.text=obj.title
        Glide.with(content)
            .load(obj.image)
            .placeholder(R.drawable.placeholder)
            .into(holder.image)

    }
}