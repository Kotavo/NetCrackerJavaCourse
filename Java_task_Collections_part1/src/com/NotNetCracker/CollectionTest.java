package com.NotNetCracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTest {

    public static void MyListCompareToLinkedList(int size){

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        int middle = (size/2);
        int temp = size/10;
        long startTime1, startTime2;
        double estimatedTime1, estimatedTime2;
        for(int i = 0; i < size;i++){
            myLinkedList.add("Element [ " + i + " ]");
            linkedList.add("Element [ " + i + " ]");
        }

        System.out.println("All tests performed for " + size +" elements");
        System.out.println("Time to getting " + temp +" elements by index: ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            myLinkedList.get(middle+i);
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            linkedList.get(middle + i);
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        System.out.println("MyLinkedList: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedList " + estimatedTime2 + " millisec"+ "\n");

        System.out.println("Time to getting index of " + temp + " elements: ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            myLinkedList.indexOf("Emenet [ " + (middle + i) + " ]");
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            linkedList.indexOf("Emenet [ " + (middle + i) + " ]");
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        System.out.println("MyLinkedList: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedList " + estimatedTime2 + " millisec" + "\n");

        System.out.println("Time to add " + temp + " elements into the middle of collection: ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            myLinkedList.add(middle+i, "Test element " + i);
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            linkedList.add(middle+i, "Test element " + i);
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        System.out.println("MyLinkedList: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedList " + estimatedTime2 + " millisec" + "\n");

        System.out.println("Time to remove " + temp + " elements from the middle of Collection: ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            myLinkedList.remove(middle + i);
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            linkedList.remove(middle + i);
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        System.out.println("MyLinkedList: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedList " + estimatedTime2 + " millisec" + "\n");

    }

    public static void ArrayListCompareToLinkedList(int size){
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        int middle = (size/2);
        int temp = size/10;
        long startTime1, startTime2;
        double estimatedTime1, estimatedTime2;
        for(int i = 0; i < size;i++){
            arrayList.add("Element [ " + i + " ]");
            linkedList.add("Element [ " + i + " ]");
        }

        System.out.println("All tests performed for " + size +" elements");
        System.out.println("Time to add " + temp +" elements into the end of collection: ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++){
            arrayList.add("Test element " + i);
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++){
            linkedList.add("Test element " + i);
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        System.out.println("ArrayList: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedList " + estimatedTime2 + " millisec" + "\n");


        System.out.println("Time to add " + temp + " elements into the middle of collection: ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++){
            arrayList.add(middle+i,"Test element [ " + (middle+i) + " ]");
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++){
            linkedList.add(middle+i,"Test element [ " + (middle+i) + " ]");
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        System.out.println("ArrayList: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedList " + estimatedTime2 + " millisec" + "\n");

        System.out.println("Time to remove " + temp + " elements from the middle of collection: ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            arrayList.remove(middle+i);
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            linkedList.remove(middle+i);
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        System.out.println("ArrayList: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedList " + estimatedTime2 + " millisec" + "\n");
    }

    public static void HashSetCompareToLinkedHashSetAndTreeSet(int size){
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        int middle = (size/2);
        int temp = size/10;
        long startTime1, startTime2, startTime3;
        double estimatedTime1, estimatedTime2, estimatedTime3;
        for(int i = 0; i < size;i++){
            hashSet.add("Element [ " + i + " ]");
            linkedHashSet.add("Element [ " + i + " ]");
            treeSet.add("Element [ " + i + " ]");
        }

        System.out.println("All tests performed for " + size +" elements");
        System.out.println("Time to add " + temp +" elements into the end of collection: ");;
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            hashSet.add("Test element " + i);
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            linkedHashSet.add("Test element " + i);
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        startTime3 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            treeSet.add("Test element " + i);
        }
        estimatedTime3 = (System.nanoTime() - startTime1) / 1000000.0;
        System.out.println("HashSet: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedHashSet: " + estimatedTime2 + " millisec" + "\n"
            + "TreeSet: " + estimatedTime3 + " millisec" + "\n");


        System.out.println("Time to remove " + temp + " elements from the middle of collection: ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            hashSet.remove("Test element " + i);
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            linkedHashSet.remove("Test element " + i);
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        startTime3 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            treeSet.remove("Test element " + i);
        }
        estimatedTime3 = (System.nanoTime() - startTime1) / 1000000.0;
        System.out.println("HashSet: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedHashSet: " + estimatedTime2 + " millisec" + "\n"
            + "TreeSet: " + estimatedTime3 + " millisec" + "\n");
    }

    public static void HashMapCompareToLinkedHashMapAndTreeMap(int size){
        HashMap<Integer,String> hashMap = new HashMap();
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap();
        TreeMap<Integer,String> treeMap = new TreeMap();
        int middle = (size/2);
        int temp = size/10;
        long startTime1, startTime2, startTime3;
        double estimatedTime1, estimatedTime2, estimatedTime3;
        for(int i = 0; i < size;i++){
            hashMap.put(i,"Element [ " + i + " ]");
            linkedHashMap.put(i,"Element [ " + i + " ]");
            treeMap.put(i,"Element [ " + i + " ]");
        }

        System.out.println("All tests performed for " + size +" elements");
        System.out.println("Time to put " + temp +" elements into the end of collection: ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            hashMap.put(size+i, "Test element " + i);
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            linkedHashMap.put(size+i, "Test element " + i);
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        startTime3 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            treeMap.put(size+i, "Test element " + i);
        }
        estimatedTime3 = (System.nanoTime() - startTime1) / 1000000.0;
        System.out.println("HashMap: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedHashMap: " + estimatedTime2 + " millisec" + "\n"
            + "TreeMap: " + estimatedTime3 + " millisec" + "\n");

        System.out.println("Time to replace " + temp + " elements with Key( " + middle + " .... " + (middle+temp) + "): ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            hashMap.replace(middle + i, "Test element " + i);
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            linkedHashMap.replace(middle + i, "Test element " + i);
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        startTime3 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            treeMap.replace(middle + i, "Test element " + i);
        }
        estimatedTime3 = (System.nanoTime() - startTime1) / 1000000.0;
        System.out.println("HashMap: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedHashMap: " + estimatedTime2 + " millisec" + "\n"
            + "TreeMap: " + estimatedTime3 + " millisec" + "\n");


        System.out.println("Time to remove " + temp +  "elements from the middle of collection: ");
        startTime1 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            hashMap.remove(middle, "Test element " + i);
        }
        estimatedTime1 = (System.nanoTime() - startTime1) / 1000000.0;
        startTime2 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            linkedHashMap.remove(middle, "Test element " + i);
        }
        estimatedTime2 = (System.nanoTime() - startTime2) / 1000000.0;
        startTime3 = System.nanoTime();
        for(int i = 0; i < temp;i++) {
            treeMap.remove(middle, "Test element " + i);
        }
        estimatedTime3 = (System.nanoTime() - startTime1) / 1000000.0;
        System.out.println("HashMap: " + estimatedTime1 + " millisec" + "\n"
            + "LinkedHashMap: " + estimatedTime2 + " millisec" + "\n"
            + "TreeMap: " + estimatedTime3 + " millisec" + "\n");
    }
}
