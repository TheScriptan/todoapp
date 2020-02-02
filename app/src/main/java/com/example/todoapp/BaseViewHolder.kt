package com.example.todoapp

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

open class BaseViewHolder<T : Any>(
    binding: ViewDataBinding,
    private val clickListener: ViewHolderClickListener? = null
) :
    RecyclerView.ViewHolder(binding.root) {

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