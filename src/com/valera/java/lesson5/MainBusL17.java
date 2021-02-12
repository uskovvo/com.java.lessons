package com.valera.java.lesson5;

import com.valera.java.lesson17.Bus;
import com.valera.java.lesson17.Engine;

public class MainBusL17 {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.go();
        System.out.println(bus.showKm());
        int km = 155;       //создаем переменную и теперь она может быть передана в класс Bus
        bus.showKm2(km);    //здесь передается переменная "km" в класс Bus в метод "showKm2"
        String km3 = "78";
        bus.showKm3(km3);
        bus.Engine();

    }
}
