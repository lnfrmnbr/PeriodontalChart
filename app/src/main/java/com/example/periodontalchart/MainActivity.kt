package com.example.periodontalchart

import android.R.attr.entries
import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import java.util.Map.entry


class MainActivity : AppCompatActivity() {

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



        val zondChart1: ArrayList<Entry> = ArrayList()
        zondChart1.add(Entry(1f, 0f))
        zondChart1.add(Entry(2f, 1f))
        zondChart1.add(Entry(13f, 2.5f))
        zondChart1.add(Entry(14f, 4f))

        val desnChart1: ArrayList<Entry> = ArrayList()
        desnChart1.add(Entry(1f, 5f))
        desnChart1.add(Entry(2f, 3f))
        desnChart1.add(Entry(13f, 0f))
        desnChart1.add(Entry(14f, 1f))

        val lineDataSet = LineDataSet(zondChart1, "")
        val desnDataSet = LineDataSet(desnChart1, "")

        lineDataSet.lineWidth = 2f
        lineDataSet.setColor(Color.RED)
        desnDataSet.setColor(Color.BLUE)

        val lineData = LineData(lineDataSet, desnDataSet)

        chart1.data = lineData
    }
}