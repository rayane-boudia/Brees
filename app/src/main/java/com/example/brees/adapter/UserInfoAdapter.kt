package com.example.brees.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.brees.R
import com.example.brees.data.UserInfoHolder
import com.example.brees.data.UserInfoModel

class UserInfoAdapter(
    val data: ArrayList<UserInfoModel>,
    val context: Context

): RecyclerView.Adapter<UserInfoHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserInfoHolder {
        return UserInfoHolder(
            LayoutInflater.from(context).inflate(R.layout.item_user_info,parent,false)
        )
    }

    override fun onBindViewHolder(holder: UserInfoHolder, position: Int) {
        holder.username.text = data[position].username
        holder.balance.text = data[position].balance.toString()
    }

    override fun getItemCount(): Int {
        return data.size
    }
}