package com.example.periodontalchart

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class MainActivity : AppCompatActivity() {

    companion object {
        var zondChart1 = mutableListOf(
            Entry(0.3f, 0f),
            Entry(0.95f, 0f),
            Entry(1.6f, 0f),
            Entry(2.1f, 0f),
            Entry(2.8f, 0f),
            Entry(3.5f, 0f),
            Entry(4f, 0f),
            Entry(5f, 0f),
            Entry(6f, 0f),
            Entry(6.4f, 0f),
            Entry(6.9f, 0f),
            Entry(7.4f, 0f),
            Entry(7.9f, 0f),
            Entry(8.35f, 0f),
            Entry(8.8f, 0f),
            Entry(9.4f, 0f),
            Entry(9.9f, 0f),
            Entry(10.4f, 0f),
            Entry(11f, 0f),
            Entry(11.5f, 0f),
            Entry(12f, 0f),
            Entry(12.5f, 0f),
            Entry(13.1f, 0f),
            Entry(13.7f, 0f)
        )

        var desnChart1 = mutableListOf(
            Entry(0.3f, 0f),
            Entry(0.95f, 0f),
            Entry(1.6f, 0f),
            Entry(2.1f, 0f),
            Entry(2.8f, 0f),
            Entry(3.5f, 0f),
            Entry(4f, 0f),
            Entry(5f, 0f),
            Entry(6f, 0f),
            Entry(6.4f, 0f),
            Entry(6.9f, 0f),
            Entry(7.4f, 0f),
            Entry(7.9f, 0f),
            Entry(8.35f, 0f),
            Entry(8.8f, 0f),
            Entry(9.4f, 0f),
            Entry(9.9f, 0f),
            Entry(10.4f, 0f),
            Entry(11f, 0f),
            Entry(11.5f, 0f),
            Entry(12f, 0f),
            Entry(12.5f, 0f),
            Entry(13.1f, 0f),
            Entry(13.7f, 0f)
        )

        var zondChart2 = mutableListOf(
            Entry(0.3f, 0f),
            Entry(0.95f, 0f),
            Entry(1.6f, 0f),
            Entry(2f, 0f),
            Entry(2.5f, 0f),
            Entry(3f, 0f),
            Entry(3.6f, 0f),
            Entry(4.1f, 0f),
            Entry(4.6f, 0f),
            Entry(5.2f, 0f),
            Entry(5.65f, 0f),
            Entry(6.1f, 0f),
            Entry(6.6f, 0f),
            Entry(7.1f, 0f),
            Entry(7.6f, 0f),
            Entry(8.2f, 0f),
            Entry(9.1f, 0f),
            Entry(10f, 0f),
            Entry(10.5f, 0f),
            Entry(11.2f, 0f),
            Entry(11.9f, 0f),
            Entry(12.5f, 0f),
            Entry(13.1f, 0f),
            Entry(13.7f, 0f)
        )

        var desnChart2 = mutableListOf(
            Entry(0.3f, 0f),
            Entry(0.95f, 0f),
            Entry(1.6f, 0f),
            Entry(2f, 0f),
            Entry(2.5f, 0f),
            Entry(3f, 0f),
            Entry(3.6f, 0f),
            Entry(4.1f, 0f),
            Entry(4.6f, 0f),
            Entry(5.2f, 0f),
            Entry(5.65f, 0f),
            Entry(6.1f, 0f),
            Entry(6.6f, 0f),
            Entry(7.1f, 0f),
            Entry(7.6f, 0f),
            Entry(8.2f, 0f),
            Entry(9.1f, 0f),
            Entry(10f, 0f),
            Entry(10.5f, 0f),
            Entry(11.2f, 0f),
            Entry(11.9f, 0f),
            Entry(12.5f, 0f),
            Entry(13.1f, 0f),
            Entry(13.7f, 0f)
        )

        var zondChart3 = mutableListOf(
            Entry(0.2f, 0f),
            Entry(0.85f, 0f),
            Entry(1.5f, 0f),
            Entry(2.1f, 0f),
            Entry(2.75f, 0f),
            Entry(3.4f, 0f),
            Entry(4f, 0f),
            Entry(4.8f, 0f),
            Entry(5.6f, 0f),
            Entry(6.4f, 0f),
            Entry(6.9f, 0f),
            Entry(7.4f, 0f),
            Entry(8f, 0f),
            Entry(8.4f, 0f),
            Entry(8.8f, 0f),
            Entry(9.5f, 0f),
            Entry(10f, 0f),
            Entry(10.5f, 0f),
            Entry(11f, 0f),
            Entry(11.45f, 0f),
            Entry(11.9f, 0f),
            Entry(12.6f, 0f),
            Entry(13.1f, 0f),
            Entry(13.6f, 0f)
        )
        var desnChart3 = mutableListOf(
            Entry(0.2f, 0f),
            Entry(0.85f, 0f),
            Entry(1.5f, 0f),
            Entry(2.1f, 0f),
            Entry(2.75f, 0f),
            Entry(3.4f, 0f),
            Entry(4f, 0f),
            Entry(4.8f, 0f),
            Entry(5.6f, 0f),
            Entry(6.4f, 0f),
            Entry(6.9f, 0f),
            Entry(7.4f, 0f),
            Entry(8f, 0f),
            Entry(8.4f, 0f),
            Entry(8.8f, 0f),
            Entry(9.5f, 0f),
            Entry(10f, 0f),
            Entry(10.5f, 0f),
            Entry(11f, 0f),
            Entry(11.45f, 0f),
            Entry(11.9f, 0f),
            Entry(12.6f, 0f),
            Entry(13.1f, 0f),
            Entry(13.6f, 0f)
        )

        const val but0Color = "#DCDCDC"
        const val plombColor = "#20B2AA"
        const val krColor = "#CD5C5C"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        settingsForPlombs()
        settingsForKr()

        val chart1 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart1)
        val chart2 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart2)
        val chart3 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart3)
        val chart4 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart4)
        val chart5 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart5)
        val chart6 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart6)

        generateChart(chart1, zondChart1, desnChart1, 17f, -9f)
        generateChart(chart2, zondChart2, desnChart2, 17f, -9f)
        generateChart(chart3, zondChart3, desnChart3,9f, -16f)
        generateChart(chart4, zondChart2, desnChart2,9f, -16f)
        generateChart(chart5, zondChart1, desnChart1, 17f, -9f)
        generateChart(chart6, zondChart2, desnChart2, 17f, -9f)


    }

    private fun changeColorButton(button: Button, color0: String, color1: String){
        button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
        button.setOnClickListener {
            val colorStateList = button.backgroundTintList
            val defaultColor =
                colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)
            if (defaultColor == Color.parseColor(color0)) {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color1)))
            } else {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
            }
        }
    }

    private fun settingsForPlombs(){
        val plomb18 = findViewById<Button>(R.id.plomb18)
        val plomb17 = findViewById<Button>(R.id.plomb17)
        val plomb16 = findViewById<Button>(R.id.plomb16)
        val plomb15 = findViewById<Button>(R.id.plomb15)
        val plomb14 = findViewById<Button>(R.id.plomb14)
        val plomb13 = findViewById<Button>(R.id.plomb13)
        val plomb12 = findViewById<Button>(R.id.plomb12)
        val plomb11 = findViewById<Button>(R.id.plomb11)
        val plomb28 = findViewById<Button>(R.id.plomb28)
        val plomb27 = findViewById<Button>(R.id.plomb27)
        val plomb26 = findViewById<Button>(R.id.plomb26)
        val plomb25 = findViewById<Button>(R.id.plomb25)
        val plomb24 = findViewById<Button>(R.id.plomb24)
        val plomb23 = findViewById<Button>(R.id.plomb23)
        val plomb22 = findViewById<Button>(R.id.plomb22)
        val plomb21 = findViewById<Button>(R.id.plomb21)
        val plomb38 = findViewById<Button>(R.id.plomb38)
        val plomb37 = findViewById<Button>(R.id.plomb37)
        val plomb36 = findViewById<Button>(R.id.plomb36)
        val plomb35 = findViewById<Button>(R.id.plomb35)
        val plomb34 = findViewById<Button>(R.id.plomb34)
        val plomb33 = findViewById<Button>(R.id.plomb33)
        val plomb32 = findViewById<Button>(R.id.plomb32)
        val plomb31 = findViewById<Button>(R.id.plomb31)
        val plomb48 = findViewById<Button>(R.id.plomb48)
        val plomb47 = findViewById<Button>(R.id.plomb47)
        val plomb46 = findViewById<Button>(R.id.plomb46)
        val plomb45 = findViewById<Button>(R.id.plomb45)
        val plomb44 = findViewById<Button>(R.id.plomb44)
        val plomb43 = findViewById<Button>(R.id.plomb43)
        val plomb42 = findViewById<Button>(R.id.plomb42)
        val plomb41 = findViewById<Button>(R.id.plomb41)

        changeColorButton(plomb18, but0Color, plombColor)
        changeColorButton(plomb17, but0Color, plombColor)
        changeColorButton(plomb16, but0Color, plombColor)
        changeColorButton(plomb15, but0Color, plombColor)
        changeColorButton(plomb14, but0Color, plombColor)
        changeColorButton(plomb13, but0Color, plombColor)
        changeColorButton(plomb12, but0Color, plombColor)
        changeColorButton(plomb11, but0Color, plombColor)
        changeColorButton(plomb28, but0Color, plombColor)
        changeColorButton(plomb27, but0Color, plombColor)
        changeColorButton(plomb26, but0Color, plombColor)
        changeColorButton(plomb25, but0Color, plombColor)
        changeColorButton(plomb24, but0Color, plombColor)
        changeColorButton(plomb23, but0Color, plombColor)
        changeColorButton(plomb22, but0Color, plombColor)
        changeColorButton(plomb21, but0Color, plombColor)
        changeColorButton(plomb38, but0Color, plombColor)
        changeColorButton(plomb37, but0Color, plombColor)
        changeColorButton(plomb36, but0Color, plombColor)
        changeColorButton(plomb35, but0Color, plombColor)
        changeColorButton(plomb34, but0Color, plombColor)
        changeColorButton(plomb33, but0Color, plombColor)
        changeColorButton(plomb32, but0Color, plombColor)
        changeColorButton(plomb31, but0Color, plombColor)
        changeColorButton(plomb48, but0Color, plombColor)
        changeColorButton(plomb47, but0Color, plombColor)
        changeColorButton(plomb46, but0Color, plombColor)
        changeColorButton(plomb45, but0Color, plombColor)
        changeColorButton(plomb44, but0Color, plombColor)
        changeColorButton(plomb43, but0Color, plombColor)
        changeColorButton(plomb42, but0Color, plombColor)
        changeColorButton(plomb41, but0Color, plombColor)
    }

    private fun settingsForKr(){
        val kr112_1 = findViewById<Button>(R.id.kr112_1)
        val kr112_2 = findViewById<Button>(R.id.kr112_2)
        val kr112_3 = findViewById<Button>(R.id.kr112_3)
        val kr122_1 = findViewById<Button>(R.id.kr122_1)
        val kr122_2 = findViewById<Button>(R.id.kr122_2)
        val kr122_3 = findViewById<Button>(R.id.kr122_3)
        val kr132_1 = findViewById<Button>(R.id.kr132_1)
        val kr132_2 = findViewById<Button>(R.id.kr132_2)
        val kr132_3 = findViewById<Button>(R.id.kr132_3)
        val kr142_1 = findViewById<Button>(R.id.kr142_1)
        val kr142_2 = findViewById<Button>(R.id.kr142_2)
        val kr142_3 = findViewById<Button>(R.id.kr142_3)
        val kr152_1 = findViewById<Button>(R.id.kr152_1)
        val kr152_2 = findViewById<Button>(R.id.kr152_2)
        val kr152_3 = findViewById<Button>(R.id.kr152_3)
        val kr162_1 = findViewById<Button>(R.id.kr162_1)
        val kr162_2 = findViewById<Button>(R.id.kr162_2)
        val kr162_3 = findViewById<Button>(R.id.kr162_3)
        val kr172_1 = findViewById<Button>(R.id.kr172_1)
        val kr172_2 = findViewById<Button>(R.id.kr172_2)
        val kr172_3 = findViewById<Button>(R.id.kr172_3)
        val kr182_1 = findViewById<Button>(R.id.kr182_1)
        val kr182_2 = findViewById<Button>(R.id.kr182_2)
        val kr182_3 = findViewById<Button>(R.id.kr182_3)

        changeColorButton(kr112_1, but0Color, krColor)
        changeColorButton(kr112_2, but0Color, krColor)
        changeColorButton(kr112_3, but0Color, krColor)
        changeColorButton(kr122_1, but0Color, krColor)
        changeColorButton(kr122_2, but0Color, krColor)
        changeColorButton(kr122_3, but0Color, krColor)
        changeColorButton(kr132_1, but0Color, krColor)
        changeColorButton(kr132_2, but0Color, krColor)
        changeColorButton(kr132_3, but0Color, krColor)
        changeColorButton(kr142_1, but0Color, krColor)
        changeColorButton(kr142_2, but0Color, krColor)
        changeColorButton(kr142_3, but0Color, krColor)
        changeColorButton(kr152_1, but0Color, krColor)
        changeColorButton(kr152_2, but0Color, krColor)
        changeColorButton(kr152_3, but0Color, krColor)
        changeColorButton(kr162_1, but0Color, krColor)
        changeColorButton(kr162_2, but0Color, krColor)
        changeColorButton(kr162_3, but0Color, krColor)
        changeColorButton(kr172_1, but0Color, krColor)
        changeColorButton(kr172_2, but0Color, krColor)
        changeColorButton(kr172_3, but0Color, krColor)
        changeColorButton(kr182_1, but0Color, krColor)
        changeColorButton(kr182_2, but0Color, krColor)
        changeColorButton(kr182_3, but0Color, krColor)

        val kr212_1 = findViewById<Button>(R.id.kr212_1)
        val kr212_2 = findViewById<Button>(R.id.kr212_2)
        val kr212_3 = findViewById<Button>(R.id.kr212_3)
        val kr222_1 = findViewById<Button>(R.id.kr222_1)
        val kr222_2 = findViewById<Button>(R.id.kr222_2)
        val kr222_3 = findViewById<Button>(R.id.kr222_3)
        val kr232_1 = findViewById<Button>(R.id.kr232_1)
        val kr232_2 = findViewById<Button>(R.id.kr232_2)
        val kr232_3 = findViewById<Button>(R.id.kr232_3)
        val kr242_1 = findViewById<Button>(R.id.kr242_1)
        val kr242_2 = findViewById<Button>(R.id.kr242_2)
        val kr242_3 = findViewById<Button>(R.id.kr242_3)
        val kr252_1 = findViewById<Button>(R.id.kr252_1)
        val kr252_2 = findViewById<Button>(R.id.kr252_2)
        val kr252_3 = findViewById<Button>(R.id.kr252_3)
        val kr262_1 = findViewById<Button>(R.id.kr262_1)
        val kr262_2 = findViewById<Button>(R.id.kr262_2)
        val kr262_3 = findViewById<Button>(R.id.kr262_3)
        val kr272_1 = findViewById<Button>(R.id.kr272_1)
        val kr272_2 = findViewById<Button>(R.id.kr272_2)
        val kr272_3 = findViewById<Button>(R.id.kr272_3)
        val kr282_1 = findViewById<Button>(R.id.kr282_1)
        val kr282_2 = findViewById<Button>(R.id.kr282_2)
        val kr282_3 = findViewById<Button>(R.id.kr282_3)

        changeColorButton(kr212_1, but0Color, krColor)
        changeColorButton(kr212_2, but0Color, krColor)
        changeColorButton(kr212_3, but0Color, krColor)
        changeColorButton(kr222_1, but0Color, krColor)
        changeColorButton(kr222_2, but0Color, krColor)
        changeColorButton(kr222_3, but0Color, krColor)
        changeColorButton(kr232_1, but0Color, krColor)
        changeColorButton(kr232_2, but0Color, krColor)
        changeColorButton(kr232_3, but0Color, krColor)
        changeColorButton(kr242_1, but0Color, krColor)
        changeColorButton(kr242_2, but0Color, krColor)
        changeColorButton(kr242_3, but0Color, krColor)
        changeColorButton(kr252_1, but0Color, krColor)
        changeColorButton(kr252_2, but0Color, krColor)
        changeColorButton(kr252_3, but0Color, krColor)
        changeColorButton(kr262_1, but0Color, krColor)
        changeColorButton(kr262_2, but0Color, krColor)
        changeColorButton(kr262_3, but0Color, krColor)
        changeColorButton(kr272_1, but0Color, krColor)
        changeColorButton(kr272_2, but0Color, krColor)
        changeColorButton(kr272_3, but0Color, krColor)
        changeColorButton(kr282_1, but0Color, krColor)
        changeColorButton(kr282_2, but0Color, krColor)
        changeColorButton(kr282_3, but0Color, krColor)

        val kr312_1 = findViewById<Button>(R.id.kr312_1)
        val kr312_2 = findViewById<Button>(R.id.kr312_2)
        val kr312_3 = findViewById<Button>(R.id.kr312_3)
        val kr322_1 = findViewById<Button>(R.id.kr322_1)
        val kr322_2 = findViewById<Button>(R.id.kr322_2)
        val kr322_3 = findViewById<Button>(R.id.kr322_3)
        val kr332_1 = findViewById<Button>(R.id.kr332_1)
        val kr332_2 = findViewById<Button>(R.id.kr332_2)
        val kr332_3 = findViewById<Button>(R.id.kr332_3)
        val kr342_1 = findViewById<Button>(R.id.kr342_1)
        val kr342_2 = findViewById<Button>(R.id.kr342_2)
        val kr342_3 = findViewById<Button>(R.id.kr342_3)
        val kr352_1 = findViewById<Button>(R.id.kr352_1)
        val kr352_2 = findViewById<Button>(R.id.kr352_2)
        val kr352_3 = findViewById<Button>(R.id.kr352_3)
        val kr362_1 = findViewById<Button>(R.id.kr362_1)
        val kr362_2 = findViewById<Button>(R.id.kr362_2)
        val kr362_3 = findViewById<Button>(R.id.kr362_3)
        val kr372_1 = findViewById<Button>(R.id.kr372_1)
        val kr372_2 = findViewById<Button>(R.id.kr372_2)
        val kr372_3 = findViewById<Button>(R.id.kr372_3)
        val kr382_1 = findViewById<Button>(R.id.kr382_1)
        val kr382_2 = findViewById<Button>(R.id.kr382_2)
        val kr382_3 = findViewById<Button>(R.id.kr382_3)

        changeColorButton(kr312_1, but0Color, krColor)
        changeColorButton(kr312_2, but0Color, krColor)
        changeColorButton(kr312_3, but0Color, krColor)
        changeColorButton(kr322_1, but0Color, krColor)
        changeColorButton(kr322_2, but0Color, krColor)
        changeColorButton(kr322_3, but0Color, krColor)
        changeColorButton(kr332_1, but0Color, krColor)
        changeColorButton(kr332_2, but0Color, krColor)
        changeColorButton(kr332_3, but0Color, krColor)
        changeColorButton(kr342_1, but0Color, krColor)
        changeColorButton(kr342_2, but0Color, krColor)
        changeColorButton(kr342_3, but0Color, krColor)
        changeColorButton(kr352_1, but0Color, krColor)
        changeColorButton(kr352_2, but0Color, krColor)
        changeColorButton(kr352_3, but0Color, krColor)
        changeColorButton(kr362_1, but0Color, krColor)
        changeColorButton(kr362_2, but0Color, krColor)
        changeColorButton(kr362_3, but0Color, krColor)
        changeColorButton(kr372_1, but0Color, krColor)
        changeColorButton(kr372_2, but0Color, krColor)
        changeColorButton(kr372_3, but0Color, krColor)
        changeColorButton(kr382_1, but0Color, krColor)
        changeColorButton(kr382_2, but0Color, krColor)
        changeColorButton(kr382_3, but0Color, krColor)

        val kr412_1 = findViewById<Button>(R.id.kr412_1)
        val kr412_2 = findViewById<Button>(R.id.kr412_2)
        val kr412_3 = findViewById<Button>(R.id.kr412_3)
        val kr422_1 = findViewById<Button>(R.id.kr422_1)
        val kr422_2 = findViewById<Button>(R.id.kr422_2)
        val kr422_3 = findViewById<Button>(R.id.kr422_3)
        val kr432_1 = findViewById<Button>(R.id.kr432_1)
        val kr432_2 = findViewById<Button>(R.id.kr432_2)
        val kr432_3 = findViewById<Button>(R.id.kr432_3)
        val kr442_1 = findViewById<Button>(R.id.kr442_1)
        val kr442_2 = findViewById<Button>(R.id.kr442_2)
        val kr442_3 = findViewById<Button>(R.id.kr442_3)
        val kr452_1 = findViewById<Button>(R.id.kr452_1)
        val kr452_2 = findViewById<Button>(R.id.kr452_2)
        val kr452_3 = findViewById<Button>(R.id.kr452_3)
        val kr462_1 = findViewById<Button>(R.id.kr462_1)
        val kr462_2 = findViewById<Button>(R.id.kr462_2)
        val kr462_3 = findViewById<Button>(R.id.kr462_3)
        val kr472_1 = findViewById<Button>(R.id.kr472_1)
        val kr472_2 = findViewById<Button>(R.id.kr472_2)
        val kr472_3 = findViewById<Button>(R.id.kr472_3)
        val kr482_1 = findViewById<Button>(R.id.kr482_1)
        val kr482_2 = findViewById<Button>(R.id.kr482_2)
        val kr482_3 = findViewById<Button>(R.id.kr482_3)

        changeColorButton(kr412_1, but0Color, krColor)
        changeColorButton(kr412_2, but0Color, krColor)
        changeColorButton(kr412_3, but0Color, krColor)
        changeColorButton(kr422_1, but0Color, krColor)
        changeColorButton(kr422_2, but0Color, krColor)
        changeColorButton(kr422_3, but0Color, krColor)
        changeColorButton(kr432_1, but0Color, krColor)
        changeColorButton(kr432_2, but0Color, krColor)
        changeColorButton(kr432_3, but0Color, krColor)
        changeColorButton(kr442_1, but0Color, krColor)
        changeColorButton(kr442_2, but0Color, krColor)
        changeColorButton(kr442_3, but0Color, krColor)
        changeColorButton(kr452_1, but0Color, krColor)
        changeColorButton(kr452_2, but0Color, krColor)
        changeColorButton(kr452_3, but0Color, krColor)
        changeColorButton(kr462_1, but0Color, krColor)
        changeColorButton(kr462_2, but0Color, krColor)
        changeColorButton(kr462_3, but0Color, krColor)
        changeColorButton(kr472_1, but0Color, krColor)
        changeColorButton(kr472_2, but0Color, krColor)
        changeColorButton(kr472_3, but0Color, krColor)
        changeColorButton(kr482_1, but0Color, krColor)
        changeColorButton(kr482_2, but0Color, krColor)
        changeColorButton(kr482_3, but0Color, krColor)
        val kr11_1 = findViewById<Button>(R.id.kr11_1)
        val kr11_2 = findViewById<Button>(R.id.kr11_2)
        val kr11_3 = findViewById<Button>(R.id.kr11_3)
        val kr12_1 = findViewById<Button>(R.id.kr12_1)
        val kr12_2 = findViewById<Button>(R.id.kr12_2)
        val kr12_3 = findViewById<Button>(R.id.kr12_3)
        val kr13_1 = findViewById<Button>(R.id.kr13_1)
        val kr13_2 = findViewById<Button>(R.id.kr13_2)
        val kr13_3 = findViewById<Button>(R.id.kr13_3)
        val kr14_1 = findViewById<Button>(R.id.kr14_1)
        val kr14_2 = findViewById<Button>(R.id.kr14_2)
        val kr14_3 = findViewById<Button>(R.id.kr14_3)
        val kr15_1 = findViewById<Button>(R.id.kr15_1)
        val kr15_2 = findViewById<Button>(R.id.kr15_2)
        val kr15_3 = findViewById<Button>(R.id.kr15_3)
        val kr16_1 = findViewById<Button>(R.id.kr16_1)
        val kr16_2 = findViewById<Button>(R.id.kr16_2)
        val kr16_3 = findViewById<Button>(R.id.kr16_3)
        val kr17_1 = findViewById<Button>(R.id.kr17_1)
        val kr17_2 = findViewById<Button>(R.id.kr17_2)
        val kr17_3 = findViewById<Button>(R.id.kr17_3)
        val kr18_1 = findViewById<Button>(R.id.kr18_1)
        val kr18_2 = findViewById<Button>(R.id.kr18_2)
        val kr18_3 = findViewById<Button>(R.id.kr18_3)

        changeColorButton(kr11_1, but0Color, krColor)
        changeColorButton(kr11_2, but0Color, krColor)
        changeColorButton(kr11_3, but0Color, krColor)
        changeColorButton(kr12_1, but0Color, krColor)
        changeColorButton(kr12_2, but0Color, krColor)
        changeColorButton(kr12_3, but0Color, krColor)
        changeColorButton(kr13_1, but0Color, krColor)
        changeColorButton(kr13_2, but0Color, krColor)
        changeColorButton(kr13_3, but0Color, krColor)
        changeColorButton(kr14_1, but0Color, krColor)
        changeColorButton(kr14_2, but0Color, krColor)
        changeColorButton(kr14_3, but0Color, krColor)
        changeColorButton(kr15_1, but0Color, krColor)
        changeColorButton(kr15_2, but0Color, krColor)
        changeColorButton(kr15_3, but0Color, krColor)
        changeColorButton(kr16_1, but0Color, krColor)
        changeColorButton(kr16_2, but0Color, krColor)
        changeColorButton(kr16_3, but0Color, krColor)
        changeColorButton(kr17_1, but0Color, krColor)
        changeColorButton(kr17_2, but0Color, krColor)
        changeColorButton(kr17_3, but0Color, krColor)
        changeColorButton(kr18_1, but0Color, krColor)
        changeColorButton(kr18_2, but0Color, krColor)
        changeColorButton(kr18_3, but0Color, krColor)

        val kr21_1 = findViewById<Button>(R.id.kr21_1)
        val kr21_2 = findViewById<Button>(R.id.kr21_2)
        val kr21_3 = findViewById<Button>(R.id.kr21_3)
        val kr22_1 = findViewById<Button>(R.id.kr22_1)
        val kr22_2 = findViewById<Button>(R.id.kr22_2)
        val kr22_3 = findViewById<Button>(R.id.kr22_3)
        val kr23_1 = findViewById<Button>(R.id.kr23_1)
        val kr23_2 = findViewById<Button>(R.id.kr23_2)
        val kr23_3 = findViewById<Button>(R.id.kr23_3)
        val kr24_1 = findViewById<Button>(R.id.kr24_1)
        val kr24_2 = findViewById<Button>(R.id.kr24_2)
        val kr24_3 = findViewById<Button>(R.id.kr24_3)
        val kr25_1 = findViewById<Button>(R.id.kr25_1)
        val kr25_2 = findViewById<Button>(R.id.kr25_2)
        val kr25_3 = findViewById<Button>(R.id.kr25_3)
        val kr26_1 = findViewById<Button>(R.id.kr26_1)
        val kr26_2 = findViewById<Button>(R.id.kr26_2)
        val kr26_3 = findViewById<Button>(R.id.kr26_3)
        val kr27_1 = findViewById<Button>(R.id.kr27_1)
        val kr27_2 = findViewById<Button>(R.id.kr27_2)
        val kr27_3 = findViewById<Button>(R.id.kr27_3)
        val kr28_1 = findViewById<Button>(R.id.kr28_1)
        val kr28_2 = findViewById<Button>(R.id.kr28_2)
        val kr28_3 = findViewById<Button>(R.id.kr28_3)

        changeColorButton(kr21_1, but0Color, krColor)
        changeColorButton(kr21_2, but0Color, krColor)
        changeColorButton(kr21_3, but0Color, krColor)
        changeColorButton(kr22_1, but0Color, krColor)
        changeColorButton(kr22_2, but0Color, krColor)
        changeColorButton(kr22_3, but0Color, krColor)
        changeColorButton(kr23_1, but0Color, krColor)
        changeColorButton(kr23_2, but0Color, krColor)
        changeColorButton(kr23_3, but0Color, krColor)
        changeColorButton(kr24_1, but0Color, krColor)
        changeColorButton(kr24_2, but0Color, krColor)
        changeColorButton(kr24_3, but0Color, krColor)
        changeColorButton(kr25_1, but0Color, krColor)
        changeColorButton(kr25_2, but0Color, krColor)
        changeColorButton(kr25_3, but0Color, krColor)
        changeColorButton(kr26_1, but0Color, krColor)
        changeColorButton(kr26_2, but0Color, krColor)
        changeColorButton(kr26_3, but0Color, krColor)
        changeColorButton(kr27_1, but0Color, krColor)
        changeColorButton(kr27_2, but0Color, krColor)
        changeColorButton(kr27_3, but0Color, krColor)
        changeColorButton(kr28_1, but0Color, krColor)
        changeColorButton(kr28_2, but0Color, krColor)
        changeColorButton(kr28_3, but0Color, krColor)

        val kr31_1 = findViewById<Button>(R.id.kr31_1)
        val kr31_2 = findViewById<Button>(R.id.kr31_2)
        val kr31_3 = findViewById<Button>(R.id.kr31_3)
        val kr32_1 = findViewById<Button>(R.id.kr32_1)
        val kr32_2 = findViewById<Button>(R.id.kr32_2)
        val kr32_3 = findViewById<Button>(R.id.kr32_3)
        val kr33_1 = findViewById<Button>(R.id.kr33_1)
        val kr33_2 = findViewById<Button>(R.id.kr33_2)
        val kr33_3 = findViewById<Button>(R.id.kr33_3)
        val kr34_1 = findViewById<Button>(R.id.kr34_1)
        val kr34_2 = findViewById<Button>(R.id.kr34_2)
        val kr34_3 = findViewById<Button>(R.id.kr34_3)
        val kr35_1 = findViewById<Button>(R.id.kr35_1)
        val kr35_2 = findViewById<Button>(R.id.kr35_2)
        val kr35_3 = findViewById<Button>(R.id.kr35_3)
        val kr36_1 = findViewById<Button>(R.id.kr36_1)
        val kr36_2 = findViewById<Button>(R.id.kr36_2)
        val kr36_3 = findViewById<Button>(R.id.kr36_3)
        val kr37_1 = findViewById<Button>(R.id.kr37_1)
        val kr37_2 = findViewById<Button>(R.id.kr37_2)
        val kr37_3 = findViewById<Button>(R.id.kr37_3)
        val kr38_1 = findViewById<Button>(R.id.kr38_1)
        val kr38_2 = findViewById<Button>(R.id.kr38_2)
        val kr38_3 = findViewById<Button>(R.id.kr38_3)

        changeColorButton(kr31_1, but0Color, krColor)
        changeColorButton(kr31_2, but0Color, krColor)
        changeColorButton(kr31_3, but0Color, krColor)
        changeColorButton(kr32_1, but0Color, krColor)
        changeColorButton(kr32_2, but0Color, krColor)
        changeColorButton(kr32_3, but0Color, krColor)
        changeColorButton(kr33_1, but0Color, krColor)
        changeColorButton(kr33_2, but0Color, krColor)
        changeColorButton(kr33_3, but0Color, krColor)
        changeColorButton(kr34_1, but0Color, krColor)
        changeColorButton(kr34_2, but0Color, krColor)
        changeColorButton(kr34_3, but0Color, krColor)
        changeColorButton(kr35_1, but0Color, krColor)
        changeColorButton(kr35_2, but0Color, krColor)
        changeColorButton(kr35_3, but0Color, krColor)
        changeColorButton(kr36_1, but0Color, krColor)
        changeColorButton(kr36_2, but0Color, krColor)
        changeColorButton(kr36_3, but0Color, krColor)
        changeColorButton(kr37_1, but0Color, krColor)
        changeColorButton(kr37_2, but0Color, krColor)
        changeColorButton(kr37_3, but0Color, krColor)
        changeColorButton(kr38_1, but0Color, krColor)
        changeColorButton(kr38_2, but0Color, krColor)
        changeColorButton(kr38_3, but0Color, krColor)

        val kr41_1 = findViewById<Button>(R.id.kr41_1)
        val kr41_2 = findViewById<Button>(R.id.kr41_2)
        val kr41_3 = findViewById<Button>(R.id.kr41_3)
        val kr42_1 = findViewById<Button>(R.id.kr42_1)
        val kr42_2 = findViewById<Button>(R.id.kr42_2)
        val kr42_3 = findViewById<Button>(R.id.kr42_3)
        val kr43_1 = findViewById<Button>(R.id.kr43_1)
        val kr43_2 = findViewById<Button>(R.id.kr43_2)
        val kr43_3 = findViewById<Button>(R.id.kr43_3)
        val kr44_1 = findViewById<Button>(R.id.kr44_1)
        val kr44_2 = findViewById<Button>(R.id.kr44_2)
        val kr44_3 = findViewById<Button>(R.id.kr44_3)
        val kr45_1 = findViewById<Button>(R.id.kr45_1)
        val kr45_2 = findViewById<Button>(R.id.kr45_2)
        val kr45_3 = findViewById<Button>(R.id.kr45_3)
        val kr46_1 = findViewById<Button>(R.id.kr46_1)
        val kr46_2 = findViewById<Button>(R.id.kr46_2)
        val kr46_3 = findViewById<Button>(R.id.kr46_3)
        val kr47_1 = findViewById<Button>(R.id.kr47_1)
        val kr47_2 = findViewById<Button>(R.id.kr47_2)
        val kr47_3 = findViewById<Button>(R.id.kr47_3)
        val kr48_1 = findViewById<Button>(R.id.kr48_1)
        val kr48_2 = findViewById<Button>(R.id.kr48_2)
        val kr48_3 = findViewById<Button>(R.id.kr48_3)

        changeColorButton(kr41_1, but0Color, krColor)
        changeColorButton(kr41_2, but0Color, krColor)
        changeColorButton(kr41_3, but0Color, krColor)
        changeColorButton(kr42_1, but0Color, krColor)
        changeColorButton(kr42_2, but0Color, krColor)
        changeColorButton(kr42_3, but0Color, krColor)
        changeColorButton(kr43_1, but0Color, krColor)
        changeColorButton(kr43_2, but0Color, krColor)
        changeColorButton(kr43_3, but0Color, krColor)
        changeColorButton(kr44_1, but0Color, krColor)
        changeColorButton(kr44_2, but0Color, krColor)
        changeColorButton(kr44_3, but0Color, krColor)
        changeColorButton(kr45_1, but0Color, krColor)
        changeColorButton(kr45_2, but0Color, krColor)
        changeColorButton(kr45_3, but0Color, krColor)
        changeColorButton(kr46_1, but0Color, krColor)
        changeColorButton(kr46_2, but0Color, krColor)
        changeColorButton(kr46_3, but0Color, krColor)
        changeColorButton(kr47_1, but0Color, krColor)
        changeColorButton(kr47_2, but0Color, krColor)
        changeColorButton(kr47_3, but0Color, krColor)
        changeColorButton(kr48_1, but0Color, krColor)
        changeColorButton(kr48_2, but0Color, krColor)
        changeColorButton(kr48_3, but0Color, krColor)

    }

    private fun generateChart(chart: com.github.mikephil.charting.charts.LineChart, zondChart: MutableList<Entry>, desnChart: MutableList<Entry>, max: Float, min: Float){
        val zondDataSet = LineDataSet(zondChart, "")
        val desnDataSet = LineDataSet(desnChart, "")
        zondDataSet.lineWidth = 2f
        desnDataSet.lineWidth = 2f
        //zondDataSet.setDrawCircles(false)
        //desnDataSet.setDrawCircles(false)
        zondDataSet.setColor(Color.RED)
        desnDataSet.setColor(Color.BLUE)
        desnDataSet.setDrawValues(false)
        zondDataSet.setDrawValues(false)
        desnDataSet.setCircleColor(Color.BLUE)
        zondDataSet.setCircleColor(Color.RED)

        val lineData = LineData(desnDataSet, zondDataSet)
        chart.data = lineData
        chart.axisRight.setAxisMinimum(min)
        chart.axisRight.setAxisMaximum(max)
        chart.axisLeft.setAxisMinimum(min)
        chart.axisLeft.setAxisMaximum(max)
        chart.xAxis.setAxisMinValue(0f)
        chart.xAxis.setAxisMaxValue(14f)
        chart.setTouchEnabled(true)
        chart.setClickable(false)
        chart.setDoubleTapToZoomEnabled(false)
        chart.setDoubleTapToZoomEnabled(false)

        chart.setDrawBorders(false)
        chart.setDrawGridBackground(false)

        chart.getDescription().setEnabled(false)
        chart.getLegend().setEnabled(false)

        chart.getAxisLeft().setDrawLabels(false)
        chart.getAxisLeft().setLabelCount((max-min).toInt())
        chart.getXAxis().setDrawGridLines(false)
        chart.getXAxis().setDrawLabels(false)
        chart.getXAxis().setDrawAxisLine(false)

        chart.getAxisRight().setDrawGridLines(false)
        chart.getAxisRight().setDrawLabels(false)
        chart.getAxisRight().setDrawAxisLine(false)
    }
}