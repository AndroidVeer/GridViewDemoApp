package com.mani.gridviewdemo

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CategoryAdapter(var context: Context,val categoryList: ArrayList<Category>) : BaseAdapter()
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View
    {

        var view = LayoutInflater.from(context).inflate(R.layout.category_row,parent,false)

        var ivCatImage = view.findViewById<ImageView>(R.id.ivCatImage)
        var tvCatName = view.findViewById<TextView>(R.id.tvCatName)

        categoryList.get(position).catImage?.let { ivCatImage.setImageResource(it) }
        tvCatName.setText("${categoryList.get(position).catName}")


        return view


    }

    override fun getItem(position: Int): Any
    {

        return position
    }

    override fun getItemId(position: Int): Long
    {
        return position.toLong()
    }

    override fun getCount(): Int
    {
        return categoryList.size
    }
}