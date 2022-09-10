package com.example.ch3_binar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlin.system.exitProcess

class fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)
        val ABtn: Button = view.findViewById(R.id.A)
        ABtn.setOnClickListener() {
            val fragment = fragment2()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
            }
        val BBtn: Button = view.findViewById(R.id.B)
        BBtn.setOnClickListener() {
            val fragment = fragment3()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val CBtn: Button = view.findViewById(R.id.C)
        CBtn.setOnClickListener() {
            val fragment = fragmentc()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val DBtn: Button = view.findViewById(R.id.D)
        DBtn.setOnClickListener() {
            val fragment = fragmentd()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val EBtn: Button = view.findViewById(R.id.E)
        EBtn.setOnClickListener() {
            val fragment = fragmente()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val FBtn: Button = view.findViewById(R.id.F)
        FBtn.setOnClickListener() {
            val fragment = fragmentf()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val GBtn: Button = view.findViewById(R.id.G)
        GBtn.setOnClickListener() {
            val fragment = fragmentg()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val HBtn: Button = view.findViewById(R.id.H)
        HBtn.setOnClickListener() {
            val fragment = fragmenth()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val IBtn: Button = view.findViewById(R.id.I)
        IBtn.setOnClickListener() {
            val fragment = fragmenti()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val JBtn: Button = view.findViewById(R.id.J)
        JBtn.setOnClickListener() {
            val fragment = fragmentj()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val KBtn: Button = view.findViewById(R.id.K)
        KBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val LBtn: Button = view.findViewById(R.id.L)
        LBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val MBtn: Button = view.findViewById(R.id.M)
        MBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val NBtn: Button = view.findViewById(R.id.N)
        NBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val OBtn: Button = view.findViewById(R.id.O)
        OBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val PBtn: Button = view.findViewById(R.id.P)
        PBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val QBtn: Button = view.findViewById(R.id.QQ)
        QBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val RBtn: Button = view.findViewById(R.id.RR)
        RBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val SBtn: Button = view.findViewById(R.id.S)
        SBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val TBtn: Button = view.findViewById(R.id.T)
        TBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val UBtn: Button = view.findViewById(R.id.U)
        UBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val VBtn: Button = view.findViewById(R.id.V)
        VBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val WBtn: Button = view.findViewById(R.id.W)
        WBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val XBtn: Button = view.findViewById(R.id.X)
        XBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val YBtn: Button = view.findViewById(R.id.Y)
        YBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val ZBtn: Button = view.findViewById(R.id.Z)
        ZBtn.setOnClickListener() {
            val fragment = fragmentk()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainer, fragment)?.addToBackStack(null)?.commit()
        }
        val QuitBtn: Button = view.findViewById(R.id.QUIT)
        QuitBtn.setOnClickListener() {
            exitProcess(0)
        }



            return view
        }
    }