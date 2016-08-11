package ru.veryevilzed.example;

import java.io.Console;

/**
 * Created by zed on 11.08.16.
 */
public class Tools {

    public static void calculate(MyContext o) {
        System.out.println("RES=" + o.index);
        o.index += 10;
    }

    public static void calculateObject(Object o) {
        if (o instanceof Integer){
           o = ((Integer)o) + 1;
        }
    }


}
