package com.example.filters

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.example.filters.model.ImageFilterItem
import com.example.filters.utils.createFilters
import com.example.filters.utils.extensions.getDisplayMetrics
import com.example.filters.utils.extensions.getPaintedBitmap
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName

        init {
            System.loadLibrary("NativeImageProcessor")
        }
    }

    private val bitmap by lazy { BitmapFactory.decodeResource(resources, R.drawable.test_image) }
    private val matrix by lazy { getDisplayMetrics() }
    private val w by lazy { matrix.widthPixels }
    private val h by lazy { matrix.heightPixels }
    private val imageFilters by lazy { arrayListOf<ImageFilterItem>() }
    private var adapter: FilterAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()

        setupFilters()

    }

    private fun setupRecyclerView() {
        adapter = FilterAdapter(w, h)
        recycler_filters.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recycler_filters.adapter = adapter
        PagerSnapHelper().attachToRecyclerView(recycler_filters)
    }

    private fun setupFilters() {
        lifecycleScope.launchWhenStarted {
            val matrix = getDisplayMetrics()
            val w = matrix.widthPixels
            val h = matrix.heightPixels
            val filters = createFilters()
            filters.forEach {
                var item: ImageFilterItem? = null
                withContext(Dispatchers.IO) {
                    // Create mutable bitmap for processing
                    val smallBitmap = Bitmap.createScaledBitmap(bitmap, w, h, false)
                    val mutableBitmap = smallBitmap.copy(bitmap.config, true)
                    val outputBitmap = it.filter.processFilter(mutableBitmap)
                    item = ImageFilterItem(it.name, outputBitmap, it.filter)
                }
                item?.let {
                    imageFilters += it
                    adapter?.addFilter(it)
                }
            }
            adapter?.setFilters(imageFilters)
            if (imageFilters.size > 0) {
                val bmp = getPaintedBitmap(bitmap, imageFilters[0].processedBitmap, w, h)
                img_target.setImageBitmap(bmp)
            }
        }
    }
}
