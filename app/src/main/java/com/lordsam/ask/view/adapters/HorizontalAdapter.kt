package com.lordsam.ask.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lordsam.ask.databinding.CardHorizontalBinding

class HorizontalAdapter(
    private val context: Context,
    private val list: Array<String>
) : RecyclerView.Adapter<HorizontalAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: CardHorizontalBinding =
            CardHorizontalBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val card = list[position]

        if (holder is ViewHolder){

            holder.tv.text = card
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(view: CardHorizontalBinding) : RecyclerView.ViewHolder(view.root){
        val tv = view.tvCardH
    }

}