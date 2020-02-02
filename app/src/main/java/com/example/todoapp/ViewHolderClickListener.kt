package com.example.todoapp

typealias ViewHolderClickType = (pos: Int, type: Int) -> Unit

interface ViewHolderClickListener {
    val onItemClick: ViewHolderClickType
    val onItemLongClick: ViewHolderClickType
}