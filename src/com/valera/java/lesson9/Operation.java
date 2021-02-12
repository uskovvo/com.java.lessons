package com.valera.java.lesson9;

public class Operation {
    int a = 6, b = 10, c;
    String str1 = "Hot?";
    String str2 = "What";
    String result;

    public void foo(){
        c = a * b;
        Boolean h = a>b;
        result = str2 + " " + str1;
        System.out.println(h);
        System.out.println(result);

        /*                +=      -=     *=     %=    /=
                         a+=b    a-=b   a*=b   a%=b  a/=b
    Тоже самое,что и     a=a+b  a=a-b  a=a*b  a=a%b a=a/b
         */
        /* a++; тоже самое, что a = a + 1;
           b--; тоже самое, что b = b - 1;
         */
    }
}
