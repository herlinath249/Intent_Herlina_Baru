package com.example.intent_herlina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var nim: EditText
    private lateinit var nama: EditText
    private lateinit var nilai: EditText
    private lateinit var proses: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        nim = findViewById(R.id.txt_nim)
        nama = findViewById(R.id.txt_nama)
        nilai = findViewById(R.id.txt_nilai)
        proses = findViewById(R.id.btn_proses)

        //button bisa diklik
        btn_proses.setOnClickListener {
            intent = Intent (this, ActivityKedua::class.java)

            //mengirim data ke activity selanjutnya
            intent.putExtra("NIM", nim.text)
            intent.putExtra("Nama", nama.text)
            intent.putExtra("Nilai", nilai.text)

            startActivity(intent)
        }
    }
}
