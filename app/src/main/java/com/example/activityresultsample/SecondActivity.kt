package com.example.activityresultsample

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        cancel_button.setOnClickListener {
            setResult(Activity.RESULT_CANCELED)
            finish()
        }

        ok_btn.setOnClickListener {
            setResult(Activity.RESULT_OK)
            finish()
        }
    }
}