package com.effective.android.panel.interfaces

interface OnScrollOutsideBorder {
    fun canLayoutOutsideBorder(): Boolean
    fun getOutsideHeight(): Int
}