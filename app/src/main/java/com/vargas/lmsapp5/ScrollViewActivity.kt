package com.vargas.lmsapp5


import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScrollViewActivity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view)
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