package com.oreilly.chapter_1;

public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4) {
            x = x - 1;
            if (x < 1) {                            //100%
                System.out.print("a ");
            }
            x = x + 2;
            if (x < 4) {
                System.out.print("noise");
            }
            x = x + 2;
            if (x == 1) {                           //100%
                System.out.print("annoys");
            }
            if (x > 0) {
                System.out.print("an");
                System.out.print(" oyster");
            }
            System.out.println("");                 //100%
        }
    }
}
