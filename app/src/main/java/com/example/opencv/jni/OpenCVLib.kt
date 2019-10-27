package com.example.opencv.jni

import android.graphics.Bitmap

object OpenCVLib {
    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    external fun opBitmap(bitmap: Bitmap, argb8888: Bitmap.Config): Bitmap

    // Used to load the 'native-lib' library on application startup.
    init {
        System.loadLibrary("native-lib")
    }

}