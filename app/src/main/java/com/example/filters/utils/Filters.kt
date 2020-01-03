package com.example.filters.utils

import com.example.filters.model.FilterItem
import com.zomato.photofilters.geometry.Point
import com.zomato.photofilters.imageprocessors.Filter
import com.zomato.photofilters.imageprocessors.subfilters.*

fun getDefaultFilter(): FilterItem {
    return FilterItem("Normal", Filter())
}

fun getStarLitFilter(): FilterItem {
    val rgbKnots = arrayOfNulls<Point>(8)
    rgbKnots[0] = Point(0F, 0F)
    rgbKnots[1] = Point(34F, 6F)
    rgbKnots[2] = Point(69F, 23F)
    rgbKnots[3] = Point(100F, 58F)
    rgbKnots[4] = Point(150F, 154F)
    rgbKnots[5] = Point(176F, 196F)
    rgbKnots[6] = Point(207F, 233F)
    rgbKnots[7] = Point(255F, 255F)
    val filter = Filter()
    filter.addSubFilter(ToneCurveSubFilter(rgbKnots, null, null, null))
    return FilterItem("Starlit", filter)
}

fun getBlueMessFilter(): FilterItem {
    val redKnots = arrayOfNulls<Point>(8)
    redKnots[0] = Point(0F, 0F)
    redKnots[1] = Point(86F, 34F)
    redKnots[2] = Point(117F, 41F)
    redKnots[3] = Point(146F, 80F)
    redKnots[4] = Point(170F, 151F)
    redKnots[5] = Point(200F, 214F)
    redKnots[6] = Point(225F, 242F)
    redKnots[7] = Point(255F, 255F)
    val filter = Filter()
    filter.addSubFilter(ToneCurveSubFilter(null, redKnots, null, null))
    filter.addSubFilter(BrightnessSubFilter(30))
    filter.addSubFilter(ContrastSubFilter(1f))
    return FilterItem("Blue Mess", filter)
}

fun getAweStruckVibeFilter(): FilterItem {
    val rgbKnots = arrayOfNulls<Point>(5)
    val redKnots = arrayOfNulls<Point>(5)
    val greenKnots = arrayOfNulls<Point>(6)
    val blueKnots = arrayOfNulls<Point>(7)

    rgbKnots[0] = Point(0F, 0F)
    rgbKnots[1] = Point(80F, 43F)
    rgbKnots[2] = Point(149F, 102F)
    rgbKnots[3] = Point(201F, 173F)
    rgbKnots[4] = Point(255F, 255F)

    redKnots[0] = Point(0F, 0F)
    redKnots[1] = Point(125F, 147F)
    redKnots[2] = Point(177F, 199F)
    redKnots[3] = Point(213F, 228F)
    redKnots[4] = Point(255F, 255F)


    greenKnots[0] = Point(0F, 0F)
    greenKnots[1] = Point(57F, 76F)
    greenKnots[2] = Point(103F, 130F)
    greenKnots[3] = Point(167F, 192F)
    greenKnots[4] = Point(211F, 229F)
    greenKnots[5] = Point(255F, 255F)


    blueKnots[0] = Point(0F, 0F)
    blueKnots[1] = Point(38F, 62F)
    blueKnots[2] = Point(75F, 112F)
    blueKnots[3] = Point(116F, 158F)
    blueKnots[4] = Point(171F, 204F)
    blueKnots[5] = Point(212F, 233F)
    blueKnots[6] = Point(255F, 255F)

    val filter = Filter()
    filter.addSubFilter(ToneCurveSubFilter(rgbKnots, redKnots, greenKnots, blueKnots))
    return FilterItem("Awe Struck Vibe", filter)
}

fun getLimeStutterFilter(): FilterItem {
    val blueKnots = arrayOfNulls<Point>(3)
    blueKnots[0] = Point(0F, 0F)
    blueKnots[1] = Point(165F, 114F)
    blueKnots[2] = Point(255F, 255F)
    // Check whether output is null or not.
    val filter = Filter()
    filter.addSubFilter(ToneCurveSubFilter(null, null, null, blueKnots))
    return FilterItem("Lime Stutter", filter)
}

fun getNightWhisperFilter(): FilterItem {
    val rgbKnots = arrayOfNulls<Point>(3)
    val redKnots = arrayOfNulls<Point>(4)
    val greenKnots = arrayOfNulls<Point>(3)
    val blueKnots = arrayOfNulls<Point>(3)

    rgbKnots[0] = Point(0F, 0F)
    rgbKnots[1] = Point(174F, 109F)
    rgbKnots[2] = Point(255F, 255F)

    redKnots[0] = Point(0F, 0F)
    redKnots[1] = Point(70F, 114F)
    redKnots[2] = Point(157F, 145F)
    redKnots[3] = Point(255F, 255F)

    greenKnots[0] = Point(0F, 0F)
    greenKnots[1] = Point(109F, 138F)
    greenKnots[2] = Point(255F, 255F)

    blueKnots[0] = Point(0F, 0F)
    blueKnots[1] = Point(113F, 152F)
    blueKnots[2] = Point(255F, 255F)

    val filter = Filter()
    filter.addSubFilter(ToneCurveSubFilter(rgbKnots, redKnots, greenKnots, blueKnots))
    return FilterItem("Night Whisper", filter)
}

fun getMayFairFilter(): FilterItem {
    val rgbKnots = arrayOfNulls<Point>(8)
    rgbKnots[0] = Point(0f, 0f)
    rgbKnots[1] = Point(34f, 6f)
    rgbKnots[2] = Point(69f, 23f)
    rgbKnots[3] = Point(100f, 58f)
    rgbKnots[4] = Point(150f, 154f)
    rgbKnots[5] = Point(176f, 196f)
    rgbKnots[6] = Point(207f, 233f)
    rgbKnots[7] = Point(255f, 255f)
    val filter = Filter()
    filter.addSubFilter(ToneCurveSubFilter(rgbKnots, null, null, null))
    return FilterItem("May Fair", filter)
}

fun getSierraFilter(): FilterItem {
    val rgbKnots = arrayOfNulls<Point>(2)
    val redKnots = arrayOfNulls<Point>(2)

    rgbKnots[0] = Point(0f, 54f)
    rgbKnots[1] = Point(255f, 255f)

    redKnots[0] = Point(0f, 21f)
    redKnots[1] = Point(255f, 255f)


    val filter = Filter()
    filter.addSubFilter(ToneCurveSubFilter(rgbKnots, redKnots, null, null))
    filter.addSubFilter(ContrastSubFilter(1.33f))
    filter.addSubFilter(BrightnessSubFilter(-30))
    return FilterItem("Sierra", filter)
}

fun getAmazonFilter(): FilterItem {
    val blueKnots = arrayOfNulls<Point>(6)
    blueKnots[0] = Point(0f, 0f)
    blueKnots[1] = Point(11f, 40f)
    blueKnots[2] = Point(36f, 99f)
    blueKnots[3] = Point(86f, 151f)
    blueKnots[4] = Point(167f, 209f)
    blueKnots[5] = Point(255f, 255f)
    val filter = Filter()
    filter.addSubFilter(ContrastSubFilter(1.2f))
    filter.addSubFilter(ToneCurveSubFilter(null, null, null, blueKnots))
    return FilterItem("Amazon", filter)
}

fun getAdeleFilter(): FilterItem {
    val filter = Filter()
    filter.addSubFilter(SaturationSubFilter(-100f))
    return FilterItem("Adele", filter)
}

fun getCruzFilter(): FilterItem {
    val filter = Filter()
    filter.addSubFilter(SaturationSubFilter(-100f))
    filter.addSubFilter(ContrastSubFilter(1.3f))
    filter.addSubFilter(BrightnessSubFilter(20))
    return FilterItem("Cruz", filter)
}

fun getMetropolisFilter(): FilterItem {
    val filter = Filter()
    filter.addSubFilter(SaturationSubFilter(-1f))
    filter.addSubFilter(ContrastSubFilter(1.7f))
    filter.addSubFilter(BrightnessSubFilter(70))
    return FilterItem("Metropolis", filter)
}

fun getAudreyFilter(): FilterItem {
    val filter = Filter()

    val redKnots = arrayOfNulls<Point>(3)
    redKnots[0] = Point(0f, 0f)
    redKnots[1] = Point(124f, 138f)
    redKnots[2] = Point(255f, 255f)

    filter.addSubFilter(SaturationSubFilter(-100f))
    filter.addSubFilter(ContrastSubFilter(1.3f))
    filter.addSubFilter(BrightnessSubFilter(20))
    filter.addSubFilter(ToneCurveSubFilter(null, redKnots, null, null))
    return FilterItem("Audrey", filter)
}

fun getRiseFilter(): FilterItem {
    val blueKnots = arrayOfNulls<Point>(4)
    val redKnots = arrayOfNulls<Point>(4)

    blueKnots[0] = Point(0f, 0f)
    blueKnots[1] = Point(39f, 70f)
    blueKnots[2] = Point(150f, 200f)
    blueKnots[3] = Point(255f, 255f)

    redKnots[0] = Point(0f, 0f)
    redKnots[1] = Point(45f, 64f)
    redKnots[2] = Point(170f, 190f)
    redKnots[3] = Point(255f, 255f)

    val filter = Filter()
    filter.addSubFilter(ContrastSubFilter(1.9f))
    filter.addSubFilter(BrightnessSubFilter(60))
    //        filter.addSubFilter(VignetteSubfilter(ctx, 200))
    filter.addSubFilter(ToneCurveSubFilter(null, redKnots, null, blueKnots))
    return FilterItem("Rise", filter)
}

fun getMarsFilter(): FilterItem {
    val filter = Filter()
    filter.addSubFilter(ContrastSubFilter(1.5f))
    filter.addSubFilter(BrightnessSubFilter(10))
    return FilterItem("Mars", filter)
}

fun getAprilFilter(): FilterItem {
    val blueKnots = arrayOfNulls<Point>(4)
    val redKnots = arrayOfNulls<Point>(4)

    blueKnots[0] = Point(0f, 0f)
    blueKnots[1] = Point(39f, 70f)
    blueKnots[2] = Point(150f, 200f)
    blueKnots[3] = Point(255f, 255f)

    redKnots[0] = Point(0f, 0f)
    redKnots[1] = Point(45f, 64f)
    redKnots[2] = Point(170f, 190f)
    redKnots[3] = Point(255f, 255f)

    val filter = Filter()
    filter.addSubFilter(ContrastSubFilter(1.5f))
    filter.addSubFilter(BrightnessSubFilter(5))
    //        filter.addSubFilter(VignetteSubfilter(context, 150))
    filter.addSubFilter(ToneCurveSubFilter(null, redKnots, null, blueKnots))
    return FilterItem("April", filter)
}

fun getHaanFilter(): FilterItem {
    val greenKnots = arrayOfNulls<Point>(3)
    greenKnots[0] = Point(0f, 0f)
    greenKnots[1] = Point(113f, 142f)
    greenKnots[2] = Point(255f, 255f)

    val filter = Filter()
    filter.addSubFilter(ContrastSubFilter(1.3f))
    filter.addSubFilter(BrightnessSubFilter(60))
    //        filter.addSubFilter(VignetteSubfilter(context, 200))
    filter.addSubFilter(ToneCurveSubFilter(null, null, greenKnots, null))
    return FilterItem("Haan", filter)
}

fun getOldManFilter(): FilterItem {
    val filter = Filter()
    filter.addSubFilter(BrightnessSubFilter(30))
    filter.addSubFilter(SaturationSubFilter(0.8f))
    filter.addSubFilter(ContrastSubFilter(1.3f))
    //        filter.addSubFilter(VignetteSubfilter(context, 100))
    filter.addSubFilter(ColorOverlaySubFilter(100, .2f, .2f, .1f))
    return FilterItem("Old Man", filter)
}

fun getClarendonFilter(): FilterItem {
    val redKnots = arrayOfNulls<Point>(4)
    val greenKnots = arrayOfNulls<Point>(4)
    val blueKnots = arrayOfNulls<Point>(4)

    redKnots[0] = Point(0f, 0f)
    redKnots[1] = Point(56f, 68f)
    redKnots[2] = Point(196f, 206f)
    redKnots[3] = Point(255f, 255f)


    greenKnots[0] = Point(0f, 0f)
    greenKnots[1] = Point(46f, 77f)
    greenKnots[2] = Point(160f, 200f)
    greenKnots[3] = Point(255f, 255f)


    blueKnots[0] = Point(0f, 0f)
    blueKnots[1] = Point(33f, 86f)
    blueKnots[2] = Point(126f, 220f)
    blueKnots[3] = Point(255f, 255f)

    val filter = Filter()
    filter.addSubFilter(ContrastSubFilter(1.5f))
    filter.addSubFilter(BrightnessSubFilter(-10))
    filter.addSubFilter(ToneCurveSubFilter(null, redKnots, greenKnots, blueKnots))
    return FilterItem("Clarendon", filter)
}

fun createFilters(): ArrayList<FilterItem> {
    return arrayListOf(
        getDefaultFilter(),
        getStarLitFilter(),
        getBlueMessFilter(),
        getAweStruckVibeFilter(),
        getLimeStutterFilter(),
        getNightWhisperFilter(),
        getMayFairFilter(),
        getSierraFilter(),
        getAmazonFilter(),
        getAdeleFilter(),
        getCruzFilter(),
        getMetropolisFilter(),
        getAudreyFilter(),
        getRiseFilter(),
        getMarsFilter(),
        getAprilFilter(),
        getHaanFilter(),
        getOldManFilter(),
        getClarendonFilter()
    )
}