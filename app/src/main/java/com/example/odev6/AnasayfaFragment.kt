package com.example.odev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.odev6.adapter.BilgilerAdapter
import com.example.odev6.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)


        tasarim.rvv.layoutManager = LinearLayoutManager(requireContext())
        val ilanlarListesi = ArrayList<bilgiler>()
        val i2 = bilgiler(2,"Yazılım Mühendisi","Microsofoft Türkiye","İstanbul(Avrupa)",10,"Tam Zamanlı",false)
        val i1 = bilgiler(1,"Elektrik - Elektronik Mühendisi","ASELSAN","Ankara",3,"Tam Zamanlı",true)
        val i3 = bilgiler(3,"Android Developer","Gizli Firma","Adana",7,"Tam Zamanlı",false)
        val i4 = bilgiler(4,"System Engineer","Asdfg Defence","Ankara",1,"Tam Zamanlı",true)
        val i5 = bilgiler(5,"IOS Developer","Gizli Firma","İstanbul(Asya)",2,"Tam Zamanlı",false)
        val i6 = bilgiler(6,"System Engineer","Asdfg Defence","İzmir",17,"Tam Zamanlı",true)
        ilanlarListesi.add(i1)
        ilanlarListesi.add(i2)
        ilanlarListesi.add(i3)
        ilanlarListesi.add(i4)
        ilanlarListesi.add(i5)
        ilanlarListesi.add(i6)
        val adapter = BilgilerAdapter(requireContext(),ilanlarListesi)
        tasarim.rvv.adapter = adapter






        return tasarim.root
    }
}