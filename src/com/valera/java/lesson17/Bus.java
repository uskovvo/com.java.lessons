package com.valera.java.lesson17;

public class Bus {
    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String serialNumber = "G4FRD10";

    public void Engine() {
        engine.type = "Benzine";
    }

    public void go(){
        System.out.println("Go");


    }
    public int showKm(){
        int km = 115;
        return km;
    }
    public void showKm2(int km2){  //метод принимает значение "km" из класса MainBusL17 и присваивает его к переменной km2
        System.out.println(km2);   //далее мы можем с этой перемнной работать, вывести значение в консоль или решить уравнение.
    }
    public void showKm3(String km4){ //аналогично, только с переменной String.
        System.out.println(km4);
    }
}
