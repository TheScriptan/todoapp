package com.example.todoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.todoapp.databinding.FragmentNotesBinding
import com.example.todoapp.models.Note
import java.util.*

class NotesFragment : BaseFragment<FragmentNotesBinding>() {

    private val notesAdapter = NotesAdapter()
    private lateinit var notesLayoutManager: LinearLayoutManager
    private lateinit var notesRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val view = super.onCreateView(inflater, container, savedInstanceState)
        notesLayoutManager = LinearLayoutManager(view.context)
        notesRecyclerView = binding.notesRecyclerView

        val note1 = Note("Note 1", "Testas", Date())
        val note2 = Note("Note 2", "Testas", Date())
        val note3 = Note("Note 3", "Testas", Date())
        val list = mutableListOf<Note>()
        list.add(note1)
        list.add(note2)
        list.add(note3)
        list.add(note1)
        list.add(note2)
        list.add(note3)
        list.add(note1)
        list.add(note2)
        list.add(note3)
        notesAdapter.setNotes(list)

        notesRecyclerView.apply {
            layoutManager = notesLayoutManager
            adapter = notesAdapter
        }
        return view
    }

    override val layoutResourceId: Int = R.layout.fragment_notes
}