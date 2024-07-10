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