package com.example.activityresultsample

import android.app.Activity
import android.content.Intent
import android.os.Build.ID
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // General activity result contract
    private val openPostActivity =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                // Do something here
                val okDataIntent = result.data
                Toast.makeText(this, "Result OK from SecondActivity", Toast.LENGTH_SHORT).show()
            }
            if (result.resultCode == Activity.RESULT_CANCELED) {
                // Do something here
                val canceledDataIntent = result.data
                Toast.makeText(this, "Result Cancelled from SecondActivity", Toast.LENGTH_SHORT).show()
            }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        next_activity_btn.setOnClickListener {
            openPostActivity.launch(
                Intent(this, SecondActivity::class.java).apply {
                    putExtra(ID, 1)
                }
            )
        }
    }
}