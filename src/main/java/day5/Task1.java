package day5;
public class Task1 {
    public static void main(String[] args) {
Car car1 = new Car();
car1.setMadeAge(2018);
car1.setColor("Pure White");
car1.setModel("VW Tiguan");
System.out.println("Привет! Я владелец автомобиля " + car1.getModel() + " " + car1.getMadeAge() + " года выпуска" + ". Автомобиль имеет цвет " + car1.getColor());
    }
}
class Car {
    private int madeAge;
    private String color, model;

    public void setMadeAge(int madeAge){
        this.madeAge = madeAge;
    }
    public int getMadeAge(){
        return madeAge;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

}
