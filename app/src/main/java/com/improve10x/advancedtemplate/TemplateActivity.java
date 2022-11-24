package com.improve10x.advancedtemplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TemplateActivity extends AppCompatActivity {
    public ArrayList<Template> templates;
    public RecyclerView templateRv;
    public TemplateAdapter templateAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        getSupportActionBar().setTitle("Template");
        addTemplate();
        setData();
        setUpTemplateUi();

    }

    @Override
    protected void onResume() {
        super.onResume();
        fetchData();
    }

    private void addTemplate() {
        Button addBtn = findViewById(R.id.template_add_btn);
        addBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,AddTemplateActivity.class);
            startActivity(intent);

        });

    }

    private void fetchData() {
        TemplateApi templateApi = new TemplateApi();
        TemplateService templateService = templateApi.createTemplateService();
        Call<List<Template>> call = templateService.fetchTask();
        call.enqueue(new Callback<List<Template>>() {
            @Override
            public void onResponse(Call<List<Template>> call, Response<List<Template>> response) {
                List<Template> Lists = response.body();
                templateAdapter.setData(Lists);
            }

            @Override
            public void onFailure(Call<List<Template>> call, Throwable t) {
                Toast.makeText(TemplateActivity.this, "Drop Down", Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void setUpTemplateUi() {
        templateRv = findViewById(R.id.template_rv);
        templateRv.setLayoutManager(new LinearLayoutManager(this));
        templateAdapter = new TemplateAdapter();
        templateAdapter.setData(templates);
        templateRv.setAdapter(templateAdapter);
    }

    public void setData() {
        templates = new ArrayList<>();
        Template hi = new Template();
        hi.message = "HI";
        templates.add(hi);

        Template hello = new Template();
        hello.message = "Hello";
        templates.add(hello);
    }
}