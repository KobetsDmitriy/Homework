package day5;


public class Task2 {
    public static void main(String[] args) {
        Motobike motobike = new Motobike("Harley Davidson", "Black", 1999);
        System.out.println("Привет! Я бы хотел приобрести " + motobike.getModel() + " " + motobike.getAge() + " года в цвете " + motobike.getColor());
    }
}
class Motobike{
int age;
String color;
String model;
public Motobike(String model, String color, int age){
    this.model = model;
    this.color = color;
    this.age = age;
}

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}