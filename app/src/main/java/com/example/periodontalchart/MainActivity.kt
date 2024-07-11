package com.example.periodontalchart

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        const val otlColor = "#FFD700"
        const val implantColor = "#595B5D"
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
        settingsForOtl()
        settingsForImplants()

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
            val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)
            if (defaultColor == Color.parseColor(color0)) {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color1)))
            } else {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
            }
        }
    }

    private fun settingsForPlombs(){
        val plombsId = intArrayOf(R.id.plomb18, R.id.plomb17,R.id.plomb16,R.id.plomb15,R.id.plomb14,R.id.plomb13,R.id.plomb12,R.id.plomb11,R.id.plomb28,R.id.plomb27,R.id.plomb26,R.id.plomb25,
            R.id.plomb24,R.id.plomb23,R.id.plomb22,R.id.plomb21,R.id.plomb38,R.id.plomb37,R.id.plomb36,R.id.plomb35,R.id.plomb34,R.id.plomb33,R.id.plomb32,R.id.plomb31,R.id.plomb48,R.id.plomb47,
            R.id.plomb46,R.id.plomb45,R.id.plomb44,R.id.plomb43,R.id.plomb42,R.id.plomb41)

        for(el in plombsId){
            changeColorButton(findViewById(el), but0Color, plombColor)
        }
    }

    private fun settingsForImplants(){
        val implantsId = intArrayOf(R.id.implant18, R.id.implant17,R.id.implant16,R.id.implant15,R.id.implant14,R.id.implant13,R.id.implant12,R.id.implant11,R.id.implant28,R.id.implant27,R.id.implant26,R.id.implant25,
            R.id.implant24,R.id.implant23,R.id.implant22,R.id.implant21,R.id.implant38,R.id.implant37,R.id.implant36,R.id.implant35,R.id.implant34,R.id.implant33,R.id.implant32,R.id.implant31,R.id.implant48,R.id.implant47,
            R.id.implant46,R.id.implant45,R.id.implant44,R.id.implant43,R.id.implant42,R.id.implant41)

        val tsId = intArrayOf(R.id.t18, R.id.t17,R.id.t16,R.id.t15,R.id.t14,R.id.t13,R.id.t12,R.id.t11,R.id.t28,R.id.t27,R.id.t26,R.id.t25,
            R.id.t24,R.id.t23,R.id.t22,R.id.t21,R.id.t38,R.id.t37,R.id.t36,R.id.t35,R.id.t34,R.id.t33,R.id.t32,R.id.t31,R.id.t48,R.id.t47,
            R.id.t46,R.id.t45,R.id.t44,R.id.t43,R.id.t42,R.id.t41)

        val t2sId = intArrayOf(R.id.t182, R.id.t172,R.id.t162,R.id.t152,R.id.t142,R.id.t132,R.id.t122,R.id.t112,R.id.t282,R.id.t272,R.id.t262,R.id.t252,
            R.id.t242,R.id.t232,R.id.t222,R.id.t212,R.id.t382,R.id.t372,R.id.t362,R.id.t352,R.id.t342,R.id.t332,R.id.t322,R.id.t312,R.id.t482,R.id.t472,
            R.id.t462,R.id.t452,R.id.t442,R.id.t432,R.id.t422,R.id.t412)

        val tsDrawable = intArrayOf(R.drawable.t18, R.drawable.t17,R.drawable.t16,R.drawable.t15,R.drawable.t14,R.drawable.t13,R.drawable.t12,R.drawable.t11,R.drawable.t28,R.drawable.t27,R.drawable.t26,R.drawable.t25,
            R.drawable.t24,R.drawable.t23,R.drawable.t22,R.drawable.t21,R.drawable.t38,R.drawable.t37,R.drawable.t36,R.drawable.t35,R.drawable.t34,R.drawable.t33,R.drawable.t32,R.drawable.t31,R.drawable.t48,R.drawable.t47,
            R.drawable.t46,R.drawable.t45,R.drawable.t44,R.drawable.t43,R.drawable.t42,R.drawable.t41)

        val t2sDrawable = intArrayOf(R.drawable.t182, R.drawable.t172,R.drawable.t162,R.drawable.t152,R.drawable.t142,R.drawable.t132,R.drawable.t122,R.drawable.t112,R.drawable.t282,R.drawable.t272,R.drawable.t262,R.drawable.t252,
            R.drawable.t242,R.drawable.t232,R.drawable.t222,R.drawable.t212,R.drawable.t382,R.drawable.t372,R.drawable.t362,R.drawable.t352,R.drawable.t342,R.drawable.t332,R.drawable.t322,R.drawable.t312,R.drawable.t482,R.drawable.t472,
            R.drawable.t462,R.drawable.t452,R.drawable.t442,R.drawable.t432,R.drawable.t422,R.drawable.t412)

        val tisDrawable = intArrayOf(R.drawable.t18i, R.drawable.t17i,R.drawable.t16i,R.drawable.t15i,R.drawable.t14i,R.drawable.t13i,R.drawable.t12i,R.drawable.t11i,R.drawable.t28i,R.drawable.t27i,R.drawable.t26i,R.drawable.t25i,
            R.drawable.t24i,R.drawable.t23i,R.drawable.t22i,R.drawable.t21i,R.drawable.t38i,R.drawable.t37i,R.drawable.t36i,R.drawable.t35i,R.drawable.t34i,R.drawable.t33i,R.drawable.t32i,R.drawable.t31i,R.drawable.t48i,R.drawable.t47i,
            R.drawable.t46i,R.drawable.t45i,R.drawable.t44i,R.drawable.t43i,R.drawable.t42i,R.drawable.t41i)

        val t2iDrawable = intArrayOf(R.drawable.t182i, R.drawable.t172i,R.drawable.t162i,R.drawable.t152i,R.drawable.t142i,R.drawable.t132i,R.drawable.t122i,R.drawable.t112i,R.drawable.t282i,R.drawable.t272i,R.drawable.t262i,R.drawable.t252i,
            R.drawable.t242i,R.drawable.t232i,R.drawable.t222i,R.drawable.t212i,R.drawable.t382i,R.drawable.t372i,R.drawable.t362i,R.drawable.t352i,R.drawable.t342i,R.drawable.t332i,R.drawable.t322i,R.drawable.t312i,R.drawable.t482i,R.drawable.t472i,
            R.drawable.t462i,R.drawable.t452i,R.drawable.t442i,R.drawable.t432i,R.drawable.t422i,R.drawable.t412i)

        for(i in implantsId.indices){
            val t = findViewById<ImageView>(tsId[i])
            val t2 = findViewById<ImageView>(t2sId[i])
            val implant = findViewById<Button>(implantsId[i])
            implant.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
            implant.setOnClickListener {
                val colorStateList = implant.backgroundTintList
                val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)
                if (defaultColor == Color.parseColor(but0Color)) {
                    implant.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(implantColor)))
                    t.setImageResource(tisDrawable[i])
                    t2.setImageResource(t2iDrawable[i])
                }
                else{
                    implant.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    t.setImageResource(tsDrawable[i])
                    t2.setImageResource(t2sDrawable[i])
                }
            }
        }
    }

    private fun settingsForKr(){
        val krId = intArrayOf(R.id.kr112_1,R.id.kr112_2,R.id.kr112_3,R.id.kr122_1,R.id.kr122_2,R.id.kr122_3,R.id.kr132_1,R.id.kr132_2,R.id.kr132_3,R.id.kr142_1,R.id.kr142_2,R.id.kr142_3,
            R.id.kr152_1,R.id.kr152_2,R.id.kr152_3,R.id.kr162_1,R.id.kr162_2,R.id.kr162_3,R.id.kr172_1,R.id.kr172_2,R.id.kr172_3,R.id.kr182_1,R.id.kr182_2,R.id.kr182_3,R.id.kr212_1,R.id.kr212_2,
            R.id.kr212_3,R.id.kr222_1,R.id.kr222_2,R.id.kr222_3,R.id.kr232_1,R.id.kr232_2,R.id.kr232_3,R.id.kr242_1,R.id.kr242_2,R.id.kr242_3,R.id.kr252_1,R.id.kr252_2,R.id.kr252_3,R.id.kr262_1,
            R.id.kr262_2,R.id.kr262_3,R.id.kr272_1,R.id.kr272_2,R.id.kr272_3,R.id.kr282_1,R.id.kr282_2,R.id.kr282_3,R.id.kr312_1,R.id.kr312_2,R.id.kr312_3,R.id.kr322_1,R.id.kr322_2,R.id.kr322_3,
            R.id.kr332_1,R.id.kr332_2,R.id.kr332_3,R.id.kr342_1,R.id.kr342_2,R.id.kr342_3,R.id.kr352_1,R.id.kr352_2,R.id.kr352_3,R.id.kr362_1,R.id.kr362_2,R.id.kr362_3,R.id.kr372_1,R.id.kr372_2,
            R.id.kr372_3,R.id.kr382_1,R.id.kr382_2,R.id.kr382_3,R.id.kr412_1,R.id.kr412_2,R.id.kr412_3,R.id.kr422_1,R.id.kr422_2,R.id.kr422_3,R.id.kr432_1,R.id.kr432_2,R.id.kr432_3,R.id.kr442_1,
            R.id.kr442_2,R.id.kr442_3,R.id.kr452_1,R.id.kr452_2,R.id.kr452_3,R.id.kr462_1,R.id.kr462_2,R.id.kr462_3,R.id.kr472_1,R.id.kr472_2,R.id.kr472_3,R.id.kr482_1,R.id.kr482_2,R.id.kr482_3,
            R.id.kr11_1,R.id.kr11_2,R.id.kr11_3,R.id.kr12_1,R.id.kr12_2,R.id.kr12_3,R.id.kr13_1,R.id.kr13_2,R.id.kr13_3,R.id.kr14_1,R.id.kr14_2,R.id.kr14_3,R.id.kr15_1,R.id.kr15_2,R.id.kr15_3,
            R.id.kr16_1,R.id.kr16_2,R.id.kr16_3,R.id.kr17_1,R.id.kr17_2,R.id.kr17_3,R.id.kr18_1,R.id.kr18_2,R.id.kr18_3,R.id.kr21_1,R.id.kr21_2,R.id.kr21_3,R.id.kr22_1,R.id.kr22_2,R.id.kr22_3,
            R.id.kr23_1,R.id.kr23_2,R.id.kr23_3,R.id.kr24_1,R.id.kr24_2,R.id.kr24_3,R.id.kr25_1,R.id.kr25_2,R.id.kr25_3,R.id.kr26_1,R.id.kr26_2,R.id.kr26_3,R.id.kr27_1,R.id.kr27_2,R.id.kr27_3,
            R.id.kr28_1,R.id.kr28_2,R.id.kr28_3,R.id.kr31_1,R.id.kr31_2,R.id.kr31_3,R.id.kr32_1,R.id.kr32_2,R.id.kr32_3,R.id.kr33_1,R.id.kr33_2,R.id.kr33_3,R.id.kr34_1,R.id.kr34_2,R.id.kr34_3,
            R.id.kr35_1,R.id.kr35_2,R.id.kr35_3,R.id.kr36_1,R.id.kr36_2,R.id.kr36_3,R.id.kr37_1,R.id.kr37_2,R.id.kr37_3,R.id.kr38_1,R.id.kr38_2,R.id.kr38_3,R.id.kr41_1,R.id.kr41_2,R.id.kr41_3,
            R.id.kr42_1,R.id.kr42_2,R.id.kr42_3,R.id.kr43_1,R.id.kr43_2,R.id.kr43_3,R.id.kr44_1,R.id.kr44_2,R.id.kr44_3,R.id.kr45_1,R.id.kr45_2,R.id.kr45_3,R.id.kr46_1,R.id.kr46_2,R.id.kr46_3,
            R.id.kr47_1,R.id.kr47_2,R.id.kr47_3,R.id.kr48_1,R.id.kr48_2,R.id.kr48_3)

        for(el in krId){
            changeColorButton(findViewById(el), but0Color, krColor)
        }
    }

    private fun settingsForOtl(){
        val otlId = intArrayOf(R.id.otl112_1,R.id.otl112_2,R.id.otl112_3,R.id.otl122_1,R.id.otl122_2,R.id.otl122_3,R.id.otl132_1,R.id.otl132_2,R.id.otl132_3,R.id.otl142_1,R.id.otl142_2,R.id.otl142_3,
            R.id.otl152_1,R.id.otl152_2,R.id.otl152_3,R.id.otl162_1,R.id.otl162_2,R.id.otl162_3,R.id.otl172_1,R.id.otl172_2,R.id.otl172_3,R.id.otl182_1,R.id.otl182_2,R.id.otl182_3,R.id.otl212_1,R.id.otl212_2,
            R.id.otl212_3,R.id.otl222_1,R.id.otl222_2,R.id.otl222_3,R.id.otl232_1,R.id.otl232_2,R.id.otl232_3,R.id.otl242_1,R.id.otl242_2,R.id.otl242_3,R.id.otl252_1,R.id.otl252_2,R.id.otl252_3,R.id.otl262_1,
            R.id.otl262_2,R.id.otl262_3,R.id.otl272_1,R.id.otl272_2,R.id.otl272_3,R.id.otl282_1,R.id.otl282_2,R.id.otl282_3,R.id.otl312_1,R.id.otl312_2,R.id.otl312_3,R.id.otl322_1,R.id.otl322_2,R.id.otl322_3,
            R.id.otl332_1,R.id.otl332_2,R.id.otl332_3,R.id.otl342_1,R.id.otl342_2,R.id.otl342_3,R.id.otl352_1,R.id.otl352_2,R.id.otl352_3,R.id.otl362_1,R.id.otl362_2,R.id.otl362_3,R.id.otl372_1,R.id.otl372_2,
            R.id.otl372_3,R.id.otl382_1,R.id.otl382_2,R.id.otl382_3,R.id.otl412_1,R.id.otl412_2,R.id.otl412_3,R.id.otl422_1,R.id.otl422_2,R.id.otl422_3,R.id.otl432_1,R.id.otl432_2,R.id.otl432_3,R.id.otl442_1,
            R.id.otl442_2,R.id.otl442_3,R.id.otl452_1,R.id.otl452_2,R.id.otl452_3,R.id.otl462_1,R.id.otl462_2,R.id.otl462_3,R.id.otl472_1,R.id.otl472_2,R.id.otl472_3,R.id.otl482_1,R.id.otl482_2,R.id.otl482_3,
            R.id.otl11_1,R.id.otl11_2,R.id.otl11_3,R.id.otl12_1,R.id.otl12_2,R.id.otl12_3,R.id.otl13_1,R.id.otl13_2,R.id.otl13_3,R.id.otl14_1,R.id.otl14_2,R.id.otl14_3,R.id.otl15_1,R.id.otl15_2,R.id.otl15_3,
            R.id.otl16_1,R.id.otl16_2,R.id.otl16_3,R.id.otl17_1,R.id.otl17_2,R.id.otl17_3,R.id.otl18_1,R.id.otl18_2,R.id.otl18_3,R.id.otl21_1,R.id.otl21_2,R.id.otl21_3,R.id.otl22_1,R.id.otl22_2,R.id.otl22_3,
            R.id.otl23_1,R.id.otl23_2,R.id.otl23_3,R.id.otl24_1,R.id.otl24_2,R.id.otl24_3,R.id.otl25_1,R.id.otl25_2,R.id.otl25_3,R.id.otl26_1,R.id.otl26_2,R.id.otl26_3,R.id.otl27_1,R.id.otl27_2,R.id.otl27_3,
            R.id.otl28_1,R.id.otl28_2,R.id.otl28_3,R.id.otl31_1,R.id.otl31_2,R.id.otl31_3,R.id.otl32_1,R.id.otl32_2,R.id.otl32_3,R.id.otl33_1,R.id.otl33_2,R.id.otl33_3,R.id.otl34_1,R.id.otl34_2,R.id.otl34_3,
            R.id.otl35_1,R.id.otl35_2,R.id.otl35_3,R.id.otl36_1,R.id.otl36_2,R.id.otl36_3,R.id.otl37_1,R.id.otl37_2,R.id.otl37_3,R.id.otl38_1,R.id.otl38_2,R.id.otl38_3,R.id.otl41_1,R.id.otl41_2,R.id.otl41_3,
            R.id.otl42_1,R.id.otl42_2,R.id.otl42_3,R.id.otl43_1,R.id.otl43_2,R.id.otl43_3,R.id.otl44_1,R.id.otl44_2,R.id.otl44_3,R.id.otl45_1,R.id.otl45_2,R.id.otl45_3,R.id.otl46_1,R.id.otl46_2,R.id.otl46_3,
            R.id.otl47_1,R.id.otl47_2,R.id.otl47_3,R.id.otl48_1,R.id.otl48_2,R.id.otl48_3)

        for(el in otlId){
            changeColorButton(findViewById(el), but0Color, otlColor)
        }
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