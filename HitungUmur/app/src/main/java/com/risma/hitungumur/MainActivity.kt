package com.risma.hitungumur

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btHitung.setOnClickListener {
            var tahunlahir = etInputUmur.text.toString().toInt()
            var tahun:Int = Calendar.getInstance().get(Calendar.YEAR)

            //set umur = tahun saat ini - tahun kelahiran kita
            var umur = 0
            if (tahunlahir.toInt() != null){
                umur = tahun - tahunlahir
                tvUmur.text = "Umur = $umur tahun"
            }else{
                tvUmur.text = "tahun tidak valid"
            }


        }
    }
}
