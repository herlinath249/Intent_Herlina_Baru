package com.example.intent_herlina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_kedua.*

class ActivityKedua : AppCompatActivity() {

    private lateinit var hasil_proses: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        //binding
        hasil_proses = findViewById(R.id.txt_proses)

        //bundle
        val bundle: Bundle? = intent.extras

        //variable yang digunakan untuk menampung nilai
        var nim = bundle?.get("NIM").toString()
        var nama = bundle?.get("Nama").toString()
        var nilai = bundle?.get("Nilai").toString()
        var nilai_huruf = perhitungan(nilai)

        txt_proses.text = """
            NIM : ${nim}
            Nama : ${nama}
            Nilai : ${nilai}
            Nilai Huruf : ${nilai_huruf}
        """.trimIndent()

    }

    fun perhitungan(nilai: String): String{
        var nilaii = nilai.toFloat()
        if (nilaii >= 80){
            return "A"
        } else if (nilaii >= 60){
            return "B"
        } else if (nilaii >= 40){
            return "C"
        } else if (nilaii >= 20){
            return "D"
        } else{
            return "E"
        }
    }
}
