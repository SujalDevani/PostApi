package com.example.postapi;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface Interface {

    @POST("user")
    Call<PostData> post2(@Body PostData dataModal2);

}