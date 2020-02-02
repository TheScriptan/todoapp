package com.example.todoapp

import android.view.ViewGroup
import android.widget.Toast
import com.example.todoapp.databinding.ListNotesViewHolderBinding
import com.example.todoapp.models.Note

class NotesAdapter : BaseAdapter<Note, ListNotesViewHolderBinding>() {

    override val layoutResourceId: Int = R.layout.list_notes_view_holder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        super.onCreateViewHolder(parent, viewType)
        return NoteViewHolder(binding, NotesClickListener())
    }

    inner class NotesClickListener : ViewHolderClickListener {
        override val onItemClick: ViewHolderClickType = { pos, type ->
            Toast.makeText(binding.root.context, "Item selected: $pos", Toast.LENGTH_LONG).show()
        }
        override val onItemLongClick: ViewHolderClickType = { pos, type ->
            Toast.makeText(binding.root.context, "Item long selected: $pos", Toast.LENGTH_LONG)
                .show()
        }
    }
}