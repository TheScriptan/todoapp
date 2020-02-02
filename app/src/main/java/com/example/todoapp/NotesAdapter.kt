package com.example.todoapp

import android.view.ViewGroup
import com.example.todoapp.models.Note

class NotesAdapter : BaseAdapter<Note>() {

    override val layoutResourceId: Int = R.layout.list_notes_view_holder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        super.onCreateViewHolder(parent, viewType)
        return NoteViewHolder(binding.root)
    }
}