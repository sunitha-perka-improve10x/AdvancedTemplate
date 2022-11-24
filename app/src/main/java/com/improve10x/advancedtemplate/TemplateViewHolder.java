package com.improve10x.advancedtemplate;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TemplateViewHolder extends RecyclerView.ViewHolder {
    public TextView message;

    public TemplateViewHolder(@NonNull View itemView) {
        super(itemView);
        message = itemView.findViewById(R.id.template_plain_txt);
    }
}
