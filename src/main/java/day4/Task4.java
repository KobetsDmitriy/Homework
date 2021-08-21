package day4;

public class Task4 {
    public static void main(String[] args) {
double sum;
double maxSum = 0;
int index = 0;
double[] array = new double[10];
for (int i = 0; i < array.length; i++){
    array[i] = Math.round(Math.random()*10000);
    System.out.println(array[i]);
}
        for (int j = 0; j < array.length - 2; j++){
            sum = array[j]+array[j+1]+array[j+2];
            System.out.println("Сумма трех элементов " + sum);
            if (sum > maxSum){
                maxSum = sum;
                index = j;
            }
    }
        System.out.println("Максимальная сумма трех соседних элементов равна " + maxSum + ". Индекс первого элемента тройки: " + index);
    }
}
