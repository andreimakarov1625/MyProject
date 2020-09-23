package hw_23_09_2020;

import java.util.Arrays;

public class HW5 {


    public static void main(String[] args) {

        int[] masiv = {6, 4, 13, 22, 47};

        boolean a = false;
        int b;
        while (!a) {
            a = true;
            for (int i = 0; i < masiv.length - 1; i++) {
                if (masiv[i] > masiv[i + 1]) {
                    a = false;

                    b = masiv[i];
                    masiv[i] = masiv[i + 1];
                    masiv[i + 1] = b;
                }
            }
        }
        System.out.println(Arrays.toString(masiv));
    }
}


