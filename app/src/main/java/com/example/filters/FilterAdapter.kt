package com.example.filters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.filters.model.ImageFilterItem
import com.example.filters.utils.extensions.getPaintedBitmap
import kotlinx.android.synthetic.main.layout_filter_item.view.*

class FilterAdapter(private val w: Int, private val h: Int) :
    RecyclerView.Adapter<FilterAdapter.ViewHolder>() {

    private var data = arrayListOf<ImageFilterItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_filter_item, parent, false)
    )

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val filter = data[position]

        holder.itemView.img_filter.setImageBitmap(getPaintedBitmap(filter.processedBitmap, w, h))
        holder.itemView.txt_filter.text = filter.name
    }

    fun setFilters(items: ArrayList<ImageFilterItem>) {
        data = items
        notifyDataSetChanged()
    }

    fun addFilter(item: ImageFilterItem) {
        data.add(item)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}