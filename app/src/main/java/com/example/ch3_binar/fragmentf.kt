package com.example.ch3_binar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragmentf : Fragment(R.layout.fragmentf) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmentf, container, false)
        val ABtn: Button = view.findViewById(R.id.Fasilitas)
        ABtn.setOnClickListener {
            val one = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Fasilitas"))
            startActivity(one)
        }

        val Btn: Button = view.findViewById(R.id.Fantasi)
        Btn.setOnClickListener {
            val two = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Fantasi"))
            startActivity(two)
        }

        val BBtn: Button = view.findViewById(R.id.Fakultas)
        BBtn.setOnClickListener {
            val three = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Fakultas"))
            startActivity(three)
        }

        val CBtn: Button = view.findViewById(R.id.Film)
        CBtn.setOnClickListener {
            val four = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Film"))
            startActivity(four)
        }
        val DBtn: Button = view.findViewById(R.id.Faktur)
        DBtn.setOnClickListener {
            val five = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Faktur"))
            startActivity(five)
        }

        val EBtn: Button = view.findViewById(R.id.Formal)
        EBtn.setOnClickListener {
            val six = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Formal"))
            startActivity(six)

        }

        return view
    }
}