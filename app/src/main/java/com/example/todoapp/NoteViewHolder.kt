package com.example.todoapp

import com.example.todoapp.databinding.ListNotesViewHolderBinding
import com.example.todoapp.models.Note


class NoteViewHolder(
    private val binding: ListNotesViewHolderBinding,
    clickListener: ViewHolderClickListener
) : BaseViewHolder<Note>(binding, clickListener) {

    override fun bind(value: Note) {
        binding.noteTitle.text = value.title
        super.bind(value)
    }
}

