package com.vargas.lmsapp5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.vargas.lmsapp5.databinding.ActivityMainBinding

class MainActivity : DebugActivity() {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        // setContentView(R.layout.activity_login)
        setContentView(binding.root)

        binding.root.setOnClickListener() {
            onClickLogin()
        }
    }

    fun onClickLogin() {
        val intent = Intent(context, LoginActivity::class.java)
        startActivity(intent)
    }

}