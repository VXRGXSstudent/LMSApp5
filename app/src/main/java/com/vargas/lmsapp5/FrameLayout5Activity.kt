package com.vargas.lmsapp5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FrameLayout5Activity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_layout5)
        val btn: Button = findViewById(R.id.btn_sair)

        btn.setOnClickListener {
            onClickSair()
        }
    }

    fun onClickSair() {
        val intent = Intent(context, TelaInicialActivity::class.java)
        startActivity(intent)
    }

}