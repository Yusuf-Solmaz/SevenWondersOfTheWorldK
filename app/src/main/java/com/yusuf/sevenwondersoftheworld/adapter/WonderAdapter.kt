package com.yusuf.sevenwondersoftheworld.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yusuf.sevenwondersoftheworld.SevenWonders
import com.yusuf.sevenwondersoftheworld.Wonder
import com.yusuf.sevenwondersoftheworld.databinding.RecyclerRowBinding

class WonderAdapter(var wonderList: ArrayList<Wonder>) : RecyclerView.Adapter<WonderAdapter.WonderHolder>() {



    class WonderHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WonderHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return WonderHolder(binding)
    }

    override fun getItemCount(): Int {
       return wonderList.size
    }

    override fun onBindViewHolder(holder: WonderHolder, position: Int) {
        holder.binding.recyclerImage.setImageResource(wonderList[position].image)
        holder.binding.recyclerText.text = wonderList[position].placeName

        /*
        holder.binding.recyclerText.setOnClickListener {
            val intent = Intent(holder.binding.recyclerText.context, SevenWonders::class.java )
            holder.binding.recyclerText.context.startActivity(intent)
        }*/

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,SevenWonders::class.java)
            intent.putExtra("wonder",wonderList[position])
            holder.itemView.context.startActivity(intent)

        }



    }
}