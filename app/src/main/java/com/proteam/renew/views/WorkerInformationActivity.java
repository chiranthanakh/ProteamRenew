package com.proteam.renew.views;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import com.proteam.renew.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class WorkerInformationActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv_nav_view;
    EditText edt_dob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_information);

        iv_nav_view = findViewById(R.id.iv_nav_view);
        iv_nav_view.setOnClickListener(this);
        edt_dob = findViewById(R.id.edt_dob);
        edt_dob.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.iv_nav_view:

                finish();
                break;
            case R.id.edt_dob:

                datePicker_diaog();
                break;

        }
    }

    private void datePicker_diaog() {
        final Calendar newCalendar = Calendar.getInstance();
        final DatePickerDialog mDatePicker = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                String myFormat = "dd-MM-yyyy"; //In which you need put here
                SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.ENGLISH);

                edt_dob.setText(sdf.format(newDate.getTime()));

            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        mDatePicker.getDatePicker().setMaxDate(System.currentTimeMillis());
        mDatePicker.show();

    }
}