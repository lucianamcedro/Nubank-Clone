package com.example.nubank_clone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nubank_clone.adapter.AdapterProduto
import com.example.nubank_clone.adapter.NuAdapter
import com.example.nubank_clone.databinding.ActivityMainBinding
import com.example.nubank_clone.model.Pagamentos
import com.example.nubank_clone.model.Produto

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPagamento: NuAdapter
    private lateinit var adapterProduto: AdapterProduto
    private val listPagamento: MutableList<Pagamentos> = mutableListOf()
    private val listaProduto: MutableList<Produto> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()

        val recyclerIconsPagamentos = binding.recyclerPagamentos
        recyclerIconsPagamentos.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.HORIZONTAL, false
        )

        recyclerIconsPagamentos.setHasFixedSize(true)

        adapterPagamento = NuAdapter(this, listPagamento)
        recyclerIconsPagamentos.adapter = adapterPagamento

        listIconsPagamento()

        val recyclerProduto = binding.recyclerProdutos
        recyclerProduto.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.HORIZONTAL,false)
        recyclerProduto.setHasFixedSize(true)
        adapterProduto = AdapterProduto(this, listaProduto)
        recyclerProduto.adapter = adapterProduto

        listaProdutosInformativo()
    }

    private fun listIconsPagamento() {
        val icone1 = Pagamentos(R.drawable.ic_pix, "Área Pix")
        listPagamento.add(icone1)
        val icone2 = Pagamentos(R.drawable.barcode, "Pagar")
        listPagamento.add(icone2)
        val icone3 = Pagamentos(R.drawable.emprestimo, "Pegar \n Emprestado")
        listPagamento.add(icone3)
        val icone4 = Pagamentos(R.drawable.depositar, "Depositar")
        listPagamento.add(icone4)
        val icone5 = Pagamentos(R.drawable.transferencia, "Transferir")
        listPagamento.add(icone5)
        val icone6 = Pagamentos(R.drawable.ic_smartphone, "Recarga \n de celular")
        listPagamento.add(icone6)
        val icone7 = Pagamentos(R.drawable.ic_baseline_monetization_on_24, "Cobrar")
        listPagamento.add(icone7)
        val icone8 = Pagamentos(R.drawable.doacao, "Doação")
        listPagamento.add(icone8)
    }

    private fun listaProdutosInformativo(){
        val textoInformativo1 = Produto("Participe da Promoção Tudo no Roxinho e concorra a...")
        listaProduto.add(textoInformativo1)
        val textoInformativo2 = Produto("Chegou o débito automático da fatura do cartão")
        listaProduto.add(textoInformativo2)
        val textoInformativo3 = Produto("Conheça a conta PJ: prática e livre de burocracia para se...")
        listaProduto.add(textoInformativo3)
        val textoInformativo4 = Produto("Salve seus amigos da burocracia: Faça um convite...")
        listaProduto.add(textoInformativo4)


    }
}
