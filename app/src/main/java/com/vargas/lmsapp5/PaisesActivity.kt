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

    val paises = listOf("Brasil", "Angola", "Mocambique", "Portugal", "Guiné Bissau", "Timor Leste", "Guiné Equatorial", "Cabo Verde", "São Tomé e Príncipe")
    val localizacao = listOf("América do Sul", "África", "África", "Europa", "África", "Ásia", "África", "África", "África" )
    val habitantes = listOf("210.147.125", "33.934.000", "32.080.000", "10.310.000", "12.410.000", "1.344.000", "676.273", "587.925", "162.755")
    val area = listOf("8.510.000", "1.246.700", "801.590", "92.212", "245.875", "14.919", "28.051", "4.033", "964")
    val bandeira = listOf(R.drawable.img_bandeira_brasil,
        R.drawable.img_bandeira_angola,
        R.drawable.img_bandeira_mocambique,
        R.drawable.img_bandeira_portugal,
        R.drawable.img_bandeira_guine_bissau,
        R.drawable.img_bandeira_timor,
        R.drawable.img_bandeira_guine_equatorial,
        R.drawable.img_bandeira_cabo_verde,
        R.drawable.img_bandeira_sao_tome)
    val mapa = listOf(R.drawable.img_mapa_brasil,
        R.drawable.img_mapa_angola,
        R.drawable.img_mapa_mocambique,
        R.drawable.img_mapa_portugal,
        R.drawable.img_mapa_guine_bissau,
        R.drawable.img_mapa_timor,
        R.drawable.img_mapa_guine_equatorial,
        R.drawable.img_mapa_cabo_verde,
        R.drawable.img_mapa_sao_tome)

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
        binding.imgBandeira.setImageResource(bandeira[pos])
        binding.imgMapa.setImageResource(mapa[pos])
    }
}