package com.improve10x.advancedtemplate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TemplateActivity extends AppCompatActivity {
    public ArrayList<Template> templates;
    public RecyclerView templateRv;
    public TemplateAdapter templateAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template);
        getSupportActionBar().setTitle("Template");
        setData();
        setUpTemplateUi();

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