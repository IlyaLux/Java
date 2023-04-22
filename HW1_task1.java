package org.sem1;

import java.util.ArrayList;
import java.util.Random;

public class HW1_task1 {
    public static void main(String[] args) {
//        Random random = new Random();
        int i = new Random().nextInt(0, 2000);
        System.out.println("Случайное число = " + i);

        int n = Integer.toBinaryString(i).length();
        System.out.println("Номер старшего значащего бита выпавшего числа = " + n);

        ArrayList<String> m1 = new ArrayList<>();
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1.add(String.valueOf(j));
            }
        }
        m1.toArray();
        System.out.println("Массив m1 = "+ m1);

        ArrayList<String> m2 = new ArrayList<>();
//        for (int k = Short.MIN_VALUE; k < i; k++) {
        for (int k = -100; k < i; k++) {
            if (k % n != 0) {
                m2.add(String.valueOf(k));
            }
        }
        m2.toArray();
        System.out.println("Массив m2 = "+ m2);
    }
}