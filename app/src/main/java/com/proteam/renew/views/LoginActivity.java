package com.proteam.renew.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.proteam.renew.R;
import com.proteam.renew.requestModels.Loginmodel;
import com.proteam.renew.responseModel.LoginResponse;
import com.proteam.renew.responseModel.StatesResponsce;
import com.proteam.renew.utilitys.OnResponseListener;
import com.proteam.renew.utilitys.WebServices;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, OnResponseListener {

    AppCompatButton btn_continue;
    ProgressDialog progressDialog;
    EditText edt_email,edt_pass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_continue = findViewById(R.id.btn_continue);
        edt_pass = findViewById(R.id.et_password);
        edt_email = findViewById(R.id.et_user_name);
        btn_continue.setOnClickListener(this);
    }

    private void callLoginapi() {
        progressDialog=new ProgressDialog(LoginActivity.this);
        if(progressDialog!=null)
        {
            if (!progressDialog.isShowing()) {
                progressDialog.setCancelable(false);
                progressDialog.setMessage("Please wait...");
                progressDialog.show();
                Loginmodel loginmodel = new Loginmodel(edt_email.getText().toString().trim(), edt_pass.getText().toString().trim());

                WebServices<LoginResponse> webServices = new WebServices<LoginResponse>(LoginActivity.this);
                webServices.login(WebServices.ApiType.login, loginmodel);
            } else {

            }
        }
    }

    @Override
    public void onResponse(Object response, WebServices.ApiType URL, boolean isSucces, int code) {
        switch (URL) {
            case login:
                if(progressDialog!=null)
                {
                    if(progressDialog.isShowing())
                    {
                        progressDialog.dismiss();
                    }
                }

                if (isSucces) {
                    LoginResponse loginResponse = (LoginResponse) response;
                    if(loginResponse.getStatus().equals("true")){
                        SharedPreferences prefs = getSharedPreferences("myPref", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = prefs.edit();
                       // editor.putString("userid",loginResponse.getUser_id());
                        //editor.putString("role",loginResponse.getRole());
                        //editor.putString("username",loginResponse.getUsername());
                        editor.commit();
                        Intent intent= new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();

                    }else{
                        Toast.makeText(this, "Please enter correct login details", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    Toast.makeText(this, "Check your internet connection", Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_continue:
                Intent intent= new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);

                //WebServices<StatesResponsce> webServices = new WebServices<StatesResponsce>(LoginActivity.this);
                //webServices.states(WebServices.ApiType.states);
                /*if(!edt_email.getText().toString().equals("")){

                    if (!edt_pass.getText().toString().equals("")){
                        callLoginapi();
                    }else {
                        Toast.makeText(LoginActivity.this,"Enter your password",Toast.LENGTH_LONG).show();
                    }

                }else {
                    Toast.makeText(LoginActivity.this,"Enter your email-id",Toast.LENGTH_LONG).show();
                }*/
                break;
        }
    }
}