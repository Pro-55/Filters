package com.example.filters.utils.extensions

import android.app.Activity
import android.graphics.*
import android.util.DisplayMetrics

fun Activity.getDisplayMetrics(): DisplayMetrics {
    val displayMetrics = DisplayMetrics()
    this.windowManager.defaultDisplay.getMetrics(displayMetrics)
    return displayMetrics
}

fun getPaintedBitmap(bmp: Bitmap, filter: Bitmap, w: Int, h: Int): Bitmap {
    val ogBitmap = Bitmap.createScaledBitmap(bmp, w, h, false)
    val tempBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(tempBitmap)
    canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR)

    val paint0 = Paint()
    val paint1 = Paint()

    paint0.apply {
        alpha = 255
        isAntiAlias = true
        flags = Paint.ANTI_ALIAS_FLAG and Paint.FILTER_BITMAP_FLAG
    }

    paint1.apply {
        alpha = 128
        isAntiAlias = true
        flags = Paint.ANTI_ALIAS_FLAG and Paint.FILTER_BITMAP_FLAG
    }

    canvas.apply {
        save()
        drawBitmap(ogBitmap, 0F, 0F, paint0)
        drawBitmap(filter, 0F, 0F, paint1)
        restore()
    }

    return tempBitmap
}

fun getPaintedBitmap(filter: Bitmap, w: Int, h: Int): Bitmap {
    val tempBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888)
    val canvas = Canvas(tempBitmap)
    canvas.drawColor(Color.TRANSPARENT, PorterDuff.Mode.CLEAR)

    val paint = Paint().apply {
        alpha = 255
        isAntiAlias = true
        flags = Paint.ANTI_ALIAS_FLAG and Paint.FILTER_BITMAP_FLAG
    }

    canvas.apply {
        save()
        drawBitmap(filter, 0F, 0F, paint)
        restore()
    }

    return tempBitmap
}