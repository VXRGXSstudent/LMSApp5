package com.vargas.lmsapp5

import android.app.AlertDialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MenuActionBarActivity : DebugActivity() {

    private val context: Context get() = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.title = "Disciplinas"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    // função sobrescrita para inflar o menu na ActionBar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        setContentView(R.layout.activity_menu_action_bar)
        // infla o menu com os botões da ActionBar
        menuInflater.inflate(R.menu.menu_action_bar, menu)
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
}