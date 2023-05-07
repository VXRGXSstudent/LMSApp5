package com.vargas.lmsapp5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.vargas.lmsapp5.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : AppCompatActivity() {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityTelaInicialBinding.inflate(layoutInflater)
    }
    val paises = listOf("Alemanha", "Brasil", "Estados Unidos", "Inglaterra", "Italia")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnPaises.setOnClickListener() {
            onClickPaises()
        }

        binding.btnParametro.setOnClickListener {
            onClickParametro()
        }

        binding.btnResultado.setOnClickListener {
            onClickResultado()
        }


        binding.btnMenuActionBar.setOnClickListener {
            onClickMenuActionBar()
        }

        binding.btnToolbar.setOnClickListener {
            onClickToolbar()
        }

        binding.btnFrame1.setOnClickListener {
            onClickFrameLayout()
        }

        binding.btnLinear1.setOnClickListener {
            onClickLinearLayout()
        }

        binding.btnConstraint.setOnClickListener {
            onClickConstraintLayout()
        }

        binding.btnScroll.setOnClickListener {
            onClickScroll()
        }

        binding.btnMenuLateral.setOnClickListener {
            onClickMenuLateral()
        }

        binding.btnListsCards.setOnClickListener {
            onClickListsCards()
        }

        binding.btnSair.setOnClickListener {
            onClickSair()
        }

    }

    fun onClickPaises() {
        val builder = AlertDialog.Builder(this)
        val pos = paises.indexOf(binding.camPais.text.toString())
        if (pos == -1) {
            val texto = "País Não Cadastrado."
            builder.setTitle("Consulta ao Países:")
            builder.setMessage(texto)
            builder.create()
            builder.show()
            Toast.makeText(context, texto, Toast.LENGTH_LONG).show()
        } else {
            val intent = Intent(context, PaisesActivity::class.java)
            val params = Bundle()
            val nomePais = binding.camPais.text.toString()
            params.putString("nome", nomePais)
            intent.putExtras(params)
            startActivity(intent)
        }

    }

    fun onClickParametro() {
        val intent = Intent(context, ParametroActivity::class.java)
        val numero = binding.camNumero.text.toString().toInt()
        intent.putExtra("numero", numero)
        startActivity(intent)
    }

    fun onClickResultado() {
        val intent = Intent(context, ResultadoActivity::class.java)
        startActivityForResult(intent, 1)
    }

    override fun onActivityResult(requestCode: Int,
                                  resultCode: Int,
                                  data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            val result = data?.getStringExtra("result")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Informações do Resultado:")
            builder.setMessage(result)
            builder.create()
            builder.show()
            Toast.makeText(context, "$result", Toast.LENGTH_LONG).show()
        }
    }

    fun onClickMenuActionBar() {
        val intent = Intent(context, MenuActionBarActivity::class.java)
        startActivity(intent)
    }

    fun onClickToolbar() {
        val intent = Intent(context, ToolbarActivity::class.java)
        intent.putExtra("msg", "Menu ToolBar Ativado.")
        startActivity(intent)
    }

    fun onClickFrameLayout() {
        val intent = Intent(context, FrameLayout1Activity::class.java)
        startActivity(intent)
    }

    fun onClickLinearLayout() {
        val intent = Intent(context, LinearLayout1Activity::class.java)
        startActivity(intent)
    }

    fun onClickConstraintLayout() {
        val intent = Intent(context, ConstraintLayoutActivity::class.java)
        startActivity(intent)
    }

    fun onClickSair() {
        val intent = Intent(context, MainActivity::class.java)
        startActivity(intent)
    }

    fun onClickScroll() {
        val intent = Intent(context, ScrollViewActivity::class.java)
        startActivity(intent)
    }

    fun onClickListsCards() {
        val intent = Intent(context, ListsAndCardsActivity::class.java)
        startActivity(intent)
    }

    fun onClickMenuLateral() {
        val intent = Intent(context, MenuLateralActivity::class.java)
        startActivity(intent)
    }

}