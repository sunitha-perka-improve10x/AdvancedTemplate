package com.improve10x.advancedtemplate;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface TemplateService {
    @GET("sunithaTemplate")
    Call<List<Template>> fetchTask();
    @POST("sunithaTemplate")
    Call<Template> createTask(@Body Template template);


}
