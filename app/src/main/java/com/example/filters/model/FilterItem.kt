package com.example.filters.model

import com.zomato.photofilters.imageprocessors.Filter

data class FilterItem(
    val name: String,
    val filter: Filter = Filter()
)