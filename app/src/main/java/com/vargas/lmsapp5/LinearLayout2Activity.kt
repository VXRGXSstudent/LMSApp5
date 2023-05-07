package com.vargas.lmsapp5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LinearLayout2Activity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear_layout2)
        val btn: Button = findViewById(R.id.btn_linear3)

        btn.setOnClickListener {
            onClickLinear3()
        }
    }

    fun onClickLinear3() {
        val intent = Intent(context, LinearLayout3Activity::class.java)
        startActivity(intent)
    }

}