package com.vargas.lmsapp5

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.vargas.lmsapp5.databinding.ActivityTelaInicialBinding

class TelaInicialActivity : DebugActivity() {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityTelaInicialBinding.inflate(layoutInflater)
    }

    val paises = listOf("Alemanha",
        "Brasil",
        "Estados Unidos",
        "Inglaterra",
        "Italia")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnPaises.setOnClickListener {
            onClickPaises()
        }

        binding.btnParametro.setOnClickListener {
            onClickParametro()
        }

        binding.btnResultado.setOnClickListener {
            onClickResultado()
        }

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
            //Toast.makeText(context, "$result",
            //  Toast.LENGTH_LONG).show()
        }
    }


    fun onClickPaises() {
        val intent = Intent(context, PaisesActivity::class.java)
        val params = Bundle()
        val nomePais = binding.camPais.text.toString()
        val pos = paises.indexOf(nomePais)
        val builder = AlertDialog.Builder(this)
        if (pos == -1) {
            builder.setTitle("Informações do País")
            builder.setMessage("País Não Cadastrado.")
            builder.create()
            builder.show()
        }
        else {
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

}