package com.immimu.sampleproject.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.immimu.sampleproject.MenuAdapter
import com.immimu.sampleproject.MenuItem
import com.immimu.sampleproject.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menus = mutableListOf<MenuItem>()
        menus.add(
            MenuItem(
                MENU_ID_BUTTON,
                getString(R.string.text_button_sample)
            )
        )

        val layoutManager = LinearLayoutManager(this)
        menuRecyclerView.apply {
            this.layoutManager = layoutManager
            adapter = MenuAdapter(menus) { menuItem ->
                val intent = when (menuItem.menuId) {
                    MENU_ID_BUTTON -> Intent(this@MainActivity, ButtonActivity::class.java)
                    else -> Intent(this@MainActivity, ButtonActivity::class.java)

                }

                startActivity(intent)
            }
        }

    }

    companion object {
        private const val MENU_ID_BUTTON = 1
    }
}
