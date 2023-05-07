package com.vargas.lmsapp5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LinearLayout1Activity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout1)
        val btn: Button = findViewById(R.id.btn_linear2)

        btn.setOnClickListener {
            onClickLinear2()
        }
    }

    fun onClickLinear2() {
        val intent = Intent(context, LinearLayout2Activity::class.java)
        startActivity(intent)
    }

}