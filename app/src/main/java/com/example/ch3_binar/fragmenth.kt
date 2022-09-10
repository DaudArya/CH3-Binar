package com.example.ch3_binar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragmenth : Fragment(R.layout.fragmenth) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmenth, container, false)
        val ABtn: Button = view.findViewById(R.id.Hasil)
        ABtn.setOnClickListener {
            val one = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Hasil"))
            startActivity(one)
        }

        val Btn: Button = view.findViewById(R.id.Hampa)
        Btn.setOnClickListener {
            val two = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Hampa"))
            startActivity(two)
        }

        val BBtn: Button = view.findViewById(R.id.Hanya)
        BBtn.setOnClickListener {
            val three = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Hanya"))
            startActivity(three)
        }

        val CBtn: Button = view.findViewById(R.id.Hapus)
        CBtn.setOnClickListener {
            val four = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Hapus"))
            startActivity(four)
        }
        val DBtn: Button = view.findViewById(R.id.Hisap)
        DBtn.setOnClickListener {
            val five = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Hisap"))
            startActivity(five)
        }

        val EBtn: Button = view.findViewById(R.id.Hilang)
        EBtn.setOnClickListener {
            val six = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Hilang"))
            startActivity(six)

        }

        return view
    }
}