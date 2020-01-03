package com.example.filters.model

import android.graphics.Bitmap
import com.zomato.photofilters.imageprocessors.Filter

data class ImageFilterItem(
    val name: String,
    val processedBitmap: Bitmap,
    val filter: Filter
)