package com.omidrezabagherian.androidtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import com.omidrezabagherian.androidtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)

        init()

        setContentView(mainBinding.root)
    }

    private fun init(){
        setupActionBar()
    }

    private fun setupActionBar(){
        setSupportActionBar(mainBinding.toolbar)
        mainBinding.toolbar.inflateMenu(R.menu.main_menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_home->
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()
            R.id.menu_dashboard->
                Toast.makeText(this, "Dashboard", Toast.LENGTH_SHORT).show()
            R.id.menu_setting->
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()
            R.id.menu_logout->
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }
}