package hw_23_09_2020;

public class HW4 {
    public static void main(String[] args){
        int [] array = {2,8,-14,6,-12,-4};
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i]<0){
                sum += array[i];
            }
        }
        System.out.println("Сумма отрицательных элементов :" + sum);

        int min = 0;
        int max = 0;
        for (int i=1; i<array.length; i++){
            if (array[i]>array[max]){
                max=i;
            }else if (array[i]<array[min]){
                min =i;
            }
        }
        int nul =1;
        if (min < max){
            for (int i = min; i <=min; i++)
            nul *=array[i];
        }else {
            for (int i = max; i<= min; i++)
                nul *=array[i];
        }
        System.out.println("Произведение элементов :" + nul);
    }
}
