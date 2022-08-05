package com.example.odev6.adapter

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6.bilgiler
import com.example.odev6.databinding.CardTasarimBinding

class BilgilerAdapter(var mContext:Context,var ilanlarListesi:List<bilgiler>)//parametreler
    : RecyclerView.Adapter<BilgilerAdapter.CardTasarimTututucu>() {//inner class adaptere bağlandı
    inner class CardTasarimTututucu(tasarim:CardTasarimBinding): RecyclerView.ViewHolder(tasarim.root){//card tasarımı sınıfı
        var tasarim:CardTasarimBinding
        init {
            this.tasarim = tasarim // dışardan gelen tasarimi aktardık.
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTututucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater, parent, false)
        return CardTasarimTututucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTututucu, position: Int) {
        val ilan = ilanlarListesi.get(position)
        val t = holder.tasarim
        t.textViewIlanBaslik.text = "${ilan.ilan_baslik}"
        t.textViewIlanAciklama.text = "${ilan.ilan_info}"
        t.textViewIlanKonum.text = "${ilan.ilan_konum}"
        t.textViewIlanTur.text = "${ilan.ilan_tur}"
        t.textView6.text = "${ilan.ilan_zaman} gün önce"
        if (ilan.ilan_goruldu == true){
            t.textView7.setVisibility(View.VISIBLE)
            t.textViewIlanBaslik.setTextColor(Color.GRAY)
            t.textViewIlanAciklama.setTextColor(Color.GRAY)
            t.textViewIlanKonum.setTextColor(Color.LTGRAY)
            t.textViewIlanTur.setTextColor(Color.GRAY)
        }else{
            t.textView7.setVisibility(View.INVISIBLE)
            t.textViewIlanBaslik.setTextColor(Color.BLACK)
            t.textViewIlanAciklama.setTextColor(Color.BLACK)
            t.textViewIlanKonum.setTextColor(Color.GRAY)
            t.textViewIlanTur.setTextColor(Color.GRAY)
        }
    }

    override fun getItemCount(): Int {
        return ilanlarListesi.size
    }

}