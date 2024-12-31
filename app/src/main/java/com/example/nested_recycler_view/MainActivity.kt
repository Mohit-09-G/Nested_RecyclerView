package com.example.nested_recycler_view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nested_recycler_view.Adapters.Parent_Adapter
import com.example.nested_recycler_view.Modelclass.ChildDataClass
import com.example.nested_recycler_view.Modelclass.ParentDataClass

class MainActivity : AppCompatActivity() {

    val  parentlist = ArrayList<ParentDataClass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val rvParent=findViewById<RecyclerView>(R.id.rv_parent)
        rvParent.setHasFixedSize(true)
        rvParent.layoutManager = LinearLayoutManager(this)
        val adapter =Parent_Adapter(parentlist)
        setData()
        rvParent.adapter=adapter

       }

    private fun setData() {
       val childItemList= ArrayList<ChildDataClass>()
        childItemList.add(ChildDataClass(R.drawable.color_bible_manga))
        childItemList.add(ChildDataClass(R.drawable.demon_slayer_manga))
        childItemList.add(ChildDataClass(R.drawable.color_bible_manga))
        childItemList.add(ChildDataClass(R.drawable.demon_slayer_manga))
        childItemList.add(ChildDataClass(R.drawable.color_bible_manga))
        childItemList.add(ChildDataClass(R.drawable.demon_slayer_manga))
        childItemList.add(ChildDataClass(R.drawable.color_bible_manga))
        childItemList.add(ChildDataClass(R.drawable.demon_slayer_manga))
        childItemList.add(ChildDataClass(R.drawable.color_bible_manga))

        parentlist.add(ParentDataClass("Best Seller",childItemList))
        parentlist.add(ParentDataClass("Latest", childItemList))
        parentlist.add(ParentDataClass("Recent", childItemList))
        parentlist.add(ParentDataClass("Watch Now", childItemList))
    }
}