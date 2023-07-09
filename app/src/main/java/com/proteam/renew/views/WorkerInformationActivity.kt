package com.proteam.renew.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.proteam.renew.R

class WorkerInformationActivity : AppCompatActivity() {

    val edt_employee_name: EditText by lazy { findViewById<EditText>(R.id.edt_employee_name) }
    val edt_guardian_name: EditText by lazy { findViewById<EditText>(R.id.edt_guardian_name) }
    val edt_dob: EditText by lazy { findViewById<EditText>(R.id.edt_dob) }
    val sp_gender: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_gender) }
    val edt_phone_number: EditText by lazy { findViewById<EditText>(R.id.edt_phone_number) }
    val edt_emergency_number: EditText by lazy { findViewById<EditText>(R.id.edt_emergency_number) }
    val nationality: EditText by lazy { findViewById<EditText>(R.id.nationality) }
    val sp_blood_group: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_blood_group) }
    val edt_address: EditText by lazy { findViewById<EditText>(R.id.edt_address) }
    val sp_state: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_state) }
    val sp_location: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_location) }
    val edt_pincode: EditText by lazy { findViewById<EditText>(R.id.edt_pincode) }

    val tv_next_one: TextView by lazy { findViewById<TextView>(R.id.tv_next_one) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker_information)

        tv_next_one.setOnClickListener {

            val intent = Intent(applicationContext, WorkerInformationNext1Activity::class.java)
            startActivity(intent)

        }
    }
}