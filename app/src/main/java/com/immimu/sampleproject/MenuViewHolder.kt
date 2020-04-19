package com.immimu.sampleproject

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class MenuViewHolder(view: View, action: (menuItem: MenuItem) -> Unit) :
    RecyclerView.ViewHolder(view) {

    private lateinit var currentMenuItem: MenuItem
    private var textView: TextView = view.findViewById(R.id.menuTitle)

    init {
        val container: ConstraintLayout = view.findViewById(R.id.menuContainer)
        container.setOnClickListener { action.invoke(currentMenuItem) }
    }

    fun bind(menuItem: MenuItem) {
        currentMenuItem = menuItem
        textView.text = menuItem.menuTitle
    }
}