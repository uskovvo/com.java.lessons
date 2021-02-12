package com.valera.java.lesson15;

public class Flower {
    String name;
    String color;

    public Flower(){    //дает возможность описать цветок данным способом
                        //Flower flower = new Flower();
                        //flower.name = "Роза";
                        //flower.color = "Алая";
    }
    public Flower (String myName, String myColor){  //дает возможность описать цветок данным способом
        name = myName;                              //Flower flower1 = new Flower("Тюльпан","Желтый");
        color = myColor;
    }
}
