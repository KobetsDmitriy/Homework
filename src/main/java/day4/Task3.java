package day4;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        double maxSum = 0;
        int stroka = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк массива");
        int m = scanner.nextInt();
        System.out.println("Введите количество столбцов массива");
        int n = scanner.nextInt();

        double[][] array = new double[m][n];
        for (int i = 0; i < array.length; i++){
            double sum = 0;
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = Math.round(Math.random()*50);
                System.out.print(array[i][j]+ " ");
                sum = sum + array[i][j];
            }
            System.out.println();
            System.out.println("Сумма элементов строки равна " + sum);
            if (sum > maxSum){
                maxSum = sum;
                stroka = i;
            }
        }
        System.out.println("Максимальная сумма элементов равна " + maxSum + " и находится в " + stroka + " строке");
    }
}