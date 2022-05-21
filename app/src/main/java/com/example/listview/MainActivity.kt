package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val nameArray = arrayOf("Shrawan", "Ansar", "Rahil", "Arman", "Guddu", "Nehal")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameList = findViewById<ListView>(R.id.list)

        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nameArray)
        nameList.adapter = arrayAdapter

        nameList.setOnItemClickListener { adapterView, view, position, id ->
            val name = nameArray

            Toast.makeText(this, "$id clicked :  "+name[position], Toast.LENGTH_SHORT).show()

        }

    }
}