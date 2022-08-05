package com.example.odev6

import java.io.Serializable

data class bilgiler(var ilan_id:Int,
                    var ilan_baslik:String,
                    var ilan_info:String,
                    var ilan_konum:String,
                    var ilan_zaman:Int,
                    var ilan_tur:String,
                    var ilan_goruldu:Boolean) :Serializable {
}