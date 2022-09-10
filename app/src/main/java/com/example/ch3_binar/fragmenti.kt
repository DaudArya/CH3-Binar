package com.example.ch3_binar

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragmenti : Fragment(R.layout.fragmenti) {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragmenti, container, false)
        val ABtn: Button = view.findViewById(R.id.ILHAM)
        ABtn.setOnClickListener {
            val one = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=ILHAM"))
            startActivity(one)
        }

        val Btn: Button = view.findViewById(R.id.ILMU)
        Btn.setOnClickListener {
            val two = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=ILMU"))
            startActivity(two)
        }

        val BBtn: Button = view.findViewById(R.id.INANG)
        BBtn.setOnClickListener {
            val three = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=INANG"))
            startActivity(three)
        }

        val CBtn: Button = view.findViewById(R.id.ISI)
        CBtn.setOnClickListener {
            val four = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=ISI"))
            startActivity(four)
        }
        val DBtn: Button = view.findViewById(R.id.INTI)
        DBtn.setOnClickListener {
            val five = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=INTI"))
            startActivity(five)
        }
        val EBtn: Button = view.findViewById(R.id.ISLAM)
        EBtn.setOnClickListener {
            val six = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=ISLAM"))
            startActivity(six)

        }

        return view
    }
}