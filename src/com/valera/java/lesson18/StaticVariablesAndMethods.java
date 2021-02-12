package com.valera.java.lesson18;

public class StaticVariablesAndMethods {
    public static int variable;         //статические переменные и методы являются переменными и методами класса,
    public int variable2;               //а не объекта.
    static{
        variable = statVarMeth();
    }

    public static int statVarMeth(){       //в статическом методе не получится вывести не статическую переменную,
        System.out.println(variable);      //тоже самое касается и методов.
        return 15;
        //foo();
    }
    public void foo(){                      //а в не статическом методе спокойно можно вывести статический метод.
        System.out.println("Hello");
        statVarMeth();
    }
}
