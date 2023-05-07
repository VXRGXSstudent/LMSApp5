package com.vargas.lmsapp5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FrameLayout3Activity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout3)
        val btn: Button = findViewById(R.id.btn_frame4)

        btn.setOnClickListener {
            onClickFrame4()
        }
    }

    fun onClickFrame4() {
        val intent = Intent(context, FrameLayout4Activity::class.java)
        startActivity(intent)
    }
}