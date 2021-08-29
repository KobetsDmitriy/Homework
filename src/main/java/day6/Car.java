package day6;

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
public void info(){
    System.out.println("Это автомобиль");
}
   int yearDifference(int inputYear){
        int yearDifference = inputYear - madeAge;
        return Math.abs(yearDifference);
    }
}
