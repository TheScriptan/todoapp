package com.example.todoapp

import android.view.View
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

open class BaseViewHolder<T : Any>(
    itemView: View,
    private val clickListener: ViewHolderClickListener? = null
) :
    RecyclerView.ViewHolder(itemView) {

    open fun bind(value: T) {
        bindClickListeners()
    }

    private fun bindClickListeners() {
        itemView.setOnClickListener {
            clickListener?.onItemClick?.invoke(adapterPosition, itemViewType)
        }
        itemView.setOnLongClickListener {
            clickListener?.onItemLongClick?.invoke(adapterPosition, itemViewType)
            true
        }
    }
}