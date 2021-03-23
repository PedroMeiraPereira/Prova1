package br.com.cotemig.pedro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_eua.setOnClickListener {
            moeda.text = resources.getString(R.string.conversao_em_dolar)
            converteReal(box_preencher_valor.text.toString().toDouble(), button_eua.text.toString())
        }

        button_mexico.setOnClickListener {
            moeda.text = resources.getString(R.string.conversao_em_euro)
            converteReal(box_preencher_valor.text.toString().toDouble(), button_mexico.text.toString())
        }

        button_russia.setOnClickListener {
            moeda.text = resources.getString(R.string.conversao_em_rublo)
            converteReal(box_preencher_valor.text.toString().toDouble(), button_russia.text.toString())
        }

        button_eau.setOnClickListener {
            moeda.text = resources.getString(R.string.conversao_em_dirra)
            converteReal(box_preencher_valor.text.toString().toDouble(), button_eau.text.toString())
        }

        button_japao.setOnClickListener {
            moeda.text = resources.getString(R.string.conversao_em_iene)
            converteReal(box_preencher_valor.text.toString().toDouble(), button_japao.text.toString())
        }

        button_india.setOnClickListener {
            moeda.text = resources.getString(R.string.conversao_em_rupia)
            converteReal(box_preencher_valor.text.toString().toDouble(), button_india.text.toString())
        }

    }

    fun converteReal(moeda: Double, botao: String){
        var v = 0.0
        if(botao == resources.getString(R.string.dolar)) {
            v = moeda * 0.18
            valor.text = String.format("US$ %.2f", v)
        }else if(botao == resources.getString(R.string.euro)) {
            v = moeda * 0.15
            valor.text = String.format("%.2f €", v)
        }else if(botao == resources.getString(R.string.rublo)) {
            v = moeda * 13.53
            valor.text = String.format("%.2f ₱", v)
        }else if(botao == resources.getString(R.string.dirra)) {
            v = moeda * 1.49
            valor.text = String.format("%.2f", v)
        }else if(botao == resources.getString(R.string.iene)) {
            v = moeda * 20.30
            valor.text = String.format("¥ %.2f", v)
        }else if(botao == resources.getString(R.string.rupia)) {
            v = moeda * 13.18540
            valor.text = String.format("%.2f INR", v)
        }
    }
}