package com.example.opencv

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.opencv.jni.OpenCVLib
import com.example.opencv.jni.OpenCVLib.stringFromJNI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        sample_text.text = stringFromJNI()

        sample_image.setOnClickListener {
            var bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.image, null);
            sample_image2.setImageBitmap(OpenCVLib.opBitmap(bitmap, Bitmap.Config.ARGB_8888));
        };

    }


}
