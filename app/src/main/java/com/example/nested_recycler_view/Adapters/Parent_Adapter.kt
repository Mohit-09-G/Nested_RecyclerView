package com.example.nested_recycler_view.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nested_recycler_view.Modelclass.ParentDataClass
import com.example.nested_recycler_view.R

class Parent_Adapter (val parentList:List<ParentDataClass>):RecyclerView.Adapter<Parent_Adapter.ViewHolder>() {
    class ViewHolder  (itemView:View):RecyclerView.ViewHolder(itemView){
        val tvtitle:TextView = itemView.findViewById(R.id.tv_title)
        val rvchild:RecyclerView =itemView.findViewById(R.id.rv_child)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.parent_items,parent,false)
        return Parent_Adapter.ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
       return parentList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentItem = parentList[position]
        holder.tvtitle.text=currentItem.title
        holder.rvchild.setHasFixedSize(true)
        holder.rvchild.layoutManager = GridLayoutManager(holder.itemView.context,1,RecyclerView.HORIZONTAL,false)
        val adapter=Child_Adapter(currentItem.childList)
        holder.rvchild.adapter = adapter

    }

}