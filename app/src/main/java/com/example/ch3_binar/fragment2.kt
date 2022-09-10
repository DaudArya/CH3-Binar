package com.example.ch3_binar

import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragment2 : Fragment(R.layout.fragment2){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)
        val ABtn: Button = view.findViewById(R.id.Ayam)
        ABtn.setOnClickListener {
            val Ayam = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Ayam"))
            startActivity(Ayam)
        }

        val Btn: Button = view.findViewById(R.id.Akal)
        Btn.setOnClickListener {
            val Akal = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Akal"))
            startActivity(Akal)
        }

        val BBtn: Button = view.findViewById(R.id.Air)
        BBtn.setOnClickListener {
            val Air = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Air"))
            startActivity(Air)
        }

        val CBtn: Button = view.findViewById(R.id.Amarah)
        CBtn.setOnClickListener {
            val Amarah = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Amarah"))
            startActivity(Amarah)
        }
        val DBtn: Button = view.findViewById(R.id.Asal)
        DBtn.setOnClickListener {
            val Asal = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Asal"))
            startActivity(Asal)
        }

        val EBtn: Button = view.findViewById(R.id.Azab)
        EBtn.setOnClickListener {
            val Azab = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Azab"))
            startActivity(Azab)
        }

        val FBtn: Button = view.findViewById(R.id.Alam)
        FBtn.setOnClickListener {
            val Alam = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Alam"))
            startActivity(Alam)
        }

        val GBtn: Button = view.findViewById(R.id.Asih)
        GBtn.setOnClickListener {
            val Asih = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Asih"))
            startActivity(Asih)
        }

        val HBtn: Button = view.findViewById(R.id.Ajar)
        HBtn.setOnClickListener {
            val Ajar = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Ajar"))
            startActivity(Ajar)
        }
        val JBtn: Button = view.findViewById(R.id.Aksi)
        JBtn.setOnClickListener {
            val Aksi = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Aksi"))
            startActivity(Aksi)
        }

        val IBtn: Button = view.findViewById(R.id.Atap)
        IBtn.setOnClickListener {
            val Atap = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Atap"))
            startActivity(Atap)
        }

        val KBtn: Button = view.findViewById(R.id.Akhir)
        KBtn.setOnClickListener {
            val Akhir = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Akhir"))
            startActivity(Akhir)
        }


        return view
    }
    }
