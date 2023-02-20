package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)
        //var names = arrayOf("Sean", "David", "Suyeta", "Widdowson")
        var list = ArrayList<Model>()

        list.add(Model("Dave", "Teacher",R.drawable.ic_launcher_foreground))
        list.add(Model("Sean", "Student",R.drawable.ic_launcher_foreground))


        listView.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)

        listView.setOnItemClickListener { MyCustomAdapter, view, i, l ->
            Toast.makeText(this, "This is " + list[i], Toast.LENGTH_SHORT).show()
        }
    }
}