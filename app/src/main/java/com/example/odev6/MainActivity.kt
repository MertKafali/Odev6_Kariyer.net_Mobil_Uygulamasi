package com.example.odev6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.odev6.adapter.BilgilerAdapter
import com.example.odev6.databinding.BottomSayfaBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim:BottomSayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = BottomSayfaBinding.inflate(layoutInflater)

        /*tasarim.rv.layoutManager = LinearLayoutManager(requireContext())
        val ilanlarListesi = ArrayList<bilgiler>()
        val i1 = bilgiler(1,"Yazılım Mühendisi","ASDFG Mühendislik A.Ş","Adana",10,"Tam Zamanlı",false)
        ilanlarListesi.add(i1)

        val adapter = BilgilerAdapter(requireContext(),ilanlarListesi)*/

        setContentView(tasarim.root)
    }

}