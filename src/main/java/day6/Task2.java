package day6;

public class Task2 {
    public static void main(String[] args) {
    Airplain boeing777 = new Airplain("Boeing", 2005, 63, 297560);
    boeing777.info();
    boeing777.fillUp(5000);

    Airplain an2 = new Airplain("USSR", 1947, 12, 3400);
    an2.setYear(1949);
    an2.setLenght(13);
    an2.fillUp(50);
    an2.fillUp(100);
    an2.info();
    }
}
class Airplain{
    private String producer;
    private int year;
    private int lenght;
    private int weight;
    private int fuel = 0;

    public Airplain(String producer, int year, int lenght, int weight){
        this.producer = producer;
        this.year = year;
        this.lenght = lenght;
        this.weight = weight;
    }
    public void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + lenght + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
    public void fillUp(int n){
        fuel = fuel + n;
        System.out.println("Запас топлива в баках самолета равен " + fuel + " литров");
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
