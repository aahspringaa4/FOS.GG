package com.example.fifausersearchservice.feature.user.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.fifausersearchservice.R
import com.example.fifausersearchservice.feature.user.RankListViewData
import org.w3c.dom.Text

class RankListAdapter (private val context: Context, private val RankList: ArrayList<RankListViewData>) : BaseAdapter() {

    override fun getCount(): Int {
        return RankList.size
    }

    override fun getItem(p0: Int): Any {
        return RankList
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.rank_listview_item, null)

        val tv_rank = view.findViewById<TextView>(R.id.tv_rank)
        val tv_tier = view.findViewById<TextView>(R.id.tv_tier)

        val rank = RankList

        return view
    }

}