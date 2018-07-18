package com.example.a17010304.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView formula;
    ArrayList<MathFormula> alformulaList;
    CustomAdapter caList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formula = findViewById(R.id.lvView);

        alformulaList = new ArrayList<>();
        MathFormula shape1 = new MathFormula("Area of rectangle", "Length x Length", "Formula Type is: Area");
        MathFormula shape2 = new MathFormula("Area of triangle", "(Length of base * Length)/2 ", "Formula Type is: Area");
        MathFormula shape3 = new MathFormula("Area of Cube", "Length * Length * Length", "Formula Type is: Volume");
        alformulaList.add(shape1);
        alformulaList.add(shape2);
        alformulaList.add(shape3);

        caList = new CustomAdapter(this, R.layout.formula_list,alformulaList);

        formula.setAdapter(caList);
    }
}
