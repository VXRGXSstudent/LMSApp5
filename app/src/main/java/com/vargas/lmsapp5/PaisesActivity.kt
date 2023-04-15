package com.vargas.lmsapp5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vargas.lmsapp5.databinding.ActivityPaisesBinding

class PaisesActivity : DebugActivity() {

    private val context: Context get() = this

    private val binding by lazy {
        ActivityPaisesBinding.inflate(layoutInflater)
    }

    val paises = listOf("Alemanha","Brasil", "Estados Unidos", "Inglaterra", "Italia")
    val localizacao = listOf("Europa", "América do Sul", "América do Norte", "Europa", "Europa")
    val idioma = listOf("alemão", "português", "inglês", "inglês", "italiano")
    val habitantes = listOf(1000, 2000, 3000, 4000, 5000)
    val area = listOf(10000, 20000, 30000, 40000, 50000)
    val bandeira = listOf(R.drawable.img_bandeira_alemanha,
        R.drawable.img_bandeira_brasil, 2,
        R.drawable.img_bandeira_inglaterra,
        R.drawable.img_bandeira_italia)
    val mapa = listOf(R.drawable.img_mapa_alemanha,
        R.drawable.img_mapa_brasil, 2,
        R.drawable.img_mapa_inglaterra,
        R.drawable.img_mapa_italia)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val args = intent.extras
        val pais = args?.getString("nome")
        val pos = paises.indexOf(pais)
        binding.camPais.text = pais
        binding.camLocalizacao.text = localizacao[pos]
        binding.camHabitantes.text = habitantes[pos].toString()
        binding.camArea.text = area[pos].toString()
        binding.camIdioma.text = idioma[pos]
        binding.imgBandeira.setImageResource(bandeira[pos])
        binding.imgMapa.setImageResource(mapa[pos])
    }
}