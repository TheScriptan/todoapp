package com.example.todoapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T : Any, Binding : ViewDataBinding> :
    RecyclerView.Adapter<BaseViewHolder<T>>() {

    abstract val layoutResourceId: Int
    private val list = mutableListOf<T>()
    lateinit var binding: Binding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<T> {
        val inflater = LayoutInflater.from(parent.context)
        binding = DataBindingUtil.inflate(inflater, layoutResourceId, parent, false)
        return BaseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseViewHolder<T>, pos: Int) {
        holder.bind(list[pos])
    }

    fun setNotes(notes: List<T>) {
        list.clear()
        list.addAll(notes)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = list.size
}