package com.immimu.sampleproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MenuAdapter(
    private val menus: List<MenuItem>,
    private val action: (menuItem: MenuItem) -> Unit
) :
    RecyclerView.Adapter<MenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.menu_item_layout, parent, false)
        return MenuViewHolder(view) { action.invoke(it) }
    }

    override fun getItemCount(): Int = menus.size

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(menus[position])
    }

}