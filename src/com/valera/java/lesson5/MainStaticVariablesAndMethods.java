package com.valera.java.lesson5;

import com.valera.java.lesson18.StaticVariablesAndMethods;

public class MainStaticVariablesAndMethods {
    public static void main(String[] args) {
        StaticVariablesAndMethods stVarMeth = new StaticVariablesAndMethods();

        StaticVariablesAndMethods.variable = 10;

        stVarMeth.statVarMeth();
    }
}
