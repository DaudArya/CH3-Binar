package com.example.ch3_binar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragmentg : Fragment(R.layout.fragmentg) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmentg, container, false)
        val ABtn: Button = view.findViewById(R.id.Gali)
        ABtn.setOnClickListener {
            val one = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Gali"))
            startActivity(one)
        }

        val Btn: Button = view.findViewById(R.id.Gampang)
        Btn.setOnClickListener {
            val two = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Gampang"))
            startActivity(two)
        }

        val BBtn: Button = view.findViewById(R.id.Gratis)
        BBtn.setOnClickListener {
            val three = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Gratis"))
            startActivity(three)
        }

        val CBtn: Button = view.findViewById(R.id.Gravitasi)
        CBtn.setOnClickListener {
            val four = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Gravitasi"))
            startActivity(four)
        }
        val DBtn: Button = view.findViewById(R.id.Gosong)
        DBtn.setOnClickListener {
            val five = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Gosong"))
            startActivity(five)
        }

        val EBtn: Button = view.findViewById(R.id.Gila)
        EBtn.setOnClickListener {
            val six = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Gila"))
            startActivity(six)

        }

        return view
    }
}