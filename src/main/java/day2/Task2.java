package day2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите числа:");
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       if (a>=b){
           System.out.println("Некорректный ввод");
       }
    for(int number = a+1; number < b; number++ ){
    if(number % 5 == 0 && number % 10 !=0){
        System.out.println(number);
    }
}
    }
}
