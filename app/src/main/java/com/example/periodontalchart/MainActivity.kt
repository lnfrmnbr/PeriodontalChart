package com.example.periodontalchart

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toDrawable
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
        const val plombColor = "#9C9C9C"
        const val krColor = "#CD5C5C"
        const val otlColor = "#FFD700"
        const val implantColor = "#595B5D"
        const val puColor = "#CF1D2E"
        const val peColor = "#555555"
        const val kamColor = "#696969"
        const val vosColor = "#9ACD32"
        const val karColor = "#a9a9a9"
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
        settingsForPupes()
        settingsForKam()
        settingsForVos()
        settingsForFurk()
        settingsForKar()

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

    private fun settingsForPupes(){
        val pupesId = intArrayOf(R.id.pupe18, R.id.pupe17,R.id.pupe16,R.id.pupe15,R.id.pupe14,R.id.pupe13,R.id.pupe12,R.id.pupe11,R.id.pupe28,R.id.pupe27,R.id.pupe26,R.id.pupe25,
            R.id.pupe24,R.id.pupe23,R.id.pupe22,R.id.pupe21,R.id.pupe38,R.id.pupe37,R.id.pupe36,R.id.pupe35,R.id.pupe34,R.id.pupe33,R.id.pupe32,R.id.pupe31,R.id.pupe48,R.id.pupe47,
            R.id.pupe46,R.id.pupe45,R.id.pupe44,R.id.pupe43,R.id.pupe42,R.id.pupe41)

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

        val trDrawable = intArrayOf(R.drawable.t18r, R.drawable.t17r,R.drawable.t16r,R.drawable.t15r,R.drawable.t14r,R.drawable.t13r,R.drawable.t12r,R.drawable.t11r,R.drawable.t28r,R.drawable.t27r,R.drawable.t26r,R.drawable.t25r,
            R.drawable.t24r,R.drawable.t23r,R.drawable.t22r,R.drawable.t21r,R.drawable.t38r,R.drawable.t37r,R.drawable.t36r,R.drawable.t35r,R.drawable.t34r,R.drawable.t33r,R.drawable.t32r,R.drawable.t31r,R.drawable.t48r,R.drawable.t47r,
            R.drawable.t46r,R.drawable.t45r,R.drawable.t44r,R.drawable.t43r,R.drawable.t42r,R.drawable.t41r)

        val t2rDrawable = intArrayOf(R.drawable.t182r, R.drawable.t172r,R.drawable.t162r,R.drawable.t152r,R.drawable.t142r,R.drawable.t132r,R.drawable.t122r,R.drawable.t112r,R.drawable.t282r,R.drawable.t272r,R.drawable.t262r,R.drawable.t252r,
            R.drawable.t242r,R.drawable.t232r,R.drawable.t222r,R.drawable.t212r,R.drawable.t382r,R.drawable.t372r,R.drawable.t362r,R.drawable.t352r,R.drawable.t342r,R.drawable.t332r,R.drawable.t322r,R.drawable.t312r,R.drawable.t482r,R.drawable.t472r,
            R.drawable.t462r,R.drawable.t452r,R.drawable.t442r,R.drawable.t432r,R.drawable.t422r,R.drawable.t412r)

        val tbDrawable = intArrayOf(R.drawable.t18b, R.drawable.t17b,R.drawable.t16b,R.drawable.t15b,R.drawable.t14b,R.drawable.t13b,R.drawable.t12b,R.drawable.t11b,R.drawable.t28b,R.drawable.t27b,R.drawable.t26b,R.drawable.t25b,
            R.drawable.t24b,R.drawable.t23b,R.drawable.t22b,R.drawable.t21b,R.drawable.t38b,R.drawable.t37b,R.drawable.t36b,R.drawable.t35b,R.drawable.t34b,R.drawable.t33b,R.drawable.t32b,R.drawable.t31b,R.drawable.t48b,R.drawable.t47b,
            R.drawable.t46b,R.drawable.t45b,R.drawable.t44b,R.drawable.t43b,R.drawable.t42b,R.drawable.t41b)

        val t2bDrawable = intArrayOf(R.drawable.t182b, R.drawable.t172b,R.drawable.t162b,R.drawable.t152b,R.drawable.t142b,R.drawable.t132b,R.drawable.t122b,R.drawable.t112b,R.drawable.t282b,R.drawable.t272b,R.drawable.t262b,R.drawable.t252b,
            R.drawable.t242b,R.drawable.t232b,R.drawable.t222b,R.drawable.t212b,R.drawable.t382b,R.drawable.t372b,R.drawable.t362b,R.drawable.t352b,R.drawable.t342b,R.drawable.t332b,R.drawable.t322b,R.drawable.t312b,R.drawable.t482b,R.drawable.t472b,
            R.drawable.t462b,R.drawable.t452b,R.drawable.t442b,R.drawable.t432b,R.drawable.t422b,R.drawable.t412b)

        for(i in pupesId.indices){
            val t = findViewById<ImageView>(tsId[i])
            val t2 = findViewById<ImageView>(t2sId[i])
            val pupe = findViewById<Button>(pupesId[i])
            pupe.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
            pupe.setOnClickListener {
                val colorStateList = pupe.backgroundTintList
                val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)
                if (defaultColor == Color.parseColor(but0Color)) {
                    pupe.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(puColor)))
                    t.setImageResource(trDrawable[i])
                    t2.setImageResource(t2rDrawable[i])
                }
                else if (defaultColor == Color.parseColor(puColor)) {
                    pupe.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(peColor)))
                    t.setImageResource(tbDrawable[i])
                    t2.setImageResource(t2bDrawable[i])
                }
                else{
                    pupe.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
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

    private fun settingsForKam(){
        val kamId = intArrayOf(R.id.kam112_1,R.id.kam112_2,R.id.kam112_3,R.id.kam122_1,R.id.kam122_2,R.id.kam122_3,R.id.kam132_1,R.id.kam132_2,R.id.kam132_3,R.id.kam142_1,R.id.kam142_2,R.id.kam142_3,
            R.id.kam152_1,R.id.kam152_2,R.id.kam152_3,R.id.kam162_1,R.id.kam162_2,R.id.kam162_3,R.id.kam172_1,R.id.kam172_2,R.id.kam172_3,R.id.kam182_1,R.id.kam182_2,R.id.kam182_3,R.id.kam212_1,R.id.kam212_2,
            R.id.kam212_3,R.id.kam222_1,R.id.kam222_2,R.id.kam222_3,R.id.kam232_1,R.id.kam232_2,R.id.kam232_3,R.id.kam242_1,R.id.kam242_2,R.id.kam242_3,R.id.kam252_1,R.id.kam252_2,R.id.kam252_3,R.id.kam262_1,
            R.id.kam262_2,R.id.kam262_3,R.id.kam272_1,R.id.kam272_2,R.id.kam272_3,R.id.kam282_1,R.id.kam282_2,R.id.kam282_3,R.id.kam312_1,R.id.kam312_2,R.id.kam312_3,R.id.kam322_1,R.id.kam322_2,R.id.kam322_3,
            R.id.kam332_1,R.id.kam332_2,R.id.kam332_3,R.id.kam342_1,R.id.kam342_2,R.id.kam342_3,R.id.kam352_1,R.id.kam352_2,R.id.kam352_3,R.id.kam362_1,R.id.kam362_2,R.id.kam362_3,R.id.kam372_1,R.id.kam372_2,
            R.id.kam372_3,R.id.kam382_1,R.id.kam382_2,R.id.kam382_3,R.id.kam412_1,R.id.kam412_2,R.id.kam412_3,R.id.kam422_1,R.id.kam422_2,R.id.kam422_3,R.id.kam432_1,R.id.kam432_2,R.id.kam432_3,R.id.kam442_1,
            R.id.kam442_2,R.id.kam442_3,R.id.kam452_1,R.id.kam452_2,R.id.kam452_3,R.id.kam462_1,R.id.kam462_2,R.id.kam462_3,R.id.kam472_1,R.id.kam472_2,R.id.kam472_3,R.id.kam482_1,R.id.kam482_2,R.id.kam482_3,
            R.id.kam11_1,R.id.kam11_2,R.id.kam11_3,R.id.kam12_1,R.id.kam12_2,R.id.kam12_3,R.id.kam13_1,R.id.kam13_2,R.id.kam13_3,R.id.kam14_1,R.id.kam14_2,R.id.kam14_3,R.id.kam15_1,R.id.kam15_2,R.id.kam15_3,
            R.id.kam16_1,R.id.kam16_2,R.id.kam16_3,R.id.kam17_1,R.id.kam17_2,R.id.kam17_3,R.id.kam18_1,R.id.kam18_2,R.id.kam18_3,R.id.kam21_1,R.id.kam21_2,R.id.kam21_3,R.id.kam22_1,R.id.kam22_2,R.id.kam22_3,
            R.id.kam23_1,R.id.kam23_2,R.id.kam23_3,R.id.kam24_1,R.id.kam24_2,R.id.kam24_3,R.id.kam25_1,R.id.kam25_2,R.id.kam25_3,R.id.kam26_1,R.id.kam26_2,R.id.kam26_3,R.id.kam27_1,R.id.kam27_2,R.id.kam27_3,
            R.id.kam28_1,R.id.kam28_2,R.id.kam28_3,R.id.kam31_1,R.id.kam31_2,R.id.kam31_3,R.id.kam32_1,R.id.kam32_2,R.id.kam32_3,R.id.kam33_1,R.id.kam33_2,R.id.kam33_3,R.id.kam34_1,R.id.kam34_2,R.id.kam34_3,
            R.id.kam35_1,R.id.kam35_2,R.id.kam35_3,R.id.kam36_1,R.id.kam36_2,R.id.kam36_3,R.id.kam37_1,R.id.kam37_2,R.id.kam37_3,R.id.kam38_1,R.id.kam38_2,R.id.kam38_3,R.id.kam41_1,R.id.kam41_2,R.id.kam41_3,
            R.id.kam42_1,R.id.kam42_2,R.id.kam42_3,R.id.kam43_1,R.id.kam43_2,R.id.kam43_3,R.id.kam44_1,R.id.kam44_2,R.id.kam44_3,R.id.kam45_1,R.id.kam45_2,R.id.kam45_3,R.id.kam46_1,R.id.kam46_2,R.id.kam46_3,
            R.id.kam47_1,R.id.kam47_2,R.id.kam47_3,R.id.kam48_1,R.id.kam48_2,R.id.kam48_3)

        for(el in kamId){
            changeColorButton(findViewById(el), but0Color, kamColor)
        }
    }

    private fun settingsForVos(){
        val vosId = intArrayOf(R.id.vos112_1,R.id.vos112_2,R.id.vos112_3,R.id.vos122_1,R.id.vos122_2,R.id.vos122_3,R.id.vos132_1,R.id.vos132_2,R.id.vos132_3,R.id.vos142_1,R.id.vos142_2,R.id.vos142_3,
            R.id.vos152_1,R.id.vos152_2,R.id.vos152_3,R.id.vos162_1,R.id.vos162_2,R.id.vos162_3,R.id.vos172_1,R.id.vos172_2,R.id.vos172_3,R.id.vos182_1,R.id.vos182_2,R.id.vos182_3,R.id.vos212_1,R.id.vos212_2,
            R.id.vos212_3,R.id.vos222_1,R.id.vos222_2,R.id.vos222_3,R.id.vos232_1,R.id.vos232_2,R.id.vos232_3,R.id.vos242_1,R.id.vos242_2,R.id.vos242_3,R.id.vos252_1,R.id.vos252_2,R.id.vos252_3,R.id.vos262_1,
            R.id.vos262_2,R.id.vos262_3,R.id.vos272_1,R.id.vos272_2,R.id.vos272_3,R.id.vos282_1,R.id.vos282_2,R.id.vos282_3,R.id.vos312_1,R.id.vos312_2,R.id.vos312_3,R.id.vos322_1,R.id.vos322_2,R.id.vos322_3,
            R.id.vos332_1,R.id.vos332_2,R.id.vos332_3,R.id.vos342_1,R.id.vos342_2,R.id.vos342_3,R.id.vos352_1,R.id.vos352_2,R.id.vos352_3,R.id.vos362_1,R.id.vos362_2,R.id.vos362_3,R.id.vos372_1,R.id.vos372_2,
            R.id.vos372_3,R.id.vos382_1,R.id.vos382_2,R.id.vos382_3,R.id.vos412_1,R.id.vos412_2,R.id.vos412_3,R.id.vos422_1,R.id.vos422_2,R.id.vos422_3,R.id.vos432_1,R.id.vos432_2,R.id.vos432_3,R.id.vos442_1,
            R.id.vos442_2,R.id.vos442_3,R.id.vos452_1,R.id.vos452_2,R.id.vos452_3,R.id.vos462_1,R.id.vos462_2,R.id.vos462_3,R.id.vos472_1,R.id.vos472_2,R.id.vos472_3,R.id.vos482_1,R.id.vos482_2,R.id.vos482_3,
            R.id.vos11_1,R.id.vos11_2,R.id.vos11_3,R.id.vos12_1,R.id.vos12_2,R.id.vos12_3,R.id.vos13_1,R.id.vos13_2,R.id.vos13_3,R.id.vos14_1,R.id.vos14_2,R.id.vos14_3,R.id.vos15_1,R.id.vos15_2,R.id.vos15_3,
            R.id.vos16_1,R.id.vos16_2,R.id.vos16_3,R.id.vos17_1,R.id.vos17_2,R.id.vos17_3,R.id.vos18_1,R.id.vos18_2,R.id.vos18_3,R.id.vos21_1,R.id.vos21_2,R.id.vos21_3,R.id.vos22_1,R.id.vos22_2,R.id.vos22_3,
            R.id.vos23_1,R.id.vos23_2,R.id.vos23_3,R.id.vos24_1,R.id.vos24_2,R.id.vos24_3,R.id.vos25_1,R.id.vos25_2,R.id.vos25_3,R.id.vos26_1,R.id.vos26_2,R.id.vos26_3,R.id.vos27_1,R.id.vos27_2,R.id.vos27_3,
            R.id.vos28_1,R.id.vos28_2,R.id.vos28_3,R.id.vos31_1,R.id.vos31_2,R.id.vos31_3,R.id.vos32_1,R.id.vos32_2,R.id.vos32_3,R.id.vos33_1,R.id.vos33_2,R.id.vos33_3,R.id.vos34_1,R.id.vos34_2,R.id.vos34_3,
            R.id.vos35_1,R.id.vos35_2,R.id.vos35_3,R.id.vos36_1,R.id.vos36_2,R.id.vos36_3,R.id.vos37_1,R.id.vos37_2,R.id.vos37_3,R.id.vos38_1,R.id.vos38_2,R.id.vos38_3,R.id.vos41_1,R.id.vos41_2,R.id.vos41_3,
            R.id.vos42_1,R.id.vos42_2,R.id.vos42_3,R.id.vos43_1,R.id.vos43_2,R.id.vos43_3,R.id.vos44_1,R.id.vos44_2,R.id.vos44_3,R.id.vos45_1,R.id.vos45_2,R.id.vos45_3,R.id.vos46_1,R.id.vos46_2,R.id.vos46_3,
            R.id.vos47_1,R.id.vos47_2,R.id.vos47_3,R.id.vos48_1,R.id.vos48_2,R.id.vos48_3)

        for(el in vosId){
            changeColorButton(findViewById(el), but0Color, vosColor)
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

    private fun settingsForFurk(){
        val furksId = intArrayOf(R.id.furk18, R.id.furk17,R.id.furk16,R.id.furk28,R.id.furk27,R.id.furk26,
            R.id.furk182_1,R.id.furk182_2, R.id.furk172_1,R.id.furk172_2,R.id.furk162_1,R.id.furk162_2,R.id.furk142_1,R.id.furk142_2,
            R.id.furk282_1,R.id.furk282_2, R.id.furk272_1,R.id.furk272_2,R.id.furk262_1,R.id.furk262_2,R.id.furk242_1,R.id.furk242_2
            ,R.id.furk38,R.id.furk37,R.id.furk36,R.id.furk48,R.id.furk47, R.id.furk46)
        val furksImgId = intArrayOf(R.id.fi18, R.id.fi17,R.id.fi16,R.id.fi28,R.id.fi27,R.id.fi26,
            R.id.fi182_1,R.id.fi182_2, R.id.fi172_1,R.id.fi172_2,R.id.fi162_1,R.id.fi162_2,R.id.fi142_1,R.id.fi142_2,
            R.id.fi282_1,R.id.fi282_2, R.id.fi272_1,R.id.fi272_2,R.id.fi262_1,R.id.fi262_2,R.id.fi242_1,R.id.fi242_2
            ,R.id.fi38,R.id.fi37,R.id.fi36,R.id.fi48,R.id.fi47, R.id.fi46)

        for(i in furksId.indices){
            val furkBut = findViewById<ImageButton>(furksId[i])
            val furkImg = findViewById<ImageView>(furksImgId[i])
            furkBut.setImageResource(R.drawable.null17)
            furkBut.tag = R.drawable.null17
            furkBut.setOnClickListener {
                if (furkBut.tag == R.drawable.null17) {
                    furkBut.setImageResource(R.drawable.f1)
                    furkImg.setImageResource(R.drawable.f1)
                    furkBut.tag = R.drawable.f1
                    furkImg.tag = R.drawable.f1
                }
                else if (furkBut.tag == R.drawable.f1) {
                    furkBut.setImageResource(R.drawable.f2)
                    furkImg.setImageResource(R.drawable.f2)
                    furkBut.tag = R.drawable.f2
                    furkImg.tag = R.drawable.f2
                }
                else if (furkBut.tag == R.drawable.f2) {
                    furkBut.setImageResource(R.drawable.f3)
                    furkImg.setImageResource(R.drawable.f3)
                    furkBut.tag = R.drawable.f3
                    furkImg.tag = R.drawable.f3
                }
                else {
                    furkBut.setImageResource(R.drawable.null17)
                    furkImg.setImageResource(R.drawable.null17)
                    furkBut.tag = R.drawable.null17
                    furkImg.tag = R.drawable.null17
                }
            }
        }
    }

    private fun settingsForKar() {
        val karsId = intArrayOf(R.id.kar18_1, R.id.kar18_5, R.id.kar18_21, R.id.kar18_22, R.id.kar18_61, R.id.kar18_62,
            R.id.kar17_1, R.id.kar17_5, R.id.kar17_21, R.id.kar17_22, R.id.kar17_61, R.id.kar17_62,
            R.id.kar16_1, R.id.kar16_5, R.id.kar16_21, R.id.kar16_22, R.id.kar16_61, R.id.kar16_62,
            R.id.kar15_1, R.id.kar15_5, R.id.kar15_21, R.id.kar15_22, R.id.kar15_61, R.id.kar15_62,
            R.id.kar14_1, R.id.kar14_5, R.id.kar14_21, R.id.kar14_22, R.id.kar14_61, R.id.kar14_62,
            R.id.kar13_6, R.id.kar13_5, R.id.kar13_31, R.id.kar13_32, R.id.kar13_41, R.id.kar13_42,
            R.id.kar12_6, R.id.kar12_5, R.id.kar12_31, R.id.kar12_32, R.id.kar12_41, R.id.kar12_42,
            R.id.kar11_6, R.id.kar11_5, R.id.kar11_31, R.id.kar11_32, R.id.kar11_41, R.id.kar11_42,
            R.id.kar28_1, R.id.kar28_5, R.id.kar28_21, R.id.kar28_22, R.id.kar28_61, R.id.kar28_62,
            R.id.kar27_1, R.id.kar27_5, R.id.kar27_21, R.id.kar27_22, R.id.kar27_61, R.id.kar27_62,
            R.id.kar26_1, R.id.kar26_5, R.id.kar26_21, R.id.kar26_22, R.id.kar26_61, R.id.kar26_62,
            R.id.kar25_1, R.id.kar25_5, R.id.kar25_21, R.id.kar25_22, R.id.kar25_61, R.id.kar25_62,
            R.id.kar24_1, R.id.kar24_5, R.id.kar24_21, R.id.kar24_22, R.id.kar24_61, R.id.kar24_62,
            R.id.kar23_6, R.id.kar23_5, R.id.kar23_31, R.id.kar23_32, R.id.kar23_41, R.id.kar23_42,
            R.id.kar22_6, R.id.kar22_5, R.id.kar22_31, R.id.kar22_32, R.id.kar22_41, R.id.kar22_42,
            R.id.kar21_6, R.id.kar21_5, R.id.kar21_31, R.id.kar21_32, R.id.kar21_41, R.id.kar21_42
        )
        val karsImgId = intArrayOf(R.id.t18k1, R.id.t18k5, R.id.t18k21, R.id.t18k22, R.id.t18k61, R.id.t18k62,
            R.id.t17k1, R.id.t17k5, R.id.t17k21, R.id.t17k22, R.id.t17k61, R.id.t17k62,
            R.id.t16k1, R.id.t16k5, R.id.t16k21, R.id.t16k22, R.id.t16k61, R.id.t16k62,
            R.id.t15k1, R.id.t15k5, R.id.t15k21, R.id.t15k22, R.id.t15k61, R.id.t15k62,
            R.id.t14k1, R.id.t14k5, R.id.t14k21, R.id.t14k22, R.id.t14k61, R.id.t14k62,
            R.id.t13k6, R.id.t13k5, R.id.t13k31, R.id.t13k32, R.id.t13k41, R.id.t13k42,
            R.id.t12k6, R.id.t12k5, R.id.t12k31, R.id.t12k32, R.id.t12k41, R.id.t12k42,
            R.id.t11k6, R.id.t11k5, R.id.t11k31, R.id.t11k32, R.id.t11k41, R.id.t11k42,
            R.id.t28k1, R.id.t28k5, R.id.t28k21, R.id.t28k22, R.id.t28k61, R.id.t28k62,
            R.id.t27k1, R.id.t27k5, R.id.t27k21, R.id.t27k22, R.id.t27k61, R.id.t27k62,
            R.id.t26k1, R.id.t26k5, R.id.t26k21, R.id.t26k22, R.id.t26k61, R.id.t26k62,
            R.id.t25k1, R.id.t25k5, R.id.t25k21, R.id.t25k22, R.id.t25k61, R.id.t25k62,
            R.id.t24k1, R.id.t24k5, R.id.t24k21, R.id.t24k22, R.id.t24k61, R.id.t24k62,
            R.id.t23k6, R.id.t23k5, R.id.t23k31, R.id.t23k32, R.id.t23k41, R.id.t23k42,
            R.id.t22k6, R.id.t22k5, R.id.t22k31, R.id.t22k32, R.id.t22k41, R.id.t22k42,
            R.id.t21k6, R.id.t21k5, R.id.t21k31, R.id.t21k32, R.id.t21k41, R.id.t21k42
        )

        for (i in karsId.indices) {
            val r = karsId.indexOf(R.id.kar23_31)
            val t = karsImgId.indexOf(R.id.t23k31)
            Log.e("DEBUG", "$i - $r - $t")
            val karBut = findViewById<Button>(karsId[i])
            val karImg = findViewById<ImageView>(karsImgId[i])
            karBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
            karBut.setOnClickListener {
                val colorStateList = karBut.backgroundTintList
                val defaultColor =
                    colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)
                if (defaultColor == Color.parseColor(but0Color)) {
                    karBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(karColor)))
                    karImg.visibility = View.VISIBLE
                } else {
                    karBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    karImg.visibility = View.GONE
                }
            }
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