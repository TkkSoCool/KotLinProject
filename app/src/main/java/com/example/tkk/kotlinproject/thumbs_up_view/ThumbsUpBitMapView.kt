package com.example.tkk.kotlinproject.thumbs_up_view

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.TypedArray
import android.graphics.Bitmap
import android.util.AttributeSet
import android.view.View
import com.example.tkk.kotlinproject.R
import kotlin.properties.Delegates

@SuppressLint("ViewConstructor")
/**
 * Created  on 2018-06-05
 * @author 唐开阔
 * @describe 点赞左边的图标
 */
class ThumbsUpBitMapView(context : Context,  thumbsUpDecoration: Bitmap,  thumbsUpOff: Bitmap, thumbsUpOn: Bitmap) : View (context) {
    var mThumbsWidth : Int by Delegates.notNull()
    init {

    }
}