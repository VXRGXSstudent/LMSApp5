package com.vargas.lmsapp5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FrameLayout2Activity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout2)
        val btn: Button = findViewById(R.id.btn_frame3)

        btn.setOnClickListener {
            onClickFrame3()
        }
    }

    fun onClickFrame3() {
        val intent = Intent(context, FrameLayout3Activity::class.java)
        startActivity(intent)
    }
}