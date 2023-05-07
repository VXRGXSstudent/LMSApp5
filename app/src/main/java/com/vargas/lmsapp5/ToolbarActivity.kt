package com.vargas.lmsapp5

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.vargas.lmsapp5.databinding.ActivityToolbarBinding

class ToolbarActivity : DebugActivity() {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityToolbarBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)
        setContentView(binding.root)

        val toolbar = findViewById<Toolbar>(R.id.toolbar_include)
        setSupportActionBar(toolbar)
        //  ações na toolbar continuam funcionando
        supportActionBar?.title = "Disciplinas"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val msg = intent.getStringExtra("msg")
        binding.msgInicial.text = "Mensagem: " + msg

        binding.btnSair.setOnClickListener {
            onClickSair()
        }

    }

    // função sobrescrita para inflar o menu na Toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // setContentView(R.layout.activity_toolbar)
        // infla o menu com os botões da Toolbar
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // id do item clicado
        val id = item?.itemId
        // verificar qual item foi clicado e mostrar a mensagem
        //Toast na tela
        // a comparação é feita com o recurso de id definido no xml
        val builder = AlertDialog.Builder(this)
        if (id == R.id.action_buscar) {
            //  Toast.makeText(context, "Botão de buscar", Toast.LENGTH_LONG).show()
            val texto = "Opção Buscar Selecionada."
            builder.setTitle("Menu Action Bar:")
            builder.setMessage(texto)
            builder.create()
            builder.show()
            Toast.makeText(context, texto, Toast.LENGTH_LONG).show()
        }
        else if (id == R.id.action_atualizar) {
            // Toast.makeText(context, "Botão de atualizar", Toast.LENGTH_LONG).show()
            val texto = "Opção Atualizar Selecionada."
            builder.setTitle("Menu Action Bar:")
            builder.setMessage(texto)
            builder.create()
            builder.show()
            Toast.makeText(context, texto, Toast.LENGTH_LONG).show()
        }  else if (id == R.id.action_config) {
            //   Toast.makeText(context, "Botão de configurações", Toast.LENGTH_LONG).show()
            val texto = "Opção de Configuração Selecionada."
            builder.setTitle("Menu Action Bar:")
            builder.setMessage(texto)
            builder.create()
            builder.show()
            Toast.makeText(context, texto, Toast.LENGTH_LONG).show()
        }
        else if (id == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }

    fun onClickSair() {
        val intent = Intent(context, TelaInicialActivity::class.java)
        startActivity(intent)
    }
}