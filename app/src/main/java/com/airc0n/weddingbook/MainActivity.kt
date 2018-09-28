package com.airc0n.weddingbook

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_listview)

        listView.setBackgroundColor(Color.parseColor("#ffcdd2"))



        listView.adapter = WeddingBookDataRowAdapter(this) // Custom Adapter

    }


    private class WeddingBookDataRowAdapter(context: Context) : BaseAdapter() {

        private val mContext: Context

        private val data = arrayListOf<String>(
                "爾康陳爾康陳爾康", "逼夢廖", "屁軍柯", "鐵肥菜"
        )

        init {
            mContext = context
        }

        override fun getCount(): Int {
            return data.size
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getItem(position: Int): Any {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            val layoutInflater = LayoutInflater.from(mContext)
            val row = layoutInflater.inflate(R.layout.row_main, parent, false)

//            val sequenceTextView = row.findViewById<TextView>(R.id.sequence_textview)
            val nameTextView = row.findViewById<TextView>(R.id.name_textview)
            nameTextView.text = data[position]
//            val amountTextView = row.findViewById<TextView>(R.id.amount_textview)

            return row

        }
    }
}
