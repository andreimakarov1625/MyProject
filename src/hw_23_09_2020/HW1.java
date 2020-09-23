package hw_23_09_2020;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Value a : ");
        double a = sc.nextDouble();
        System.out.println("Value b :");
        double b = sc.nextDouble();
        System.out.println("Value r :");
        double r = sc.nextDouble();
        double c = Math.sqrt(a*a + b*b);
        double d = (r*2);
        if (c<d) {
            System.out.println("Covers");
        }else System.out.println("Does not cover");
    }
}
