package com.proteam.renew.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.TextView
import com.proteam.renew.R

class WorkerInformationNext1Activity : AppCompatActivity() {

    val sp_project: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_project) }
    val sp_skill_type: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_skill_type) }
    val sp_skill_set: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_skill_set) }
    val edt_worker_designation: EditText by lazy { findViewById<EditText>(R.id.edt_worker_designation) }
    val edt_doj: EditText by lazy { findViewById<EditText>(R.id.edt_doj) }
    val sp_Supervisor_name: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_Supervisor_name) }
    val sp_sub_contractor: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_sub_contractor) }
    val edt_contractor_contact_number: EditText by lazy { findViewById<EditText>(R.id.edt_contractor_contact_number) }
    val sp_induction_status: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_induction_status) }
    val edt_aadhaar_card: EditText by lazy { findViewById<EditText>(R.id.edt_aadhaar_card) }
    val sp_medical_test_status: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_medical_test_status) }
    val sp_report_is_ok: AutoCompleteTextView by lazy { findViewById<AutoCompleteTextView>(R.id.sp_report_is_ok) }


    val tv_previous: TextView by lazy { findViewById<AutoCompleteTextView>(R.id.tv_previous) }
    val tv_next_two: TextView by lazy { findViewById<AutoCompleteTextView>(R.id.tv_next_two) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_worker_information_next1)
    }
}