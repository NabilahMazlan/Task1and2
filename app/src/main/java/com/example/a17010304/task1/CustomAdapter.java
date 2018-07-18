package com.example.a17010304.task1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<MathFormula> formulaList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MathFormula> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        formulaList = objects;

    }
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvShape = rowView.findViewById(R.id.textViewShape);
        TextView tvFormula = rowView.findViewById(R.id.textViewFormula);
        TextView tvType = rowView.findViewById(R.id.textViewType);
        MathFormula currentItem = formulaList.get(position);
        tvShape.setText(currentItem.getName());
        tvFormula.setText(currentItem.getFormula());
        tvType.setText(currentItem.getType());
        return rowView;
    }

}
