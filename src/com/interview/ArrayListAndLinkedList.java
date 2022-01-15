package com.interview;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {

        // 涉及到泛型
        // ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Object> arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("2");
        arrayList.add("abc");
        System.out.println(arrayList);


        LinkedList linkedList = new LinkedList<>();
    }
}
