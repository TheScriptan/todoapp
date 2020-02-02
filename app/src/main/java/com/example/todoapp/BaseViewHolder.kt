package com.example.todoapp

import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

open class BaseViewHolder<T : Any>(itemView: View) :
    RecyclerView.ViewHolder(itemView) {

    open fun bind(value: T) {
    }
}