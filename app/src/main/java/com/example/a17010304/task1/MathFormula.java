package com.example.a17010304.task1;

public class MathFormula {
    String name;
    String formula;
    String type;

    public MathFormula(String name, String formula, String type) {
        this.name = name;
        this.formula = formula;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MathFormula{" +
                "name='" + name + '\'' +
                ", formula='" + formula + '\'' +
                '}';
    }

}
