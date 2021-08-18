package day4;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите колличество строк массива: ");  //12
        int m = scanner.nextInt();
        System.out.println("Введите колличество столбцов массива: ");  //8
        int n = scanner.nextInt();
double[][] array = new double[m][n]; // создали массив размером m x n

// заполняем массив случайными числами
for (int i = 0; i < array.length; i++){
    for (int j = 0; j < array[i].length; j++){
        array[i][j] = Math.round(Math.random()*50);
        System.out.print(array[i][j] + " ");
    }
    System.out.println();
}
// находим сумму строк и определяем максимальное значение

for (int stroka = 0; stroka < array.length; stroka++){
    double sum = 0;

    for (int nomerElementaStroki = 0; nomerElementaStroki < array[stroka].length; nomerElementaStroki++) {
        sum = sum + array[stroka][nomerElementaStroki];
    }
    System.out.println("Сумма элементов строки равна: " + sum);

    double maxSum = sum;
    if(maxSum >= sum){
        sum = maxSum;
    }

}
double sumNulevoiStroki = 0;
    for (int nomerElementaStroki = 0; nomerElementaStroki < array[0].length; nomerElementaStroki++) {
       sumNulevoiStroki = sumNulevoiStroki + array[0][nomerElementaStroki];
    }
        System.out.println("максимальное значение из всех строк: " + sumNulevoiStroki);
    }
}
