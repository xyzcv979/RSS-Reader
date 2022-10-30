package com.example.rssreader

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class RssListFragment : Fragment() {
    private val rssItems = mutableListOf<RssItem>()
    private lateinit var rssRecyclerView: RecyclerView
    private lateinit var rssAdapter: RssAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_rss_list, container, false)
        val layoutManager = LinearLayoutManager(context)
        rssRecyclerView = view.findViewById(R.id.rss_recycler_view)
        rssRecyclerView.layoutManager = layoutManager
        rssRecyclerView.setHasFixedSize(true)
        rssAdapter = RssAdapter(view.context, rssItems)
        rssRecyclerView.adapter = rssAdapter

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Call the new method within onViewCreated
        fetchArticles()
    }


    companion object {
        fun newInstance(): RssListFragment {
            return RssListFragment()
        }

    }

    private fun fetchArticles() {

    }

}