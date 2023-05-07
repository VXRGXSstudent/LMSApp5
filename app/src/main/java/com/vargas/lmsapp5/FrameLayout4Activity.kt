package com.vargas.lmsapp5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FrameLayout4Activity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout4)
        val btn: Button = findViewById(R.id.btn_frame5)

        btn.setOnClickListener {
            onClickFrame5()
        }
    }

    fun onClickFrame5() {
        val intent = Intent(context, FrameLayout5Activity::class.java)
        startActivity(intent)
    }

}