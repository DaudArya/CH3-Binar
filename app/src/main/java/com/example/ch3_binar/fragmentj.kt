package com.example.ch3_binar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragmentj : Fragment(R.layout.fragmentj) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmentj, container, false)
        val ABtn: Button = view.findViewById(R.id.Jadi)
        ABtn.setOnClickListener {
            val one = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Jadi"))
            startActivity(one)
        }

        val Btn: Button = view.findViewById(R.id.Jahat)
        Btn.setOnClickListener {
            val two = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Jahat"))
            startActivity(two)
        }

        val BBtn: Button = view.findViewById(R.id.Jangan)
        BBtn.setOnClickListener {
            val three = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Jangan"))
            startActivity(three)
        }

        val CBtn: Button = view.findViewById(R.id.Jaminan)
        CBtn.setOnClickListener {
            val four = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Jaminan"))
            startActivity(four)
        }
        val DBtn: Button = view.findViewById(R.id.Jasa)
        DBtn.setOnClickListener {
            val five = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Jasa"))
            startActivity(five)
        }
        val EBtn: Button = view.findViewById(R.id.Jiwa)
        EBtn.setOnClickListener {
            val six = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Jiwa"))
            startActivity(six)

        }

        return view
    }
}