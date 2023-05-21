package org.sem1;

import java.util.*;

public class sem5 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Пять", "Five");
        map.put("Два", "Two");
        map.put("Один", "One");

        String str = map.get("Пять");
        System.out.println(str);

        map.remove("Пять");
        map.remove("Пять", "Five");

        map.put("Пять", "Five");

//        for (String key: map.keySet()) {
//            System.out.println(map.get(key));
//        }
//
//        Iterator<String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//            System.out.println(map.get(key));
//        }
//
//        Set keys = map.keySet();
//        for (int i=0; i< keys.size();i++){
//            System.out.println(map.get(keys.toArray()[i]));
//        }

        map.replace("Пять", "5");
        map.replace("Пять", "Five", "5");

        map.getOrDefault("Шесть", "0");
        map.containsKey("Шесть");
        map.containsValue("5");
        map.putIfAbsent("Шесть", "6");
        map.forEach((k, v) -> System.out.println(k + " " + v));

        map.compute("Шесть", (k, v) -> v += "!");

        map.computeIfPresent("Шесть", (k, v) -> v + "!?");
        map.computeIfAbsent("Шесть", v -> v + "!?!");

        for (String key : map.keySet()) {
//            map.compute(key, (k, v) -> v+"!");
            map.merge(key, "!", String::concat);
        }

        System.out.println(map);

        map.merge("Семь", "7", String::concat);

        System.out.println(map);

        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("Пять", "Five");
        hashMap.put("Два", "Two");
        hashMap.put("Один", "One");
        hashMap.putIfAbsent("Шесть", "6");
        System.out.println(hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        treeMap.put(5, "Five");
        treeMap.put(2, "Two");
        treeMap.put(1, "One");
        treeMap.putIfAbsent(6, "6");
        System.out.println(treeMap.headMap(2, true));
        System.out.println(treeMap.tailMap(2, false));

        int[] ints;
        ArrayList<Integer> integers;
        HashMap<Integer, Integer> map1;


    }
}