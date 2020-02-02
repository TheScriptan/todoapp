package com.example.todoapp

import android.view.View
import android.widget.TextView
import com.example.todoapp.models.Note



class NoteViewHolder(itemView: View) : BaseViewHolder<Note>(itemView) {

    override fun bind(value: Note) {
        itemView.findViewById<TextView>(R.id.note_title).text = value.title
        super.bind(value)
    }
}
