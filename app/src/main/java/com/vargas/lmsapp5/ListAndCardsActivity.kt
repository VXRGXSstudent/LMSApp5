package com.vargas.lmsapp5

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.vargas.lmsapp5.databinding.ActivityListAndCardsBinding
import com.google.android.material.navigation.NavigationView

class ListsAndCardsActivity : DebugActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val context: Context get() = this
    private var disciplinas = listOf<Disciplina>()

    private val binding by lazy {
        ActivityListAndCardsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // configurar cardview
        binding.recyclerDisciplinas?.layoutManager = LinearLayoutManager(context)
        binding.recyclerDisciplinas?.itemAnimator = DefaultItemAnimator()
        binding.recyclerDisciplinas?.setHasFixedSize(true)
    }

    override fun onResume() {
        super.onResume()
        // task para recuperar as disciplinas
        taskDisciplinas()
    }

    fun taskDisciplinas() {
        disciplinas = DisciplinaService.getDisciplinas(context)
        // atualizar lista
        binding.recyclerDisciplinas?.adapter = DisciplinaAdapter(disciplinas) {onClickDisciplina(it)}
    }

    // tratamento do evento de clicar em uma disciplina
    fun onClickDisciplina(disciplina: Disciplina) {
        val builder = AlertDialog.Builder(this)
        val texto = "Clicou disciplina ${disciplina.nome}"
        builder.setTitle("Informações do Resultado:")
        builder.setMessage(texto)
        builder.create()
        builder.show()
        Toast.makeText(context, texto, Toast.LENGTH_SHORT).show()
        val params = Bundle()
        params.putString("disciplina", disciplina.toString())
        val intent = Intent(context, DisciplinaActivity::class.java).also {
            intent.putExtras(params)
            startActivity(intent)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        TODO("Not yet implemented")
    }

}