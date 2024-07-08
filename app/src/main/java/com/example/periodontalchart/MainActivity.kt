package com.example.periodontalchart

import android.graphics.Color
import android.os.Bundle
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

        generateChart1()
    }

    private fun generateChart1(){
        val chart1 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart1)

        val zondDataSet = LineDataSet(zondChart1, "")
        val desnDataSet = LineDataSet(desnChart1, "")

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
        chart1.data = lineData

        chart1.axisRight.setAxisMinimum(-9f)
        chart1.axisRight.setAxisMaximum(17f)
        chart1.axisLeft.setAxisMinimum(-9f)
        chart1.axisLeft.setAxisMaximum(17f)
        chart1.xAxis.setAxisMinValue(0f)
        chart1.xAxis.setAxisMaxValue(14f)
        chart1.setTouchEnabled(true)
        chart1.setClickable(false)
        chart1.setDoubleTapToZoomEnabled(false)
        chart1.setDoubleTapToZoomEnabled(false)

        chart1.setDrawBorders(false)
        chart1.setDrawGridBackground(false)

        chart1.getDescription().setEnabled(false)
        chart1.getLegend().setEnabled(false)

        chart1.getAxisLeft().setDrawLabels(false)
        chart1.getAxisLeft().setLabelCount(25)


        chart1.getXAxis().setDrawGridLines(false)
        chart1.getXAxis().setDrawLabels(false)
        chart1.getXAxis().setDrawAxisLine(false)

        chart1.getAxisRight().setDrawGridLines(false)
        chart1.getAxisRight().setDrawLabels(false)
        chart1.getAxisRight().setDrawAxisLine(false)
    }
}