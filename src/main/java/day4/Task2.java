package day4;

public class Task2 {
    public static void main(String[] args) {
        double[] array = new double[100];
        for (int i = 0; i < array.length; i++) {
        array[i] = Math.round(Math.random() * 10000);
        }
double maxValue = array[0];
double minValue = array[0];
int kolichestvoElementovNaNol = 0;
double sum = 0;

        for (double max: array) {
             if(max>maxValue){
               maxValue = max;
        }
            }
        for (double min: array){
            if(min<minValue){
              minValue = min;
            }
        }
        for (double kratnoeDesyati: array){
            if (kratnoeDesyati % 10 == 0){
kolichestvoElementovNaNol++;
            }
        }
        for (double summaChiselNaNol: array){
            if (summaChiselNaNol % 10 == 0){
                sum = sum + summaChiselNaNol;
            }
        }
        System.out.println(maxValue);
        System.out.println(minValue);
        System.out.println(kolichestvoElementovNaNol);
        System.out.println(sum);
    }
}




/*  maxValue = array;

if (array > maxValue){
    maxValue = array;
    System.out.println(maxValue);
}

 */