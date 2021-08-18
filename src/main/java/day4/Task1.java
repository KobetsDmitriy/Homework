package day4;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int chiselBolscheVosmi = 0;
        int chiselRavnichEdinitse = 0;
        int chetnihChisel = 0;
        int neChetnichChisel = 0;
        double sum = 0;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(Math.random() * 10);
            System.out.println(array[i]);

            if (array[i] > 8) {
                chiselBolscheVosmi++;
            }
            if (array[i] == 1) {
                chiselRavnichEdinitse++;
            }
            if(array[i] % 2 == 0){
                chetnihChisel++;
            }
            if(array[i] % 2 != 0){
                neChetnichChisel++;
            }
            sum = sum + array[i];
        }
        System.out.println("Длинна массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + chiselBolscheVosmi);
        System.out.println("Количество чисел равных 1: " + chiselRavnichEdinitse);
        System.out.println("Количество четных чисел: " + chetnihChisel);
        System.out.println("Количество нечетных чисел: " + neChetnichChisel);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
