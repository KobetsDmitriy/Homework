package day6;

class Motobike{
int age;
String color;
String model;
public Motobike (String model, String color, int age){
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
    void info(){
        System.out.println("Это мотоцикл");
    }
    int yearDifference(int inputYear){
    int yearDifference = inputYear - age;
    return Math.abs(yearDifference);
    }
}