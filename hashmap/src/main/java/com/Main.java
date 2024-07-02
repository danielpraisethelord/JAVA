package com;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1000, "Juan");
        hashMap.put(3000, "Ana");
        hashMap.put(1500, "Pepe");
        System.out.println(hashMap);

        System.out.println(hashMap.get(1000));

        hashMap.remove(3000);
        System.out.println(hashMap);
        
        if (hashMap.containsKey(1500)) {
            System.out.println("Efectivamente, esta el valor uwu");            
        }

        for (Integer indice : hashMap.keySet()) {
            System.out.println(hashMap.get(indice));
        }
    }
}