package hw_23_09_2020;
import java.util.Scanner;
import  java.util.Random;


public class HW6 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Value a : ");
        int a  = sc.nextInt();
        System.out.println("Value b : ");
        int b = sc.nextInt();
        int [][] arr = new int [a][b];
        int min = 1;
        int max = 50;

// постоянно выходит за пределы массива, не смог разобраться
        for (int i = 0; i < arr.length; i++){
            arr [a] = new int[random.nextInt(max - min) + min];
            for (int j = 0; j < arr[i].length; j++) {
                arr [b] =new int[random.nextInt(max - min) + min];
                System.out.println(arr[a][b]);
            }
            System.out.println();
        }
        System.out.println("Array Values :");
//взял из интернета должен быть рабочим
        for (int i = 0; i < arr.length; i++ ){
            for (int j = 0; j < arr.length; j++){
                if (arr [a][b]%2 == 0){
                    arr [a][b] = 0;
                } else arr[a][b]=1;
                System.out.println(arr[a][b] + "\n");
            }
            System.out.println();
        }
    }

}
