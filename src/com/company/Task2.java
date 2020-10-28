package com.company;

import java.util.Scanner;

public class Task2 {
    //    Спросить у ПЗ(пользователя) размер массива, после попросить
//    заполнить массив поэлементно.
//    Переставить элементы массива в обратном порядке
//    и показать получившийся массив ПЗ.

    public static void main(String[] args) {
//        task1();
        task2();
    }

    private static void task2() {
        String line = new Scanner(System.in).nextLine();
//        line.length() <- длина строки
//        "met"
//        line.charAt(1) <- возвращает char на индексе (1)
//        line.substring(0, 3) <- вытащить подстроку из String с индексами [0, 3)

        String[] fragments = new String[line.length() / 3];
        for (int i = 0; i < fragments.length; i++) {
            fragments[i] = line.substring(i * 3, i * 3 + 3);

            // i = 0 -> (0, 3)
            // i = 1 -> (3, 6)
            // i = 2 -> (6, 9)
        }

        show(fragments);
        for (int i = 0; i < fragments.length; i++) {
            fragments[i] = changeMiddleSymbol(fragments[i]);
        }
        show(fragments);
        while (true) {

            System.out.println(Math.random());
        }
    }

    private static String changeMiddleSymbol(String str) {
        char[] symbols = new char[]{
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'
        };
        char oldMiddleChar = str.charAt(1);
        int randomIndex = (int) (Math.random() * symbols.length);
        return "" + str.charAt(0) + symbols[randomIndex] + str.charAt(2);
    }

    private static void show(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i] + ", ");
            } else if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }

}
