package com.example.happieryou

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class JournalEntriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_journal_entries, container, false)

        // Find the TextViews for each entry
        val entry1: TextView = rootView.findViewById(R.id.entry1)
        val entry2: TextView = rootView.findViewById(R.id.entry2)
        val entry3: TextView = rootView.findViewById(R.id.entry3)
        val entry4: TextView = rootView.findViewById(R.id.entry4)
        val entry5: TextView = rootView.findViewById(R.id.entry5)
        val entry6: TextView = rootView.findViewById(R.id.entry6)
        // ... (find others)

        // Set click listeners for each entry
        entry1.setOnClickListener {
            onEntryClick("Monday, 29th April", "Today was a productive start to the week. I kicked off the day with a refreshing morning walk, setting a positive tone. Work was busy but fulfilling, and I managed to complete a challenging project. In the evening, I unwound by reading a chapter of my favorite book.")
        }
        entry2.setOnClickListener {
            onEntryClick("Tuesday 27th March", "A slightly hectic day, but I embraced the challenges. I attended an insightful webinar in the afternoon, gaining new perspectives on my field. After work, I treated myself to a homemade dinner and caught up on a series, finding a good balance between work and relaxation.")
        }
        entry3.setOnClickListener {
            onEntryClick("Wednesday 20th March", "Midweek vibes! Woke up with a positive mindset and tackled my to-do list with enthusiasm. Spent the evening catching up with a friend over a virtual call, sharing laughter and stories. Grateful for meaningful connections.")
        }
        entry4.setOnClickListener {
            onEntryClick("Thursday 15th March", "Today was a bit of a rollercoaster, but I learned to appreciate the small victories. Had a breakthrough on a project at work, and it felt incredible. Took a break in the evening to meditate and clear my mind, finding solace in moments of mindfulness.")
        }
        entry5.setOnClickListener {
            onEntryClick("Friday 10th March", "TGIF! Wrapped up the workweek on a high note. Celebrated the achievements with a virtual team happy hour. Cooked a special dinner to mark the beginning of the weekend. Looking forward to a well-deserved rest and some quality time with loved ones.")
        }
        entry6.setOnClickListener {
            onEntryClick("Sunday 5th March", "Embraced the tranquility of Sunday today. Started the morning with a leisurely breakfast and a stroll in the park. Spent quality time with family, sharing stories and laughter over a cozy brunch. In the afternoon, I delved into a creative project, finding joy in self-expression. Wrapped up the day with a calming evening meditation, feeling grateful for the serenity that Sundays bring.")
        }

        // ... (set click listeners for others)

        return rootView
    }

    // Handle the entry click
    private fun onEntryClick(entryDate: String, entryContent: String) {
        // You can navigate to another fragment or activity here
        // For simplicity, let's show the content in a new activity
        val intent = Intent(requireContext(), EntryDetailActivity::class.java)
        intent.putExtra("date", entryDate)
        intent.putExtra("content", entryContent)
        startActivity(intent)
    }
}
