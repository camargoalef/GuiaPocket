package com.AC.guiapocket.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.AC.guiapocket.R
import com.AC.guiapocket.databinding.ListItemServiceBinding
import com.AC.guiapocket.model.Service

class ServiceAdapter(
    private val context: Context,
    private val list: List<Service>
) : BaseAdapter() {

    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val itemService = list[position]

        val itemView: View
        val binding: ListItemServiceBinding

        if (convertView == null) {
            binding = ListItemServiceBinding.inflate(LayoutInflater.from(context), parent, false)
            itemView = binding.root
            itemView.tag = binding
        } else {
            itemView = convertView
            binding = itemView.tag as ListItemServiceBinding
        }

        binding.imgService.setImageResource(itemService.imageId)
        binding.tvServiceName.text = context.getString(itemService.nameResId)
        binding.tvServiceCategory.text = "${context.getString(R.string.category_label)} ${context.getString(itemService.categoryResId)}"

        return itemView
    }
}