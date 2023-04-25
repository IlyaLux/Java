//Основание -5, стапень 3, результат равен
//        Основание 127, стапень 2, результат равен
//        Основание 33, стапень 15, результат равен
//        Основание 4, стапень 7, результат равен
package org.sem1;

public class Sem2_task1 {
    public static void main(String[] args) {
        System.out.println(parse_string("Основание -5, стапень -3, результат равен"));
        System.out.println(parse_string("Основание 127, стапень 2, результат равен"));
        System.out.println(parse_string("Основание 33, стапень 15, результат равен"));
        System.out.println(parse_string("Основание 4, стапень 7, результат равен"));
        //        StringBuilder builder = new StringBuilder("Основание -5, стапень 3, результат равен");
    }


    public static String parse_string(String in_string) {
        String[] strings = in_string.split(" ");
        int base = 0;
        int power = 0;
        double product = 0;
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replace(",", "");
            try {
                Integer.parseInt(strings[i]);
                if (base == 0) {
                    base = Integer.parseInt(strings[i]);
                } else {
                    power = Integer.parseInt(strings[i]);
                }
            } catch (NumberFormatException e) {
                continue;
            }
        }
        product = Math.pow(base, power);
        return in_string + " " + String.valueOf(product);
    }
}
