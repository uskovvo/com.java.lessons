package com.valera.java.lesson13;

public class ForLoop {

    int [] array = {1, 2, 3,4,5,6,7,8,9,10};

    public void foo (){
        for(int a = 1; a<8; a++){      /*int a - начальное данное. Пока выполняется условие что а<5,
                                        будет выполнятся программа вывода на экран, с последущим увеличение
                                        int a на 1.*/
            System.out.println(a);
        }
        for (int element: array){
            System.out.println(element);
        }
    }
}
