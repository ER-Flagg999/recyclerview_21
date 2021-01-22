package com.erflagg.recyclerview_21.decorator

import android.annotation.SuppressLint
import android.graphics.Canvas
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView
import com.erflagg.recyclerview_21.R

class MyItemDecorator : RecyclerView.ItemDecoration() {

    @SuppressLint("ResourceAsColor")
    override fun onDraw(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        super.onDraw(c, parent, state)
        parent.children.forEachIndexed { index, view ->
            if(index % 2 == 0){
                view.setBackgroundColor(R.color.colorYellow)
            } else {
                view.setBackgroundColor(R.color.colorBlue)
            } }
    }
}