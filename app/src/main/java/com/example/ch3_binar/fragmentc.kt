package com.example.ch3_binar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragmentc : Fragment(R.layout.fragmentc) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmentc, container, false)
        val ABtn: Button = view.findViewById(R.id.Cantik)
        ABtn.setOnClickListener {
            val one = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Cantik"))
            startActivity(one)
        }

        val Btn: Button = view.findViewById(R.id.Cakar)
        Btn.setOnClickListener {
            val two = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Cakar"))
            startActivity(two)
        }

        val BBtn: Button = view.findViewById(R.id.Cari)
        BBtn.setOnClickListener {
            val three = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Cari"))
            startActivity(three)
        }

        val CBtn: Button = view.findViewById(R.id.Cara)
        CBtn.setOnClickListener {
            val four = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Cara"))
            startActivity(four)
        }
        val DBtn: Button = view.findViewById(R.id.Cokelat)
        DBtn.setOnClickListener {
            val five = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Cokelat"))
            startActivity(five)
        }

        val EBtn: Button = view.findViewById(R.id.Cawan)
        EBtn.setOnClickListener {
            val six = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Cawan"))
            startActivity(six)

        }

        return view
    }
}