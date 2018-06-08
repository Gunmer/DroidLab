package com.gunmer.droidlab.presentation.main.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.gunmer.droidlab.databinding.ViewFeatureTestItemBinding
import com.gunmer.droidlab.presentation.main.viewModel.FeatureTestVM

class FeatureTestAdapter(
        private val features: List<FeatureTestVM>
) : RecyclerView.Adapter<FeatureTestAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ViewFeatureTestItemBinding.inflate(inflater, parent, false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return features.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(features[position])
    }

    class ViewHolder(
            private val binding: ViewFeatureTestItemBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(featureTest: FeatureTestVM) {
            binding.viewModel = featureTest
            binding.executePendingBindings()
        }
    }
}