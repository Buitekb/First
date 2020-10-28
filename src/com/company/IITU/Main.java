package com.company.IITU;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IITUChild iitu = new IITUChild();
        iitu.read_input();
        iitu.display();

    }

      public static class IITUBase{
        int width,height;
        public void display(){
            System.out.println(width + " "+ height);
        }

    }

    static class IITUChild extends IITUBase{
        void read_input() {
            Scanner sc = new Scanner(System.in);
            this.width = sc.nextInt();
            this.height = sc.nextInt();
        }

        @Override
        public void display() {
            super.display();
            System.out.println(width * height);
        }
    }
}
