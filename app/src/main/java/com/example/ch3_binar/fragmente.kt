package com.example.ch3_binar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragmente : Fragment(R.layout.fragmente) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmente, container, false)
        val ABtn: Button = view.findViewById(R.id.Emas)
        ABtn.setOnClickListener {
            val one = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Emas"))
            startActivity(one)
        }

        val Btn: Button = view.findViewById(R.id.Endap)
        Btn.setOnClickListener {
            val two = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Endap"))
            startActivity(two)
        }

        val BBtn: Button = view.findViewById(R.id.Elang)
        BBtn.setOnClickListener {
            val three = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Elang"))
            startActivity(three)
        }

        val CBtn: Button = view.findViewById(R.id.Esa)
        CBtn.setOnClickListener {
            val four = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Esa"))
            startActivity(four)
        }
        val DBtn: Button = view.findViewById(R.id.Elemen)
        DBtn.setOnClickListener {
            val five = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Elemen"))
            startActivity(five)
        }

        val EBtn: Button = view.findViewById(R.id.Ember)
        EBtn.setOnClickListener {
            val six = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=Ember"))
            startActivity(six)

        }

        return view
    }
}