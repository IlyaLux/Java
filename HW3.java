package org.sem1;

import java.util.*;

public class HW3 {
    public static void main(String[] args) {
        // task1
        System.out.println("Task1");
        List<Integer> list5 = new ArrayList<>();
        for (int i = 0; i < 10; i++) list5.add(new Random().nextInt(15));
        System.out.println("Несортированный список = " + list5);
        list5.sort(Comparator.reverseOrder());
        System.out.println("Сортированный список   = " + list5);
        System.out.println();

        // task2
        System.out.println("Task2");
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) list1.add(new Random().nextInt(15));
        System.out.println(list1);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 != 0) {
                list1.remove(i);
                i -= 1;
            }
        }
        System.out.println(list1);
        System.out.println();

        //task3
        System.out.println("Task3");
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) list2.add(new Random().nextInt(15));
        System.out.println(list2);
        System.out.println("Максимальное значение = " + Collections.max(list2));
        System.out.println("Минимальное значение = " + Collections.min(list2));
        System.out.println();

        //task4
        System.out.println("Task4");
        System.out.println("Список 1 = " + list1);
        System.out.println("Список 2 = " + list2);
        List<Integer> list3 = new ArrayList<>(list1);
        for (int i = 0; i < list2.size(); i++) {
            if (!list1.contains(list2.get(i))) list3.add(list2.get(i));

//            int temp = 0;
//            for (int j = 0; j < list1.size(); j++) {
//                if (Objects.equals(list1.get(j), list2.get(i))) {
//                    temp += 1;
//                }
//            }
//            if (temp == 0) {
//                list3.add(list2.get(i));
//            }
        }
        System.out.println("Список 3 = " + list3);
        System.out.println();

        //task5
        long begin = System.currentTimeMillis();
        System.out.println("Task5");
        List<String> list4 = new ArrayList<>();
        list4.add(0, "0".repeat(10000));
        System.out.println(list4);
        long end = System.currentTimeMillis();
        System.out.println("Время выполнения = " + (end - begin));
        System.out.println();

        //task6
        long start = System.currentTimeMillis();
        System.out.println("Task6");
        LinkedList<String> list6 = new LinkedList<>();
        list6.add(0, "0".repeat(10000));
        System.out.println(list6);
        long finish = System.currentTimeMillis();
        System.out.println("Время выполнения = " + (finish - start));
    }

}
