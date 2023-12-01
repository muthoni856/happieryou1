package com.example.happieryou

import com.example.happieryou.R
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class EntryDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry_detail)
        val textViewDate = findViewById<TextView>(R.id.textViewDate)
        val textViewContent = findViewById<TextView>(R.id.textViewContent)

        // Retrieve the details from the intent
        val date = intent.getStringExtra("date")
        val content = intent.getStringExtra("content")

        // Set the details to TextViews
        textViewDate.text = date
        textViewContent.text = content
    }
}