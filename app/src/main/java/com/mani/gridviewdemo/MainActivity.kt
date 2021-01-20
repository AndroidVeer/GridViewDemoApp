package com.mani.gridviewdemo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class MainActivity : Activity()
{
    lateinit var gvData : GridView

    var categoryDataList = ArrayList<Category>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gvData = findViewById(R.id.gvCData)

        addDataIntoList()

        var adapter = CategoryAdapter(this,categoryDataList)
        gvData.adapter = adapter


    }

    private fun addDataIntoList() {

        categoryDataList.add(Category(1001,"Vegtables",R.drawable.veg))
        categoryDataList.add(Category(1002,"Non Veg",R.drawable.non_veg))
        categoryDataList.add(Category(1003,"Books",R.drawable.book))
        categoryDataList.add(Category(1004,"Groceries",R.drawable.grocoreis))
        categoryDataList.add(Category(1005,"Milk",R.drawable.milk))
        categoryDataList.add(Category(1006,"Movers & Pakers",R.drawable.packers))


    }
}