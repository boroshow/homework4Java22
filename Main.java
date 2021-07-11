package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> ArrayList1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите 5 слов");
        while
        (ArrayList1.size() < 5) {
            String str0 = scanner.nextLine();
            ArrayList1.add(str0);
        }
        info(ArrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Напишите 5 слов");

        while (arrayList2.size() < 5) {
            String str0 = scanner1.nextLine();
            arrayList2.add(str0);
        }
        info(arrayList2);

        ArrayList<String> arrayList3 = new ArrayList<>();
        Collections.reverse(arrayList2);
        Iterator<String> iterator = arrayList2.iterator();
        while
        (iterator.hasNext()){
            Iterator<String> iterator1 = ArrayList1.iterator();
            while (iterator.hasNext()) {
                arrayList3.add(iterator1.next());
                iterator1.remove();
                break;
            }
            arrayList3.add(iterator.next()); }
        System.out.println(arrayList3);
        System.out.println("Отсортирован");
        arrayList3.sort(Comparator.comparing((String::length)));
        System.out.println(arrayList3);
        }
        public static void info(ArrayList<?> arrayList) {
            System.out.println("___________________________________________");
            Iterator<?> iterator = arrayList.iterator();
            while
            (iterator.hasNext()) {
                System.out.println(iterator.next()); }
    }
}
