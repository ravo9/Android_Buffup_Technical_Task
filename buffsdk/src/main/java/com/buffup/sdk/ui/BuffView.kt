package com.buffup.sdk.ui

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.VideoView

class BuffView : ViewGroup {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        getChildAt(0).layout(left, top, right, bottom)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        if (getChildCount() > 1)
            throw IllegalArgumentException("Only 1 child allowed")

        if (getChildCount() == 0)
            throw IllegalArgumentException("At least 1 child of VideoView type is required")

        if (!(getChildAt(0) is VideoView))
            throw IllegalArgumentException("Child must be a VideoView")
    }

}
