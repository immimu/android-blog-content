package com.immimu.sampleproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menus = mutableListOf<MenuItem>()
        menus.add(MenuItem(1, getString(R.string.menu_1)))

        val layoutManager = LinearLayoutManager(this)
        menuRecyclerView.apply {
            this.layoutManager = layoutManager
            adapter = MenuAdapter(menus) { menuItem ->
                Toast.makeText(this@MainActivity, menuItem.menuTitle, Toast.LENGTH_SHORT).show()
            }
        }

    }
}
