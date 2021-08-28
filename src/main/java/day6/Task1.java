package day6;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

Car car = new Car();
Motobike motobike = new Motobike("Harley Davidson", "Black", 1999);
car.info();
motobike.info();
        System.out.println("Введите год в формате ****");
car.setMadeAge(2018);
        System.out.println(car.yearDifference(scanner.nextInt()));
        System.out.println(motobike.yearDifference(scanner.nextInt()));
    }
}
