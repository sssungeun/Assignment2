package com.example.semina2.Feature

import android.media.Image
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.semina2.Data.GitRepoItem
import com.example.semina2.R

class  GitRepoViewHolder(view : View) : RecyclerView.ViewHolder(view) {
         val textView: TextView = view.findViewById(R.id.textView)
         val textView2: TextView = view.findViewById(R.id.textView2)
         val imageView: ImageView = view.findViewById(R.id.imageView)
         val button: ImageView = view.findViewById(R.id.button)

    fun bind(data: GitRepoItem) {
        textView.text = data.profileName
        textView2.text = data.profileDetail

//       imageView
//        Glide.with()
//            .load(dataList[position].profileImg)
//            .into(holder.profileImg)

//        Glide
//            .with(itemView)
//            .load()
//
//        Glide //이미지처리
//            .with(itemView)
//            .load() //다양한 것들 로드 가능
//            .into(imageView)
//            .placeholder(R.drawable.) //다른거 보여주기
    }
}