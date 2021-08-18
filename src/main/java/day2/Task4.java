package day2;
import java.util.Scanner;
import static java.lang.Math.pow;
public class Task4 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
double x = scanner.nextDouble();
if (x>=5){
    double y = (pow(x,2) - 10) / (x + 7);
    System.out.println(y);
}
else if(x>-3 && x<5){
    double y = (x+3)*(pow(x,2)-2);
    System.out.println(y);
}
else {
    double y = 420;
    System.out.println(y);
}
    }
}
