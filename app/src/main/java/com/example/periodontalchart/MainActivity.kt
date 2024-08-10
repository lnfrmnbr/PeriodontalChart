package com.example.periodontalchart

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.pdf.PdfDocument
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.doAfterTextChanged
//import com.example.periodontalchart.databinding.ActivityMainBinding
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import kotlin.math.max
import kotlin.math.round

class MainActivity : AppCompatActivity() {

    //private lateinit var binding: ActivityMainBinding

    companion object {
        val IMAGE_REQUEST_CODE = 1_000;
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

        var zondChart4 = mutableListOf(
            Entry(0.4f, 0f),
            Entry(0.95f, 0f),
            Entry(1.5f, 0f),
            Entry(2.1f, 0f),
            Entry(2.55f, 0f),
            Entry(3f, 0f),
            Entry(3.5f, 0f),
            Entry(4f, 0f),
            Entry(4.5f, 0f),
            Entry(5.1f, 0f),
            Entry(5.6f, 0f),
            Entry(6.1f, 0f),
            Entry(6.6f, 0f),
            Entry(7.1f, 0f),
            Entry(7.6f, 0f),
            Entry(8.2f, 0f),
            Entry(9.0f, 0f),
            Entry(9.8f, 0f),
            Entry(10.4f, 0f),
            Entry(11.15f, 0f),
            Entry(11.9f, 0f),
            Entry(12.4f, 0f),
            Entry(13.1f, 0f),
            Entry(13.8f, 0f)
        )
        var desnChart4 = mutableListOf(
            Entry(0.4f, 0f),
            Entry(0.95f, 0f),
            Entry(1.5f, 0f),
            Entry(2.1f, 0f),
            Entry(2.55f, 0f),
            Entry(3f, 0f),
            Entry(3.5f, 0f),
            Entry(4f, 0f),
            Entry(4.5f, 0f),
            Entry(5.1f, 0f),
            Entry(5.6f, 0f),
            Entry(6.1f, 0f),
            Entry(6.6f, 0f),
            Entry(7.1f, 0f),
            Entry(7.6f, 0f),
            Entry(8.2f, 0f),
            Entry(9.0f, 0f),
            Entry(9.8f, 0f),
            Entry(10.4f, 0f),
            Entry(11.15f, 0f),
            Entry(11.9f, 0f),
            Entry(12.4f, 0f),
            Entry(13.1f, 0f),
            Entry(13.8f, 0f)
        )

        var zondChart5 = mutableListOf(
            Entry(0.2f, 0f),
            Entry(1.1f, 0f),
            Entry(2.0f, 0f),
            Entry(2.6f, 0f),
            Entry(3.5f, 0f),
            Entry(4.4f, 0f),
            Entry(5f, 0f),
            Entry(5.8f, 0f),
            Entry(6.6f, 0f),
            Entry(7.4f, 0f),
            Entry(7.8f, 0f),
            Entry(8.2f, 0f),
            Entry(8.8f, 0f),
            Entry(9.25f, 0f),
            Entry(9.7f, 0f),
            Entry(10.25f, 0f),
            Entry(10.8f, 0f),
            Entry(11.2f, 0f),
            Entry(11.7f, 0f),
            Entry(12f, 0f),
            Entry(12.3f, 0f),
            Entry(13.0f, 0f),
            Entry(13.35f, 0f),
            Entry(13.7f, 0f)
        )

        var desnChart5 = mutableListOf(
            Entry(0.2f, 0f),
            Entry(1.1f, 0f),
            Entry(2.0f, 0f),
            Entry(2.6f, 0f),
            Entry(3.5f, 0f),
            Entry(4.4f, 0f),
            Entry(5f, 0f),
            Entry(5.8f, 0f),
            Entry(6.6f, 0f),
            Entry(7.4f, 0f),
            Entry(7.8f, 0f),
            Entry(8.2f, 0f),
            Entry(8.8f, 0f),
            Entry(9.25f, 0f),
            Entry(9.7f, 0f),
            Entry(10.25f, 0f),
            Entry(10.8f, 0f),
            Entry(11.2f, 0f),
            Entry(11.7f, 0f),
            Entry(12f, 0f),
            Entry(12.3f, 0f),
            Entry(13.0f, 0f),
            Entry(13.35f, 0f),
            Entry(13.7f, 0f)
        )

        var zondChart6 = mutableListOf(
            Entry(0.4f, 0f),
            Entry(0.7f, 0f),
            Entry(1.0f, 0f),
            Entry(1.6f, 0f),
            Entry(2.0f, 0f),
            Entry(2.4f, 0f),
            Entry(2.9f, 0f),
            Entry(3.3f, 0f),
            Entry(3.7f, 0f),
            Entry(4.3f, 0f),
            Entry(4.75f, 0f),
            Entry(5.2f, 0f),
            Entry(5.8f, 0f),
            Entry(6.2f, 0f),
            Entry(6.6f, 0f),
            Entry(7.4f, 0f),
            Entry(8.25f, 0f),
            Entry(9.1f, 0f),
            Entry(9.6f, 0f),
            Entry(10.55f, 0f),
            Entry(11.5f, 0f),
            Entry(12.0f, 0f),
            Entry(12.9f, 0f),
            Entry(13.8f, 0f)
        )

        var desnChart6 = mutableListOf(
            Entry(0.4f, 0f),
            Entry(0.7f, 0f),
            Entry(1.0f, 0f),
            Entry(1.6f, 0f),
            Entry(2.0f, 0f),
            Entry(2.4f, 0f),
            Entry(2.9f, 0f),
            Entry(3.3f, 0f),
            Entry(3.7f, 0f),
            Entry(4.3f, 0f),
            Entry(4.75f, 0f),
            Entry(5.2f, 0f),
            Entry(5.8f, 0f),
            Entry(6.2f, 0f),
            Entry(6.6f, 0f),
            Entry(7.4f, 0f),
            Entry(8.25f, 0f),
            Entry(9.1f, 0f),
            Entry(9.6f, 0f),
            Entry(10.55f, 0f),
            Entry(11.5f, 0f),
            Entry(12.0f, 0f),
            Entry(12.9f, 0f),
            Entry(13.8f, 0f)
        )

        var zondChart7 = mutableListOf(
            Entry(0.3f, 0f),
            Entry(1.1f, 0f),
            Entry(1.9f, 0f),
            Entry(2.6f, 0f),
            Entry(3.5f, 0f),
            Entry(4.4f, 0f),
            Entry(5f, 0f),
            Entry(5.8f, 0f),
            Entry(6.6f, 0f),
            Entry(7.5f, 0f),
            Entry(7.8f, 0f),
            Entry(8.1f, 0f),
            Entry(9f, 0f),
            Entry(9.35f, 0f),
            Entry(9.7f, 0f),
            Entry(10.4f, 0f),
            Entry(10.8f, 0f),
            Entry(11.2f, 0f),
            Entry(11.9f, 0f),
            Entry(12.2f, 0f),
            Entry(12.5f, 0f),
            Entry(13.1f, 0f),
            Entry(13.4f, 0f),
            Entry(13.7f, 0f)
        )

        var desnChart7 = mutableListOf(
            Entry(0.3f, 0f),
            Entry(1.1f, 0f),
            Entry(1.9f, 0f),
            Entry(2.6f, 0f),
            Entry(3.5f, 0f),
            Entry(4.4f, 0f),
            Entry(5f, 0f),
            Entry(5.8f, 0f),
            Entry(6.6f, 0f),
            Entry(7.5f, 0f),
            Entry(7.8f, 0f),
            Entry(8.1f, 0f),
            Entry(9f, 0f),
            Entry(9.35f, 0f),
            Entry(9.7f, 0f),
            Entry(10.4f, 0f),
            Entry(10.8f, 0f),
            Entry(11.2f, 0f),
            Entry(11.9f, 0f),
            Entry(12.2f, 0f),
            Entry(12.5f, 0f),
            Entry(13.1f, 0f),
            Entry(13.4f, 0f),
            Entry(13.7f, 0f)
        )

        var zondChart8 = mutableListOf(
            Entry(0.4f, 0f),
            Entry(0.7f, 0f),
            Entry(1.0f, 0f),
            Entry(1.6f, 0f),
            Entry(2.0f, 0f),
            Entry(2.4f, 0f),
            Entry(2.9f, 0f),
            Entry(3.3f, 0f),
            Entry(3.7f, 0f),
            Entry(4.3f, 0f),
            Entry(4.75f, 0f),
            Entry(5.2f, 0f),
            Entry(6.0f, 0f),
            Entry(6.3f, 0f),
            Entry(6.6f, 0f),
            Entry(7.4f, 0f),
            Entry(8.25f, 0f),
            Entry(9.1f, 0f),
            Entry(9.8f, 0f),
            Entry(10.65f, 0f),
            Entry(11.5f, 0f),
            Entry(12.3f, 0f),
            Entry(13.05f, 0f),
            Entry(13.8f, 0f)
        )

        var desnChart8 = mutableListOf(
            Entry(0.4f, 0f),
            Entry(0.7f, 0f),
            Entry(1.0f, 0f),
            Entry(1.6f, 0f),
            Entry(2.0f, 0f),
            Entry(2.4f, 0f),
            Entry(2.9f, 0f),
            Entry(3.3f, 0f),
            Entry(3.7f, 0f),
            Entry(4.3f, 0f),
            Entry(4.75f, 0f),
            Entry(5.2f, 0f),
            Entry(6.0f, 0f),
            Entry(6.3f, 0f),
            Entry(6.6f, 0f),
            Entry(7.4f, 0f),
            Entry(8.25f, 0f),
            Entry(9.1f, 0f),
            Entry(9.8f, 0f),
            Entry(10.65f, 0f),
            Entry(11.5f, 0f),
            Entry(12.3f, 0f),
            Entry(13.05f, 0f),
            Entry(13.8f, 0f)
        )

        val tsDrawable1 = intArrayOf(R.drawable.t18, R.drawable.t17,R.drawable.t16,R.drawable.t15,R.drawable.t14,R.drawable.t13,R.drawable.t12,R.drawable.t11)
        val tsDrawable2 = intArrayOf(R.drawable.t28,R.drawable.t27,R.drawable.t26,R.drawable.t25, R.drawable.t24,R.drawable.t23,R.drawable.t22,R.drawable.t21)
        val tsDrawable3 = intArrayOf(R.drawable.t38,R.drawable.t37,R.drawable.t36,R.drawable.t35,R.drawable.t34,R.drawable.t33,R.drawable.t32,R.drawable.t31)
        val tsDrawable4 = intArrayOf(R.drawable.t48,R.drawable.t47,R.drawable.t46,R.drawable.t45,R.drawable.t44,R.drawable.t43,R.drawable.t42,R.drawable.t41)

        val t2sDrawable1 = intArrayOf(R.drawable.t182, R.drawable.t172,R.drawable.t162,R.drawable.t152,R.drawable.t142,R.drawable.t132,R.drawable.t122,R.drawable.t112)
        val t2sDrawable2 = intArrayOf(R.drawable.t282,R.drawable.t272,R.drawable.t262,R.drawable.t252, R.drawable.t242,R.drawable.t232,R.drawable.t222,R.drawable.t212)
        val t2sDrawable3 = intArrayOf(R.drawable.t382,R.drawable.t372,R.drawable.t362,R.drawable.t352,R.drawable.t342,R.drawable.t332,R.drawable.t322,R.drawable.t312)
        val t2sDrawable4 = intArrayOf(R.drawable.t482,R.drawable.t472, R.drawable.t462,R.drawable.t452,R.drawable.t442,R.drawable.t432,R.drawable.t422,R.drawable.t412)

        val tsId1 = intArrayOf(R.id.t18, R.id.t17,R.id.t16,R.id.t15,R.id.t14,R.id.t13,R.id.t12,R.id.t11)
        val tsId2 = intArrayOf(R.id.t28,R.id.t27,R.id.t26,R.id.t25,R.id.t24,R.id.t23,R.id.t22,R.id.t21)
        val tsId3 = intArrayOf(R.id.t38,R.id.t37,R.id.t36,R.id.t35,R.id.t34,R.id.t33,R.id.t32,R.id.t31)
        val tsId4 = intArrayOf(R.id.t48,R.id.t47, R.id.t46,R.id.t45,R.id.t44,R.id.t43,R.id.t42,R.id.t41)

        val t2sId1 = intArrayOf(R.id.t182, R.id.t172,R.id.t162,R.id.t152,R.id.t142,R.id.t132,R.id.t122,R.id.t112)
        val t2sId2 = intArrayOf(R.id.t282,R.id.t272,R.id.t262,R.id.t252, R.id.t242,R.id.t232,R.id.t222,R.id.t212)
        val t2sId3 = intArrayOf(R.id.t382,R.id.t372,R.id.t362,R.id.t352,R.id.t342,R.id.t332,R.id.t322,R.id.t312)
        val t2sId4 = intArrayOf(R.id.t482,R.id.t472, R.id.t462,R.id.t452,R.id.t442,R.id.t432,R.id.t422,R.id.t412)

        val furksId1 = intArrayOf(R.id.furk18, R.id.furk17,R.id.furk16)
        val furks2Id1 = intArrayOf(R.id.furk182_1,R.id.furk182_2, R.id.furk172_1,R.id.furk172_2,R.id.furk162_1,R.id.furk162_2,R.id.furk142_1,R.id.furk142_2)
        val furksId2 = intArrayOf(R.id.furk28, R.id.furk27,R.id.furk26)
        val furks2Id2 = intArrayOf(R.id.furk282_1,R.id.furk282_2, R.id.furk272_1,R.id.furk272_2,R.id.furk262_1,R.id.furk262_2,R.id.furk242_1,R.id.furk242_2)
        val furksId3  = intArrayOf(R.id.furk38,R.id.furk37,R.id.furk36)
        val furks2Id3  = intArrayOf(R.id.furk382,R.id.furk372,R.id.furk362)
        val furksId4  = intArrayOf(R.id.furk48,R.id.furk47, R.id.furk46)
        val furks2Id4  = intArrayOf(R.id.furk482,R.id.furk472, R.id.furk462)

        val furksImgId1 = intArrayOf(R.id.fi18, R.id.fi17,R.id.fi16)
        val furks2ImgId1 = intArrayOf(R.id.fi182_1,R.id.fi182_2, R.id.fi172_1,R.id.fi172_2,R.id.fi162_1,R.id.fi162_2,R.id.fi142_1,R.id.fi142_2)
        val furksImgId2 = intArrayOf(R.id.fi28,R.id.fi27,R.id.fi26)
        val furks2ImgId2 = intArrayOf(R.id.fi282_1,R.id.fi282_2, R.id.fi272_1,R.id.fi272_2,R.id.fi262_1,R.id.fi262_2,R.id.fi242_1,R.id.fi242_2)
        val furksImgId3 = intArrayOf( R.id.fi38,R.id.fi37,R.id.fi36)
        val furks2ImgId3 = intArrayOf( R.id.fi382,R.id.fi372,R.id.fi362)
        val furksImgId4 = intArrayOf(R.id.fi48,R.id.fi47, R.id.fi46)
        val furks2ImgId4 = intArrayOf(R.id.fi482,R.id.fi472, R.id.fi462)

        val implantsId1 = intArrayOf(R.id.implant18, R.id.implant17,R.id.implant16,R.id.implant15,R.id.implant14,R.id.implant13,R.id.implant12,R.id.implant11)
        val implantsId2 = intArrayOf(R.id.implant28,R.id.implant27,R.id.implant26,R.id.implant25, R.id.implant24,R.id.implant23,R.id.implant22,R.id.implant21)
        val implantsId3 = intArrayOf(R.id.implant38,R.id.implant37,R.id.implant36,R.id.implant35,R.id.implant34,R.id.implant33,R.id.implant32,R.id.implant31)
        val implantsId4 = intArrayOf(R.id.implant48,R.id.implant47, R.id.implant46,R.id.implant45,R.id.implant44,R.id.implant43,R.id.implant42,R.id.implant41)

        val podvsId1 = intArrayOf(R.id.podv18, R.id.podv17,R.id.podv16,R.id.podv15,R.id.podv14,R.id.podv13,R.id.podv12,R.id.podv11)
        val podvsId2 = intArrayOf(R.id.podv28,R.id.podv27,R.id.podv26,R.id.podv25, R.id.podv24,R.id.podv23,R.id.podv22,R.id.podv21)
        val podvsId3 = intArrayOf(R.id.podv38,R.id.podv37,R.id.podv36,R.id.podv35,R.id.podv34,R.id.podv33,R.id.podv32,R.id.podv31)
        val podvsId4 = intArrayOf(R.id.podv48,R.id.podv47, R.id.podv46,R.id.podv45,R.id.podv44,R.id.podv43,R.id.podv42,R.id.podv41)

        val tsId = intArrayOf(R.id.t18, R.id.t17,R.id.t16,R.id.t15,R.id.t14,R.id.t13,R.id.t12,R.id.t11,R.id.t28,R.id.t27,R.id.t26,R.id.t25,
            R.id.t24,R.id.t23,R.id.t22,R.id.t21,R.id.t38,R.id.t37,R.id.t36,R.id.t35,R.id.t34,R.id.t33,R.id.t32,R.id.t31,R.id.t48,R.id.t47,
            R.id.t46,R.id.t45,R.id.t44,R.id.t43,R.id.t42,R.id.t41)

        val t2sId = intArrayOf(R.id.t182, R.id.t172,R.id.t162,R.id.t152,R.id.t142,R.id.t132,R.id.t122,R.id.t112,R.id.t282,R.id.t272,R.id.t262,R.id.t252,
            R.id.t242,R.id.t232,R.id.t222,R.id.t212,R.id.t382,R.id.t372,R.id.t362,R.id.t352,R.id.t342,R.id.t332,R.id.t322,R.id.t312,R.id.t482,R.id.t472,
            R.id.t462,R.id.t452,R.id.t442,R.id.t432,R.id.t422,R.id.t412)

        val plombsId = intArrayOf(R.id.plomb18, R.id.plomb17,R.id.plomb16,R.id.plomb15,R.id.plomb14,R.id.plomb13,R.id.plomb12,R.id.plomb11,R.id.plomb28,R.id.plomb27,R.id.plomb26,R.id.plomb25,
            R.id.plomb24,R.id.plomb23,R.id.plomb22,R.id.plomb21,R.id.plomb38,R.id.plomb37,R.id.plomb36,R.id.plomb35,R.id.plomb34,R.id.plomb33,R.id.plomb32,R.id.plomb31,R.id.plomb48,R.id.plomb47,
            R.id.plomb46,R.id.plomb45,R.id.plomb44,R.id.plomb43,R.id.plomb42,R.id.plomb41)

        val pupesId = intArrayOf(R.id.pupe18, R.id.pupe17,R.id.pupe16,R.id.pupe15,R.id.pupe14,R.id.pupe13,R.id.pupe12,R.id.pupe11,R.id.pupe28,R.id.pupe27,R.id.pupe26,R.id.pupe25,
            R.id.pupe24,R.id.pupe23,R.id.pupe22,R.id.pupe21,R.id.pupe38,R.id.pupe37,R.id.pupe36,R.id.pupe35,R.id.pupe34,R.id.pupe33,R.id.pupe32,R.id.pupe31,R.id.pupe48,R.id.pupe47,
            R.id.pupe46,R.id.pupe45,R.id.pupe44,R.id.pupe43,R.id.pupe42,R.id.pupe41)

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
            R.id.kar21_6, R.id.kar21_5, R.id.kar21_31, R.id.kar21_32, R.id.kar21_41, R.id.kar21_42,
            R.id.kar38_1, R.id.kar38_5, R.id.kar38_21, R.id.kar38_22, R.id.kar38_61, R.id.kar38_62,
            R.id.kar37_1, R.id.kar37_5, R.id.kar37_21, R.id.kar37_22, R.id.kar37_61, R.id.kar37_62,
            R.id.kar36_1, R.id.kar36_5, R.id.kar36_21, R.id.kar36_22, R.id.kar36_61, R.id.kar36_62,
            R.id.kar35_1, R.id.kar35_5, R.id.kar35_21, R.id.kar35_22, R.id.kar35_61, R.id.kar35_62,
            R.id.kar34_1, R.id.kar34_5, R.id.kar34_21, R.id.kar34_22, R.id.kar34_61, R.id.kar34_62,
            R.id.kar33_6, R.id.kar33_5, R.id.kar33_31, R.id.kar33_32, R.id.kar33_41, R.id.kar33_42,
            R.id.kar32_6, R.id.kar32_5, R.id.kar32_31, R.id.kar32_32, R.id.kar32_41, R.id.kar32_42,
            R.id.kar31_6, R.id.kar31_5, R.id.kar31_31, R.id.kar31_32, R.id.kar31_41, R.id.kar31_42,
            R.id.kar48_1, R.id.kar48_5, R.id.kar48_21, R.id.kar48_22, R.id.kar48_61, R.id.kar48_62,
            R.id.kar47_1, R.id.kar47_5, R.id.kar47_21, R.id.kar47_22, R.id.kar47_61, R.id.kar47_62,
            R.id.kar46_1, R.id.kar46_5, R.id.kar46_21, R.id.kar46_22, R.id.kar46_61, R.id.kar46_62,
            R.id.kar45_1, R.id.kar45_5, R.id.kar45_21, R.id.kar45_22, R.id.kar45_61, R.id.kar45_62,
            R.id.kar44_1, R.id.kar44_5, R.id.kar44_21, R.id.kar44_22, R.id.kar44_61, R.id.kar44_62,
            R.id.kar43_6, R.id.kar43_5, R.id.kar43_31, R.id.kar43_32, R.id.kar43_41, R.id.kar43_42,
            R.id.kar42_6, R.id.kar42_5, R.id.kar42_31, R.id.kar42_32, R.id.kar42_41, R.id.kar42_42,
            R.id.kar41_6, R.id.kar41_5, R.id.kar41_31, R.id.kar41_32, R.id.kar41_41, R.id.kar41_42,
            R.id.kar182_1, R.id.kar182_5, R.id.kar182_21, R.id.kar182_22, R.id.kar182_61, R.id.kar182_62,
            R.id.kar172_1, R.id.kar172_5, R.id.kar172_21, R.id.kar172_22, R.id.kar172_61, R.id.kar172_62,
            R.id.kar162_1, R.id.kar162_5, R.id.kar162_21, R.id.kar162_22, R.id.kar162_61, R.id.kar162_62,
            R.id.kar152_1, R.id.kar152_5, R.id.kar152_21, R.id.kar152_22, R.id.kar152_61, R.id.kar152_62,
            R.id.kar142_1, R.id.kar142_5, R.id.kar142_21, R.id.kar142_22, R.id.kar142_61, R.id.kar142_62,
            R.id.kar132_6, R.id.kar132_5, R.id.kar132_31, R.id.kar132_32, R.id.kar132_41, R.id.kar132_42,
            R.id.kar122_6, R.id.kar122_5, R.id.kar122_31, R.id.kar122_32, R.id.kar122_41, R.id.kar122_42,
            R.id.kar112_6, R.id.kar112_5, R.id.kar112_31, R.id.kar112_32, R.id.kar112_41, R.id.kar112_42,
            R.id.kar282_1, R.id.kar282_5, R.id.kar282_21, R.id.kar282_22, R.id.kar282_61, R.id.kar282_62,
            R.id.kar272_1, R.id.kar272_5, R.id.kar272_21, R.id.kar272_22, R.id.kar272_61, R.id.kar272_62,
            R.id.kar262_1, R.id.kar262_5, R.id.kar262_21, R.id.kar262_22, R.id.kar262_61, R.id.kar262_62,
            R.id.kar252_1, R.id.kar252_5, R.id.kar252_21, R.id.kar252_22, R.id.kar252_61, R.id.kar252_62,
            R.id.kar242_1, R.id.kar242_5, R.id.kar242_21, R.id.kar242_22, R.id.kar242_61, R.id.kar242_62,
            R.id.kar232_6, R.id.kar232_5, R.id.kar232_31, R.id.kar232_32, R.id.kar232_41, R.id.kar232_42,
            R.id.kar222_6, R.id.kar222_5, R.id.kar222_31, R.id.kar222_32, R.id.kar222_41, R.id.kar222_42,
            R.id.kar212_6, R.id.kar212_5, R.id.kar212_31, R.id.kar212_32, R.id.kar212_41, R.id.kar212_42,
            R.id.kar382_1, R.id.kar382_5, R.id.kar382_21, R.id.kar382_22, R.id.kar382_61, R.id.kar382_62,
            R.id.kar372_1, R.id.kar372_5, R.id.kar372_21, R.id.kar372_22, R.id.kar372_61, R.id.kar372_62,
            R.id.kar362_1, R.id.kar362_5, R.id.kar362_21, R.id.kar362_22, R.id.kar362_61, R.id.kar362_62,
            R.id.kar352_1, R.id.kar352_5, R.id.kar352_21, R.id.kar352_22, R.id.kar352_61, R.id.kar352_62,
            R.id.kar342_1, R.id.kar342_5, R.id.kar342_21, R.id.kar342_22, R.id.kar342_61, R.id.kar342_62,
            R.id.kar332_6, R.id.kar332_5, R.id.kar332_31, R.id.kar332_32, R.id.kar332_41, R.id.kar332_42,
            R.id.kar322_6, R.id.kar322_5, R.id.kar322_31, R.id.kar322_32, R.id.kar322_41, R.id.kar322_42,
            R.id.kar312_6, R.id.kar312_5, R.id.kar312_31, R.id.kar312_32, R.id.kar312_41, R.id.kar312_42,
            R.id.kar482_1, R.id.kar482_5, R.id.kar482_21, R.id.kar482_22, R.id.kar482_61, R.id.kar482_62,
            R.id.kar472_1, R.id.kar472_5, R.id.kar472_21, R.id.kar472_22, R.id.kar472_61, R.id.kar472_62,
            R.id.kar462_1, R.id.kar462_5, R.id.kar462_21, R.id.kar462_22, R.id.kar462_61, R.id.kar462_62,
            R.id.kar452_1, R.id.kar452_5, R.id.kar452_21, R.id.kar452_22, R.id.kar452_61, R.id.kar452_62,
            R.id.kar442_1, R.id.kar442_5, R.id.kar442_21, R.id.kar442_22, R.id.kar442_61, R.id.kar442_62,
            R.id.kar432_6, R.id.kar432_5, R.id.kar432_31, R.id.kar432_32, R.id.kar432_41, R.id.kar432_42,
            R.id.kar422_6, R.id.kar422_5, R.id.kar422_31, R.id.kar422_32, R.id.kar422_41, R.id.kar422_42,
            R.id.kar412_6, R.id.kar412_5, R.id.kar412_31, R.id.kar412_32, R.id.kar412_41, R.id.kar412_42
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
            R.id.t21k6, R.id.t21k5, R.id.t21k31, R.id.t21k32, R.id.t21k41, R.id.t21k42,
            R.id.t38k1, R.id.t38k5, R.id.t38k21, R.id.t38k22, R.id.t38k61, R.id.t38k62,
            R.id.t37k1, R.id.t37k5, R.id.t37k21, R.id.t37k22, R.id.t37k61, R.id.t37k62,
            R.id.t36k1, R.id.t36k5, R.id.t36k21, R.id.t36k22, R.id.t36k61, R.id.t36k62,
            R.id.t35k1, R.id.t35k5, R.id.t35k21, R.id.t35k22, R.id.t35k61, R.id.t35k62,
            R.id.t34k1, R.id.t34k5, R.id.t34k21, R.id.t34k22, R.id.t34k61, R.id.t34k62,
            R.id.t33k6, R.id.t33k5, R.id.t33k31, R.id.t33k32, R.id.t33k41, R.id.t33k42,
            R.id.t32k6, R.id.t32k5, R.id.t32k31, R.id.t32k32, R.id.t32k41, R.id.t32k42,
            R.id.t31k6, R.id.t31k5, R.id.t31k31, R.id.t31k32, R.id.t31k41, R.id.t31k42,
            R.id.t48k1, R.id.t48k5, R.id.t48k21, R.id.t48k22, R.id.t48k61, R.id.t48k62,
            R.id.t47k1, R.id.t47k5, R.id.t47k21, R.id.t47k22, R.id.t47k61, R.id.t47k62,
            R.id.t46k1, R.id.t46k5, R.id.t46k21, R.id.t46k22, R.id.t46k61, R.id.t46k62,
            R.id.t45k1, R.id.t45k5, R.id.t45k21, R.id.t45k22, R.id.t45k61, R.id.t45k62,
            R.id.t44k1, R.id.t44k5, R.id.t44k21, R.id.t44k22, R.id.t44k61, R.id.t44k62,
            R.id.t43k6, R.id.t43k5, R.id.t43k31, R.id.t43k32, R.id.t43k41, R.id.t43k42,
            R.id.t42k6, R.id.t42k5, R.id.t42k31, R.id.t42k32, R.id.t42k41, R.id.t42k42,
            R.id.t41k6, R.id.t41k5, R.id.t41k31, R.id.t41k32, R.id.t41k41, R.id.t41k42,
            R.id.t182k1, R.id.t182k5, R.id.t182k21, R.id.t182k22, R.id.t182k61, R.id.t182k62,
            R.id.t172k1, R.id.t172k5, R.id.t172k21, R.id.t172k22, R.id.t172k61, R.id.t172k62,
            R.id.t162k1, R.id.t162k5, R.id.t162k21, R.id.t162k22, R.id.t162k61, R.id.t162k62,
            R.id.t152k1, R.id.t152k5, R.id.t152k21, R.id.t152k22, R.id.t152k61, R.id.t152k62,
            R.id.t142k1, R.id.t142k5, R.id.t142k21, R.id.t142k22, R.id.t142k61, R.id.t142k62,
            R.id.t132k6, R.id.t132k5, R.id.t132k31, R.id.t132k32, R.id.t132k41, R.id.t132k42,
            R.id.t122k6, R.id.t122k5, R.id.t122k31, R.id.t122k32, R.id.t122k41, R.id.t122k42,
            R.id.t112k6, R.id.t112k5, R.id.t112k31, R.id.t112k32, R.id.t112k41, R.id.t112k42,
            R.id.t282k1, R.id.t282k5, R.id.t282k21, R.id.t282k22, R.id.t282k61, R.id.t282k62,
            R.id.t272k1, R.id.t272k5, R.id.t272k21, R.id.t272k22, R.id.t272k61, R.id.t272k62,
            R.id.t262k1, R.id.t262k5, R.id.t262k21, R.id.t262k22, R.id.t262k61, R.id.t262k62,
            R.id.t252k1, R.id.t252k5, R.id.t252k21, R.id.t252k22, R.id.t252k61, R.id.t252k62,
            R.id.t242k1, R.id.t242k5, R.id.t242k21, R.id.t242k22, R.id.t242k61, R.id.t242k62,
            R.id.t232k6, R.id.t232k5, R.id.t232k31, R.id.t232k32, R.id.t232k41, R.id.t232k42,
            R.id.t222k6, R.id.t222k5, R.id.t222k31, R.id.t222k32, R.id.t222k41, R.id.t222k42,
            R.id.t212k6, R.id.t212k5, R.id.t212k31, R.id.t212k32, R.id.t212k41, R.id.t212k42,
            R.id.t382k1, R.id.t382k5, R.id.t382k21, R.id.t382k22, R.id.t382k61, R.id.t382k62,
            R.id.t372k1, R.id.t372k5, R.id.t372k21, R.id.t372k22, R.id.t372k61, R.id.t372k62,
            R.id.t362k1, R.id.t362k5, R.id.t362k21, R.id.t362k22, R.id.t362k61, R.id.t362k62,
            R.id.t352k1, R.id.t352k5, R.id.t352k21, R.id.t352k22, R.id.t352k61, R.id.t352k62,
            R.id.t342k1, R.id.t342k5, R.id.t342k21, R.id.t342k22, R.id.t342k61, R.id.t342k62,
            R.id.t332k6, R.id.t332k5, R.id.t332k31, R.id.t332k32, R.id.t332k41, R.id.t332k42,
            R.id.t322k6, R.id.t322k5, R.id.t322k31, R.id.t322k32, R.id.t322k41, R.id.t322k42,
            R.id.t312k6, R.id.t312k5, R.id.t312k31, R.id.t312k32, R.id.t312k41, R.id.t312k42,
            R.id.t482k1, R.id.t482k5, R.id.t482k21, R.id.t482k22, R.id.t482k61, R.id.t482k62,
            R.id.t472k1, R.id.t472k5, R.id.t472k21, R.id.t472k22, R.id.t472k61, R.id.t472k62,
            R.id.t462k1, R.id.t462k5, R.id.t462k21, R.id.t462k22, R.id.t462k61, R.id.t462k62,
            R.id.t452k1, R.id.t452k5, R.id.t452k21, R.id.t452k22, R.id.t452k61, R.id.t452k62,
            R.id.t442k1, R.id.t442k5, R.id.t442k21, R.id.t442k22, R.id.t442k61, R.id.t442k62,
            R.id.t432k6, R.id.t432k5, R.id.t432k31, R.id.t432k32, R.id.t432k41, R.id.t432k42,
            R.id.t422k6, R.id.t422k5, R.id.t422k31, R.id.t422k32, R.id.t422k41, R.id.t422k42,
            R.id.t412k6, R.id.t412k5, R.id.t412k31, R.id.t412k32, R.id.t412k41, R.id.t412k42
        )

        val furksId = intArrayOf(R.id.furk18, R.id.furk17,R.id.furk16,R.id.furk28,R.id.furk27,R.id.furk26,
            R.id.furk182_1,R.id.furk182_2, R.id.furk172_1,R.id.furk172_2,R.id.furk162_1,R.id.furk162_2,R.id.furk142_1,R.id.furk142_2,
            R.id.furk282_1,R.id.furk282_2, R.id.furk272_1,R.id.furk272_2,R.id.furk262_1,R.id.furk262_2,R.id.furk242_1,R.id.furk242_2,R.id.furk38,R.id.furk37,R.id.furk36,R.id.furk48,R.id.furk47, R.id.furk46,
            R.id.furk382,R.id.furk372,R.id.furk362,R.id.furk482,R.id.furk472,R.id.furk462)

        val furksImgId = intArrayOf(R.id.fi18, R.id.fi17,R.id.fi16,R.id.fi28,R.id.fi27,R.id.fi26,
            R.id.fi182_1,R.id.fi182_2, R.id.fi172_1,R.id.fi172_2,R.id.fi162_1,R.id.fi162_2,R.id.fi142_1,R.id.fi142_2,
            R.id.fi282_1,R.id.fi282_2, R.id.fi272_1,R.id.fi272_2,R.id.fi262_1,R.id.fi262_2,R.id.fi242_1,R.id.fi242_2
            ,R.id.fi38,R.id.fi37,R.id.fi36,R.id.fi48,R.id.fi47, R.id.fi46,R.id.fi382,R.id.fi372,R.id.fi362,R.id.fi482,R.id.fi472,R.id.fi462)

        val desnId1 = intArrayOf(R.id.desn18_1,R.id.desn18_2,R.id.desn18_3,R.id.desn17_1,R.id.desn17_2,R.id.desn17_3,R.id.desn16_1,R.id.desn16_2,R.id.desn16_3,R.id.desn15_1,R.id.desn15_2,R.id.desn15_3,
            R.id.desn14_1,R.id.desn14_2,R.id.desn14_3,R.id.desn13_1,R.id.desn13_2,R.id.desn13_3,R.id.desn12_1,R.id.desn12_2,R.id.desn12_3,R.id.desn11_1,R.id.desn11_2,R.id.desn11_3)

        val desnId2 = intArrayOf(R.id.desn21_1,R.id.desn21_2,R.id.desn21_3,R.id.desn22_1,R.id.desn22_2,R.id.desn22_3, R.id.desn23_1,R.id.desn23_2,R.id.desn23_3,
            R.id.desn24_1,R.id.desn24_2,R.id.desn24_3,R.id.desn25_1,R.id.desn25_2,R.id.desn25_3,
            R.id.desn26_1,R.id.desn26_2,R.id.desn26_3,R.id.desn27_1,R.id.desn27_2,R.id.desn27_3, R.id.desn28_1,R.id.desn28_2,R.id.desn28_3)

        val desnId3 = intArrayOf(R.id.desn182_1,R.id.desn182_2,R.id.desn182_3,R.id.desn172_1,R.id.desn172_2,R.id.desn172_3,R.id.desn162_1,R.id.desn162_2,R.id.desn162_3,R.id.desn152_1,R.id.desn152_2,R.id.desn152_3,
            R.id.desn142_1,R.id.desn142_2,R.id.desn142_3,R.id.desn132_1,R.id.desn132_2,R.id.desn132_3,R.id.desn122_1,R.id.desn122_2,R.id.desn122_3,R.id.desn112_1,R.id.desn112_2,R.id.desn112_3)

        val desnId4 = intArrayOf(R.id.desn212_1,R.id.desn212_2, R.id.desn212_3,R.id.desn222_1,R.id.desn222_2,R.id.desn222_3,R.id.desn232_1,R.id.desn232_2,R.id.desn232_3,R.id.desn242_1,R.id.desn242_2,R.id.desn242_3,
            R.id.desn252_1,R.id.desn252_2,R.id.desn252_3,R.id.desn262_1, R.id.desn262_2,R.id.desn262_3,R.id.desn272_1,R.id.desn272_2,R.id.desn272_3,R.id.desn282_1,R.id.desn282_2,R.id.desn282_3)

        val desnId5 = intArrayOf(R.id.desn48_1,R.id.desn48_2,R.id.desn48_3,R.id.desn47_1,R.id.desn47_2,R.id.desn47_3,R.id.desn46_1,R.id.desn46_2,R.id.desn46_3,R.id.desn45_1,R.id.desn45_2,R.id.desn45_3,
            R.id.desn44_1,R.id.desn44_2,R.id.desn44_3,R.id.desn43_1,R.id.desn43_2,R.id.desn43_3,R.id.desn42_1,R.id.desn42_2,R.id.desn42_3,R.id.desn41_1,R.id.desn41_2,R.id.desn41_3)

        val desnId6 = intArrayOf(R.id.desn31_1,R.id.desn31_2,R.id.desn31_3,R.id.desn32_1,R.id.desn32_2,R.id.desn32_3,R.id.desn33_1,R.id.desn33_2,R.id.desn33_3,R.id.desn34_1,R.id.desn34_2,R.id.desn34_3,
            R.id.desn35_1,R.id.desn35_2,R.id.desn35_3,R.id.desn36_1,R.id.desn36_2,R.id.desn36_3,R.id.desn37_1,R.id.desn37_2,R.id.desn37_3,R.id.desn38_1,R.id.desn38_2,R.id.desn38_3)

        val desnId7 = intArrayOf(R.id.desn482_1,R.id.desn482_2,R.id.desn482_3,R.id.desn472_1,R.id.desn472_2,R.id.desn472_3,R.id.desn462_1,R.id.desn462_2,R.id.desn462_3,R.id.desn452_1,R.id.desn452_2,R.id.desn452_3,
            R.id.desn442_1,R.id.desn442_2,R.id.desn442_3,R.id.desn432_1,R.id.desn432_2,R.id.desn432_3,R.id.desn422_1,R.id.desn422_2,R.id.desn422_3,R.id.desn412_1,R.id.desn412_2,R.id.desn412_3)

        val desnId8 = intArrayOf(R.id.desn312_1,R.id.desn312_2,R.id.desn312_3,R.id.desn322_1,R.id.desn322_2,R.id.desn322_3,
            R.id.desn332_1,R.id.desn332_2,R.id.desn332_3,R.id.desn342_1,R.id.desn342_2,R.id.desn342_3,R.id.desn352_1,R.id.desn352_2,R.id.desn352_3,R.id.desn362_1,R.id.desn362_2,R.id.desn362_3,R.id.desn372_1,R.id.desn372_2,
            R.id.desn372_3,R.id.desn382_1,R.id.desn382_2,R.id.desn382_3)

        val zondId1 = intArrayOf(R.id.zond18_1,R.id.zond18_2,R.id.zond18_3,R.id.zond17_1,R.id.zond17_2,R.id.zond17_3,R.id.zond16_1,R.id.zond16_2,R.id.zond16_3,R.id.zond15_1,R.id.zond15_2,R.id.zond15_3,
            R.id.zond14_1,R.id.zond14_2,R.id.zond14_3,R.id.zond13_1,R.id.zond13_2,R.id.zond13_3,R.id.zond12_1,R.id.zond12_2,R.id.zond12_3,R.id.zond11_1,R.id.zond11_2,R.id.zond11_3)

        val zondId2 = intArrayOf(R.id.zond21_1,R.id.zond21_2,R.id.zond21_3,R.id.zond22_1,R.id.zond22_2,R.id.zond22_3, R.id.zond23_1,R.id.zond23_2,R.id.zond23_3,
            R.id.zond24_1,R.id.zond24_2,R.id.zond24_3,R.id.zond25_1,R.id.zond25_2,R.id.zond25_3,
            R.id.zond26_1,R.id.zond26_2,R.id.zond26_3,R.id.zond27_1,R.id.zond27_2,R.id.zond27_3, R.id.zond28_1,R.id.zond28_2,R.id.zond28_3)

        val zondId3 = intArrayOf(R.id.zond182_1,R.id.zond182_2,R.id.zond182_3,R.id.zond172_1,R.id.zond172_2,R.id.zond172_3,R.id.zond162_1,R.id.zond162_2,R.id.zond162_3,R.id.zond152_1,R.id.zond152_2,R.id.zond152_3,
            R.id.zond142_1,R.id.zond142_2,R.id.zond142_3,R.id.zond132_1,R.id.zond132_2,R.id.zond132_3,R.id.zond122_1,R.id.zond122_2,R.id.zond122_3,R.id.zond112_1,R.id.zond112_2,R.id.zond112_3)

        val zondId4 = intArrayOf(R.id.zond212_1,R.id.zond212_2, R.id.zond212_3,R.id.zond222_1,R.id.zond222_2,R.id.zond222_3,R.id.zond232_1,R.id.zond232_2,R.id.zond232_3,R.id.zond242_1,R.id.zond242_2,R.id.zond242_3,
            R.id.zond252_1,R.id.zond252_2,R.id.zond252_3,R.id.zond262_1, R.id.zond262_2,R.id.zond262_3,R.id.zond272_1,R.id.zond272_2,R.id.zond272_3,R.id.zond282_1,R.id.zond282_2,R.id.zond282_3)

        val zondId5 = intArrayOf(R.id.zond48_1,R.id.zond48_2,R.id.zond48_3,R.id.zond47_1,R.id.zond47_2,R.id.zond47_3,R.id.zond46_1,R.id.zond46_2,R.id.zond46_3,R.id.zond45_1,R.id.zond45_2,R.id.zond45_3,
            R.id.zond44_1,R.id.zond44_2,R.id.zond44_3,R.id.zond43_1,R.id.zond43_2,R.id.zond43_3,R.id.zond42_1,R.id.zond42_2,R.id.zond42_3,R.id.zond41_1,R.id.zond41_2,R.id.zond41_3)

        val zondId6 = intArrayOf(R.id.zond31_1,R.id.zond31_2,R.id.zond31_3,R.id.zond32_1,R.id.zond32_2,R.id.zond32_3,R.id.zond33_1,R.id.zond33_2,R.id.zond33_3,R.id.zond34_1,R.id.zond34_2,R.id.zond34_3,
            R.id.zond35_1,R.id.zond35_2,R.id.zond35_3,R.id.zond36_1,R.id.zond36_2,R.id.zond36_3,R.id.zond37_1,R.id.zond37_2,R.id.zond37_3,R.id.zond38_1,R.id.zond38_2,R.id.zond38_3)

        val zondId7 = intArrayOf(R.id.zond482_1,R.id.zond482_2,R.id.zond482_3,R.id.zond472_1,R.id.zond472_2,R.id.zond472_3,R.id.zond462_1,R.id.zond462_2,R.id.zond462_3,R.id.zond452_1,R.id.zond452_2,R.id.zond452_3,
            R.id.zond442_1,R.id.zond442_2,R.id.zond442_3,R.id.zond432_1,R.id.zond432_2,R.id.zond432_3,R.id.zond422_1,R.id.zond422_2,R.id.zond422_3,R.id.zond412_1,R.id.zond412_2,R.id.zond412_3)

        val zondId8 = intArrayOf(R.id.zond312_1,R.id.zond312_2,R.id.zond312_3,R.id.zond322_1,R.id.zond322_2,R.id.zond322_3,
            R.id.zond332_1,R.id.zond332_2,R.id.zond332_3,R.id.zond342_1,R.id.zond342_2,R.id.zond342_3,R.id.zond352_1,R.id.zond352_2,R.id.zond352_3,R.id.zond362_1,R.id.zond362_2,R.id.zond362_3,R.id.zond372_1,R.id.zond372_2,
            R.id.zond372_3,R.id.zond382_1,R.id.zond382_2,R.id.zond382_3)

        val plombsId1 = intArrayOf(R.id.plomb18, R.id.plomb17,R.id.plomb16,R.id.plomb15,R.id.plomb14,R.id.plomb13,R.id.plomb12,R.id.plomb11)
        val plombsId2 = intArrayOf(R.id.plomb28,R.id.plomb27,R.id.plomb26,R.id.plomb25,R.id.plomb24,R.id.plomb23,R.id.plomb22,R.id.plomb21)
        val plombsId3 = intArrayOf(R.id.plomb38,R.id.plomb37,R.id.plomb36,R.id.plomb35,R.id.plomb34,R.id.plomb33,R.id.plomb32,R.id.plomb31)
        val plombsId4 = intArrayOf(R.id.plomb48,R.id.plomb47, R.id.plomb46,R.id.plomb45,R.id.plomb44,R.id.plomb43,R.id.plomb42,R.id.plomb41)

        val karsId1 = intArrayOf(R.id.kar18_1, R.id.kar18_5, R.id.kar18_21, R.id.kar18_22, R.id.kar18_61, R.id.kar18_62,
            R.id.kar17_1, R.id.kar17_5, R.id.kar17_21, R.id.kar17_22, R.id.kar17_61, R.id.kar17_62,
            R.id.kar16_1, R.id.kar16_5, R.id.kar16_21, R.id.kar16_22, R.id.kar16_61, R.id.kar16_62,
            R.id.kar15_1, R.id.kar15_5, R.id.kar15_21, R.id.kar15_22, R.id.kar15_61, R.id.kar15_62,
            R.id.kar14_1, R.id.kar14_5, R.id.kar14_21, R.id.kar14_22, R.id.kar14_61, R.id.kar14_62,
            R.id.kar13_6, R.id.kar13_5, R.id.kar13_31, R.id.kar13_32, R.id.kar13_41, R.id.kar13_42,
            R.id.kar12_6, R.id.kar12_5, R.id.kar12_31, R.id.kar12_32, R.id.kar12_41, R.id.kar12_42,
            R.id.kar11_6, R.id.kar11_5, R.id.kar11_31, R.id.kar11_32, R.id.kar11_41, R.id.kar11_42)
        val karsId2 = intArrayOf(  R.id.kar28_1, R.id.kar28_5, R.id.kar28_21, R.id.kar28_22, R.id.kar28_61, R.id.kar28_62,
            R.id.kar27_1, R.id.kar27_5, R.id.kar27_21, R.id.kar27_22, R.id.kar27_61, R.id.kar27_62,
            R.id.kar26_1, R.id.kar26_5, R.id.kar26_21, R.id.kar26_22, R.id.kar26_61, R.id.kar26_62,
            R.id.kar25_1, R.id.kar25_5, R.id.kar25_21, R.id.kar25_22, R.id.kar25_61, R.id.kar25_62,
            R.id.kar24_1, R.id.kar24_5, R.id.kar24_21, R.id.kar24_22, R.id.kar24_61, R.id.kar24_62,
            R.id.kar23_6, R.id.kar23_5, R.id.kar23_31, R.id.kar23_32, R.id.kar23_41, R.id.kar23_42,
            R.id.kar22_6, R.id.kar22_5, R.id.kar22_31, R.id.kar22_32, R.id.kar22_41, R.id.kar22_42,
            R.id.kar21_6, R.id.kar21_5, R.id.kar21_31, R.id.kar21_32, R.id.kar21_41, R.id.kar21_42)
        val karsId3 = intArrayOf(R.id.kar38_1, R.id.kar38_5, R.id.kar38_21, R.id.kar38_22, R.id.kar38_61, R.id.kar38_62,
            R.id.kar37_1, R.id.kar37_5, R.id.kar37_21, R.id.kar37_22, R.id.kar37_61, R.id.kar37_62,
            R.id.kar36_1, R.id.kar36_5, R.id.kar36_21, R.id.kar36_22, R.id.kar36_61, R.id.kar36_62,
            R.id.kar35_1, R.id.kar35_5, R.id.kar35_21, R.id.kar35_22, R.id.kar35_61, R.id.kar35_62,
            R.id.kar34_1, R.id.kar34_5, R.id.kar34_21, R.id.kar34_22, R.id.kar34_61, R.id.kar34_62,
            R.id.kar33_6, R.id.kar33_5, R.id.kar33_31, R.id.kar33_32, R.id.kar33_41, R.id.kar33_42,
            R.id.kar32_6, R.id.kar32_5, R.id.kar32_31, R.id.kar32_32, R.id.kar32_41, R.id.kar32_42,
            R.id.kar31_6, R.id.kar31_5, R.id.kar31_31, R.id.kar31_32, R.id.kar31_41, R.id.kar31_42)
        val karsId4 = intArrayOf( R.id.kar48_1, R.id.kar48_5, R.id.kar48_21, R.id.kar48_22, R.id.kar48_61, R.id.kar48_62,
            R.id.kar47_1, R.id.kar47_5, R.id.kar47_21, R.id.kar47_22, R.id.kar47_61, R.id.kar47_62,
            R.id.kar46_1, R.id.kar46_5, R.id.kar46_21, R.id.kar46_22, R.id.kar46_61, R.id.kar46_62,
            R.id.kar45_1, R.id.kar45_5, R.id.kar45_21, R.id.kar45_22, R.id.kar45_61, R.id.kar45_62,
            R.id.kar44_1, R.id.kar44_5, R.id.kar44_21, R.id.kar44_22, R.id.kar44_61, R.id.kar44_62,
            R.id.kar43_6, R.id.kar43_5, R.id.kar43_31, R.id.kar43_32, R.id.kar43_41, R.id.kar43_42,
            R.id.kar42_6, R.id.kar42_5, R.id.kar42_31, R.id.kar42_32, R.id.kar42_41, R.id.kar42_42,
            R.id.kar41_6, R.id.kar41_5, R.id.kar41_31, R.id.kar41_32, R.id.kar41_41, R.id.kar41_42)
        val kars2Id1 = intArrayOf(R.id.kar182_1, R.id.kar182_5, R.id.kar182_21, R.id.kar182_22, R.id.kar182_61, R.id.kar182_62,
            R.id.kar172_1, R.id.kar172_5, R.id.kar172_21, R.id.kar172_22, R.id.kar172_61, R.id.kar172_62,
            R.id.kar162_1, R.id.kar162_5, R.id.kar162_21, R.id.kar162_22, R.id.kar162_61, R.id.kar162_62,
            R.id.kar152_1, R.id.kar152_5, R.id.kar152_21, R.id.kar152_22, R.id.kar152_61, R.id.kar152_62,
            R.id.kar142_1, R.id.kar142_5, R.id.kar142_21, R.id.kar142_22, R.id.kar142_61, R.id.kar142_62,
            R.id.kar132_6, R.id.kar132_5, R.id.kar132_31, R.id.kar132_32, R.id.kar132_41, R.id.kar132_42,
            R.id.kar122_6, R.id.kar122_5, R.id.kar122_31, R.id.kar122_32, R.id.kar122_41, R.id.kar122_42,
            R.id.kar112_6, R.id.kar112_5, R.id.kar112_31, R.id.kar112_32, R.id.kar112_41, R.id.kar112_42)
        val kars2Id2 = intArrayOf(R.id.kar282_1, R.id.kar282_5, R.id.kar282_21, R.id.kar282_22, R.id.kar282_61, R.id.kar282_62,
            R.id.kar272_1, R.id.kar272_5, R.id.kar272_21, R.id.kar272_22, R.id.kar272_61, R.id.kar272_62,
            R.id.kar262_1, R.id.kar262_5, R.id.kar262_21, R.id.kar262_22, R.id.kar262_61, R.id.kar262_62,
            R.id.kar252_1, R.id.kar252_5, R.id.kar252_21, R.id.kar252_22, R.id.kar252_61, R.id.kar252_62,
            R.id.kar242_1, R.id.kar242_5, R.id.kar242_21, R.id.kar242_22, R.id.kar242_61, R.id.kar242_62,
            R.id.kar232_6, R.id.kar232_5, R.id.kar232_31, R.id.kar232_32, R.id.kar232_41, R.id.kar232_42,
            R.id.kar222_6, R.id.kar222_5, R.id.kar222_31, R.id.kar222_32, R.id.kar222_41, R.id.kar222_42,
            R.id.kar212_6, R.id.kar212_5, R.id.kar212_31, R.id.kar212_32, R.id.kar212_41, R.id.kar212_42)
        val kars2Id3 = intArrayOf(R.id.kar382_1, R.id.kar382_5, R.id.kar382_21, R.id.kar382_22, R.id.kar382_61, R.id.kar382_62,
            R.id.kar372_1, R.id.kar372_5, R.id.kar372_21, R.id.kar372_22, R.id.kar372_61, R.id.kar372_62,
            R.id.kar362_1, R.id.kar362_5, R.id.kar362_21, R.id.kar362_22, R.id.kar362_61, R.id.kar362_62,
            R.id.kar352_1, R.id.kar352_5, R.id.kar352_21, R.id.kar352_22, R.id.kar352_61, R.id.kar352_62,
            R.id.kar342_1, R.id.kar342_5, R.id.kar342_21, R.id.kar342_22, R.id.kar342_61, R.id.kar342_62,
            R.id.kar332_6, R.id.kar332_5, R.id.kar332_31, R.id.kar332_32, R.id.kar332_41, R.id.kar332_42,
            R.id.kar322_6, R.id.kar322_5, R.id.kar322_31, R.id.kar322_32, R.id.kar322_41, R.id.kar322_42,
            R.id.kar312_6, R.id.kar312_5, R.id.kar312_31, R.id.kar312_32, R.id.kar312_41, R.id.kar312_42)
        val kars2Id4 = intArrayOf(R.id.kar482_1, R.id.kar482_5, R.id.kar482_21, R.id.kar482_22, R.id.kar482_61, R.id.kar482_62,
            R.id.kar472_1, R.id.kar472_5, R.id.kar472_21, R.id.kar472_22, R.id.kar472_61, R.id.kar472_62,
            R.id.kar462_1, R.id.kar462_5, R.id.kar462_21, R.id.kar462_22, R.id.kar462_61, R.id.kar462_62,
            R.id.kar452_1, R.id.kar452_5, R.id.kar452_21, R.id.kar452_22, R.id.kar452_61, R.id.kar452_62,
            R.id.kar442_1, R.id.kar442_5, R.id.kar442_21, R.id.kar442_22, R.id.kar442_61, R.id.kar442_62,
            R.id.kar432_6, R.id.kar432_5, R.id.kar432_31, R.id.kar432_32, R.id.kar432_41, R.id.kar432_42,
            R.id.kar422_6, R.id.kar422_5, R.id.kar422_31, R.id.kar422_32, R.id.kar422_41, R.id.kar422_42,
            R.id.kar412_6, R.id.kar412_5, R.id.kar412_31, R.id.kar412_32, R.id.kar412_41, R.id.kar412_42
        )
        val karsIdImg1 = intArrayOf(R.id.t18k1, R.id.t18k5, R.id.t18k21, R.id.t18k22, R.id.t18k61, R.id.t18k62,
            R.id.t17k1, R.id.t17k5, R.id.t17k21, R.id.t17k22, R.id.t17k61, R.id.t17k62,
            R.id.t16k1, R.id.t16k5, R.id.t16k21, R.id.t16k22, R.id.t16k61, R.id.t16k62,
            R.id.t15k1, R.id.t15k5, R.id.t15k21, R.id.t15k22, R.id.t15k61, R.id.t15k62,
            R.id.t14k1, R.id.t14k5, R.id.t14k21, R.id.t14k22, R.id.t14k61, R.id.t14k62,
            R.id.t13k6, R.id.t13k5, R.id.t13k31, R.id.t13k32, R.id.t13k41, R.id.t13k42,
            R.id.t12k6, R.id.t12k5, R.id.t12k31, R.id.t12k32, R.id.t12k41, R.id.t12k42,
            R.id.t11k6, R.id.t11k5, R.id.t11k31, R.id.t11k32, R.id.t11k41, R.id.t11k42)
        val karsIdImg2 = intArrayOf(  R.id.t28k1, R.id.t28k5, R.id.t28k21, R.id.t28k22, R.id.t28k61, R.id.t28k62,
            R.id.t27k1, R.id.t27k5, R.id.t27k21, R.id.t27k22, R.id.t27k61, R.id.t27k62,
            R.id.t26k1, R.id.t26k5, R.id.t26k21, R.id.t26k22, R.id.t26k61, R.id.t26k62,
            R.id.t25k1, R.id.t25k5, R.id.t25k21, R.id.t25k22, R.id.t25k61, R.id.t25k62,
            R.id.t24k1, R.id.t24k5, R.id.t24k21, R.id.t24k22, R.id.t24k61, R.id.t24k62,
            R.id.t23k6, R.id.t23k5, R.id.t23k31, R.id.t23k32, R.id.t23k41, R.id.t23k42,
            R.id.t22k6, R.id.t22k5, R.id.t22k31, R.id.t22k32, R.id.t22k41, R.id.t22k42,
            R.id.t21k6, R.id.t21k5, R.id.t21k31, R.id.t21k32, R.id.t21k41, R.id.t21k42)
        val karsIdImg3 = intArrayOf(R.id.t38k1, R.id.t38k5, R.id.t38k21, R.id.t38k22, R.id.t38k61, R.id.t38k62,
            R.id.t37k1, R.id.t37k5, R.id.t37k21, R.id.t37k22, R.id.t37k61, R.id.t37k62,
            R.id.t36k1, R.id.t36k5, R.id.t36k21, R.id.t36k22, R.id.t36k61, R.id.t36k62,
            R.id.t35k1, R.id.t35k5, R.id.t35k21, R.id.t35k22, R.id.t35k61, R.id.t35k62,
            R.id.t34k1, R.id.t34k5, R.id.t34k21, R.id.t34k22, R.id.t34k61, R.id.t34k62,
            R.id.t33k6, R.id.t33k5, R.id.t33k31, R.id.t33k32, R.id.t33k41, R.id.t33k42,
            R.id.t32k6, R.id.t32k5, R.id.t32k31, R.id.t32k32, R.id.t32k41, R.id.t32k42,
            R.id.t31k6, R.id.t31k5, R.id.t31k31, R.id.t31k32, R.id.t31k41, R.id.t31k42)
        val karsIdImg4 = intArrayOf( R.id.t48k1, R.id.t48k5, R.id.t48k21, R.id.t48k22, R.id.t48k61, R.id.t48k62,
            R.id.t47k1, R.id.t47k5, R.id.t47k21, R.id.t47k22, R.id.t47k61, R.id.t47k62,
            R.id.t46k1, R.id.t46k5, R.id.t46k21, R.id.t46k22, R.id.t46k61, R.id.t46k62,
            R.id.t45k1, R.id.t45k5, R.id.t45k21, R.id.t45k22, R.id.t45k61, R.id.t45k62,
            R.id.t44k1, R.id.t44k5, R.id.t44k21, R.id.t44k22, R.id.t44k61, R.id.t44k62,
            R.id.t43k6, R.id.t43k5, R.id.t43k31, R.id.t43k32, R.id.t43k41, R.id.t43k42,
            R.id.t42k6, R.id.t42k5, R.id.t42k31, R.id.t42k32, R.id.t42k41, R.id.t42k42,
            R.id.t41k6, R.id.t41k5, R.id.t41k31, R.id.t41k32, R.id.t41k41, R.id.t41k42)
        val kars2IdImg1 = intArrayOf(R.id.t182k1, R.id.t182k5, R.id.t182k21, R.id.t182k22, R.id.t182k61, R.id.t182k62,
            R.id.t172k1, R.id.t172k5, R.id.t172k21, R.id.t172k22, R.id.t172k61, R.id.t172k62,
            R.id.t162k1, R.id.t162k5, R.id.t162k21, R.id.t162k22, R.id.t162k61, R.id.t162k62,
            R.id.t152k1, R.id.t152k5, R.id.t152k21, R.id.t152k22, R.id.t152k61, R.id.t152k62,
            R.id.t142k1, R.id.t142k5, R.id.t142k21, R.id.t142k22, R.id.t142k61, R.id.t142k62,
            R.id.t132k6, R.id.t132k5, R.id.t132k31, R.id.t132k32, R.id.t132k41, R.id.t132k42,
            R.id.t122k6, R.id.t122k5, R.id.t122k31, R.id.t122k32, R.id.t122k41, R.id.t122k42,
            R.id.t112k6, R.id.t112k5, R.id.t112k31, R.id.t112k32, R.id.t112k41, R.id.t112k42)
        val kars2IdImg2 = intArrayOf(R.id.t282k1, R.id.t282k5, R.id.t282k21, R.id.t282k22, R.id.t282k61, R.id.t282k62,
            R.id.t272k1, R.id.t272k5, R.id.t272k21, R.id.t272k22, R.id.t272k61, R.id.t272k62,
            R.id.t262k1, R.id.t262k5, R.id.t262k21, R.id.t262k22, R.id.t262k61, R.id.t262k62,
            R.id.t252k1, R.id.t252k5, R.id.t252k21, R.id.t252k22, R.id.t252k61, R.id.t252k62,
            R.id.t242k1, R.id.t242k5, R.id.t242k21, R.id.t242k22, R.id.t242k61, R.id.t242k62,
            R.id.t232k6, R.id.t232k5, R.id.t232k31, R.id.t232k32, R.id.t232k41, R.id.t232k42,
            R.id.t222k6, R.id.t222k5, R.id.t222k31, R.id.t222k32, R.id.t222k41, R.id.t222k42,
            R.id.t212k6, R.id.t212k5, R.id.t212k31, R.id.t212k32, R.id.t212k41, R.id.t212k42)
        val kars2IdImg3 = intArrayOf(R.id.t382k1, R.id.t382k5, R.id.t382k21, R.id.t382k22, R.id.t382k61, R.id.t382k62,
            R.id.t372k1, R.id.t372k5, R.id.t372k21, R.id.t372k22, R.id.t372k61, R.id.t372k62,
            R.id.t362k1, R.id.t362k5, R.id.t362k21, R.id.t362k22, R.id.t362k61, R.id.t362k62,
            R.id.t352k1, R.id.t352k5, R.id.t352k21, R.id.t352k22, R.id.t352k61, R.id.t352k62,
            R.id.t342k1, R.id.t342k5, R.id.t342k21, R.id.t342k22, R.id.t342k61, R.id.t342k62,
            R.id.t332k6, R.id.t332k5, R.id.t332k31, R.id.t332k32, R.id.t332k41, R.id.t332k42,
            R.id.t322k6, R.id.t322k5, R.id.t322k31, R.id.t322k32, R.id.t322k41, R.id.t322k42,
            R.id.t312k6, R.id.t312k5, R.id.t312k31, R.id.t312k32, R.id.t312k41, R.id.t312k42)
        val kars2IdImg4 = intArrayOf(R.id.t482k1, R.id.t482k5, R.id.t482k21, R.id.t482k22, R.id.t482k61, R.id.t482k62,
            R.id.t472k1, R.id.t472k5, R.id.t472k21, R.id.t472k22, R.id.t472k61, R.id.t472k62,
            R.id.t462k1, R.id.t462k5, R.id.t462k21, R.id.t462k22, R.id.t462k61, R.id.t462k62,
            R.id.t452k1, R.id.t452k5, R.id.t452k21, R.id.t452k22, R.id.t452k61, R.id.t452k62,
            R.id.t442k1, R.id.t442k5, R.id.t442k21, R.id.t442k22, R.id.t442k61, R.id.t442k62,
            R.id.t432k6, R.id.t432k5, R.id.t432k31, R.id.t432k32, R.id.t432k41, R.id.t432k42,
            R.id.t422k6, R.id.t422k5, R.id.t422k31, R.id.t422k32, R.id.t422k41, R.id.t422k42,
            R.id.t412k6, R.id.t412k5, R.id.t412k31, R.id.t412k32, R.id.t412k41, R.id.t412k42
        )

        val existsId1 = intArrayOf(R.id.exist18, R.id.exist17,R.id.exist16,R.id.exist15,R.id.exist14,R.id.exist13,R.id.exist12,R.id.exist11)
        val existsId2 = intArrayOf(R.id.exist28,R.id.exist27,R.id.exist26,R.id.exist25,R.id.exist24,R.id.exist23,R.id.exist22,R.id.exist21)
        val existsId3 = intArrayOf(R.id.exist38,R.id.exist37,R.id.exist36,R.id.exist35,R.id.exist34,R.id.exist33,R.id.exist32,R.id.exist31)
        val existsId4 = intArrayOf(R.id.exist48,R.id.exist47, R.id.exist46,R.id.exist45,R.id.exist44,R.id.exist43,R.id.exist42,R.id.exist41)

        val pupesId1 = intArrayOf(R.id.pupe18, R.id.pupe17,R.id.pupe16,R.id.pupe15,R.id.pupe14,R.id.pupe13,R.id.pupe12,R.id.pupe11)
        val pupesId2 = intArrayOf(R.id.pupe28,R.id.pupe27,R.id.pupe26,R.id.pupe25,R.id.pupe24,R.id.pupe23,R.id.pupe22,R.id.pupe21)
        val pupesId3 = intArrayOf(R.id.pupe38,R.id.pupe37,R.id.pupe36,R.id.pupe35,R.id.pupe34,R.id.pupe33,R.id.pupe32,R.id.pupe31)
        val pupesId4 = intArrayOf(R.id.pupe48,R.id.pupe47, R.id.pupe46,R.id.pupe45,R.id.pupe44,R.id.pupe43,R.id.pupe42,R.id.pupe41)

        const val but0Color = "#DCDCDC"
        const val but1Color = "#DCDCDD"
        const val plombColor = "#20b2aa"
        const val krColor = "#CD5C5C"
        const val otlColor = "#FFD700"
        const val implantColor = "#595B5D"
        const val puColor = "#CF1D2E"
        const val peColor = "#555555"
        const val kamColor = "#696969"
        const val vosColor = "#9ACD32"
        const val karColor = "#a9a9a9"//416 312

        val podvsId = intArrayOf(R.id.podv18, R.id.podv17,R.id.podv16,R.id.podv15,R.id.podv14,R.id.podv13,R.id.podv12,R.id.podv11,
            R.id.podv28,R.id.podv27,R.id.podv26,R.id.podv25, R.id.podv24,R.id.podv23,R.id.podv22,R.id.podv21,
            R.id.podv38,R.id.podv37,R.id.podv36,R.id.podv35,R.id.podv34,R.id.podv33,R.id.podv32,R.id.podv31,
            R.id.podv48,R.id.podv47, R.id.podv46,R.id.podv45,R.id.podv44,R.id.podv43,R.id.podv42,R.id.podv41)
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
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

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
        val chart7 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart7)
        val chart8 = findViewById<com.github.mikephil.charting.charts.LineChart>(R.id.chart8)

        settingsForDesnZond(chart1, chart2, chart3, chart4, chart5, chart6, chart7, chart8)
        settingsForExist(chart1, chart2, chart3, chart4, chart5, chart6, chart7, chart8)

        generateChart(chart1, zondChart1, desnChart1, 17f, -9f)
        generateChart(chart2, zondChart2, desnChart2, 17f, -9f)
        generateChart(chart3, zondChart3, desnChart3,9f, -16f)
        generateChart(chart4, zondChart4, desnChart4,9f, -16f)
        generateChart(chart5, zondChart5, desnChart5, 17f, -9f)
        generateChart(chart6, zondChart6, desnChart6, 17f, -9f)
        generateChart(chart7, zondChart7, desnChart7,9f, -16f)
        generateChart(chart8, zondChart8, desnChart8,9f, -16f)

        val topLayout = findViewById<LinearLayout>(R.id.top)
        val table1Layout = findViewById<RelativeLayout>(R.id.table1)
        val table2Layout = findViewById<RelativeLayout>(R.id.table2)
        val table3Layout = findViewById<RelativeLayout>(R.id.table3)
        val table4Layout = findViewById<RelativeLayout>(R.id.table4)
        val bottomLayout = findViewById<LinearLayout>(R.id.bottom)

        val downloadBut: Button = findViewById(R.id.download)

        downloadBut.setOnClickListener {
            saveBitmap(takeScreenshot(topLayout), "top.png")
            saveBitmap(takeScreenshot(table1Layout), "table1.png")
            saveBitmap(takeScreenshot(table2Layout), "table2.png")
            saveBitmap(takeScreenshot(table3Layout), "table3.png")
            saveBitmap(takeScreenshot(table4Layout), "table4.png")
            saveBitmap(takeScreenshot(bottomLayout), "bottom.png")
            convertImagesToPdf()
            addDataToExcel()
        }

        for (el in podvsId){
            val podv = findViewById<EditText>(el)
            podv.doAfterTextChanged{
                russel()
            }
        }

        //val addBut = findViewById<Button>(R.id.addImg)
        //addBut.setOnClickListener{
        //    addImage()
        //}

    }

    //private fun addImage() {
     //   val intent = Intent(Intent.ACTION_PICK)
     //   intent.type = "image/*"
     //   startActivityForResult(intent, IMAGE_REQUEST_CODE)
    //}

    //override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
     //   super.onActivityResult(requestCode, resultCode, data)
     //   if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK) {
     //       val imageView = findViewById<ImageView>(R.id.img1)
      //      imageView.setImageURI(data?.data)
     //   }
    //}

    fun addDataToExcel(){
        val ohis = findViewById<TextView>(R.id.ohis).text.toString()
        val kpu = findViewById<TextView>(R.id.kpu).text.toString()
        val bop = findViewById<TextView>(R.id.bop).text.toString()
        val cpitn = findViewById<TextView>(R.id.cpitn1).text.toString()+
                findViewById<TextView>(R.id.cpitn2).text.toString()+
                findViewById<TextView>(R.id.cpitn3).text.toString()+
                findViewById<TextView>(R.id.cpitn4).text.toString()+
                findViewById<TextView>(R.id.cpitn5).text.toString()+
                findViewById<TextView>(R.id.cpitn6).text.toString()
        val russel = findViewById<TextView>(R.id.russel).text.toString()
        val api = findViewById<TextView>(R.id.api).text.toString()

        val familia = findViewById<EditText>(R.id.editTextTextFamilia).text.trim().toString()
        val name = findViewById<EditText>(R.id.editTextTextName).text.trim().toString()
        val otchestvo = findViewById<EditText>(R.id.editTextTextOtchestvo).text.trim().toString()

        val str = familia + name + otchestvo + "\t"+kpu+"\t"+bop+"\t"+api+"\t"+cpitn+"\t"+russel+"\t"+ohis

        val filePath = "${externalCacheDir?.absolutePath}/statistics.txt"
        val file = File(filePath)
        file.appendText("$str\n")
    }

    fun takeScreenshot(view: View): Bitmap {
        val bitmap = Bitmap.createBitmap(view.width, view.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        view.draw(canvas)
        return bitmap
    }

    private fun saveBitmap(bitmap: Bitmap, path: String) {
        val filePath = "${externalCacheDir?.absolutePath}/"+path
        val file = File(filePath)

        try {
            val outputStream = FileOutputStream(file)
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream)
            outputStream.flush()
            outputStream.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun convertImagesToPdf() {
        val imagePaths = listOf(
            "${externalCacheDir?.absolutePath}/top.png",
            "${externalCacheDir?.absolutePath}/table1.png",
            "${externalCacheDir?.absolutePath}/table2.png",
            "${externalCacheDir?.absolutePath}/table3.png",
            "${externalCacheDir?.absolutePath}/table4.png",
            "${externalCacheDir?.absolutePath}/bottom.png"
        )
        val mmpi = 25.4f
        val dpi = 150
        val pdfDocument = PdfDocument()
        var bitmap0 = BitmapFactory.decodeFile(imagePaths[0])
        var bitmap1 = BitmapFactory.decodeFile(imagePaths[1])
        var bitmap2 = BitmapFactory.decodeFile(imagePaths[2])
        var bitmap3 = BitmapFactory.decodeFile(imagePaths[3])
        var bitmap4 = BitmapFactory.decodeFile(imagePaths[4])
        var bitmap5 = BitmapFactory.decodeFile(imagePaths[5])

        val w1 = bitmap5.width
        val h1 = bitmap5.height

        Log.e("DEBUG", "$w1 $h1")

        if (bitmap0 != null && bitmap1 != null && bitmap2 != null && bitmap3 != null && bitmap4 != null && bitmap5 != null) {
            bitmap0 = Bitmap.createScaledBitmap(bitmap0, 1200, 162, true)
            bitmap1 = Bitmap.createScaledBitmap(bitmap1, 1200, 713, true)
            bitmap2 = Bitmap.createScaledBitmap(bitmap2, 1200, 552, true)
            bitmap3 = Bitmap.createScaledBitmap(bitmap3, 1200, 538, true)
            bitmap4 = Bitmap.createScaledBitmap(bitmap4, 1200, 695, true)
            bitmap5 = Bitmap.createScaledBitmap(bitmap5, 1150, round(h1*1150.0/w1).toInt(), true)

            val pageInfo0 = PdfDocument.PageInfo.Builder((210/mmpi*dpi).toInt(), (297/mmpi*dpi).toInt(), 0).create()
            val page0 = pdfDocument.startPage(pageInfo0)
            val canvas = page0.canvas
            canvas.drawBitmap(bitmap0, 20f, 80f, null)
            canvas.drawBitmap(bitmap1, 20f, bitmap0.height.toFloat()+140f, null)
            canvas.drawBitmap(bitmap2, 20f, bitmap0.height.toFloat()+bitmap1.height.toFloat()+140f, null)
            pdfDocument.finishPage(page0)

            val pageInfo1 = PdfDocument.PageInfo.Builder((210/mmpi*dpi).toInt(), (297/mmpi*dpi).toInt(), 1).create()
            val page1 = pdfDocument.startPage(pageInfo1)
            val canvas1 = page1.canvas
            canvas1.drawBitmap(bitmap3, 20f, 80f, null)
            canvas1.drawBitmap(bitmap4, 20f, bitmap3.height.toFloat()+80f, null)
            canvas1.drawBitmap(bitmap5, (210/mmpi*dpi)/2-575, bitmap3.height.toFloat()+bitmap4.height.toFloat()+100f, null)
            pdfDocument.finishPage(page1)

        }

        val familia = findViewById<EditText>(R.id.editTextTextFamilia).text.trim().toString()
        val name = findViewById<EditText>(R.id.editTextTextName).text.trim().toString()
        val otchestvo = findViewById<EditText>(R.id.editTextTextOtchestvo).text.trim().toString()

        val dirDoc = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS)
        val pdfFilePath = "${dirDoc}/${familia}_${name}_${otchestvo}.pdf"
        val file = File(pdfFilePath)

        try {
            val outputStream = FileOutputStream(file)
            pdfDocument.writeTo(outputStream)
            outputStream.close()
        } catch (e: Exception) {
            e.printStackTrace()
        } finally {
            pdfDocument.close()
        }
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

    private fun changeColorButtonPlomb(button: Button, color0: String, color1: String){
        button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
        button.setOnClickListener {
            val colorStateList = button.backgroundTintList
            val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)
            if (defaultColor == Color.parseColor(color0)) {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color1)))
            } else {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
            }
            kpu()
        }
    }

    private fun changeColorButtonKr(button: Button, color0: String, color1: String){
        button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
        button.setOnClickListener {
            val colorStateList = button.backgroundTintList
            val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)
            if (defaultColor == Color.parseColor(color0)) {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color1)))
            } else {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
            }
            bop()
            russel()
        }
    }

    private fun changeColorButtonKam(button: Button, color0: String, color1: String){
        button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
        button.setOnClickListener {
            val colorStateList = button.backgroundTintList
            val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)
            if (defaultColor == Color.parseColor(color0)) {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color1)))
            } else {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
            }
            cpitn()
            ohis()
        }
    }

    private fun changeColorButtonOtl(button: Button, color0: String, color1: String){
        button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
        button.setOnClickListener {
            val colorStateList = button.backgroundTintList
            val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)
            if (defaultColor == Color.parseColor(color0)) {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color1)))
            } else {
                button.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(color0)))
            }
            api()
            ohis()
        }
    }

    private fun settingsForPlombs(){
        for(el in plombsId){
            changeColorButtonPlomb(findViewById(el), but0Color, plombColor)
        }
    }

    private fun settingsForImplants(){
        val tisDrawable1 = intArrayOf(R.drawable.t18i, R.drawable.t17i,R.drawable.t16i,R.drawable.t15i,R.drawable.t14i,R.drawable.t13i,R.drawable.t12i,R.drawable.t11i)
        val tisDrawable2 = intArrayOf(R.drawable.t28i,R.drawable.t27i,R.drawable.t26i,R.drawable.t25i, R.drawable.t24i,R.drawable.t23i,R.drawable.t22i,R.drawable.t21i)
        val tisDrawable3 = intArrayOf(R.drawable.t38i,R.drawable.t37i,R.drawable.t36i,R.drawable.t35i,R.drawable.t34i,R.drawable.t33i,R.drawable.t32i,R.drawable.t31i)
        val tisDrawable4 = intArrayOf(R.drawable.t48i,R.drawable.t47i, R.drawable.t46i,R.drawable.t45i,R.drawable.t44i,R.drawable.t43i,R.drawable.t42i,R.drawable.t41i)

        val t2iDrawable1 = intArrayOf(R.drawable.t182i, R.drawable.t172i,R.drawable.t162i,R.drawable.t152i,R.drawable.t142i,R.drawable.t132i,R.drawable.t122i,R.drawable.t112i)
        val t2iDrawable2 = intArrayOf(R.drawable.t282i,R.drawable.t272i,R.drawable.t262i,R.drawable.t252i, R.drawable.t242i,R.drawable.t232i,R.drawable.t222i,R.drawable.t212i)
        val t2iDrawable3 = intArrayOf(R.drawable.t382i,R.drawable.t372i,R.drawable.t362i,R.drawable.t352i,R.drawable.t342i,R.drawable.t332i,R.drawable.t322i,R.drawable.t312i)
        val t2iDrawable4 = intArrayOf(R.drawable.t482i,R.drawable.t472i, R.drawable.t462i,R.drawable.t452i,R.drawable.t442i,R.drawable.t432i,R.drawable.t422i,R.drawable.t412i)

        fun implntHelp(implantsId: IntArray, furksImgId1: IntArray, furksId1: IntArray, furks2ImgId1: IntArray, furks2Id1: IntArray, tsId1: IntArray, t2sId1: IntArray,
                       tisDrawable1: IntArray, t2iDrawable1: IntArray, tsDrawable1: IntArray, t2sDrawable1: IntArray, plombsId1: IntArray,karsId1: IntArray,kars2Id1: IntArray,
                       karsIdImg1: IntArray, kars2IdImg1: IntArray, pupesId1: IntArray, flag: Boolean){
            for(i in implantsId.indices){
                val t = findViewById<ImageView>(tsId1[i])
                val t2 = findViewById<ImageView>(t2sId1[i])
                val implant = findViewById<Button>(implantsId[i])
                implant.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                implant.setOnClickListener {
                    val colorStateList = implant.backgroundTintList
                    val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)
                    if (defaultColor == Color.parseColor(but0Color)) {
                        implant.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(implantColor)))
                        t.setImageResource(tisDrawable1[i])
                        t2.setImageResource(t2iDrawable1[i])

                        findViewById<Button>(plombsId1[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(plombsId1[i]).visibility = View.INVISIBLE

                        findViewById<Button>(pupesId1[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(pupesId1[i]).visibility = View.INVISIBLE

                        for (j in i*6..i*6+5){
                            findViewById<Button>(karsId1[j]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                            findViewById<Button>(karsId1[j]).visibility = View.INVISIBLE
                            findViewById<Button>(kars2Id1[j]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                            findViewById<Button>(kars2Id1[j]).visibility = View.INVISIBLE
                            findViewById<ImageView>(karsIdImg1[j]).visibility = View.GONE
                            findViewById<ImageView>(kars2IdImg1[j]).visibility = View.GONE
                        }


                        if (flag){
                            if(i <= 2){
                                findViewById<ImageButton>(furksId1[i]).tag = R.drawable.null17
                                findViewById<ImageView>(furksImgId1[i]).tag = R.drawable.null17
                                findViewById<ImageButton>(furks2Id1[i*2]).tag = R.drawable.null17
                                findViewById<ImageView>(furks2ImgId1[i*2]).tag = R.drawable.null17
                                findViewById<ImageButton>(furks2Id1[i*2+1]).tag = R.drawable.null17
                                findViewById<ImageView>(furks2ImgId1[i*2+1]).tag = R.drawable.null17
                                findViewById<ImageButton>(furksId1[i]).visibility = View.INVISIBLE
                                findViewById<ImageView>(furksImgId1[i]).visibility = View.INVISIBLE
                                findViewById<ImageButton>(furks2Id1[i*2]).visibility = View.INVISIBLE
                                findViewById<ImageView>(furks2ImgId1[i*2]).visibility = View.INVISIBLE
                                findViewById<ImageButton>(furks2Id1[i*2+1]).visibility = View.INVISIBLE
                                findViewById<ImageView>(furks2ImgId1[i*2+1]).visibility = View.INVISIBLE
                            }
                            if (i == 4){
                                findViewById<ImageButton>(furks2Id1[6]).tag = R.drawable.null17
                                findViewById<ImageView>(furks2ImgId1[6]).tag = R.drawable.null17
                                findViewById<ImageButton>(furks2Id1[7]).tag = R.drawable.null17
                                findViewById<ImageView>(furks2ImgId1[7]).tag = R.drawable.null17
                                findViewById<ImageButton>(furks2Id1[6]).visibility = View.INVISIBLE
                                findViewById<ImageView>(furks2ImgId1[6]).visibility = View.INVISIBLE
                                findViewById<ImageButton>(furks2Id1[7]).visibility = View.INVISIBLE
                                findViewById<ImageView>(furks2ImgId1[7]).visibility = View.INVISIBLE
                            }
                        }
                        else{
                            if(i <= 2){
                                findViewById<ImageButton>(furksId1[i]).tag = R.drawable.null17
                                findViewById<ImageView>(furksImgId1[i]).tag = R.drawable.null17
                                findViewById<ImageButton>(furks2Id1[i]).tag = R.drawable.null17
                                findViewById<ImageView>(furks2ImgId1[i]).tag = R.drawable.null17
                                findViewById<ImageButton>(furksId1[i]).visibility = View.INVISIBLE
                                findViewById<ImageView>(furksImgId1[i]).visibility = View.INVISIBLE
                                findViewById<ImageButton>(furks2Id1[i]).visibility = View.INVISIBLE
                                findViewById<ImageView>(furks2ImgId1[i]).visibility = View.INVISIBLE
                            }
                        }
                    }
                    else{
                        implant.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        t.setImageResource(tsDrawable1[i])
                        t2.setImageResource(t2sDrawable1[i])

                        findViewById<Button>(plombsId1[i]).visibility = View.VISIBLE

                        findViewById<Button>(pupesId1[i]).visibility = View.VISIBLE

                        for (j in i*6..i*6+5){
                            findViewById<Button>(karsId1[j]).visibility = View.VISIBLE
                            findViewById<Button>(kars2Id1[j]).visibility = View.VISIBLE
                        }
                        if (flag){
                            if(i <= 2){
                                findViewById<ImageButton>(furksId1[i]).visibility = View.VISIBLE
                                findViewById<ImageView>(furksImgId1[i]).visibility = View.VISIBLE
                                findViewById<ImageButton>(furks2Id1[i*2]).visibility = View.VISIBLE
                                findViewById<ImageView>(furks2ImgId1[i*2]).visibility = View.VISIBLE
                                findViewById<ImageButton>(furks2Id1[i*2+1]).visibility = View.VISIBLE
                                findViewById<ImageView>(furks2ImgId1[i*2+1]).visibility = View.VISIBLE
                            }
                            if (i == 4){
                                findViewById<ImageButton>(furks2Id1[6]).visibility = View.VISIBLE
                                findViewById<ImageView>(furks2ImgId1[6]).visibility = View.VISIBLE
                                findViewById<ImageButton>(furks2Id1[7]).visibility = View.VISIBLE
                                findViewById<ImageView>(furks2ImgId1[7]).visibility = View.VISIBLE
                            }
                        }
                        else{
                            if(i <= 2){
                                findViewById<ImageButton>(furksId1[i]).visibility = View.VISIBLE
                                findViewById<ImageView>(furksImgId1[i]).visibility = View.VISIBLE

                                findViewById<ImageButton>(furks2Id1[i]).visibility = View.VISIBLE
                                findViewById<ImageView>(furks2ImgId1[i]).visibility = View.VISIBLE
                            }
                        }

                    }
                    kpu()
                }
            }
        }

        implntHelp(implantsId1,furksImgId1, furksId1, furks2ImgId1, furks2Id1, tsId1, t2sId1 ,tisDrawable1, t2iDrawable1, tsDrawable1, t2sDrawable1,plombsId1,karsId1,kars2Id1, karsIdImg1, kars2IdImg1, pupesId1,true)
        implntHelp(implantsId2, furksImgId2, furksId2, furks2ImgId2, furks2Id2, tsId2, t2sId2 ,tisDrawable2, t2iDrawable2, tsDrawable2, t2sDrawable2,plombsId2,karsId2,kars2Id2, karsIdImg2, kars2IdImg2,pupesId2,true)
        implntHelp(implantsId3, furksImgId3, furksId3, furks2ImgId3, furks2Id3, tsId3, t2sId3 ,tisDrawable3, t2iDrawable3, tsDrawable3, t2sDrawable3,plombsId3,karsId3,kars2Id3, karsIdImg3, kars2IdImg3,pupesId3,false)
        implntHelp(implantsId4, furksImgId4, furksId4, furks2ImgId4, furks2Id4, tsId4, t2sId4 ,tisDrawable4, t2iDrawable4, tsDrawable4, t2sDrawable4,plombsId4,karsId4,kars2Id4, karsIdImg4, kars2IdImg4,pupesId4,false)
    }

    private fun settingsForPupes(){
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
        for(el in krId){
            changeColorButtonKr(findViewById(el), but0Color, krColor)
        }
        val krId1 = intArrayOf(R.id.kr18_1,R.id.kr18_2,R.id.kr18_3,R.id.kr17_1,R.id.kr17_2,R.id.kr17_3,R.id.kr16_1,R.id.kr16_2,R.id.kr16_3,R.id.kr15_1,R.id.kr15_2,R.id.kr15_3,R.id.kr14_1,R.id.kr14_2,R.id.kr14_3,R.id.kr13_1,R.id.kr13_2,R.id.kr13_3,R.id.kr12_1,R.id.kr12_2,R.id.kr12_3,R.id.kr11_1,R.id.kr11_2,R.id.kr11_3,
            R.id.kr28_1,R.id.kr28_2,R.id.kr28_3,R.id.kr27_1,R.id.kr27_2,R.id.kr27_3,R.id.kr26_1,R.id.kr26_2,R.id.kr26_3,R.id.kr25_1,R.id.kr25_2,R.id.kr25_3,R.id.kr24_1,R.id.kr24_2,R.id.kr24_3,R.id.kr23_1,R.id.kr23_2,R.id.kr23_3,R.id.kr22_1,R.id.kr22_2,R.id.kr22_3,R.id.kr21_1,R.id.kr21_2,R.id.kr21_3)

        val krId2 = intArrayOf(R.id.kr182_1,R.id.kr182_2,R.id.kr182_3,R.id.kr172_1,R.id.kr172_2,R.id.kr172_3,R.id.kr162_1,R.id.kr162_2,R.id.kr162_3,R.id.kr152_1,R.id.kr152_2,R.id.kr152_3,R.id.kr142_1,R.id.kr142_2,R.id.kr142_3,R.id.kr132_1,R.id.kr132_2,R.id.kr132_3,R.id.kr122_1,R.id.kr122_2,R.id.kr122_3,R.id.kr112_1,
            R.id.kr112_2,R.id.kr112_3,R.id.kr282_1,R.id.kr282_2,R.id.kr282_3,R.id.kr272_1,R.id.kr272_2,R.id.kr272_3,R.id.kr262_1,R.id.kr262_2,R.id.kr262_3,R.id.kr252_1,R.id.kr252_2,R.id.kr252_3,R.id.kr242_1,R.id.kr242_2,R.id.kr242_3,R.id.kr232_1,R.id.kr232_2,R.id.kr232_3,R.id.kr222_1,R.id.kr222_2,R.id.kr222_3,R.id.kr212_1,R.id.kr212_2,R.id.kr212_3)

        val krId3 = intArrayOf(R.id.kr38_1,R.id.kr38_2,R.id.kr38_3,R.id.kr37_1,R.id.kr37_2,R.id.kr37_3,R.id.kr36_1,R.id.kr36_2,R.id.kr36_3,R.id.kr35_1,R.id.kr35_2,R.id.kr35_3,R.id.kr34_1,R.id.kr34_2,R.id.kr34_3,R.id.kr33_1,R.id.kr33_2,R.id.kr33_3,R.id.kr32_1,R.id.kr32_2,R.id.kr32_3,R.id.kr31_1,R.id.kr31_2,R.id.kr31_3,
            R.id.kr48_1,R.id.kr48_2,R.id.kr48_3,R.id.kr47_1,R.id.kr47_2,R.id.kr47_3,R.id.kr46_1,R.id.kr46_2,R.id.kr46_3,R.id.kr45_1,R.id.kr45_2,R.id.kr45_3,R.id.kr44_1,R.id.kr44_2,R.id.kr44_3,R.id.kr43_1,R.id.kr43_2,R.id.kr43_3,R.id.kr42_1,R.id.kr42_2,R.id.kr42_3,R.id.kr41_1,R.id.kr41_2,R.id.kr41_3)

        val krId4 = intArrayOf(R.id.kr382_1,R.id.kr382_2,R.id.kr382_3,R.id.kr372_1,R.id.kr372_2,R.id.kr372_3,R.id.kr362_1,R.id.kr362_2,R.id.kr362_3,R.id.kr352_1,R.id.kr352_2,R.id.kr352_3,R.id.kr342_1,R.id.kr342_2,R.id.kr342_3,R.id.kr332_1,R.id.kr332_2,R.id.kr332_3,R.id.kr322_1,R.id.kr322_2,R.id.kr322_3,R.id.kr312_1,
            R.id.kr312_2,R.id.kr312_3,R.id.kr482_1,R.id.kr482_2,R.id.kr482_3,R.id.kr472_1,R.id.kr472_2,R.id.kr472_3,R.id.kr462_1,R.id.kr462_2,R.id.kr462_3,R.id.kr452_1,R.id.kr452_2,R.id.kr452_3,R.id.kr442_1,R.id.kr442_2,R.id.kr442_3,R.id.kr432_1,R.id.kr432_2,R.id.kr432_3,R.id.kr422_1,R.id.kr422_2,R.id.kr422_3,R.id.kr412_1,R.id.kr412_2,R.id.kr412_3)

        findViewById<Button>(R.id.kr1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.kr1).setOnClickListener{
            val color = getColor(findViewById(R.id.kr1))
            if (color == Color.parseColor(but0Color)) {
                    findViewById<Button>(R.id.kr1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                    for (el in krId1) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(krColor)))
                    }
            }
            else{
                findViewById<Button>(R.id.kr1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in krId1) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            russel()
            bop()
        }

        findViewById<Button>(R.id.kr2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.kr2).setOnClickListener{
            val color = getColor(findViewById(R.id.kr2))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.kr2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in krId2) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(krColor)))
                }
            }
            else{
                findViewById<Button>(R.id.kr2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in krId2) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            russel()
            bop()
        }

        findViewById<Button>(R.id.kr3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.kr3).setOnClickListener{
            val color = getColor(findViewById(R.id.kr3))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.kr3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in krId3) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(krColor)))
                }
            }
            else{
                findViewById<Button>(R.id.kr3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in krId3) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            russel()
            bop()
        }

        findViewById<Button>(R.id.kr4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(
            but0Color)))
        findViewById<Button>(R.id.kr4).setOnClickListener{
            val color = getColor(findViewById(R.id.kr4))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.kr4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in krId4) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(krColor)))
                }
            }
            else{
                findViewById<Button>(R.id.kr4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in krId4) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            russel()
            bop()
        }

    }

    private fun settingsForKam(){
        for(el in kamId){
            changeColorButtonKam(findViewById(el), but0Color, kamColor)
        }
        val kamId1 = intArrayOf(R.id.kam18_1,R.id.kam18_2,R.id.kam18_3,R.id.kam17_1,R.id.kam17_2,R.id.kam17_3,R.id.kam16_1,R.id.kam16_2,R.id.kam16_3,R.id.kam15_1,R.id.kam15_2,R.id.kam15_3,R.id.kam14_1,R.id.kam14_2,R.id.kam14_3,R.id.kam13_1,R.id.kam13_2,R.id.kam13_3,R.id.kam12_1,R.id.kam12_2,R.id.kam12_3,R.id.kam11_1,R.id.kam11_2,R.id.kam11_3,
            R.id.kam28_1,R.id.kam28_2,R.id.kam28_3,R.id.kam27_1,R.id.kam27_2,R.id.kam27_3,R.id.kam26_1,R.id.kam26_2,R.id.kam26_3,R.id.kam25_1,R.id.kam25_2,R.id.kam25_3,R.id.kam24_1,R.id.kam24_2,R.id.kam24_3,R.id.kam23_1,R.id.kam23_2,R.id.kam23_3,R.id.kam22_1,R.id.kam22_2,R.id.kam22_3,R.id.kam21_1,R.id.kam21_2,R.id.kam21_3)

        val kamId2 = intArrayOf(R.id.kam182_1,R.id.kam182_2,R.id.kam182_3,R.id.kam172_1,R.id.kam172_2,R.id.kam172_3,R.id.kam162_1,R.id.kam162_2,R.id.kam162_3,R.id.kam152_1,R.id.kam152_2,R.id.kam152_3,R.id.kam142_1,R.id.kam142_2,R.id.kam142_3,R.id.kam132_1,R.id.kam132_2,R.id.kam132_3,R.id.kam122_1,R.id.kam122_2,R.id.kam122_3,R.id.kam112_1,
            R.id.kam112_2,R.id.kam112_3,R.id.kam282_1,R.id.kam282_2,R.id.kam282_3,R.id.kam272_1,R.id.kam272_2,R.id.kam272_3,R.id.kam262_1,R.id.kam262_2,R.id.kam262_3,R.id.kam252_1,R.id.kam252_2,R.id.kam252_3,R.id.kam242_1,R.id.kam242_2,R.id.kam242_3,R.id.kam232_1,R.id.kam232_2,R.id.kam232_3,R.id.kam222_1,R.id.kam222_2,R.id.kam222_3,R.id.kam212_1,R.id.kam212_2,R.id.kam212_3)

        val kamId3 = intArrayOf(R.id.kam38_1,R.id.kam38_2,R.id.kam38_3,R.id.kam37_1,R.id.kam37_2,R.id.kam37_3,R.id.kam36_1,R.id.kam36_2,R.id.kam36_3,R.id.kam35_1,R.id.kam35_2,R.id.kam35_3,R.id.kam34_1,R.id.kam34_2,R.id.kam34_3,R.id.kam33_1,R.id.kam33_2,R.id.kam33_3,R.id.kam32_1,R.id.kam32_2,R.id.kam32_3,R.id.kam31_1,R.id.kam31_2,R.id.kam31_3,
            R.id.kam48_1,R.id.kam48_2,R.id.kam48_3,R.id.kam47_1,R.id.kam47_2,R.id.kam47_3,R.id.kam46_1,R.id.kam46_2,R.id.kam46_3,R.id.kam45_1,R.id.kam45_2,R.id.kam45_3,R.id.kam44_1,R.id.kam44_2,R.id.kam44_3,R.id.kam43_1,R.id.kam43_2,R.id.kam43_3,R.id.kam42_1,R.id.kam42_2,R.id.kam42_3,R.id.kam41_1,R.id.kam41_2,R.id.kam41_3)

        val kamId4 = intArrayOf(R.id.kam382_1,R.id.kam382_2,R.id.kam382_3,R.id.kam372_1,R.id.kam372_2,R.id.kam372_3,R.id.kam362_1,R.id.kam362_2,R.id.kam362_3,R.id.kam352_1,R.id.kam352_2,R.id.kam352_3,R.id.kam342_1,R.id.kam342_2,R.id.kam342_3,R.id.kam332_1,R.id.kam332_2,R.id.kam332_3,R.id.kam322_1,R.id.kam322_2,R.id.kam322_3,R.id.kam312_1,
            R.id.kam312_2,R.id.kam312_3,R.id.kam482_1,R.id.kam482_2,R.id.kam482_3,R.id.kam472_1,R.id.kam472_2,R.id.kam472_3,R.id.kam462_1,R.id.kam462_2,R.id.kam462_3,R.id.kam452_1,R.id.kam452_2,R.id.kam452_3,R.id.kam442_1,R.id.kam442_2,R.id.kam442_3,R.id.kam432_1,R.id.kam432_2,R.id.kam432_3,R.id.kam422_1,R.id.kam422_2,R.id.kam422_3,R.id.kam412_1,R.id.kam412_2,R.id.kam412_3)

        findViewById<Button>(R.id.kam1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.kam1).setOnClickListener{
            val color = getColor(findViewById(R.id.kam1))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.kam1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in kamId1) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(kamColor)))
                }
            }
            else{
                findViewById<Button>(R.id.kam1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in kamId1) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            cpitn()
            ohis()
        }

        findViewById<Button>(R.id.kam2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.kam2).setOnClickListener{
            val color = getColor(findViewById(R.id.kam2))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.kam2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in kamId2) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(kamColor)))
                }
            }
            else{
                findViewById<Button>(R.id.kam2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in kamId2) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            cpitn()
            ohis()
        }

        findViewById<Button>(R.id.kam3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.kam3).setOnClickListener{
            val color = getColor(findViewById(R.id.kam3))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.kam3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in kamId3) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(kamColor)))
                }
            }
            else{
                findViewById<Button>(R.id.kam3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in kamId3) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            cpitn()
            ohis()
        }

        findViewById<Button>(R.id.kam4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(
            but0Color)))
        findViewById<Button>(R.id.kam4).setOnClickListener{
            val color = getColor(findViewById(R.id.kam4))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.kam4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in kamId4) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(kamColor)))
                }
            }
            else{
                findViewById<Button>(R.id.kam4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in kamId4) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            cpitn()
            ohis()
        }
    }

    private fun settingsForVos(){

        for(el in vosId){
            changeColorButton(findViewById(el), but0Color, vosColor)
        }

        val vosId1 = intArrayOf(R.id.vos18_1,R.id.vos18_2,R.id.vos18_3,R.id.vos17_1,R.id.vos17_2,R.id.vos17_3,R.id.vos16_1,R.id.vos16_2,R.id.vos16_3,R.id.vos15_1,R.id.vos15_2,R.id.vos15_3,R.id.vos14_1,R.id.vos14_2,R.id.vos14_3,R.id.vos13_1,R.id.vos13_2,R.id.vos13_3,R.id.vos12_1,R.id.vos12_2,R.id.vos12_3,R.id.vos11_1,R.id.vos11_2,R.id.vos11_3,
            R.id.vos28_1,R.id.vos28_2,R.id.vos28_3,R.id.vos27_1,R.id.vos27_2,R.id.vos27_3,R.id.vos26_1,R.id.vos26_2,R.id.vos26_3,R.id.vos25_1,R.id.vos25_2,R.id.vos25_3,R.id.vos24_1,R.id.vos24_2,R.id.vos24_3,R.id.vos23_1,R.id.vos23_2,R.id.vos23_3,R.id.vos22_1,R.id.vos22_2,R.id.vos22_3,R.id.vos21_1,R.id.vos21_2,R.id.vos21_3)

        val vosId2 = intArrayOf(R.id.vos182_1,R.id.vos182_2,R.id.vos182_3,R.id.vos172_1,R.id.vos172_2,R.id.vos172_3,R.id.vos162_1,R.id.vos162_2,R.id.vos162_3,R.id.vos152_1,R.id.vos152_2,R.id.vos152_3,R.id.vos142_1,R.id.vos142_2,R.id.vos142_3,R.id.vos132_1,R.id.vos132_2,R.id.vos132_3,R.id.vos122_1,R.id.vos122_2,R.id.vos122_3,R.id.vos112_1,
            R.id.vos112_2,R.id.vos112_3,R.id.vos282_1,R.id.vos282_2,R.id.vos282_3,R.id.vos272_1,R.id.vos272_2,R.id.vos272_3,R.id.vos262_1,R.id.vos262_2,R.id.vos262_3,R.id.vos252_1,R.id.vos252_2,R.id.vos252_3,R.id.vos242_1,R.id.vos242_2,R.id.vos242_3,R.id.vos232_1,R.id.vos232_2,R.id.vos232_3,R.id.vos222_1,R.id.vos222_2,R.id.vos222_3,R.id.vos212_1,R.id.vos212_2,R.id.vos212_3)

        val vosId3 = intArrayOf(R.id.vos38_1,R.id.vos38_2,R.id.vos38_3,R.id.vos37_1,R.id.vos37_2,R.id.vos37_3,R.id.vos36_1,R.id.vos36_2,R.id.vos36_3,R.id.vos35_1,R.id.vos35_2,R.id.vos35_3,R.id.vos34_1,R.id.vos34_2,R.id.vos34_3,R.id.vos33_1,R.id.vos33_2,R.id.vos33_3,R.id.vos32_1,R.id.vos32_2,R.id.vos32_3,R.id.vos31_1,R.id.vos31_2,R.id.vos31_3,
            R.id.vos48_1,R.id.vos48_2,R.id.vos48_3,R.id.vos47_1,R.id.vos47_2,R.id.vos47_3,R.id.vos46_1,R.id.vos46_2,R.id.vos46_3,R.id.vos45_1,R.id.vos45_2,R.id.vos45_3,R.id.vos44_1,R.id.vos44_2,R.id.vos44_3,R.id.vos43_1,R.id.vos43_2,R.id.vos43_3,R.id.vos42_1,R.id.vos42_2,R.id.vos42_3,R.id.vos41_1,R.id.vos41_2,R.id.vos41_3)

        val vosId4 = intArrayOf(R.id.vos382_1,R.id.vos382_2,R.id.vos382_3,R.id.vos372_1,R.id.vos372_2,R.id.vos372_3,R.id.vos362_1,R.id.vos362_2,R.id.vos362_3,R.id.vos352_1,R.id.vos352_2,R.id.vos352_3,R.id.vos342_1,R.id.vos342_2,R.id.vos342_3,R.id.vos332_1,R.id.vos332_2,R.id.vos332_3,R.id.vos322_1,R.id.vos322_2,R.id.vos322_3,R.id.vos312_1,
            R.id.vos312_2,R.id.vos312_3,R.id.vos482_1,R.id.vos482_2,R.id.vos482_3,R.id.vos472_1,R.id.vos472_2,R.id.vos472_3,R.id.vos462_1,R.id.vos462_2,R.id.vos462_3,R.id.vos452_1,R.id.vos452_2,R.id.vos452_3,R.id.vos442_1,R.id.vos442_2,R.id.vos442_3,R.id.vos432_1,R.id.vos432_2,R.id.vos432_3,R.id.vos422_1,R.id.vos422_2,R.id.vos422_3,R.id.vos412_1,R.id.vos412_2,R.id.vos412_3)

        findViewById<Button>(R.id.vos1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.vos1).setOnClickListener{
            val color = getColor(findViewById(R.id.vos1))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.vos1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in vosId1) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(vosColor)))
                }
            }
            else{
                findViewById<Button>(R.id.vos1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in vosId1) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
        }

        findViewById<Button>(R.id.vos2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.vos2).setOnClickListener{
            val color = getColor(findViewById(R.id.vos2))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.vos2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in vosId2) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(vosColor)))
                }
            }
            else{
                findViewById<Button>(R.id.vos2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in vosId2) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
        }

        findViewById<Button>(R.id.vos3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.vos3).setOnClickListener{
            val color = getColor(findViewById(R.id.vos3))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.vos3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in vosId3) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(vosColor)))
                }
            }
            else{
                findViewById<Button>(R.id.vos3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in vosId3) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
        }

        findViewById<Button>(R.id.vos4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(
            but0Color)))
        findViewById<Button>(R.id.vos4).setOnClickListener{
            val color = getColor(findViewById(R.id.vos4))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.vos4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in vosId4) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(vosColor)))
                }
            }
            else{
                findViewById<Button>(R.id.vos4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in vosId4) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
        }
    }

    private fun settingsForOtl(){
        for(el in otlId){
            changeColorButtonOtl(findViewById(el), but0Color, otlColor)
        }
        val otlId1 = intArrayOf(R.id.otl18_1,R.id.otl18_2,R.id.otl18_3,R.id.otl17_1,R.id.otl17_2,R.id.otl17_3,R.id.otl16_1,R.id.otl16_2,R.id.otl16_3,R.id.otl15_1,R.id.otl15_2,R.id.otl15_3,R.id.otl14_1,R.id.otl14_2,R.id.otl14_3,R.id.otl13_1,R.id.otl13_2,R.id.otl13_3,R.id.otl12_1,R.id.otl12_2,R.id.otl12_3,R.id.otl11_1,R.id.otl11_2,R.id.otl11_3,
            R.id.otl28_1,R.id.otl28_2,R.id.otl28_3,R.id.otl27_1,R.id.otl27_2,R.id.otl27_3,R.id.otl26_1,R.id.otl26_2,R.id.otl26_3,R.id.otl25_1,R.id.otl25_2,R.id.otl25_3,R.id.otl24_1,R.id.otl24_2,R.id.otl24_3,R.id.otl23_1,R.id.otl23_2,R.id.otl23_3,R.id.otl22_1,R.id.otl22_2,R.id.otl22_3,R.id.otl21_1,R.id.otl21_2,R.id.otl21_3)

        val otlId2 = intArrayOf(R.id.otl182_1,R.id.otl182_2,R.id.otl182_3,R.id.otl172_1,R.id.otl172_2,R.id.otl172_3,R.id.otl162_1,R.id.otl162_2,R.id.otl162_3,R.id.otl152_1,R.id.otl152_2,R.id.otl152_3,R.id.otl142_1,R.id.otl142_2,R.id.otl142_3,R.id.otl132_1,R.id.otl132_2,R.id.otl132_3,R.id.otl122_1,R.id.otl122_2,R.id.otl122_3,R.id.otl112_1,
            R.id.otl112_2,R.id.otl112_3,R.id.otl282_1,R.id.otl282_2,R.id.otl282_3,R.id.otl272_1,R.id.otl272_2,R.id.otl272_3,R.id.otl262_1,R.id.otl262_2,R.id.otl262_3,R.id.otl252_1,R.id.otl252_2,R.id.otl252_3,R.id.otl242_1,R.id.otl242_2,R.id.otl242_3,R.id.otl232_1,R.id.otl232_2,R.id.otl232_3,R.id.otl222_1,R.id.otl222_2,R.id.otl222_3,R.id.otl212_1,R.id.otl212_2,R.id.otl212_3)

        val otlId3 = intArrayOf(R.id.otl38_1,R.id.otl38_2,R.id.otl38_3,R.id.otl37_1,R.id.otl37_2,R.id.otl37_3,R.id.otl36_1,R.id.otl36_2,R.id.otl36_3,R.id.otl35_1,R.id.otl35_2,R.id.otl35_3,R.id.otl34_1,R.id.otl34_2,R.id.otl34_3,R.id.otl33_1,R.id.otl33_2,R.id.otl33_3,R.id.otl32_1,R.id.otl32_2,R.id.otl32_3,R.id.otl31_1,R.id.otl31_2,R.id.otl31_3,
            R.id.otl48_1,R.id.otl48_2,R.id.otl48_3,R.id.otl47_1,R.id.otl47_2,R.id.otl47_3,R.id.otl46_1,R.id.otl46_2,R.id.otl46_3,R.id.otl45_1,R.id.otl45_2,R.id.otl45_3,R.id.otl44_1,R.id.otl44_2,R.id.otl44_3,R.id.otl43_1,R.id.otl43_2,R.id.otl43_3,R.id.otl42_1,R.id.otl42_2,R.id.otl42_3,R.id.otl41_1,R.id.otl41_2,R.id.otl41_3)

        val otlId4 = intArrayOf(R.id.otl382_1,R.id.otl382_2,R.id.otl382_3,R.id.otl372_1,R.id.otl372_2,R.id.otl372_3,R.id.otl362_1,R.id.otl362_2,R.id.otl362_3,R.id.otl352_1,R.id.otl352_2,R.id.otl352_3,R.id.otl342_1,R.id.otl342_2,R.id.otl342_3,R.id.otl332_1,R.id.otl332_2,R.id.otl332_3,R.id.otl322_1,R.id.otl322_2,R.id.otl322_3,R.id.otl312_1,
            R.id.otl312_2,R.id.otl312_3,R.id.otl482_1,R.id.otl482_2,R.id.otl482_3,R.id.otl472_1,R.id.otl472_2,R.id.otl472_3,R.id.otl462_1,R.id.otl462_2,R.id.otl462_3,R.id.otl452_1,R.id.otl452_2,R.id.otl452_3,R.id.otl442_1,R.id.otl442_2,R.id.otl442_3,R.id.otl432_1,R.id.otl432_2,R.id.otl432_3,R.id.otl422_1,R.id.otl422_2,R.id.otl422_3,R.id.otl412_1,R.id.otl412_2,R.id.otl412_3)

        findViewById<Button>(R.id.otl1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.otl1).setOnClickListener{
            val color = getColor(findViewById(R.id.otl1))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.otl1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in otlId1) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(otlColor)))
                }
            }
            else{
                findViewById<Button>(R.id.otl1).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in otlId1) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            api()
            ohis()
        }

        findViewById<Button>(R.id.otl2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.otl2).setOnClickListener{
            val color = getColor(findViewById(R.id.otl2))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.otl2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in otlId2) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(otlColor)))
                }
            }
            else{
                findViewById<Button>(R.id.otl2).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in otlId2) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            api()
            ohis()
        }

        findViewById<Button>(R.id.otl3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
        findViewById<Button>(R.id.otl3).setOnClickListener{
            val color = getColor(findViewById(R.id.otl3))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.otl3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in otlId3) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(otlColor)))
                }
            }
            else{
                findViewById<Button>(R.id.otl3).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in otlId3) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            api()
            ohis()
        }

        findViewById<Button>(R.id.otl4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(
            but0Color)))
        findViewById<Button>(R.id.otl4).setOnClickListener{
            val color = getColor(findViewById(R.id.otl4))
            if (color == Color.parseColor(but0Color)) {
                findViewById<Button>(R.id.otl4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but1Color)))
                for (el in otlId4) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(otlColor)))
                }
            }
            else{
                findViewById<Button>(R.id.otl4).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                for (el in otlId4) {
                    findViewById<Button>(el).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                }
            }
            api()
            ohis()
        }
    }

    private fun settingsForFurk(){
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

        for (i in karsId.indices) {
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
                kpu()
            }
        }
    }

    private fun settingsForDesnZond(chart1: com.github.mikephil.charting.charts.LineChart,
                                chart2: com.github.mikephil.charting.charts.LineChart,
                                chart3: com.github.mikephil.charting.charts.LineChart,
                                chart4: com.github.mikephil.charting.charts.LineChart,
                                chart5: com.github.mikephil.charting.charts.LineChart,
                                chart6: com.github.mikephil.charting.charts.LineChart,
                                chart7: com.github.mikephil.charting.charts.LineChart,
                                chart8: com.github.mikephil.charting.charts.LineChart){

        fun DesnHelper(desnId: IntArray, zondId: IntArray, desnChart: MutableList<Entry>, zondChart: MutableList<Entry>, chart: com.github.mikephil.charting.charts.LineChart, sign: Int, max: Float, min: Float){
            for (i in desnId.indices){
                val zondEditText = findViewById<EditText>(zondId[i])
                val desnEditText = findViewById<EditText>(desnId[i])
                desnEditText.doAfterTextChanged{
                    var textZond = zondEditText.text.toString().trim()
                    var textDesn = desnEditText.text.toString().trim()
                    if (textDesn == ""){
                        textDesn = "0"
                    }
                    if (textZond==""){
                        textZond = "0"
                    }
                    if(textZond != "-" && textDesn != "-" && textZond != "+" && textDesn != "+"){
                        desnChart[i].y = textDesn.toFloat()*sign
                        zondChart[i].y = (textDesn.toFloat()-textZond.toFloat())*sign
                        generateChart(chart, zondChart, desnChart, max, min)
                    }
                    cpitn()
                    russel()
                }
            }
        }

        fun ZondHelper(desnId: IntArray, zondId: IntArray, desnChart: MutableList<Entry>, zondChart: MutableList<Entry>, chart: com.github.mikephil.charting.charts.LineChart, sign: Int, max: Float, min: Float){
            for (i in zondId.indices){
                val zondEditText = findViewById<EditText>(zondId[i])
                val desnEditText = findViewById<EditText>(desnId[i])
                zondEditText.doAfterTextChanged{
                    var textZond = zondEditText.text.toString().trim()
                    var textDesn = desnEditText.text.toString().trim()
                    if (textDesn == ""){
                        textDesn = "0"
                    }
                    if (textZond==""){
                        textZond = "0"
                    }
                    if(textZond != "-" && textDesn != "-" && textZond != "+" && textDesn != "+"){
                        zondChart[i].y = (textDesn.toFloat()-textZond.toFloat())*sign
                        generateChart(chart, zondChart, desnChart, max, min)
                    }
                    cpitn()
                    russel()
                }
            }
        }

        DesnHelper(desnId1, zondId1, desnChart1, zondChart1, chart1, -1,17f, -9f)
        DesnHelper(desnId2, zondId2, desnChart2, zondChart2, chart2, -1,17f, -9f)
        DesnHelper(desnId3, zondId3, desnChart3, zondChart3, chart3, 1,9f, -16f)
        DesnHelper(desnId4, zondId4, desnChart4, zondChart4, chart4, 1,9f, -16f)
        DesnHelper(desnId5, zondId5, desnChart5, zondChart5, chart5, -1,17f, -9f)
        DesnHelper(desnId6, zondId6, desnChart6, zondChart6, chart6, -1,17f, -9f)
        DesnHelper(desnId7, zondId7, desnChart7, zondChart7, chart7, 1,9f, -16f)
        DesnHelper(desnId8, zondId8, desnChart8, zondChart8, chart8, 1,9f, -16f)

        ZondHelper(desnId1, zondId1, desnChart1, zondChart1, chart1,-1, 17f, -9f)
        ZondHelper(desnId2, zondId2, desnChart2, zondChart2, chart2, -1,17f, -9f)
        ZondHelper(desnId3, zondId3, desnChart3, zondChart3, chart3, 1,9f, -16f)
        ZondHelper(desnId4, zondId4, desnChart4, zondChart4, chart4, 1,9f, -16f)
        ZondHelper(desnId5, zondId5, desnChart5, zondChart5, chart5, -1,17f, -9f)
        ZondHelper(desnId6, zondId6, desnChart6, zondChart6, chart6, -1,17f, -9f)
        ZondHelper(desnId7, zondId7, desnChart7, zondChart7, chart7, 1,9f, -16f)
        ZondHelper(desnId8, zondId8, desnChart8, zondChart8, chart8, 1,9f, -16f)
    }

    private fun generateChart(chart: com.github.mikephil.charting.charts.LineChart, zondChart: MutableList<Entry>, desnChart: MutableList<Entry>, max: Float, min: Float){
        val zondDataSet = LineDataSet(zondChart, "")
        val desnDataSet = LineDataSet(desnChart, "")
        zondDataSet.lineWidth = 2f
        desnDataSet.lineWidth = 2f
        zondDataSet.setDrawCircles(false)
        desnDataSet.setDrawCircles(false)
        desnDataSet.setColor(Color.parseColor("#da8c99"))
        zondDataSet.setColor(Color.BLUE)
        desnDataSet.setDrawValues(false)
        zondDataSet.setDrawValues(false)
        desnDataSet.setCircleColor(Color.parseColor("#da8c99"))
        zondDataSet.setCircleColor(Color.BLUE)

        val lineData = LineData(zondDataSet, desnDataSet)
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

    private fun settingsForExist(chart1: com.github.mikephil.charting.charts.LineChart,
                                 chart2: com.github.mikephil.charting.charts.LineChart,
                                 chart3: com.github.mikephil.charting.charts.LineChart,
                                 chart4: com.github.mikephil.charting.charts.LineChart,
                                 chart5: com.github.mikephil.charting.charts.LineChart,
                                 chart6: com.github.mikephil.charting.charts.LineChart,
                                 chart7: com.github.mikephil.charting.charts.LineChart,
                                 chart8: com.github.mikephil.charting.charts.LineChart){

        val kr2Id1 = intArrayOf(R.id.kr182_1,R.id.kr182_2,R.id.kr182_3,R.id.kr172_1,R.id.kr172_2,R.id.kr172_3,R.id.kr162_1,R.id.kr162_2,R.id.kr162_3,R.id.kr152_1,R.id.kr152_2,R.id.kr152_3,R.id.kr142_1,R.id.kr142_2,R.id.kr142_3,R.id.kr132_1,R.id.kr132_2,R.id.kr132_3,R.id.kr122_1,R.id.kr122_2,R.id.kr122_3,R.id.kr112_1,R.id.kr112_2,R.id.kr112_3)
        val krId1 = intArrayOf(R.id.kr18_1,R.id.kr18_2,R.id.kr18_3,R.id.kr17_1,R.id.kr17_2,R.id.kr17_3,R.id.kr16_1,R.id.kr16_2,R.id.kr16_3,R.id.kr15_1,R.id.kr15_2,R.id.kr15_3,R.id.kr14_1,R.id.kr14_2,R.id.kr14_3,R.id.kr13_1,R.id.kr13_2,R.id.kr13_3,R.id.kr12_1,R.id.kr12_2,R.id.kr12_3,R.id.kr11_1,R.id.kr11_2,R.id.kr11_3)
        val kr2Id2 = intArrayOf(R.id.kr282_1,R.id.kr282_2,R.id.kr282_3,R.id.kr272_1,R.id.kr272_2,R.id.kr272_3,R.id.kr262_1,R.id.kr262_2,R.id.kr262_3,R.id.kr252_1,R.id.kr252_2,R.id.kr252_3,R.id.kr242_1,R.id.kr242_2,R.id.kr242_3,R.id.kr232_1,R.id.kr232_2,R.id.kr232_3,R.id.kr222_1,R.id.kr222_2,R.id.kr222_3,R.id.kr212_1,R.id.kr212_2,R.id.kr212_3)
        val krId2 = intArrayOf(R.id.kr28_1,R.id.kr28_2,R.id.kr28_3,R.id.kr27_1,R.id.kr27_2,R.id.kr27_3,R.id.kr26_1,R.id.kr26_2,R.id.kr26_3,R.id.kr25_1,R.id.kr25_2,R.id.kr25_3,R.id.kr24_1,R.id.kr24_2,R.id.kr24_3,R.id.kr23_1,R.id.kr23_2,R.id.kr23_3,R.id.kr22_1,R.id.kr22_2,R.id.kr22_3,R.id.kr21_1,R.id.kr21_2,R.id.kr21_3)
        val kr2Id3 = intArrayOf(R.id.kr382_1,R.id.kr382_2,R.id.kr382_3,R.id.kr372_1,R.id.kr372_2,R.id.kr372_3,R.id.kr362_1,R.id.kr362_2,R.id.kr362_3,R.id.kr352_1,R.id.kr352_2,R.id.kr352_3,R.id.kr342_1,R.id.kr342_2,R.id.kr342_3,R.id.kr332_1,R.id.kr332_2,R.id.kr332_3,R.id.kr322_1,R.id.kr322_2,R.id.kr322_3,R.id.kr312_1,R.id.kr312_2,R.id.kr312_3)
        val krId3 = intArrayOf(R.id.kr38_1,R.id.kr38_2,R.id.kr38_3,R.id.kr37_1,R.id.kr37_2,R.id.kr37_3,R.id.kr36_1,R.id.kr36_2,R.id.kr36_3,R.id.kr35_1,R.id.kr35_2,R.id.kr35_3,R.id.kr34_1,R.id.kr34_2,R.id.kr34_3,R.id.kr33_1,R.id.kr33_2,R.id.kr33_3,R.id.kr32_1,R.id.kr32_2,R.id.kr32_3,R.id.kr31_1,R.id.kr31_2,R.id.kr31_3)
        val kr2Id4 = intArrayOf(R.id.kr482_1,R.id.kr482_2,R.id.kr482_3,R.id.kr472_1,R.id.kr472_2,R.id.kr472_3,R.id.kr462_1,R.id.kr462_2,R.id.kr462_3,R.id.kr452_1,R.id.kr452_2,R.id.kr452_3,R.id.kr442_1,R.id.kr442_2,R.id.kr442_3,R.id.kr432_1,R.id.kr432_2,R.id.kr432_3,R.id.kr422_1,R.id.kr422_2,R.id.kr422_3,R.id.kr412_1,R.id.kr412_2,R.id.kr412_3)
        val krId4 = intArrayOf(R.id.kr48_1,R.id.kr48_2,R.id.kr48_3,R.id.kr47_1,R.id.kr47_2,R.id.kr47_3,R.id.kr46_1,R.id.kr46_2,R.id.kr46_3,R.id.kr45_1,R.id.kr45_2,R.id.kr45_3,R.id.kr44_1,R.id.kr44_2,R.id.kr44_3,R.id.kr43_1,R.id.kr43_2,R.id.kr43_3,R.id.kr42_1,R.id.kr42_2,R.id.kr42_3,R.id.kr41_1,R.id.kr41_2,R.id.kr41_3)

        val otl2Id1 = intArrayOf(R.id.otl182_1,R.id.otl182_2,R.id.otl182_3,R.id.otl172_1,R.id.otl172_2,R.id.otl172_3,R.id.otl162_1,R.id.otl162_2,R.id.otl162_3,R.id.otl152_1,R.id.otl152_2,R.id.otl152_3,R.id.otl142_1,R.id.otl142_2,R.id.otl142_3,R.id.otl132_1,R.id.otl132_2,R.id.otl132_3,R.id.otl122_1,R.id.otl122_2,R.id.otl122_3,R.id.otl112_1,R.id.otl112_2,R.id.otl112_3)
        val otlId1 = intArrayOf(R.id.otl18_1,R.id.otl18_2,R.id.otl18_3,R.id.otl17_1,R.id.otl17_2,R.id.otl17_3,R.id.otl16_1,R.id.otl16_2,R.id.otl16_3,R.id.otl15_1,R.id.otl15_2,R.id.otl15_3,R.id.otl14_1,R.id.otl14_2,R.id.otl14_3,R.id.otl13_1,R.id.otl13_2,R.id.otl13_3,R.id.otl12_1,R.id.otl12_2,R.id.otl12_3,R.id.otl11_1,R.id.otl11_2,R.id.otl11_3)
        val otl2Id2 = intArrayOf(R.id.otl282_1,R.id.otl282_2,R.id.otl282_3,R.id.otl272_1,R.id.otl272_2,R.id.otl272_3,R.id.otl262_1,R.id.otl262_2,R.id.otl262_3,R.id.otl252_1,R.id.otl252_2,R.id.otl252_3,R.id.otl242_1,R.id.otl242_2,R.id.otl242_3,R.id.otl232_1,R.id.otl232_2,R.id.otl232_3,R.id.otl222_1,R.id.otl222_2,R.id.otl222_3,R.id.otl212_1,R.id.otl212_2,R.id.otl212_3)
        val otlId2 = intArrayOf(R.id.otl28_1,R.id.otl28_2,R.id.otl28_3,R.id.otl27_1,R.id.otl27_2,R.id.otl27_3,R.id.otl26_1,R.id.otl26_2,R.id.otl26_3,R.id.otl25_1,R.id.otl25_2,R.id.otl25_3,R.id.otl24_1,R.id.otl24_2,R.id.otl24_3,R.id.otl23_1,R.id.otl23_2,R.id.otl23_3,R.id.otl22_1,R.id.otl22_2,R.id.otl22_3,R.id.otl21_1,R.id.otl21_2,R.id.otl21_3)
        val otl2Id3 = intArrayOf(R.id.otl382_1,R.id.otl382_2,R.id.otl382_3,R.id.otl372_1,R.id.otl372_2,R.id.otl372_3,R.id.otl362_1,R.id.otl362_2,R.id.otl362_3,R.id.otl352_1,R.id.otl352_2,R.id.otl352_3,R.id.otl342_1,R.id.otl342_2,R.id.otl342_3,R.id.otl332_1,R.id.otl332_2,R.id.otl332_3,R.id.otl322_1,R.id.otl322_2,R.id.otl322_3,R.id.otl312_1,R.id.otl312_2,R.id.otl312_3)
        val otlId3 = intArrayOf(R.id.otl38_1,R.id.otl38_2,R.id.otl38_3,R.id.otl37_1,R.id.otl37_2,R.id.otl37_3,R.id.otl36_1,R.id.otl36_2,R.id.otl36_3,R.id.otl35_1,R.id.otl35_2,R.id.otl35_3,R.id.otl34_1,R.id.otl34_2,R.id.otl34_3,R.id.otl33_1,R.id.otl33_2,R.id.otl33_3,R.id.otl32_1,R.id.otl32_2,R.id.otl32_3,R.id.otl31_1,R.id.otl31_2,R.id.otl31_3)
        val otl2Id4 = intArrayOf(R.id.otl482_1,R.id.otl482_2,R.id.otl482_3,R.id.otl472_1,R.id.otl472_2,R.id.otl472_3,R.id.otl462_1,R.id.otl462_2,R.id.otl462_3,R.id.otl452_1,R.id.otl452_2,R.id.otl452_3,R.id.otl442_1,R.id.otl442_2,R.id.otl442_3,R.id.otl432_1,R.id.otl432_2,R.id.otl432_3,R.id.otl422_1,R.id.otl422_2,R.id.otl422_3,R.id.otl412_1,R.id.otl412_2,R.id.otl412_3)
        val otlId4 = intArrayOf(R.id.otl48_1,R.id.otl48_2,R.id.otl48_3,R.id.otl47_1,R.id.otl47_2,R.id.otl47_3,R.id.otl46_1,R.id.otl46_2,R.id.otl46_3,R.id.otl45_1,R.id.otl45_2,R.id.otl45_3,R.id.otl44_1,R.id.otl44_2,R.id.otl44_3,R.id.otl43_1,R.id.otl43_2,R.id.otl43_3,R.id.otl42_1,R.id.otl42_2,R.id.otl42_3,R.id.otl41_1,R.id.otl41_2,R.id.otl41_3)

        val vos2Id1 = intArrayOf(R.id.vos182_1,R.id.vos182_2,R.id.vos182_3,R.id.vos172_1,R.id.vos172_2,R.id.vos172_3,R.id.vos162_1,R.id.vos162_2,R.id.vos162_3,R.id.vos152_1,R.id.vos152_2,R.id.vos152_3,R.id.vos142_1,R.id.vos142_2,R.id.vos142_3,R.id.vos132_1,R.id.vos132_2,R.id.vos132_3,R.id.vos122_1,R.id.vos122_2,R.id.vos122_3,R.id.vos112_1,R.id.vos112_2,R.id.vos112_3)
        val vosId1 = intArrayOf(R.id.vos18_1,R.id.vos18_2,R.id.vos18_3,R.id.vos17_1,R.id.vos17_2,R.id.vos17_3,R.id.vos16_1,R.id.vos16_2,R.id.vos16_3,R.id.vos15_1,R.id.vos15_2,R.id.vos15_3,R.id.vos14_1,R.id.vos14_2,R.id.vos14_3,R.id.vos13_1,R.id.vos13_2,R.id.vos13_3,R.id.vos12_1,R.id.vos12_2,R.id.vos12_3,R.id.vos11_1,R.id.vos11_2,R.id.vos11_3)
        val vos2Id2 = intArrayOf(R.id.vos282_1,R.id.vos282_2,R.id.vos282_3,R.id.vos272_1,R.id.vos272_2,R.id.vos272_3,R.id.vos262_1,R.id.vos262_2,R.id.vos262_3,R.id.vos252_1,R.id.vos252_2,R.id.vos252_3,R.id.vos242_1,R.id.vos242_2,R.id.vos242_3,R.id.vos232_1,R.id.vos232_2,R.id.vos232_3,R.id.vos222_1,R.id.vos222_2,R.id.vos222_3,R.id.vos212_1,R.id.vos212_2,R.id.vos212_3)
        val vosId2 = intArrayOf(R.id.vos28_1,R.id.vos28_2,R.id.vos28_3,R.id.vos27_1,R.id.vos27_2,R.id.vos27_3,R.id.vos26_1,R.id.vos26_2,R.id.vos26_3,R.id.vos25_1,R.id.vos25_2,R.id.vos25_3,R.id.vos24_1,R.id.vos24_2,R.id.vos24_3,R.id.vos23_1,R.id.vos23_2,R.id.vos23_3,R.id.vos22_1,R.id.vos22_2,R.id.vos22_3,R.id.vos21_1,R.id.vos21_2,R.id.vos21_3)
        val vos2Id3 = intArrayOf(R.id.vos382_1,R.id.vos382_2,R.id.vos382_3,R.id.vos372_1,R.id.vos372_2,R.id.vos372_3,R.id.vos362_1,R.id.vos362_2,R.id.vos362_3,R.id.vos352_1,R.id.vos352_2,R.id.vos352_3,R.id.vos342_1,R.id.vos342_2,R.id.vos342_3,R.id.vos332_1,R.id.vos332_2,R.id.vos332_3,R.id.vos322_1,R.id.vos322_2,R.id.vos322_3,R.id.vos312_1,R.id.vos312_2,R.id.vos312_3)
        val vosId3 = intArrayOf(R.id.vos38_1,R.id.vos38_2,R.id.vos38_3,R.id.vos37_1,R.id.vos37_2,R.id.vos37_3,R.id.vos36_1,R.id.vos36_2,R.id.vos36_3,R.id.vos35_1,R.id.vos35_2,R.id.vos35_3,R.id.vos34_1,R.id.vos34_2,R.id.vos34_3,R.id.vos33_1,R.id.vos33_2,R.id.vos33_3,R.id.vos32_1,R.id.vos32_2,R.id.vos32_3,R.id.vos31_1,R.id.vos31_2,R.id.vos31_3)
        val vos2Id4 = intArrayOf(R.id.vos482_1,R.id.vos482_2,R.id.vos482_3,R.id.vos472_1,R.id.vos472_2,R.id.vos472_3,R.id.vos462_1,R.id.vos462_2,R.id.vos462_3,R.id.vos452_1,R.id.vos452_2,R.id.vos452_3,R.id.vos442_1,R.id.vos442_2,R.id.vos442_3,R.id.vos432_1,R.id.vos432_2,R.id.vos432_3,R.id.vos422_1,R.id.vos422_2,R.id.vos422_3,R.id.vos412_1,R.id.vos412_2,R.id.vos412_3)
        val vosId4 = intArrayOf(R.id.vos48_1,R.id.vos48_2,R.id.vos48_3,R.id.vos47_1,R.id.vos47_2,R.id.vos47_3,R.id.vos46_1,R.id.vos46_2,R.id.vos46_3,R.id.vos45_1,R.id.vos45_2,R.id.vos45_3,R.id.vos44_1,R.id.vos44_2,R.id.vos44_3,R.id.vos43_1,R.id.vos43_2,R.id.vos43_3,R.id.vos42_1,R.id.vos42_2,R.id.vos42_3,R.id.vos41_1,R.id.vos41_2,R.id.vos41_3)

        val kam2Id1 = intArrayOf(R.id.kam182_1,R.id.kam182_2,R.id.kam182_3,R.id.kam172_1,R.id.kam172_2,R.id.kam172_3,R.id.kam162_1,R.id.kam162_2,R.id.kam162_3,R.id.kam152_1,R.id.kam152_2,R.id.kam152_3,R.id.kam142_1,R.id.kam142_2,R.id.kam142_3,R.id.kam132_1,R.id.kam132_2,R.id.kam132_3,R.id.kam122_1,R.id.kam122_2,R.id.kam122_3,R.id.kam112_1,R.id.kam112_2,R.id.kam112_3)
        val kamId1 = intArrayOf(R.id.kam18_1,R.id.kam18_2,R.id.kam18_3,R.id.kam17_1,R.id.kam17_2,R.id.kam17_3,R.id.kam16_1,R.id.kam16_2,R.id.kam16_3,R.id.kam15_1,R.id.kam15_2,R.id.kam15_3,R.id.kam14_1,R.id.kam14_2,R.id.kam14_3,R.id.kam13_1,R.id.kam13_2,R.id.kam13_3,R.id.kam12_1,R.id.kam12_2,R.id.kam12_3,R.id.kam11_1,R.id.kam11_2,R.id.kam11_3)
        val kam2Id2 = intArrayOf(R.id.kam282_1,R.id.kam282_2,R.id.kam282_3,R.id.kam272_1,R.id.kam272_2,R.id.kam272_3,R.id.kam262_1,R.id.kam262_2,R.id.kam262_3,R.id.kam252_1,R.id.kam252_2,R.id.kam252_3,R.id.kam242_1,R.id.kam242_2,R.id.kam242_3,R.id.kam232_1,R.id.kam232_2,R.id.kam232_3,R.id.kam222_1,R.id.kam222_2,R.id.kam222_3,R.id.kam212_1,R.id.kam212_2,R.id.kam212_3)
        val kamId2 = intArrayOf(R.id.kam28_1,R.id.kam28_2,R.id.kam28_3,R.id.kam27_1,R.id.kam27_2,R.id.kam27_3,R.id.kam26_1,R.id.kam26_2,R.id.kam26_3,R.id.kam25_1,R.id.kam25_2,R.id.kam25_3,R.id.kam24_1,R.id.kam24_2,R.id.kam24_3,R.id.kam23_1,R.id.kam23_2,R.id.kam23_3,R.id.kam22_1,R.id.kam22_2,R.id.kam22_3,R.id.kam21_1,R.id.kam21_2,R.id.kam21_3)
        val kam2Id3 = intArrayOf(R.id.kam382_1,R.id.kam382_2,R.id.kam382_3,R.id.kam372_1,R.id.kam372_2,R.id.kam372_3,R.id.kam362_1,R.id.kam362_2,R.id.kam362_3,R.id.kam352_1,R.id.kam352_2,R.id.kam352_3,R.id.kam342_1,R.id.kam342_2,R.id.kam342_3,R.id.kam332_1,R.id.kam332_2,R.id.kam332_3,R.id.kam322_1,R.id.kam322_2,R.id.kam322_3,R.id.kam312_1,R.id.kam312_2,R.id.kam312_3)
        val kamId3 = intArrayOf(R.id.kam38_1,R.id.kam38_2,R.id.kam38_3,R.id.kam37_1,R.id.kam37_2,R.id.kam37_3,R.id.kam36_1,R.id.kam36_2,R.id.kam36_3,R.id.kam35_1,R.id.kam35_2,R.id.kam35_3,R.id.kam34_1,R.id.kam34_2,R.id.kam34_3,R.id.kam33_1,R.id.kam33_2,R.id.kam33_3,R.id.kam32_1,R.id.kam32_2,R.id.kam32_3,R.id.kam31_1,R.id.kam31_2,R.id.kam31_3)
        val kam2Id4 = intArrayOf(R.id.kam482_1,R.id.kam482_2,R.id.kam482_3,R.id.kam472_1,R.id.kam472_2,R.id.kam472_3,R.id.kam462_1,R.id.kam462_2,R.id.kam462_3,R.id.kam452_1,R.id.kam452_2,R.id.kam452_3,R.id.kam442_1,R.id.kam442_2,R.id.kam442_3,R.id.kam432_1,R.id.kam432_2,R.id.kam432_3,R.id.kam422_1,R.id.kam422_2,R.id.kam422_3,R.id.kam412_1,R.id.kam412_2,R.id.kam412_3)
        val kamId4 = intArrayOf(R.id.kam48_1,R.id.kam48_2,R.id.kam48_3,R.id.kam47_1,R.id.kam47_2,R.id.kam47_3,R.id.kam46_1,R.id.kam46_2,R.id.kam46_3,R.id.kam45_1,R.id.kam45_2,R.id.kam45_3,R.id.kam44_1,R.id.kam44_2,R.id.kam44_3,R.id.kam43_1,R.id.kam43_2,R.id.kam43_3,R.id.kam42_1,R.id.kam42_2,R.id.kam42_3,R.id.kam41_1,R.id.kam41_2,R.id.kam41_3)


        for (i in existsId1.indices){
            val existBut = findViewById<Button>(existsId1[i])
            existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
            existBut.setOnClickListener{
                val colorStateList = existBut.backgroundTintList
                val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)

                if (defaultColor == Color.parseColor(but0Color)) {
                    existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(implantColor)))
                    for (j in i*3..i*3+2){
                        zondChart1[j].y = 0f
                        desnChart1[j].y = 0f
                        findViewById<EditText>(desnId1[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(zondId1[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(desnId1[j]).setText("")
                        findViewById<EditText>(zondId1[j]).setText("")

                        zondChart3[j].y = 0f
                        desnChart3[j].y = 0f
                        findViewById<EditText>(desnId3[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(zondId3[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(desnId3[j]).setText("")
                        findViewById<EditText>(zondId3[j]).setText("")
                    }
                    generateChart(chart1, zondChart1, desnChart1, 17f, -9f)
                    generateChart(chart3, zondChart3, desnChart3,9f, -16f)

                    findViewById<Button>(implantsId1[i]).visibility = View.INVISIBLE
                    findViewById<Button>(implantsId1[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<EditText>(podvsId1[i]).visibility = View.INVISIBLE
                    if(i <= 2){
                        findViewById<ImageButton>(furksId1[i]).tag = R.drawable.null17
                        findViewById<ImageView>(furksImgId1[i]).tag = R.drawable.null17
                        findViewById<ImageButton>(furks2Id1[i*2]).tag = R.drawable.null17
                        findViewById<ImageView>(furks2ImgId1[i*2]).tag = R.drawable.null17
                        findViewById<ImageButton>(furks2Id1[i*2+1]).tag = R.drawable.null17
                        findViewById<ImageView>(furks2ImgId1[i*2+1]).tag = R.drawable.null17
                        findViewById<ImageButton>(furksId1[i]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furksImgId1[i]).visibility = View.INVISIBLE
                        findViewById<ImageButton>(furks2Id1[i*2]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furks2ImgId1[i*2]).visibility = View.INVISIBLE
                        findViewById<ImageButton>(furks2Id1[i*2+1]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furks2ImgId1[i*2+1]).visibility = View.INVISIBLE
                    }
                    if (i == 4){
                        findViewById<ImageButton>(furks2Id1[6]).tag = R.drawable.null17
                        findViewById<ImageView>(furks2ImgId1[6]).tag = R.drawable.null17
                        findViewById<ImageButton>(furks2Id1[7]).tag = R.drawable.null17
                        findViewById<ImageView>(furks2ImgId1[7]).tag = R.drawable.null17
                        findViewById<ImageButton>(furks2Id1[6]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furks2ImgId1[6]).visibility = View.INVISIBLE
                        findViewById<ImageButton>(furks2Id1[7]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furks2ImgId1[7]).visibility = View.INVISIBLE
                    }
                    findViewById<Button>(pupesId1[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<Button>(pupesId1[i]).visibility = View.INVISIBLE

                    findViewById<ImageView>(tsId1[i]).setImageResource(tsDrawable1[i])
                    findViewById<ImageView>(t2sId1[i]).setImageResource(t2sDrawable1[i])
                    findViewById<ImageView>(tsId1[i]).visibility = View.INVISIBLE
                    findViewById<ImageView>(t2sId1[i]).visibility = View.INVISIBLE

                    findViewById<Button>(plombsId1[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<Button>(plombsId1[i]).visibility = View.INVISIBLE
                    for (j in i*6..i*6+5){
                        findViewById<Button>(karsId1[j]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(karsId1[j]).visibility = View.INVISIBLE
                        findViewById<Button>(kars2Id1[j]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kars2Id1[j]).visibility = View.INVISIBLE
                        findViewById<ImageView>(karsIdImg1[j]).visibility = View.GONE
                        findViewById<ImageView>(kars2IdImg1[j]).visibility = View.GONE
                    }
                    for (k in i*3..i*3+2){
                        findViewById<Button>(krId1[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(krId1[k]).visibility = View.INVISIBLE
                        findViewById<Button>(kr2Id1[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kr2Id1[k]).visibility = View.INVISIBLE

                        findViewById<Button>(otlId1[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(otlId1[k]).visibility = View.INVISIBLE
                        findViewById<Button>(otl2Id1[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(otl2Id1[k]).visibility = View.INVISIBLE

                        findViewById<Button>(kamId1[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kamId1[k]).visibility = View.INVISIBLE
                        findViewById<Button>(kam2Id1[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kam2Id1[k]).visibility = View.INVISIBLE

                        findViewById<Button>(vosId1[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(vosId1[k]).visibility = View.INVISIBLE
                        findViewById<Button>(vos2Id1[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(vos2Id1[k]).visibility = View.INVISIBLE
                    }
                }
                else{
                    existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    for (j in i*3..i*3+2){
                        findViewById<EditText>(desnId1[j]).visibility = View.VISIBLE
                        findViewById<EditText>(zondId1[j]).visibility = View.VISIBLE
                        findViewById<EditText>(desnId3[j]).visibility = View.VISIBLE
                        findViewById<EditText>(zondId3[j]).visibility = View.VISIBLE
                    }

                    findViewById<Button>(implantsId1[i]).visibility = View.VISIBLE
                    findViewById<EditText>(podvsId1[i]).visibility = View.VISIBLE
                    if(i <= 2){
                        findViewById<ImageButton>(furksId1[i]).visibility = View.VISIBLE
                        findViewById<ImageView>(furksImgId1[i]).visibility = View.VISIBLE
                        findViewById<ImageButton>(furks2Id1[i*2]).visibility = View.VISIBLE
                        findViewById<ImageView>(furks2ImgId1[i*2]).visibility = View.VISIBLE
                        findViewById<ImageButton>(furks2Id1[i*2+1]).visibility = View.VISIBLE
                        findViewById<ImageView>(furks2ImgId1[i*2+1]).visibility = View.VISIBLE
                    }
                    if (i == 4){
                        findViewById<ImageButton>(furks2Id1[6]).visibility = View.VISIBLE
                        findViewById<ImageView>(furks2ImgId1[6]).visibility = View.VISIBLE
                        findViewById<ImageButton>(furks2Id1[7]).visibility = View.VISIBLE
                        findViewById<ImageView>(furks2ImgId1[7]).visibility = View.VISIBLE
                    }
                    findViewById<Button>(pupesId1[i]).visibility = View.VISIBLE

                    findViewById<ImageView>(tsId1[i]).visibility = View.VISIBLE
                    findViewById<ImageView>(t2sId1[i]).visibility = View.VISIBLE

                    findViewById<Button>(plombsId1[i]).visibility = View.VISIBLE
                    for (j in i*6..i*6+5){
                        findViewById<Button>(karsId1[j]).visibility = View.VISIBLE
                        findViewById<Button>(kars2Id1[j]).visibility = View.VISIBLE
                    }
                    for (k in i*3..i*3+2){
                        findViewById<Button>(krId1[k]).visibility = View.VISIBLE
                        findViewById<Button>(kr2Id1[k]).visibility = View.VISIBLE

                        findViewById<Button>(otlId1[k]).visibility = View.VISIBLE
                        findViewById<Button>(otl2Id1[k]).visibility = View.VISIBLE

                        findViewById<Button>(kamId1[k]).visibility = View.VISIBLE
                        findViewById<Button>(kam2Id1[k]).visibility = View.VISIBLE

                        findViewById<Button>(vosId1[k]).visibility = View.VISIBLE
                        findViewById<Button>(vos2Id1[k]).visibility = View.VISIBLE
                    }
                }
                kpu()
                bop()
                api()
                cpitn()
                russel()
                ohis()
            }
        }

        for (i in existsId2.indices){
            val existBut = findViewById<Button>(existsId2[i])
            existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
            existBut.setOnClickListener{
                val colorStateList = existBut.backgroundTintList
                val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)

                if (defaultColor == Color.parseColor(but0Color)) {
                    existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(implantColor)))
                    for (j in (7-i)*3..(7-i)*3+2){
                        zondChart2[j].y = 0f
                        desnChart2[j].y = 0f
                        findViewById<EditText>(desnId2[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(zondId2[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(desnId2[j]).setText("")
                        findViewById<EditText>(zondId2[j]).setText("")

                        zondChart4[j].y = 0f
                        desnChart4[j].y = 0f
                        findViewById<EditText>(desnId4[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(zondId4[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(desnId4[j]).setText("")
                        findViewById<EditText>(zondId4[j]).setText("")
                    }
                    generateChart(chart2, zondChart2, desnChart2, 17f, -9f)
                    generateChart(chart4, zondChart4, desnChart4,9f, -16f)

                    findViewById<Button>(implantsId2[i]).visibility = View.INVISIBLE
                    findViewById<Button>(implantsId2[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<EditText>(podvsId2[i]).visibility = View.INVISIBLE
                    if(i <= 2){
                        findViewById<ImageButton>(furksId2[i]).tag = R.drawable.null17
                        findViewById<ImageView>(furksImgId2[i]).tag = R.drawable.null17
                        findViewById<ImageButton>(furks2Id2[i*2]).tag = R.drawable.null17
                        findViewById<ImageView>(furks2ImgId2[i*2]).tag = R.drawable.null17
                        findViewById<ImageButton>(furks2Id2[i*2+1]).tag = R.drawable.null17
                        findViewById<ImageView>(furks2ImgId2[i*2+1]).tag = R.drawable.null17
                        findViewById<ImageButton>(furksId2[i]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furksImgId2[i]).visibility = View.INVISIBLE
                        findViewById<ImageButton>(furks2Id2[i*2]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furks2ImgId2[i*2]).visibility = View.INVISIBLE
                        findViewById<ImageButton>(furks2Id2[i*2+1]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furks2ImgId2[i*2+1]).visibility = View.INVISIBLE
                    }
                    if (i == 4){
                        findViewById<ImageButton>(furks2Id2[6]).tag = R.drawable.null17
                        findViewById<ImageView>(furks2ImgId2[6]).tag = R.drawable.null17
                        findViewById<ImageButton>(furks2Id2[7]).tag = R.drawable.null17
                        findViewById<ImageView>(furks2ImgId2[7]).tag = R.drawable.null17
                        findViewById<ImageButton>(furks2Id2[6]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furks2ImgId2[6]).visibility = View.INVISIBLE
                        findViewById<ImageButton>(furks2Id2[7]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furks2ImgId2[7]).visibility = View.INVISIBLE
                    }
                    findViewById<Button>(pupesId2[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<Button>(pupesId2[i]).visibility = View.INVISIBLE

                    findViewById<ImageView>(tsId2[i]).setImageResource(tsDrawable2[i])
                    findViewById<ImageView>(t2sId2[i]).setImageResource(t2sDrawable2[i])
                    findViewById<ImageView>(tsId2[i]).visibility = View.INVISIBLE
                    findViewById<ImageView>(t2sId2[i]).visibility = View.INVISIBLE

                    findViewById<Button>(plombsId2[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<Button>(plombsId2[i]).visibility = View.INVISIBLE
                    for (j in i*6..i*6+5){
                        findViewById<Button>(karsId2[j]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(karsId2[j]).visibility = View.INVISIBLE
                        findViewById<Button>(kars2Id2[j]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kars2Id2[j]).visibility = View.INVISIBLE
                        findViewById<ImageView>(karsIdImg2[j]).visibility = View.GONE
                        findViewById<ImageView>(kars2IdImg2[j]).visibility = View.GONE
                    }
                    for (k in i*3..i*3+2){
                        findViewById<Button>(krId2[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(krId2[k]).visibility = View.INVISIBLE
                        findViewById<Button>(kr2Id2[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kr2Id2[k]).visibility = View.INVISIBLE

                        findViewById<Button>(otlId2[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(otlId2[k]).visibility = View.INVISIBLE
                        findViewById<Button>(otl2Id2[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(otl2Id2[k]).visibility = View.INVISIBLE

                        findViewById<Button>(kamId2[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kamId2[k]).visibility = View.INVISIBLE
                        findViewById<Button>(kam2Id2[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kam2Id2[k]).visibility = View.INVISIBLE

                        findViewById<Button>(vosId2[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(vosId2[k]).visibility = View.INVISIBLE
                        findViewById<Button>(vos2Id2[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(vos2Id2[k]).visibility = View.INVISIBLE
                    }
                }
                else{
                    existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    for (j in (7-i)*3..(7-i)*3+2){
                        findViewById<EditText>(desnId2[j]).visibility = View.VISIBLE
                        findViewById<EditText>(zondId2[j]).visibility = View.VISIBLE
                        findViewById<EditText>(desnId4[j]).visibility = View.VISIBLE
                        findViewById<EditText>(zondId4[j]).visibility = View.VISIBLE
                    }

                    findViewById<Button>(implantsId2[i]).visibility = View.VISIBLE
                    findViewById<EditText>(podvsId2[i]).visibility = View.VISIBLE
                    if(i <= 2){
                        findViewById<ImageButton>(furksId2[i]).visibility = View.VISIBLE
                        findViewById<ImageView>(furksImgId2[i]).visibility = View.VISIBLE
                        findViewById<ImageButton>(furks2Id2[i*2]).visibility = View.VISIBLE
                        findViewById<ImageView>(furks2ImgId2[i*2]).visibility = View.VISIBLE
                        findViewById<ImageButton>(furks2Id2[i*2+1]).visibility = View.VISIBLE
                        findViewById<ImageView>(furks2ImgId2[i*2+1]).visibility = View.VISIBLE
                    }
                    if (i == 4){
                        findViewById<ImageButton>(furks2Id2[6]).visibility = View.VISIBLE
                        findViewById<ImageView>(furks2ImgId2[6]).visibility = View.VISIBLE
                        findViewById<ImageButton>(furks2Id2[7]).visibility = View.VISIBLE
                        findViewById<ImageView>(furks2ImgId2[7]).visibility = View.VISIBLE
                    }
                    findViewById<Button>(pupesId2[i]).visibility = View.VISIBLE

                    findViewById<ImageView>(tsId2[i]).visibility = View.VISIBLE
                    findViewById<ImageView>(t2sId2[i]).visibility = View.VISIBLE

                    findViewById<Button>(plombsId2[i]).visibility = View.VISIBLE
                    for (j in i*6..i*6+5){
                        findViewById<Button>(karsId2[j]).visibility = View.VISIBLE
                        findViewById<Button>(kars2Id2[j]).visibility = View.VISIBLE
                    }
                    for (k in i*3..i*3+2){
                        findViewById<Button>(krId2[k]).visibility = View.VISIBLE
                        findViewById<Button>(kr2Id2[k]).visibility = View.VISIBLE

                        findViewById<Button>(otlId2[k]).visibility = View.VISIBLE
                        findViewById<Button>(otl2Id2[k]).visibility = View.VISIBLE

                        findViewById<Button>(kamId2[k]).visibility = View.VISIBLE
                        findViewById<Button>(kam2Id2[k]).visibility = View.VISIBLE

                        findViewById<Button>(vosId2[k]).visibility = View.VISIBLE
                        findViewById<Button>(vos2Id2[k]).visibility = View.VISIBLE
                    }
                }
                kpu()
                bop()
                api()
                cpitn()
                russel()
                ohis()
            }
        }

        for (i in existsId3.indices){
            val existBut = findViewById<Button>(existsId3[i])
            existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
            existBut.setOnClickListener{
                val colorStateList = existBut.backgroundTintList
                val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)

                if (defaultColor == Color.parseColor(but0Color)) {
                    existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(implantColor)))
                    for (j in (7-i)*3..(7-i)*3+2){
                        zondChart6[j].y = 0f
                        desnChart6[j].y = 0f
                        findViewById<EditText>(desnId6[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(zondId6[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(desnId6[j]).setText("")
                        findViewById<EditText>(zondId6[j]).setText("")

                        zondChart8[j].y = 0f
                        desnChart8[j].y = 0f
                        findViewById<EditText>(desnId8[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(zondId8[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(desnId8[j]).setText("")
                        findViewById<EditText>(zondId8[j]).setText("")
                    }
                    generateChart(chart6, zondChart6, desnChart6, 17f, -9f)
                    generateChart(chart8, zondChart8, desnChart8,9f, -16f)

                    findViewById<Button>(implantsId3[i]).visibility = View.INVISIBLE
                    findViewById<Button>(implantsId3[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<EditText>(podvsId3[i]).visibility = View.INVISIBLE
                    if(i <= 2){
                        findViewById<ImageButton>(furksId3[i]).tag = R.drawable.null17
                        findViewById<ImageView>(furksImgId3[i]).tag = R.drawable.null17
                        findViewById<ImageButton>(furks2Id3[i]).tag = R.drawable.null17
                        findViewById<ImageView>(furks2ImgId3[i]).tag = R.drawable.null17
                        findViewById<ImageButton>(furksId3[i]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furksImgId3[i]).visibility = View.INVISIBLE
                        findViewById<ImageButton>(furks2Id3[i]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furks2ImgId3[i]).visibility = View.INVISIBLE
                    }
                    findViewById<Button>(pupesId3[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<Button>(pupesId3[i]).visibility = View.INVISIBLE

                    findViewById<ImageView>(tsId3[i]).setImageResource(tsDrawable3[i])
                    findViewById<ImageView>(t2sId3[i]).setImageResource(t2sDrawable3[i])
                    findViewById<ImageView>(tsId3[i]).visibility = View.INVISIBLE
                    findViewById<ImageView>(t2sId3[i]).visibility = View.INVISIBLE

                    findViewById<Button>(plombsId3[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<Button>(plombsId3[i]).visibility = View.INVISIBLE
                    for (j in i*6..i*6+5){
                        findViewById<Button>(karsId3[j]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(karsId3[j]).visibility = View.INVISIBLE
                        findViewById<Button>(kars2Id3[j]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kars2Id3[j]).visibility = View.INVISIBLE
                        findViewById<ImageView>(karsIdImg3[j]).visibility = View.GONE
                        findViewById<ImageView>(kars2IdImg3[j]).visibility = View.GONE
                    }
                    for (k in i*3..i*3+2){
                        findViewById<Button>(krId3[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(krId3[k]).visibility = View.INVISIBLE
                        findViewById<Button>(kr2Id3[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kr2Id3[k]).visibility = View.INVISIBLE

                        findViewById<Button>(otlId3[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(otlId3[k]).visibility = View.INVISIBLE
                        findViewById<Button>(otl2Id3[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(otl2Id3[k]).visibility = View.INVISIBLE

                        findViewById<Button>(kamId3[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kamId3[k]).visibility = View.INVISIBLE
                        findViewById<Button>(kam2Id3[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kam2Id3[k]).visibility = View.INVISIBLE

                        findViewById<Button>(vosId3[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(vosId3[k]).visibility = View.INVISIBLE
                        findViewById<Button>(vos2Id3[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(vos2Id3[k]).visibility = View.INVISIBLE
                    }
                }
                else{
                    existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    for (j in (7-i)*3..(7-i)*3+2){
                        findViewById<EditText>(desnId6[j]).visibility = View.VISIBLE
                        findViewById<EditText>(zondId6[j]).visibility = View.VISIBLE
                        findViewById<EditText>(desnId8[j]).visibility = View.VISIBLE
                        findViewById<EditText>(zondId8[j]).visibility = View.VISIBLE
                    }

                    findViewById<Button>(implantsId3[i]).visibility = View.VISIBLE
                    findViewById<EditText>(podvsId3[i]).visibility = View.VISIBLE
                    if(i <= 2){
                        findViewById<ImageButton>(furksId3[i]).visibility = View.VISIBLE
                        findViewById<ImageView>(furksImgId3[i]).visibility = View.VISIBLE

                        findViewById<ImageButton>(furks2Id3[i]).visibility = View.VISIBLE
                        findViewById<ImageView>(furks2ImgId3[i]).visibility = View.VISIBLE
                    }
                    findViewById<Button>(pupesId3[i]).visibility = View.VISIBLE

                    findViewById<ImageView>(tsId3[i]).visibility = View.VISIBLE
                    findViewById<ImageView>(t2sId3[i]).visibility = View.VISIBLE

                    findViewById<Button>(plombsId3[i]).visibility = View.VISIBLE
                    for (j in i*6..i*6+5){
                        findViewById<Button>(karsId3[j]).visibility = View.VISIBLE
                        findViewById<Button>(kars2Id3[j]).visibility = View.VISIBLE
                    }
                    for (k in i*3..i*3+2){
                        findViewById<Button>(krId3[k]).visibility = View.VISIBLE
                        findViewById<Button>(kr2Id3[k]).visibility = View.VISIBLE

                        findViewById<Button>(otlId3[k]).visibility = View.VISIBLE
                        findViewById<Button>(otl2Id3[k]).visibility = View.VISIBLE

                        findViewById<Button>(kamId3[k]).visibility = View.VISIBLE
                        findViewById<Button>(kam2Id3[k]).visibility = View.VISIBLE

                        findViewById<Button>(vosId3[k]).visibility = View.VISIBLE
                        findViewById<Button>(vos2Id3[k]).visibility = View.VISIBLE
                    }
                }
                kpu()
                bop()
                api()
                cpitn()
                russel()
                ohis()
            }
        }
        for (i in existsId4.indices){
            val existBut = findViewById<Button>(existsId4[i])
            existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
            existBut.setOnClickListener{
                val colorStateList = existBut.backgroundTintList
                val defaultColor = colorStateList?.getColorForState(IntArray(0), colorStateList.defaultColor)

                if (defaultColor == Color.parseColor(but0Color)) {
                    existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(implantColor)))
                    for (j in i*3..i*3+2){
                        zondChart5[j].y = 0f
                        desnChart5[j].y = 0f
                        findViewById<EditText>(desnId5[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(zondId5[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(desnId5[j]).setText("")
                        findViewById<EditText>(zondId5[j]).setText("")

                        zondChart7[j].y = 0f
                        desnChart7[j].y = 0f
                        findViewById<EditText>(desnId7[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(zondId7[j]).visibility = View.INVISIBLE
                        findViewById<EditText>(desnId7[j]).setText("")
                        findViewById<EditText>(zondId7[j]).setText("")
                    }
                    generateChart(chart5, zondChart5, desnChart5, 17f, -9f)
                    generateChart(chart7, zondChart7, desnChart7,9f, -16f)

                    findViewById<Button>(implantsId4[i]).visibility = View.INVISIBLE
                    findViewById<Button>(implantsId4[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<EditText>(podvsId4[i]).visibility = View.INVISIBLE
                    if(i <= 2){
                        findViewById<ImageButton>(furksId4[i]).tag = R.drawable.null17
                        findViewById<ImageView>(furksImgId4[i]).tag = R.drawable.null17
                        findViewById<ImageButton>(furks2Id4[i]).tag = R.drawable.null17
                        findViewById<ImageView>(furks2ImgId4[i]).tag = R.drawable.null17
                        findViewById<ImageButton>(furksId4[i]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furksImgId4[i]).visibility = View.INVISIBLE
                        findViewById<ImageButton>(furks2Id4[i]).visibility = View.INVISIBLE
                        findViewById<ImageView>(furks2ImgId4[i]).visibility = View.INVISIBLE
                    }
                    findViewById<Button>(pupesId4[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<Button>(pupesId4[i]).visibility = View.INVISIBLE

                    findViewById<ImageView>(tsId4[i]).setImageResource(tsDrawable4[i])
                    findViewById<ImageView>(t2sId4[i]).setImageResource(t2sDrawable4[i])
                    findViewById<ImageView>(tsId4[i]).visibility = View.INVISIBLE
                    findViewById<ImageView>(t2sId4[i]).visibility = View.INVISIBLE

                    findViewById<Button>(plombsId4[i]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    findViewById<Button>(plombsId4[i]).visibility = View.INVISIBLE
                    for (j in i*6..i*6+5){
                        findViewById<Button>(karsId4[j]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(karsId4[j]).visibility = View.INVISIBLE
                        findViewById<Button>(kars2Id4[j]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kars2Id4[j]).visibility = View.INVISIBLE
                        findViewById<ImageView>(karsIdImg4[j]).visibility = View.GONE
                        findViewById<ImageView>(kars2IdImg4[j]).visibility = View.GONE
                    }
                    for (k in i*3..i*3+2){
                        findViewById<Button>(krId4[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(krId4[k]).visibility = View.INVISIBLE
                        findViewById<Button>(kr2Id4[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kr2Id4[k]).visibility = View.INVISIBLE

                        findViewById<Button>(otlId4[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(otlId4[k]).visibility = View.INVISIBLE
                        findViewById<Button>(otl2Id4[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(otl2Id4[k]).visibility = View.INVISIBLE

                        findViewById<Button>(kamId4[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kamId4[k]).visibility = View.INVISIBLE
                        findViewById<Button>(kam2Id4[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(kam2Id4[k]).visibility = View.INVISIBLE

                        findViewById<Button>(vosId4[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(vosId4[k]).visibility = View.INVISIBLE
                        findViewById<Button>(vos2Id4[k]).setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                        findViewById<Button>(vos2Id4[k]).visibility = View.INVISIBLE
                    }
                }
                else{
                    existBut.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(but0Color)))
                    for (j in i*3..i*3+2){
                        findViewById<EditText>(desnId5[j]).visibility = View.VISIBLE
                        findViewById<EditText>(zondId5[j]).visibility = View.VISIBLE
                        findViewById<EditText>(desnId7[j]).visibility = View.VISIBLE
                        findViewById<EditText>(zondId7[j]).visibility = View.VISIBLE
                    }

                    findViewById<Button>(implantsId4[i]).visibility = View.VISIBLE
                    findViewById<EditText>(podvsId4[i]).visibility = View.VISIBLE
                    if(i <= 2){
                        findViewById<ImageButton>(furksId4[i]).visibility = View.VISIBLE
                        findViewById<ImageView>(furksImgId4[i]).visibility = View.VISIBLE
                        findViewById<ImageButton>(furks2Id4[i]).visibility = View.VISIBLE
                        findViewById<ImageView>(furks2ImgId4[i]).visibility = View.VISIBLE
                    }
                    findViewById<Button>(pupesId4[i]).visibility = View.VISIBLE

                    findViewById<ImageView>(tsId4[i]).visibility = View.VISIBLE
                    findViewById<ImageView>(t2sId4[i]).visibility = View.VISIBLE

                    findViewById<Button>(plombsId4[i]).visibility = View.VISIBLE
                    for (j in i*6..i*6+5){
                        findViewById<Button>(karsId4[j]).visibility = View.VISIBLE
                        findViewById<Button>(kars2Id4[j]).visibility = View.VISIBLE
                    }
                    for (k in i*3..i*3+2){
                        findViewById<Button>(krId4[k]).visibility = View.VISIBLE
                        findViewById<Button>(kr2Id4[k]).visibility = View.VISIBLE

                        findViewById<Button>(otlId4[k]).visibility = View.VISIBLE
                        findViewById<Button>(otl2Id4[k]).visibility = View.VISIBLE

                        findViewById<Button>(kamId4[k]).visibility = View.VISIBLE
                        findViewById<Button>(kam2Id4[k]).visibility = View.VISIBLE

                        findViewById<Button>(vosId4[k]).visibility = View.VISIBLE
                        findViewById<Button>(vos2Id4[k]).visibility = View.VISIBLE
                    }
                }
                kpu()
                bop()
                api()
                cpitn()
                russel()
                ohis()
            }
        }

    }

    private fun kpu(){
        val kpuText = findViewById<TextView>(R.id.kpu)
        var kpu = 0

        fun kpuHelper(existsId: IntArray, plombsId: IntArray, karsId: IntArray, kars2Id: IntArray){
            for (i in 0..7){
                val existColorStateList = findViewById<Button>(existsId[i]).backgroundTintList
                val existColor = existColorStateList?.getColorForState(IntArray(0), existColorStateList.defaultColor)

                val plombColorStateList = findViewById<Button>(plombsId[i]).backgroundTintList
                val plombColor = plombColorStateList?.getColorForState(IntArray(0), plombColorStateList.defaultColor)

                var karFlag = false

                for (j in i*6..i*6+5){
                    val karColorStateList = findViewById<Button>(karsId[j]).backgroundTintList
                    val karColor = karColorStateList?.getColorForState(IntArray(0), karColorStateList.defaultColor)

                    val kar2ColorStateList = findViewById<Button>(kars2Id[j]).backgroundTintList
                    val kar2Color = kar2ColorStateList?.getColorForState(IntArray(0), kar2ColorStateList.defaultColor)

                    if(karColor != Color.parseColor(but0Color) || kar2Color != Color.parseColor(but0Color)){
                        karFlag = true
                        break
                    }
                }

                if (karFlag || existColor != Color.parseColor(but0Color) || plombColor != Color.parseColor(but0Color)){
                    kpu += 1
                }
            }
        }

        kpuHelper(existsId1, plombsId1, karsId1, kars2Id1)
        kpuHelper(existsId2, plombsId2, karsId2, kars2Id2)
        kpuHelper(existsId3, plombsId3, karsId3, kars2Id3)
        kpuHelper(existsId4, plombsId4, karsId4, kars2Id4)

        kpuText.text = kpu.toString()

        val kpuInterpr = findViewById<TextView>(R.id.kpu_interpr)


        val kpuRes =  (kpu.toFloat()/32f)*100
        if(kpuRes <=30){
            kpuInterpr.text = "Низкая степень тяжести кариозного процесса"
        }
        if(kpuRes>30 && kpuRes<=80){
            kpuInterpr.text = "Средняя степень тяжести кариозного процесса"
        }
        if (kpuRes > 80){
            kpuInterpr.text = "Высокая степень тяжести кариозного процесса"
        }

    }

    private fun countExist(): Int {
        var sum = 0
        val existsId = intArrayOf(R.id.exist18, R.id.exist17,R.id.exist16,R.id.exist15,R.id.exist14,R.id.exist13,R.id.exist12,R.id.exist11,
            R.id.exist28,R.id.exist27,R.id.exist26,R.id.exist25,R.id.exist24,R.id.exist23,R.id.exist22,R.id.exist21,
            R.id.exist38,R.id.exist37,R.id.exist36,R.id.exist35,R.id.exist34,R.id.exist33,R.id.exist32,R.id.exist31,
            R.id.exist48,R.id.exist47, R.id.exist46,R.id.exist45,R.id.exist44,R.id.exist43,R.id.exist42,R.id.exist41)

        for (el in existsId){
            val existBut = findViewById<Button>(el)
            val existColorStateList = existBut.backgroundTintList
            val existColor = existColorStateList?.getColorForState(IntArray(0), existColorStateList.defaultColor)
            if (existColor == Color.parseColor(but0Color)){
                sum += 1
            }
        }
        return sum
    }

    private fun bop() {
        val bopText = findViewById<TextView>(R.id.bop)

        var krCounter = 0f

        val numOfSurfaces = countExist()*6

        for (el in krId){
            val krBut = findViewById<Button>(el)
            val krColorStateList = krBut.backgroundTintList
            val existColor = krColorStateList?.getColorForState(IntArray(0), krColorStateList.defaultColor)
            if (existColor != Color.parseColor(but0Color)){
                krCounter += 1f
            }
        }

        val bop = (krCounter/numOfSurfaces)*100f

        val bopInterpr = findViewById<TextView>(R.id.bop_interpr)

        if (bop < 10){
            bopInterpr.text = "Норма"
        }
        if (bop >= 10 && bop < 30){
            bopInterpr.text = "Начальная степень гингивита"
        }
        if (bop >= 30 && bop < 50){
            bopInterpr.text = "Средняя степень гингивита"
        }
        if (bop >= 50){
            bopInterpr.text = "Тяжелая степень гингивита"
        }

        bopText.text = String.format("%.3f", bop.toDouble())
    }

    private fun api() {
        val otlIdApi = intArrayOf(R.id.otl112_1,R.id.otl112_3,R.id.otl122_1,R.id.otl122_3,R.id.otl132_1,R.id.otl132_3,R.id.otl142_1,R.id.otl142_3,
            R.id.otl152_1,R.id.otl152_3,R.id.otl162_1,R.id.otl162_3,R.id.otl172_1,R.id.otl172_3,R.id.otl182_1,R.id.otl182_3,R.id.otl212_1,
            R.id.otl212_3,R.id.otl222_1,R.id.otl222_3,R.id.otl232_1,R.id.otl232_3,R.id.otl242_1,R.id.otl242_3,R.id.otl252_1,R.id.otl252_3,R.id.otl262_1,
            R.id.otl262_3,R.id.otl272_1,R.id.otl272_3,R.id.otl282_1,R.id.otl282_3,R.id.otl312_1,R.id.otl312_3,R.id.otl322_1,R.id.otl322_3,
            R.id.otl332_1,R.id.otl332_3,R.id.otl342_1,R.id.otl342_3,R.id.otl352_1,R.id.otl352_3,R.id.otl362_1,R.id.otl362_3,R.id.otl372_1,
            R.id.otl372_3,R.id.otl382_1,R.id.otl382_3,R.id.otl412_1,R.id.otl412_3,R.id.otl422_1,R.id.otl422_3,R.id.otl432_1,R.id.otl432_3,R.id.otl442_1,
            R.id.otl442_3,R.id.otl452_1,R.id.otl452_3,R.id.otl462_1,R.id.otl462_3,R.id.otl472_1,R.id.otl472_3,R.id.otl482_1,R.id.otl482_3,
            R.id.otl11_1,R.id.otl11_3,R.id.otl12_1,R.id.otl12_3,R.id.otl13_1,R.id.otl13_3,R.id.otl14_1,R.id.otl14_3,R.id.otl15_1,R.id.otl15_3,
            R.id.otl16_1,R.id.otl16_3,R.id.otl17_1,R.id.otl17_3,R.id.otl18_1,R.id.otl18_3,R.id.otl21_1,R.id.otl21_3,R.id.otl22_1,R.id.otl22_3,
            R.id.otl23_1,R.id.otl23_3,R.id.otl24_1,R.id.otl24_3,R.id.otl25_1,R.id.otl25_3,R.id.otl26_1,R.id.otl26_3,R.id.otl27_1,R.id.otl27_3,
            R.id.otl28_1,R.id.otl28_3,R.id.otl31_1,R.id.otl31_3,R.id.otl32_1,R.id.otl32_3,R.id.otl33_1,R.id.otl33_3,R.id.otl34_1,R.id.otl34_3,
            R.id.otl35_1,R.id.otl35_3,R.id.otl36_1,R.id.otl36_3,R.id.otl37_1,R.id.otl37_3,R.id.otl38_1,R.id.otl38_3,R.id.otl41_1,R.id.otl41_3,
            R.id.otl42_1,R.id.otl42_3,R.id.otl43_1,R.id.otl43_3,R.id.otl44_1,R.id.otl44_3,R.id.otl45_1,R.id.otl45_3,R.id.otl46_1,R.id.otl46_3,
            R.id.otl47_1,R.id.otl47_3,R.id.otl48_1,R.id.otl48_3)
        val apiText = findViewById<TextView>(R.id.api)

        var otlCounter = 0f

        val numOfSurfaces = countExist()*4

        for (el in otlIdApi){
            val krBut = findViewById<Button>(el)
            val otlColorStateList = krBut.backgroundTintList
            val existColor = otlColorStateList?.getColorForState(IntArray(0), otlColorStateList.defaultColor)
            if (existColor != Color.parseColor(but0Color)){
                otlCounter += 1f
            }
        }

        val api = (otlCounter/numOfSurfaces)*100f

        val bopInterpr = findViewById<TextView>(R.id.api_interpr)

        if (api<25){
            bopInterpr.text = "Оптимальный уровень гигиены"
        }
        if (api >= 25 && api<40 ){
            bopInterpr.text = "Удовлетворительный уровень гигиены"
        }
        if (api >= 40 && api<70 ){
            bopInterpr.text = "Недовлетворительный уровень гигиены"
        }
        if (api>=70 ){
            bopInterpr.text = "Недопустимый уровень гигиены"
        }

        apiText.text = String.format("%.3f", api.toDouble())
    }

    private fun cpitn(){
        val cpitn1Text = findViewById<TextView>(R.id.cpitn1)
        val cpitn2Text = findViewById<TextView>(R.id.cpitn2)
        val cpitn3Text = findViewById<TextView>(R.id.cpitn3)
        val cpitn4Text = findViewById<TextView>(R.id.cpitn4)
        val cpitn5Text = findViewById<TextView>(R.id.cpitn5)
        val cpitn6Text = findViewById<TextView>(R.id.cpitn6)

        val kr1Section = intArrayOf(R.id.kr172_1,R.id.kr172_2,R.id.kr172_3,
            R.id.kr162_1,R.id.kr162_2,R.id.kr162_3,
            R.id.kr152_1,R.id.kr152_2,R.id.kr152_3,
            R.id.kr142_1,R.id.kr142_2,R.id.kr142_3,
            R.id.kr17_1,R.id.kr17_2,R.id.kr17_3,
            R.id.kr16_1,R.id.kr16_2,R.id.kr16_3,
            R.id.kr15_1,R.id.kr15_2,R.id.kr15_3,
            R.id.kr14_1,R.id.kr14_2,R.id.kr14_3)

        val kr2Section = intArrayOf(R.id.kr132_1,R.id.kr132_2,R.id.kr132_3,
            R.id.kr122_1,R.id.kr122_2,R.id.kr122_3,
            R.id.kr112_1,R.id.kr112_2,R.id.kr112_3,
            R.id.kr13_1,R.id.kr13_2,R.id.kr13_3,
            R.id.kr12_1,R.id.kr12_2,R.id.kr12_3,
            R.id.kr11_1,R.id.kr11_2,R.id.kr11_3,
            R.id.kr232_1,R.id.kr232_2,R.id.kr232_3,
            R.id.kr222_1, R.id.kr222_2,R.id.kr222_3,
            R.id.kr212_1,R.id.kr212_2,R.id.kr212_3,
            R.id.kr23_1,R.id.kr23_2,R.id.kr23_3,
            R.id.kr22_1,R.id.kr22_2, R.id.kr22_3,
            R.id.kr21_1,R.id.kr21_2,R.id.kr21_3
            )
        val kr3Section = intArrayOf(R.id.kr272_1,R.id.kr272_2, R.id.kr272_3,
            R.id.kr262_1,R.id.kr262_2,R.id.kr262_3,
            R.id.kr252_1,R.id.kr252_2,R.id.kr252_3,
            R.id.kr242_1,R.id.kr242_2,R.id.kr242_3,
            R.id.kr27_1,R.id.kr27_2,R.id.kr27_3,
            R.id.kr26_1,R.id.kr26_2,R.id.kr26_3,
            R.id.kr25_1,R.id.kr25_2,R.id.kr25_3,
            R.id.kr24_1,R.id.kr24_2,R.id.kr24_3)

        val kr4Section = intArrayOf(R.id.kr472_1,R.id.kr472_2,R.id.kr472_3,
            R.id.kr462_1,R.id.kr462_2,R.id.kr462_3,
            R.id.kr452_1,R.id.kr452_2,R.id.kr452_3,
            R.id.kr442_1,R.id.kr442_2,R.id.kr442_3,
            R.id.kr47_1,R.id.kr47_2,R.id.kr47_3,
            R.id.kr46_1,R.id.kr46_2,R.id.kr46_3,
            R.id.kr45_1,R.id.kr45_2,R.id.kr45_3,
            R.id.kr44_1,R.id.kr44_2,R.id.kr44_3)

        val kr5Section = intArrayOf(R.id.kr432_1,R.id.kr432_2,R.id.kr432_3,
            R.id.kr422_1,R.id.kr422_2,R.id.kr422_3,
            R.id.kr412_1,R.id.kr412_2,R.id.kr412_3,
            R.id.kr43_1,R.id.kr43_2,R.id.kr43_3,
            R.id.kr42_1,R.id.kr42_2,R.id.kr42_3,
            R.id.kr41_1,R.id.kr41_2,R.id.kr41_3,
            R.id.kr332_1,R.id.kr332_2,R.id.kr332_3,
            R.id.kr322_1, R.id.kr322_2,R.id.kr322_3,
            R.id.kr312_1,R.id.kr312_2,R.id.kr312_3,
            R.id.kr33_1,R.id.kr33_2,R.id.kr33_3,
            R.id.kr32_1,R.id.kr32_2, R.id.kr32_3,
            R.id.kr31_1,R.id.kr31_2,R.id.kr31_3
        )

        val kr6Section = intArrayOf(R.id.kr372_1,R.id.kr372_2, R.id.kr372_3,
            R.id.kr362_1,R.id.kr362_2,R.id.kr362_3,
            R.id.kr352_1,R.id.kr352_2,R.id.kr352_3,
            R.id.kr342_1,R.id.kr342_2,R.id.kr342_3,
            R.id.kr37_1,R.id.kr37_2,R.id.kr37_3,
            R.id.kr36_1,R.id.kr36_2,R.id.kr36_3,
            R.id.kr35_1,R.id.kr35_2,R.id.kr35_3,
            R.id.kr34_1,R.id.kr34_2,R.id.kr34_3)

        val kam1Section = intArrayOf(R.id.kam172_1,R.id.kam172_2,R.id.kam172_3,
            R.id.kam162_1,R.id.kam162_2,R.id.kam162_3,
            R.id.kam152_1,R.id.kam152_2,R.id.kam152_3,
            R.id.kam142_1,R.id.kam142_2,R.id.kam142_3,
            R.id.kam17_1,R.id.kam17_2,R.id.kam17_3,
            R.id.kam16_1,R.id.kam16_2,R.id.kam16_3,
            R.id.kam15_1,R.id.kam15_2,R.id.kam15_3,
            R.id.kam14_1,R.id.kam14_2,R.id.kam14_3)

        val kam2Section = intArrayOf(R.id.kam132_1,R.id.kam132_2,R.id.kam132_3,
            R.id.kam122_1,R.id.kam122_2,R.id.kam122_3,
            R.id.kam112_1,R.id.kam112_2,R.id.kam112_3,
            R.id.kam13_1,R.id.kam13_2,R.id.kam13_3,
            R.id.kam12_1,R.id.kam12_2,R.id.kam12_3,
            R.id.kam11_1,R.id.kam11_2,R.id.kam11_3,
            R.id.kam232_1,R.id.kam232_2,R.id.kam232_3,
            R.id.kam222_1, R.id.kam222_2,R.id.kam222_3,
            R.id.kam212_1,R.id.kam212_2,R.id.kam212_3,
            R.id.kam23_1,R.id.kam23_2,R.id.kam23_3,
            R.id.kam22_1,R.id.kam22_2, R.id.kam22_3,
            R.id.kam21_1,R.id.kam21_2,R.id.kam21_3
        )
        val kam3Section = intArrayOf(R.id.kam272_1,R.id.kam272_2, R.id.kam272_3,
            R.id.kam262_1,R.id.kam262_2,R.id.kam262_3,
            R.id.kam252_1,R.id.kam252_2,R.id.kam252_3,
            R.id.kam242_1,R.id.kam242_2,R.id.kam242_3,
            R.id.kam27_1,R.id.kam27_2,R.id.kam27_3,
            R.id.kam26_1,R.id.kam26_2,R.id.kam26_3,
            R.id.kam25_1,R.id.kam25_2,R.id.kam25_3,
            R.id.kam24_1,R.id.kam24_2,R.id.kam24_3)

        val kam4Section = intArrayOf(R.id.kam472_1,R.id.kam472_2,R.id.kam472_3,
            R.id.kam462_1,R.id.kam462_2,R.id.kam462_3,
            R.id.kam452_1,R.id.kam452_2,R.id.kam452_3,
            R.id.kam442_1,R.id.kam442_2,R.id.kam442_3,
            R.id.kam47_1,R.id.kam47_2,R.id.kam47_3,
            R.id.kam46_1,R.id.kam46_2,R.id.kam46_3,
            R.id.kam45_1,R.id.kam45_2,R.id.kam45_3,
            R.id.kam44_1,R.id.kam44_2,R.id.kam44_3)

        val kam5Section = intArrayOf(R.id.kam432_1,R.id.kam432_2,R.id.kam432_3,
            R.id.kam422_1,R.id.kam422_2,R.id.kam422_3,
            R.id.kam412_1,R.id.kam412_2,R.id.kam412_3,
            R.id.kam43_1,R.id.kam43_2,R.id.kam43_3,
            R.id.kam42_1,R.id.kam42_2,R.id.kam42_3,
            R.id.kam41_1,R.id.kam41_2,R.id.kam41_3,
            R.id.kam332_1,R.id.kam332_2,R.id.kam332_3,
            R.id.kam322_1, R.id.kam322_2,R.id.kam322_3,
            R.id.kam312_1,R.id.kam312_2,R.id.kam312_3,
            R.id.kam33_1,R.id.kam33_2,R.id.kam33_3,
            R.id.kam32_1,R.id.kam32_2, R.id.kam32_3,
            R.id.kam31_1,R.id.kam31_2,R.id.kam31_3
        )

        val kam6Section = intArrayOf(R.id.kam372_1,R.id.kam372_2, R.id.kam372_3,
            R.id.kam362_1,R.id.kam362_2,R.id.kam362_3,
            R.id.kam352_1,R.id.kam352_2,R.id.kam352_3,
            R.id.kam342_1,R.id.kam342_2,R.id.kam342_3,
            R.id.kam37_1,R.id.kam37_2,R.id.kam37_3,
            R.id.kam36_1,R.id.kam36_2,R.id.kam36_3,
            R.id.kam35_1,R.id.kam35_2,R.id.kam35_3,
            R.id.kam34_1,R.id.kam34_2,R.id.kam34_3)

        val zond1Section = intArrayOf(R.id.zond172_1,R.id.zond172_2,R.id.zond172_3,
            R.id.zond162_1,R.id.zond162_2,R.id.zond162_3,
            R.id.zond152_1,R.id.zond152_2,R.id.zond152_3,
            R.id.zond142_1,R.id.zond142_2,R.id.zond142_3,
            R.id.zond17_1,R.id.zond17_2,R.id.zond17_3,
            R.id.zond16_1,R.id.zond16_2,R.id.zond16_3,
            R.id.zond15_1,R.id.zond15_2,R.id.zond15_3,
            R.id.zond14_1,R.id.zond14_2,R.id.zond14_3)

        val zond2Section = intArrayOf(R.id.zond132_1,R.id.zond132_2,R.id.zond132_3,
            R.id.zond122_1,R.id.zond122_2,R.id.zond122_3,
            R.id.zond112_1,R.id.zond112_2,R.id.zond112_3,
            R.id.zond13_1,R.id.zond13_2,R.id.zond13_3,
            R.id.zond12_1,R.id.zond12_2,R.id.zond12_3,
            R.id.zond11_1,R.id.zond11_2,R.id.zond11_3,
            R.id.zond232_1,R.id.zond232_2,R.id.zond232_3,
            R.id.zond222_1, R.id.zond222_2,R.id.zond222_3,
            R.id.zond212_1,R.id.zond212_2,R.id.zond212_3,
            R.id.zond23_1,R.id.zond23_2,R.id.zond23_3,
            R.id.zond22_1,R.id.zond22_2, R.id.zond22_3,
            R.id.zond21_1,R.id.zond21_2,R.id.zond21_3
        )
        val zond3Section = intArrayOf(R.id.zond272_1,R.id.zond272_2, R.id.zond272_3,
            R.id.zond262_1,R.id.zond262_2,R.id.zond262_3,
            R.id.zond252_1,R.id.zond252_2,R.id.zond252_3,
            R.id.zond242_1,R.id.zond242_2,R.id.zond242_3,
            R.id.zond27_1,R.id.zond27_2,R.id.zond27_3,
            R.id.zond26_1,R.id.zond26_2,R.id.zond26_3,
            R.id.zond25_1,R.id.zond25_2,R.id.zond25_3,
            R.id.zond24_1,R.id.zond24_2,R.id.zond24_3)

        val zond4Section = intArrayOf(R.id.zond472_1,R.id.zond472_2,R.id.zond472_3,
            R.id.zond462_1,R.id.zond462_2,R.id.zond462_3,
            R.id.zond452_1,R.id.zond452_2,R.id.zond452_3,
            R.id.zond442_1,R.id.zond442_2,R.id.zond442_3,
            R.id.zond47_1,R.id.zond47_2,R.id.zond47_3,
            R.id.zond46_1,R.id.zond46_2,R.id.zond46_3,
            R.id.zond45_1,R.id.zond45_2,R.id.zond45_3,
            R.id.zond44_1,R.id.zond44_2,R.id.zond44_3)

        val zond5Section = intArrayOf(R.id.zond432_1,R.id.zond432_2,R.id.zond432_3,
            R.id.zond422_1,R.id.zond422_2,R.id.zond422_3,
            R.id.zond412_1,R.id.zond412_2,R.id.zond412_3,
            R.id.zond43_1,R.id.zond43_2,R.id.zond43_3,
            R.id.zond42_1,R.id.zond42_2,R.id.zond42_3,
            R.id.zond41_1,R.id.zond41_2,R.id.zond41_3,
            R.id.zond332_1,R.id.zond332_2,R.id.zond332_3,
            R.id.zond322_1, R.id.zond322_2,R.id.zond322_3,
            R.id.zond312_1,R.id.zond312_2,R.id.zond312_3,
            R.id.zond33_1,R.id.zond33_2,R.id.zond33_3,
            R.id.zond32_1,R.id.zond32_2, R.id.zond32_3,
            R.id.zond31_1,R.id.zond31_2,R.id.zond31_3
        )

        val zond6Section = intArrayOf(R.id.zond372_1,R.id.zond372_2, R.id.zond372_3,
            R.id.zond362_1,R.id.zond362_2,R.id.zond362_3,
            R.id.zond352_1,R.id.zond352_2,R.id.zond352_3,
            R.id.zond342_1,R.id.zond342_2,R.id.zond342_3,
            R.id.zond37_1,R.id.zond37_2,R.id.zond37_3,
            R.id.zond36_1,R.id.zond36_2,R.id.zond36_3,
            R.id.zond35_1,R.id.zond35_2,R.id.zond35_3,
            R.id.zond34_1,R.id.zond34_2,R.id.zond34_3)

        fun cpitnHelper(krSection: IntArray, kamSection: IntArray, zondSection: IntArray): Int {
            var cpitn = 0
            for (el in krSection){
                val krBut = findViewById<Button>(el)
                val colorStateListKr = krBut.backgroundTintList
                val defaultColorKr = colorStateListKr?.getColorForState(IntArray(0), colorStateListKr.defaultColor)

                if (defaultColorKr != Color.parseColor(but0Color)) {
                    cpitn = 1
                }
            }
            for (el in kamSection) {
                val kamBut = findViewById<Button>(el)
                val colorStateListKam = kamBut.backgroundTintList
                val defaultColorKam = colorStateListKam?.getColorForState(IntArray(0), colorStateListKam.defaultColor)

                if (defaultColorKam != Color.parseColor(but0Color)) {
                    cpitn = 2
                }
            }
            for (el in zondSection){
                val zondEditText = findViewById<EditText>(el)
                if (zondEditText.text.toString()!=""){
                    if (zondEditText.text.toString().toDouble() >= 4){
                        cpitn = 3
                    }
                    if (zondEditText.text.toString().toDouble() >= 6){
                        cpitn = 4
                    }
                }
            }
            return cpitn
        }

        cpitn1Text.text = cpitnHelper(kr1Section, kam1Section,zond1Section).toString()
        cpitn2Text.text = cpitnHelper(kr2Section, kam2Section,zond2Section).toString()
        cpitn3Text.text = cpitnHelper(kr3Section, kam3Section,zond3Section).toString()
        cpitn4Text.text = cpitnHelper(kr4Section, kam4Section,zond4Section).toString()
        cpitn5Text.text = cpitnHelper(kr5Section, kam5Section,zond5Section).toString()
        cpitn6Text.text = cpitnHelper(kr6Section, kam6Section,zond6Section).toString()

        val cpitnRes = max(max(max(max(max(cpitn1Text.text.toString().toInt(),
                cpitn2Text.text.toString().toInt()),
                cpitn3Text.text.toString().toInt()),
                cpitn4Text.text.toString().toInt()),
                cpitn5Text.text.toString().toInt()),
                cpitn6Text.text.toString().toInt())
        val cpitnInterpr = findViewById<TextView>(R.id.cpitn_interpr)

        if (cpitnRes == 0){
            cpitnInterpr.text="Лечение не требуется"
        }
        if (cpitnRes == 1){
            cpitnInterpr.text="Необходимость удаления зубного камня"
        }
        if (cpitnRes == 2 || cpitnRes == 3){
            cpitnInterpr.text="Необходимость профессиональной гигиены"
        }
        if (cpitnRes == 4){
            cpitnInterpr.text="Необходимость комплексного лечения"
        }

    }

    private fun getColor(but: Button): Int? {
        val colorStateListKr = but.backgroundTintList
        val defaultColorKr = colorStateListKr?.getColorForState(IntArray(0), colorStateListKr.defaultColor)
        return defaultColorKr
    }

    private fun russel(){
        val russelText = findViewById<TextView>(R.id.russel)
        val russelInterpr = findViewById<TextView>(R.id.russel_interpr)

        var russel = 0

        val zondId = intArrayOf(R.id.zond18_1,R.id.zond18_2,R.id.zond18_3,R.id.zond17_1,R.id.zond17_2,R.id.zond17_3,R.id.zond16_1,R.id.zond16_2,R.id.zond16_3,R.id.zond15_1,R.id.zond15_2,R.id.zond15_3,
            R.id.zond14_1,R.id.zond14_2,R.id.zond14_3,R.id.zond13_1,R.id.zond13_2,R.id.zond13_3,R.id.zond12_1,R.id.zond12_2,R.id.zond12_3,R.id.zond11_1,R.id.zond11_2,R.id.zond11_3,
            R.id.zond28_1,R.id.zond28_2,R.id.zond28_3,R.id.zond27_1,R.id.zond27_2,R.id.zond27_3,R.id.zond26_1,R.id.zond26_2,R.id.zond26_3,R.id.zond25_1,R.id.zond25_2,R.id.zond25_3,
            R.id.zond24_1,R.id.zond24_2,R.id.zond24_3,R.id.zond23_1,R.id.zond23_2,R.id.zond23_3,R.id.zond22_1,R.id.zond22_2,R.id.zond22_3,R.id.zond21_1,R.id.zond21_2,R.id.zond21_3,
            R.id.zond38_1,R.id.zond38_2,R.id.zond38_3,R.id.zond37_1,R.id.zond37_2,R.id.zond37_3,R.id.zond36_1,R.id.zond36_2,R.id.zond36_3,R.id.zond35_1,R.id.zond35_2,R.id.zond35_3,
            R.id.zond34_1,R.id.zond34_2,R.id.zond34_3,R.id.zond33_1,R.id.zond33_2,R.id.zond33_3,R.id.zond32_1,R.id.zond32_2,R.id.zond32_3,R.id.zond31_1,R.id.zond31_2,R.id.zond31_3,
            R.id.zond48_1,R.id.zond48_2,R.id.zond48_3,R.id.zond47_1,R.id.zond47_2,R.id.zond47_3,R.id.zond46_1,R.id.zond46_2,R.id.zond46_3,R.id.zond45_1,R.id.zond45_2,R.id.zond45_3,
            R.id.zond44_1,R.id.zond44_2,R.id.zond44_3,R.id.zond43_1,R.id.zond43_2,R.id.zond43_3,R.id.zond42_1,R.id.zond42_2,R.id.zond42_3,R.id.zond41_1,R.id.zond41_2,R.id.zond41_3)

        val zond2Id = intArrayOf(R.id.zond182_1,R.id.zond182_2,R.id.zond182_3,R.id.zond172_1,R.id.zond172_2,R.id.zond172_3,R.id.zond162_1,R.id.zond162_2,R.id.zond162_3,R.id.zond152_1,R.id.zond152_2,R.id.zond152_3,
            R.id.zond142_1,R.id.zond142_2,R.id.zond142_3,R.id.zond132_1,R.id.zond132_2,R.id.zond132_3,R.id.zond122_1,R.id.zond122_2,R.id.zond122_3,R.id.zond112_1,R.id.zond112_2,R.id.zond112_3,
            R.id.zond282_1,R.id.zond282_2,R.id.zond282_3,R.id.zond272_1,R.id.zond272_2,R.id.zond272_3,R.id.zond262_1,R.id.zond262_2,R.id.zond262_3,R.id.zond252_1,R.id.zond252_2,R.id.zond252_3,
            R.id.zond242_1,R.id.zond242_2,R.id.zond242_3,R.id.zond232_1,R.id.zond232_2,R.id.zond232_3,R.id.zond222_1,R.id.zond222_2,R.id.zond222_3,R.id.zond212_1,R.id.zond212_2,R.id.zond212_3,
            R.id.zond382_1,R.id.zond382_2,R.id.zond382_3,R.id.zond372_1,R.id.zond372_2,R.id.zond372_3,R.id.zond362_1,R.id.zond362_2,R.id.zond362_3,R.id.zond352_1,R.id.zond352_2,R.id.zond352_3,
            R.id.zond342_1,R.id.zond342_2,R.id.zond342_3,R.id.zond332_1,R.id.zond332_2,R.id.zond332_3,R.id.zond322_1,R.id.zond322_2,R.id.zond322_3,R.id.zond312_1,R.id.zond312_2,R.id.zond312_3,
            R.id.zond482_1,R.id.zond482_2,R.id.zond482_3,R.id.zond472_1,R.id.zond472_2,R.id.zond472_3,R.id.zond462_1,R.id.zond462_2,R.id.zond462_3,R.id.zond452_1,R.id.zond452_2,R.id.zond452_3,
            R.id.zond442_1,R.id.zond442_2,R.id.zond442_3,R.id.zond432_1,R.id.zond432_2,R.id.zond432_3,R.id.zond422_1,R.id.zond422_2,R.id.zond422_3,R.id.zond412_1,R.id.zond412_2,R.id.zond412_3)

        val krId = intArrayOf(R.id.kr18_1,R.id.kr18_2,R.id.kr18_3,R.id.kr17_1,R.id.kr17_2,R.id.kr17_3,R.id.kr16_1,R.id.kr16_2,R.id.kr16_3,R.id.kr15_1,R.id.kr15_2,R.id.kr15_3,
            R.id.kr14_1,R.id.kr14_2,R.id.kr14_3,R.id.kr13_1,R.id.kr13_2,R.id.kr13_3,R.id.kr12_1,R.id.kr12_2,R.id.kr12_3,R.id.kr11_1,R.id.kr11_2,R.id.kr11_3,
            R.id.kr28_1,R.id.kr28_2,R.id.kr28_3,R.id.kr27_1,R.id.kr27_2,R.id.kr27_3,R.id.kr26_1,R.id.kr26_2,R.id.kr26_3,R.id.kr25_1,R.id.kr25_2,R.id.kr25_3,
            R.id.kr24_1,R.id.kr24_2,R.id.kr24_3,R.id.kr23_1,R.id.kr23_2,R.id.kr23_3,R.id.kr22_1,R.id.kr22_2,R.id.kr22_3,R.id.kr21_1,R.id.kr21_2,R.id.kr21_3,
            R.id.kr38_1,R.id.kr38_2,R.id.kr38_3,R.id.kr37_1,R.id.kr37_2,R.id.kr37_3,R.id.kr36_1,R.id.kr36_2,R.id.kr36_3,R.id.kr35_1,R.id.kr35_2,R.id.kr35_3,
            R.id.kr34_1,R.id.kr34_2,R.id.kr34_3,R.id.kr33_1,R.id.kr33_2,R.id.kr33_3,R.id.kr32_1,R.id.kr32_2,R.id.kr32_3,R.id.kr31_1,R.id.kr31_2,R.id.kr31_3,
            R.id.kr48_1,R.id.kr48_2,R.id.kr48_3,R.id.kr47_1,R.id.kr47_2,R.id.kr47_3,R.id.kr46_1,R.id.kr46_2,R.id.kr46_3,R.id.kr45_1,R.id.kr45_2,R.id.kr45_3,
            R.id.kr44_1,R.id.kr44_2,R.id.kr44_3,R.id.kr43_1,R.id.kr43_2,R.id.kr43_3,R.id.kr42_1,R.id.kr42_2,R.id.kr42_3,R.id.kr41_1,R.id.kr41_2,R.id.kr41_3)

        val kr2Id = intArrayOf(R.id.kr182_1,R.id.kr182_2,R.id.kr182_3,R.id.kr172_1,R.id.kr172_2,R.id.kr172_3,R.id.kr162_1,R.id.kr162_2,R.id.kr162_3,R.id.kr152_1,R.id.kr152_2,R.id.kr152_3,
            R.id.kr142_1,R.id.kr142_2,R.id.kr142_3,R.id.kr132_1,R.id.kr132_2,R.id.kr132_3,R.id.kr122_1,R.id.kr122_2,R.id.kr122_3,R.id.kr112_1,R.id.kr112_2,R.id.kr112_3,
            R.id.kr282_1,R.id.kr282_2,R.id.kr282_3,R.id.kr272_1,R.id.kr272_2,R.id.kr272_3,R.id.kr262_1,R.id.kr262_2,R.id.kr262_3,R.id.kr252_1,R.id.kr252_2,R.id.kr252_3,
            R.id.kr242_1,R.id.kr242_2,R.id.kr242_3,R.id.kr232_1,R.id.kr232_2,R.id.kr232_3,R.id.kr222_1,R.id.kr222_2,R.id.kr222_3,R.id.kr212_1,R.id.kr212_2,R.id.kr212_3,
            R.id.kr382_1,R.id.kr382_2,R.id.kr382_3,R.id.kr372_1,R.id.kr372_2,R.id.kr372_3,R.id.kr362_1,R.id.kr362_2,R.id.kr362_3,R.id.kr352_1,R.id.kr352_2,R.id.kr352_3,
            R.id.kr342_1,R.id.kr342_2,R.id.kr342_3,R.id.kr332_1,R.id.kr332_2,R.id.kr332_3,R.id.kr322_1,R.id.kr322_2,R.id.kr322_3,R.id.kr312_1,R.id.kr312_2,R.id.kr312_3,
            R.id.kr482_1,R.id.kr482_2,R.id.kr482_3,R.id.kr472_1,R.id.kr472_2,R.id.kr472_3,R.id.kr462_1,R.id.kr462_2,R.id.kr462_3,R.id.kr452_1,R.id.kr452_2,R.id.kr452_3,
            R.id.kr442_1,R.id.kr442_2,R.id.kr442_3,R.id.kr432_1,R.id.kr432_2,R.id.kr432_3,R.id.kr422_1,R.id.kr422_2,R.id.kr422_3,R.id.kr412_1,R.id.kr412_2,R.id.kr412_3)

        for (i in podvsId.indices){
            var russelI = 0
            var podvText = findViewById<EditText>(podvsId[i]).text.toString().trim()

            var zondId1 = findViewById<EditText>(zondId[i*3]).text.toString().trim()
            var zondId2 = findViewById<EditText>(zondId[i*3+1]).text.toString().trim()
            var zondId3 = findViewById<EditText>(zondId[i*3+2]).text.toString().trim()
            var zond2Id1 = findViewById<EditText>(zond2Id[i*3]).text.toString().trim()
            var zond2Id2 = findViewById<EditText>(zond2Id[i*3+1]).text.toString().trim()
            var zond2Id3 = findViewById<EditText>(zond2Id[i*3+2]).text.toString().trim()

            var kr = 0
            var zond = 0

            val ktIdButColor1 = getColor(findViewById<Button>(krId[i*3]))
            val ktIdButColor2 = getColor(findViewById<Button>(krId[i*3+1]))
            val ktIdButColor3 = getColor(findViewById<Button>(krId[i*3+2]))
            val kt2IdButColor1 = getColor(findViewById<Button>(kr2Id[i*3]))
            val kr2IdButColor2 = getColor(findViewById<Button>(kr2Id[i*3+1]))
            val kr2IdButColor3 = getColor(findViewById<Button>(kr2Id[i*3+2]))

            if (ktIdButColor1 != Color.parseColor(but0Color)){
                kr +=1
            }
            if (ktIdButColor2 != Color.parseColor(but0Color)){
                kr +=1
            }
            if (ktIdButColor3 != Color.parseColor(but0Color)){
                kr +=1
            }
            if (kt2IdButColor1 != Color.parseColor(but0Color)){
                kr +=1
            }
            if (kr2IdButColor2 != Color.parseColor(but0Color)){
                kr +=1
            }
            if (kr2IdButColor3 != Color.parseColor(but0Color)){
                kr +=1
            }

            if (zondId1 == ""){
                zondId1 = "0"
            }
            if (zondId2 == ""){
                zondId2 = "0"
            }
            if (zondId3 == ""){
                zondId3 = "0"
            }
            if (zond2Id1 == ""){
                zond2Id1 = "0"
            }
            if (zond2Id2 == ""){
                zond2Id2 = "0"
            }
            if (zond2Id3 == ""){
                zond2Id3 = "0"
            }

            zond = max(max(max(max(max(max(0, zondId1.toInt()),zondId2.toInt()),zondId3.toInt()),zond2Id1.toInt()),zond2Id2.toInt()),zond2Id3.toInt())

            if (podvText == ""){
                podvText = "0"
            }

            if (podvText.toInt() == 0 && zond<3 && kr == 2){
                russelI = 1
            }
            if (podvText.toInt() == 0 && zond<3 && kr >=3){
                russelI = 2
            }
            if (podvText.toInt() == 0 && zond >=3 && zond <= 4){
                russelI = 4
            }
            if (podvText.toInt() == 0 && zond>4){
                russelI = 5
            }
            if (podvText.toInt() > 0 && zond>4){
                russelI = 8
            }
            russel += russelI
        }
        val russeld = russel.toDouble()/countExist().toDouble()
        russelText.text = String.format("%.3f", russeld)
        if (russeld < 0.1){
            russelInterpr.text = "Норма"
        }
        if (russeld in 0.1..1.0){
            russelInterpr.text = "Гингивит"
        }
        if (russeld > 1 && russeld < 2){
            russelInterpr.text = "Начальные деструктивные изменения"
        }
        if (russeld in 2.0..4.0){
            russelInterpr.text = "Выраженные деструктивные изменения"
        }
        if (russeld > 4){
            russelInterpr.text = "Деструктивные изменения в развившейся стадии"
        }
    }

    private fun ohis(){
        val ohisText = findViewById<TextView>(R.id.ohis)
        val ohisInterpr = findViewById<TextView>(R.id.ohis_interpr)

        val otlId = intArrayOf(R.id.otl18_1,R.id.otl18_2,R.id.otl18_3,R.id.otl17_1,R.id.otl17_2,R.id.otl17_3,R.id.otl16_1,R.id.otl16_2,R.id.otl16_3,R.id.otl15_1,R.id.otl15_2,R.id.otl15_3,
            R.id.otl14_1,R.id.otl14_2,R.id.otl14_3,R.id.otl13_1,R.id.otl13_2,R.id.otl13_3,R.id.otl12_1,R.id.otl12_2,R.id.otl12_3,R.id.otl11_1,R.id.otl11_2,R.id.otl11_3,
            R.id.otl28_1,R.id.otl28_2,R.id.otl28_3,R.id.otl27_1,R.id.otl27_2,R.id.otl27_3,R.id.otl26_1,R.id.otl26_2,R.id.otl26_3,R.id.otl25_1,R.id.otl25_2,R.id.otl25_3,
            R.id.otl24_1,R.id.otl24_2,R.id.otl24_3,R.id.otl23_1,R.id.otl23_2,R.id.otl23_3,R.id.otl22_1,R.id.otl22_2,R.id.otl22_3,R.id.otl21_1,R.id.otl21_2,R.id.otl21_3,
            R.id.otl38_1,R.id.otl38_2,R.id.otl38_3,R.id.otl37_1,R.id.otl37_2,R.id.otl37_3,R.id.otl36_1,R.id.otl36_2,R.id.otl36_3,R.id.otl35_1,R.id.otl35_2,R.id.otl35_3,
            R.id.otl34_1,R.id.otl34_2,R.id.otl34_3,R.id.otl33_1,R.id.otl33_2,R.id.otl33_3,R.id.otl32_1,R.id.otl32_2,R.id.otl32_3,R.id.otl31_1,R.id.otl31_2,R.id.otl31_3,
            R.id.otl48_1,R.id.otl48_2,R.id.otl48_3,R.id.otl47_1,R.id.otl47_2,R.id.otl47_3,R.id.otl46_1,R.id.otl46_2,R.id.otl46_3,R.id.otl45_1,R.id.otl45_2,R.id.otl45_3,
            R.id.otl44_1,R.id.otl44_2,R.id.otl44_3,R.id.otl43_1,R.id.otl43_2,R.id.otl43_3,R.id.otl42_1,R.id.otl42_2,R.id.otl42_3,R.id.otl41_1,R.id.otl41_2,R.id.otl41_3)

        val otl2Id = intArrayOf(R.id.otl182_1,R.id.otl182_2,R.id.otl182_3,R.id.otl172_1,R.id.otl172_2,R.id.otl172_3,R.id.otl162_1,R.id.otl162_2,R.id.otl162_3,R.id.otl152_1,R.id.otl152_2,R.id.otl152_3,
            R.id.otl142_1,R.id.otl142_2,R.id.otl142_3,R.id.otl132_1,R.id.otl132_2,R.id.otl132_3,R.id.otl122_1,R.id.otl122_2,R.id.otl122_3,R.id.otl112_1,R.id.otl112_2,R.id.otl112_3,
            R.id.otl282_1,R.id.otl282_2,R.id.otl282_3,R.id.otl272_1,R.id.otl272_2,R.id.otl272_3,R.id.otl262_1,R.id.otl262_2,R.id.otl262_3,R.id.otl252_1,R.id.otl252_2,R.id.otl252_3,
            R.id.otl242_1,R.id.otl242_2,R.id.otl242_3,R.id.otl232_1,R.id.otl232_2,R.id.otl232_3,R.id.otl222_1,R.id.otl222_2,R.id.otl222_3,R.id.otl212_1,R.id.otl212_2,R.id.otl212_3,
            R.id.otl382_1,R.id.otl382_2,R.id.otl382_3,R.id.otl372_1,R.id.otl372_2,R.id.otl372_3,R.id.otl362_1,R.id.otl362_2,R.id.otl362_3,R.id.otl352_1,R.id.otl352_2,R.id.otl352_3,
            R.id.otl342_1,R.id.otl342_2,R.id.otl342_3,R.id.otl332_1,R.id.otl332_2,R.id.otl332_3,R.id.otl322_1,R.id.otl322_2,R.id.otl322_3,R.id.otl312_1,R.id.otl312_2,R.id.otl312_3,
            R.id.otl482_1,R.id.otl482_2,R.id.otl482_3,R.id.otl472_1,R.id.otl472_2,R.id.otl472_3,R.id.otl462_1,R.id.otl462_2,R.id.otl462_3,R.id.otl452_1,R.id.otl452_2,R.id.otl452_3,
            R.id.otl442_1,R.id.otl442_2,R.id.otl442_3,R.id.otl432_1,R.id.otl432_2,R.id.otl432_3,R.id.otl422_1,R.id.otl422_2,R.id.otl422_3,R.id.otl412_1,R.id.otl412_2,R.id.otl412_3)

        val kamId = intArrayOf(R.id.kam18_1,R.id.kam18_2,R.id.kam18_3,R.id.kam17_1,R.id.kam17_2,R.id.kam17_3,R.id.kam16_1,R.id.kam16_2,R.id.kam16_3,R.id.kam15_1,R.id.kam15_2,R.id.kam15_3,
            R.id.kam14_1,R.id.kam14_2,R.id.kam14_3,R.id.kam13_1,R.id.kam13_2,R.id.kam13_3,R.id.kam12_1,R.id.kam12_2,R.id.kam12_3,R.id.kam11_1,R.id.kam11_2,R.id.kam11_3,
            R.id.kam28_1,R.id.kam28_2,R.id.kam28_3,R.id.kam27_1,R.id.kam27_2,R.id.kam27_3,R.id.kam26_1,R.id.kam26_2,R.id.kam26_3,R.id.kam25_1,R.id.kam25_2,R.id.kam25_3,
            R.id.kam24_1,R.id.kam24_2,R.id.kam24_3,R.id.kam23_1,R.id.kam23_2,R.id.kam23_3,R.id.kam22_1,R.id.kam22_2,R.id.kam22_3,R.id.kam21_1,R.id.kam21_2,R.id.kam21_3,
            R.id.kam38_1,R.id.kam38_2,R.id.kam38_3,R.id.kam37_1,R.id.kam37_2,R.id.kam37_3,R.id.kam36_1,R.id.kam36_2,R.id.kam36_3,R.id.kam35_1,R.id.kam35_2,R.id.kam35_3,
            R.id.kam34_1,R.id.kam34_2,R.id.kam34_3,R.id.kam33_1,R.id.kam33_2,R.id.kam33_3,R.id.kam32_1,R.id.kam32_2,R.id.kam32_3,R.id.kam31_1,R.id.kam31_2,R.id.kam31_3,
            R.id.kam48_1,R.id.kam48_2,R.id.kam48_3,R.id.kam47_1,R.id.kam47_2,R.id.kam47_3,R.id.kam46_1,R.id.kam46_2,R.id.kam46_3,R.id.kam45_1,R.id.kam45_2,R.id.kam45_3,
            R.id.kam44_1,R.id.kam44_2,R.id.kam44_3,R.id.kam43_1,R.id.kam43_2,R.id.kam43_3,R.id.kam42_1,R.id.kam42_2,R.id.kam42_3,R.id.kam41_1,R.id.kam41_2,R.id.kam41_3)

        val kam2Id = intArrayOf(R.id.kam182_1,R.id.kam182_2,R.id.kam182_3,R.id.kam172_1,R.id.kam172_2,R.id.kam172_3,R.id.kam162_1,R.id.kam162_2,R.id.kam162_3,R.id.kam152_1,R.id.kam152_2,R.id.kam152_3,
            R.id.kam142_1,R.id.kam142_2,R.id.kam142_3,R.id.kam132_1,R.id.kam132_2,R.id.kam132_3,R.id.kam122_1,R.id.kam122_2,R.id.kam122_3,R.id.kam112_1,R.id.kam112_2,R.id.kam112_3,
            R.id.kam282_1,R.id.kam282_2,R.id.kam282_3,R.id.kam272_1,R.id.kam272_2,R.id.kam272_3,R.id.kam262_1,R.id.kam262_2,R.id.kam262_3,R.id.kam252_1,R.id.kam252_2,R.id.kam252_3,
            R.id.kam242_1,R.id.kam242_2,R.id.kam242_3,R.id.kam232_1,R.id.kam232_2,R.id.kam232_3,R.id.kam222_1,R.id.kam222_2,R.id.kam222_3,R.id.kam212_1,R.id.kam212_2,R.id.kam212_3,
            R.id.kam382_1,R.id.kam382_2,R.id.kam382_3,R.id.kam372_1,R.id.kam372_2,R.id.kam372_3,R.id.kam362_1,R.id.kam362_2,R.id.kam362_3,R.id.kam352_1,R.id.kam352_2,R.id.kam352_3,
            R.id.kam342_1,R.id.kam342_2,R.id.kam342_3,R.id.kam332_1,R.id.kam332_2,R.id.kam332_3,R.id.kam322_1,R.id.kam322_2,R.id.kam322_3,R.id.kam312_1,R.id.kam312_2,R.id.kam312_3,
            R.id.kam482_1,R.id.kam482_2,R.id.kam482_3,R.id.kam472_1,R.id.kam472_2,R.id.kam472_3,R.id.kam462_1,R.id.kam462_2,R.id.kam462_3,R.id.kam452_1,R.id.kam452_2,R.id.kam452_3,
            R.id.kam442_1,R.id.kam442_2,R.id.kam442_3,R.id.kam432_1,R.id.kam432_2,R.id.kam432_3,R.id.kam422_1,R.id.kam422_2,R.id.kam422_3,R.id.kam412_1,R.id.kam412_2,R.id.kam412_3)

        var ohis = 0

        for (i in otlId.indices){
            val otlId1 = getColor(findViewById(otlId[i]))
            val otl2Id1 = getColor(findViewById(otl2Id[i]))

            val kamId1 = getColor(findViewById(kamId[i]))
            val kam2Id1 = getColor(findViewById(kam2Id[i]))

            if (otlId1 != Color.parseColor(but0Color)){
                ohis +=1
            }
            if (otl2Id1 != Color.parseColor(but0Color)){
                ohis +=1
            }
            if (kamId1 != Color.parseColor(but0Color)){
                ohis +=1
            }
            if (kam2Id1 != Color.parseColor(but0Color)){
                ohis +=1
            }

        }
        val ohisd = (ohis).toDouble()/(3f*countExist())
        if (ohisd < 0.7){
            ohisInterpr.text = "Хорошая гигиена"
        }
        if (ohisd >= 0.7 && ohisd <1.7){
            ohisInterpr.text = "Удовлетворительная гигиена"
        }
        if (ohisd >= 1.7 && ohisd <2.6){
            ohisInterpr.text = "Неудовлетворительная гигиена"
        }
        if (ohisd >=2.6){
            ohisInterpr.text = "Плохая гигиена"
        }
        ohisText.text = String.format("%.3f", ohisd)
    }
}
