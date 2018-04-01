package com.company;

public class Main {

    public static void main(String[] args) {
        int array[] = new int[4];
        boolean growth = false;

            for (int i = 0; i < 4; i++) {
                array[i] = (int) (Math.random() * 90 + 10);
                System.out.print(array[i] + " ");
                if (i >= 1) {
                    if (array[i] <= array[i - 1]){
                        growth = false;}
                }
            }
            System.out.println();
            if (growth) {
                System.out.println("growth");
            }else {
                System.out.println("chaos");
            }

    }
}
