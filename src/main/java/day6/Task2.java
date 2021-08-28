package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplain boeing777 = new Airplain("Boeing", 2005, 63, 297560);
    boeing777.info();
    System.out.println("Запас топлива в баках самолета равен " + boeing777.fillUp(5000) + " литров");

    Airplain an2 = new Airplain("USSR", 1947, 12, 3400);
    an2.setYear(1949);
    an2.setLenght(13);
        System.out.println("Запас топлива в баках самолета равен " + an2.fillUp(50) + " литров");
        System.out.println("Запас топлива в баках самолета равен " + an2.fillUp(100) + " литров");
    an2.info();
    }
}
class Airplain{
    String producer;
    int year;
    int lenght;
    int weight;
    int fuel = 0;

    public Airplain(String producer, int year, int lenght, int weight){
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
    }
    public void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + lenght + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
    public int fillUp(int n){
        int fillUp = fuel + n;
        return fillUp;
    }

    public void setProducer(String producer){
        this.producer = producer;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setLenght(int lenght){
        this.lenght = lenght;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public void setFuel(int fuel){
        this.fuel = fuel;
    }
    public int getFuel(){
        return fuel;
    }
}
