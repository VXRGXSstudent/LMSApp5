package com.vargas.lmsapp5

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.vargas.lmsapp5.databinding.ActivityMenuLateralBinding
import com.google.android.material.navigation.NavigationView

class MenuLateralActivity : DebugActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityMenuLateralBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        // configuração no menu latera
        configurarMenuLateral()

        binding.btnSair.setOnClickListener {
            onClickSair()
        }
    }

    // método que deve ser implementado quando a activity implementa
    // a interface NavigationView.OnNavigationItemSelectedListener
    // para tratar os eventos de clique no menu lateral
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val builder = AlertDialog.Builder(this)
        when (item.itemId) {
            R.id.nav_diciplinas -> {
                val texto = "Clicou em Disciplinas."
                builder.setTitle("Navegation Drawer")
                builder.setMessage(texto)
                builder.create()
                builder.show()
                Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
            }
            R.id.nav_mensagens -> {
                val texto = "Clicou em Mensagens."
                builder.setTitle("Navegation Drawer")
                builder.setMessage(texto)
                builder.create()
                builder.show()
                Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
            }
            R.id.nav_forum -> {
                val texto = "Clicou em Forum."
                builder.setTitle("Navegation Drawer")
                builder.setMessage(texto)
                builder.create()
                builder.show()
                Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
            }
            R.id.nav_localizacao -> {
                val texto = "Clicou em Localização."
                builder.setTitle("Navegation Drawer")
                builder.setMessage(texto)
                builder.create()
                builder.show()
                Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
            }
            R.id.nav_config -> {
                val texto = "Clicou em Configuração."
                builder.setTitle("Navegation Drawer")
                builder.setMessage(texto)
                builder.create()
                builder.show()
                Toast.makeText(this, texto, Toast.LENGTH_SHORT).show()
            }
        }

        // fecha menu depois de tratar o evento
        binding.layoutMenuLateral.closeDrawer(GravityCompat.START)
        return true
    }

    // configuração do navigation Drawer com a toolbar
    private fun configurarMenuLateral() {
        // ícone de menu (hamburger) para mostrar o menu
        var toogle = ActionBarDrawerToggle(
            this,
            binding.layoutMenuLateral,
            binding.toolbarInclude.toolbar,
            R.string.navigation_drawer_open,
            R.string.navigation_drawer_close)
        binding.layoutMenuLateral.addDrawerListener(toogle)
        toogle.syncState()
        binding.menuLateral.setNavigationItemSelectedListener(this)
    }

    fun onClickSair() {
        val intent = Intent(context, TelaInicialActivity::class.java)
        startActivity(intent)
    }

}