package com.example.brees.data

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.brees.R

class UserInfoHolder (itemView: View): RecyclerView.ViewHolder(itemView) {

    val username : TextView = itemView.findViewById(R.id.username)
    val balance : TextView = itemView.findViewById(R.id.balance_value)

}