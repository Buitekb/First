package com.company;

import java.util.Scanner;

//import java.util.Scanner;
public class Main {
    // write your code here
    //спросить у ПЗ(пользователя) размер массива,после попросить
    //заполнить массив поэлементно
    //Переставить элементы массива в обратном порядке
    //и показать получившийся массив ПЗ

    public static void main(String[] args) {
//        task1();
        task2();

    }
    private static void task2(){
        String line = new Scanner(System.in).nextLine();
        String[] fragments = new String[line.length()/3];
        for (int i = 0;i < fragments.length; i++){
            fragments[i] = line.substring(i * 3, i * 3 +3);
        }
        show(fragments);
        for (int i = 0; i < fragments.length; i++){
            fragments[i] = changeMiddleSymbol(fragments[i]);
        }
        show(fragments);
    }

    private static String changeMiddleSymbol(String str){
        char[] symbols = new char[]{
                'a','b','c','d','e','f','g','h','i','j','k'
        };
        char oldMiddleChar = str.charAt(1);
        int randomIndex = (int)(Math.random()*symbols.length);
        return "" + str.charAt(0) + symbols[randomIndex] + str.charAt(2);
    }
    private static void show(String[] array){
        for (int i = 0; i < array.length; i++){
            if (i == 0){
                System.out.println("[" + array[i] + ",");
            }else if(i == array.length - 1){
                System.out.println(array[i] + "]");
            }else{
                System.out.println(array[i] + ",");
            }
        }
    }




    //begintask1
//
//    //основной метод для задачи
//    private static void task1() {
//        int size = getIntFromConsole("Напишите размер массива: ");
//        int[] array = getUserArray(size);
//        showArray(array);
//        System.out.println("После переворота");
//        int[] reverse = reverseArray(array);
//        showArray(reverse);
//    }
//
//    //метод чтения числа. Возвращает int
//    private static int getIntFromConsole(String txt) {
//        System.out.println(txt);
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextInt();
//    }
//
//    //метод, возвращающий массив из n элементов
//    private static int[] getUserArray(int size) {
//        int[] result = new int[size];
//        for (int i = 0; i < result.length; i++) {
//            result[i] = getIntFromConsole("Введите " + (i+1) + "элемент:");
//        }
//        return result;
//    }
//    //метод,возвращающий массив с переставленными в обратном порядке элементами
//    private static int[] reverseArray(int[] array){
//        for (int i = 0; i < array.length/2; i++){
//            int temp = array[i];
//            array[i] = array[array.length-1-i];
//            array[array.length-1-i] = temp;
//        }
//        return array;
//    }
//
//    private static void showArray(int[] array){
//        for (int i = 0; i<array.length; i++){
//            if (i == 0){
//                System.out.println("[" + array[i] + ",");
//            }
//            else if (i == array.length - 1){
//                System.out.println(array[i] + "]");
//            }
//            else{
//                System.out.println(array[i] + ",");
//            }
//        }
//    }
    //endoftask1

}
