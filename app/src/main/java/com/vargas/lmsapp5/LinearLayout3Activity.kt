package com.vargas.lmsapp5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LinearLayout3Activity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout3)
        val btn: Button = findViewById(R.id.btn_linear4)

        btn.setOnClickListener {
            onClickLinear4()
        }
    }

    fun onClickLinear4() {
        val intent = Intent(context, LinearLayout4Activity::class.java)
        startActivity(intent)
    }

}