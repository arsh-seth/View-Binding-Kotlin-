package com.example.viewbinding

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.apply {
            text="10"
            textView.setTextColor(resources.getColor(R.color.black))
            getResources().getColor(R.color.design_default_color_background)
            textSize=30f
        }

        }

    fun showToast(view: View) {
        Toast.makeText(view.context,"Button Pressed",Toast.LENGTH_LONG).show()
    }
}
