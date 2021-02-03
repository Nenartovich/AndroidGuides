package com.nenartovich.example014_actionbarsampleproject

import android.app.ListActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.Toast

class MainActivity : ListActivity() {
    private val items = arrayOf("lorem", "ipsum", "dolor",
        "sit", "amet", "consectetuer", "adipiscing", "elit", "morbi",
        "vel", "ligula", "vitae", "arcu", "aliquet", "mollis", "etiam",
        "vel", "erat", "placerat", "ante", "porttitor", "sodales",
        "pellentesque", "augue", "purus")

    private lateinit var words: ArrayList<String>
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        words = arrayListOf()
        for (i in 0..4) {
            words.add(items[i])
        }
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, words)
        listAdapter = adapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actions, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add -> {
                addWord()
                return true
            }
            R.id.reset -> {
                initAdapter()
                return true
            }
            R.id.about -> {
                Toast.makeText(this, "About toast", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }


    private fun addWord() {
        if (adapter.count < items.size) {
            adapter.add(items[adapter.count])
        }
    }
}