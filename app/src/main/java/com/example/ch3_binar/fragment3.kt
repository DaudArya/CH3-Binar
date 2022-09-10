package com.example.ch3_binar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragment3 : Fragment(R.layout.fragment3) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment3, container, false)
        val ABtn: Button = view.findViewById(R.id.Baik)
        ABtn.setOnClickListener {
            val Ayam = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Baik"))
            startActivity(Ayam)
        }

        val Btn: Button = view.findViewById(R.id.Bahan)
        Btn.setOnClickListener {
            val Akal = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Bahan"))
            startActivity(Akal)
        }

        val BBtn: Button = view.findViewById(R.id.Bakar)
        BBtn.setOnClickListener {
            val Air = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Bakar"))
            startActivity(Air)
        }

        val CBtn: Button = view.findViewById(R.id.Bukan)
        CBtn.setOnClickListener {
            val four = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Bukan"))
            startActivity(four)
        }
        val DBtn: Button = view.findViewById(R.id.Buih)
        DBtn.setOnClickListener {
            val five = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Buih"))
            startActivity(five)
        }

        val EBtn: Button = view.findViewById(R.id.Barang)
        EBtn.setOnClickListener {
            val six = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Barang"))
            startActivity(six)

        }

        return view
    }
}