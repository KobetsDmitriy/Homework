package day3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    for(int i = 0; i>=0; i++){
        double delimoe = scanner.nextDouble();
        double delitel = scanner.nextDouble();

    if (delitel == 0){
        break;
    }
        System.out.println(delimoe / delitel);
}
    }
}
