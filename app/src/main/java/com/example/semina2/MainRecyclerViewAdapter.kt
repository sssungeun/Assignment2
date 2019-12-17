package com.example.semina2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.semina2.Data.GitRepoItem

class MainRecyclerViewAdapter (val ctx: Context, val dataList: ArrayList<GitRepoItem>):
    RecyclerView.Adapter<MainRecyclerViewAdapter.Holder>(){

    override fun getItemCount(): Int =dataList.size

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item, viewGroup, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        Glide.with(ctx)
            .load(dataList[position].profileImg)
            .into(holder.listImg)
        holder.profileName.text= dataList[position].profileName
        holder.profileDetail.text= dataList[position].profileDetail

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var listImg = itemView.findViewById(R.id.imageView) as ImageView
        var profileName = itemView.findViewById(R.id.textView) as TextView
        var profileDetail = itemView.findViewById(R.id.textView2) as TextView

    }
}