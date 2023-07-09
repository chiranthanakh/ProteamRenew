package com.proteam.renew.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.ImageView
import android.widget.TextView
import com.proteam.renew.R

class WorkerInformationNext2Activity : AppCompatActivity() {

    val select_aadhar_card: ImageView by lazy { findViewById<ImageView>(R.id.select_aadhar_card) }
    val select_driving_licence: ImageView by lazy { findViewById<ImageView>(R.id.select_driving_licence) }
    val select_medical_certificate: ImageView by lazy { findViewById<ImageView>(R.id.select_medical_certificate) }

    val tv_previous_two: TextView by lazy { findViewById<TextView>(R.id.tv_previous_two) }
    val tv_submit: TextView by lazy { findViewById<TextView>(R.id.tv_submit) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker_information_next2)
    }
}