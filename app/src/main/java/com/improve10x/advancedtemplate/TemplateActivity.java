package com.improve10x.advancedtemplate;

import androidx.appcompat.app.AppCompatActivity;
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

    }
}