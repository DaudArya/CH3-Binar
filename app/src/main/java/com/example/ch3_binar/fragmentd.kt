package com.example.ch3_binar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragmentd : Fragment(R.layout.fragmentd) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmentd, container, false)
        val ABtn: Button = view.findViewById(R.id.Dada)
        ABtn.setOnClickListener {
            val one = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Dada"))
            startActivity(one)
        }

        val Btn: Button = view.findViewById(R.id.Diam)
        Btn.setOnClickListener {
            val two = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Diam"))
            startActivity(two)
        }

        val BBtn: Button = view.findViewById(R.id.Dalam)
        BBtn.setOnClickListener {
            val three = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Dalam"))
            startActivity(three)
        }

        val CBtn: Button = view.findViewById(R.id.Dampak)
        CBtn.setOnClickListener {
            val four = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Dampak"))
            startActivity(four)
        }
        val DBtn: Button = view.findViewById(R.id.Dasar)
        DBtn.setOnClickListener {
            val five = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Dasar"))
            startActivity(five)
        }

        val EBtn: Button = view.findViewById(R.id.Dilema)
        EBtn.setOnClickListener {
            val six = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Dilema"))
            startActivity(six)

        }

        return view
    }
}