package com.valera.java.lesson15;

public class Constructor {

    public void foo(){
        Flower flower = new Flower();   //создается объект без данных
        flower.name = "Роза";           //данному объекту присваивается Name
        flower.color = "Алая";          //и присваивается Color.
                                        //Это такое же выражение, что и выражение ниже.
                                        //только для него в классе Flower создается отдельный метод в виде
                                        //public void Flower(){
                                        //} в методе не прописаны данные Flower, они прописываются отдельно в начале.
                                        //flower.name или flower.color - ссылки на созданный объект и на индентификатор
                                        //типа String из класса Flower.
        Flower flower1 = new Flower("Тюльпан","Желтый"); //Здесь создан объект с присвоенными ему сразу
                                                                        //данными, которые прописаны в модификаторе.
        System.out.println(flower.name + " " + flower.color);           //Данный можификатор выглядит как:
        System.out.println(flower1.name + " " + flower1.color);         //public void Flower(String myName, String myColor){
                                                                        // name = myName;
                                                                        // color = myColor;}
    }
}
