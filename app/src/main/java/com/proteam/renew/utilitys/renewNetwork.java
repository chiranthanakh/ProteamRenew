package com.proteam.renew.utilitys;

import com.proteam.renew.responseModel.LocationResponse;
import com.proteam.renew.responseModel.LoginResponse;
import com.proteam.renew.responseModel.StatesResponsce;
import com.proteam.renew.responseModel.WorkersModelItem;
import com.proteam.renew.responseModel.statesResponse;
import com.proteam.renew.responseModel.statesResponseItem;


import java.util.List;
import java.util.Map;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface renewNetwork {
    @POST("login")
    @FormUrlEncoded
    Call<LoginResponse> validatelogin(@FieldMap Map<String,String> params);

    @GET("viewStateMaster")
    Call<List<statesResponseItem>> stateslist();

    @GET("viewLocationMaster")
    Call<List<LocationResponse>> locationlist();

    @GET("workers")
    Call<List<WorkersModelItem>> workerslist();
   }
