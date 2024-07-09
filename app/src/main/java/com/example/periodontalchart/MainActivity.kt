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

        val chart1 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart1)
        val chart2 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart2)
        val chart3 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart3)
        val chart4 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart4)



        generateChart(chart1, zondChart1, desnChart1, 17f, -9f)
        generateChart(chart2, zondChart2, desnChart2, 17f, -9f)
        generateChart(chart3, zondChart3, desnChart3,9f, -16f)
        generateChart(chart4, zondChart2, desnChart2,9f, -16f)

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