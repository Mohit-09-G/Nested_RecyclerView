package com.example.nested_recycler_view.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.nested_recycler_view.Modelclass.ChildDataClass
import com.example.nested_recycler_view.R


class Child_Adapter(val childList: List<ChildDataClass>):RecyclerView.Adapter<Child_Adapter.ViewHolder>() {
    class ViewHolder (itemView:View ): RecyclerView.ViewHolder(itemView){

        val imgchild:ImageView = itemView.findViewById(R.id.img_child)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =LayoutInflater.from(parent.context).inflate(R.layout.child_items,parent,false)
        return Child_Adapter.ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return childList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem =childList[position]
        holder.imgchild.setImageResource(currentItem.image)
    }
}