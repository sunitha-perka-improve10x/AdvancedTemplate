package com.improve10x.advancedtemplate;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TemplateService {
    @GET("sunithaTemplate")
    Call<List<Template>> fetchTask();

}
