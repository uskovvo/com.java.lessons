package com.valera.java.lesson5;

import com.valera.java.lesson10.ControlOperators;
import com.valera.java.lesson11.OperatorSwitch;
import com.valera.java.lesson12.LoopControl;
import com.valera.java.lesson13.ForLoop;
import com.valera.java.lesson14.MyArrays;
import com.valera.java.lesson7.Bus;
import com.valera.java.lesson8.References;
import com.valera.java.lesson9.Operation;

public class Main {
    public static void main(String[] args) {
        Bus ourBus = new Bus();
        Bus firstBus = new Bus();

        ourBus.color = "Red";
        firstBus.color = "Yellow";

        ourBus.numberOfStreet = 123;
        firstBus.numberOfStreet = 12;

        ourBus.showColor();
        firstBus.showColor();

        ourBus.showNumberOfStreet();
        firstBus.showNumberOfStreet();
    }
}
