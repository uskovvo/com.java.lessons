package com.valera.java.lesson14;

public class MyArrays {

    int [] array = new int[7];
    Candy [] box = new Candy[9]; /*[] box является массивом (хранилищем) Candy,
                                    //создается Объект и сразу ему прописывается значение (кол-во)*/

    int [] array2 = {10, 50, 38};
    Candy candy1 = new Candy();
    Candy candy2 = new Candy();
    Candy candy3 = new Candy();

    Candy [] box2 = {candy1, candy2, candy3};

    Candy [] box3;

    public void foo() {
        System.out.println(array2[0]);      //выводим на экран ссылку на объект, который лежит в [нулевой
        System.out.println(box2[1]);        //ячейке] (нулевая ячейка - это первая ячейка в массиве, соответственно
        System.out.println(box2[2]);        //[1] - это вторая ячейка, [2] - это третья ячейка.

        for (int i = 0; i<array2.length; i++ ) {  // выполняется условие, пока array2.lenght (длина array2,
            System.out.println(array2[i]);       // точнее длина ячейки массива array2) больше значения i,
                                                 //i увеличивается на один и на экран выводятся все значения ячейки.
        }


        int[][] array3 = new int[12][32];
        int[][][] array4 = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};

        System.out.println(array4[1][1][0]);
    }
}
