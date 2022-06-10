package com.example.nubank_clone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nubank_clone.databinding.ItemPagamentoBinding
import com.example.nubank_clone.model.Pagamentos

class NuAdapter(
    private val context: Context,
    private val listPagamentos: MutableList<Pagamentos>
) : RecyclerView.Adapter<NuAdapter.PagamentoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagamentoViewHolder {
     val ItemList = ItemPagamentoBinding.inflate(LayoutInflater.from(context), parent,false)
        return PagamentoViewHolder(ItemList)
    }

    override fun onBindViewHolder(holder: PagamentoViewHolder, position: Int) {
        holder.iconPagamento.setBackgroundResource(listPagamentos[position].Icon!!)
        holder.titlePagamento.text = listPagamentos[position].title
    }

    override fun getItemCount() = listPagamentos.size

    inner class PagamentoViewHolder(
        binding: ItemPagamentoBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        val iconPagamento = binding.icPagamento
        val titlePagamento = binding.tituloPagamento
    }
}
