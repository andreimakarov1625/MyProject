package hw_23_09_2020;

import  java.util.Random;

public class HW7 {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] arr = new int [2][];
        int min = 1;
        int max = 20;

        for (int i = 0; 1 < arr.length; i++){
            arr [i] = new int[random.nextInt(max - min) + min];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(max - min) + min;
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }

    }
}
