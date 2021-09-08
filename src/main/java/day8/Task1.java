package day8;

public class Task1 {
    public static void main(String[] args) {
StringBuilder sb = new StringBuilder();

        long startTime = System.currentTimeMillis();

        for (int i = 0; i<=20000; i++){
    sb.append(i).append(" ");
}
        System.out.print(sb.toString());
        System.out.println();

        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime - startTime));

        System.out.println();

        long startTime1 = System.currentTimeMillis();

        String stringAll = "";

for (int j = 0; j <= 20000; j++){
    String string = j + " ";
    stringAll = stringAll + string;
}
System.out.print(stringAll);
System.out.println();
long stopTime1 = System.currentTimeMillis();
System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));
    }
}





/*
String speak1 = "Hello";
String speak2 = " my";
String speak3 = " friend";
String speak123 = speak1 + speak2 + speak3;
        System.out.println(speak123);
        String speak13 = speak1 + speak3;
        System.out.println(speak13);

        StringBuilder sb = new StringBuilder();
        sb.append("Привет ").append("мой ").append("друг!");
        System.out.println(sb.toString());

        System.out.printf("%4s. This is a string number %d \n", "OK", 1);

        System.out.printf("String %10d \n", 10);
        System.out.printf("String %10d \n", 1123);
        System.out.printf("String %10d \n", 13440);
        System.out.printf("String %10d \n", 106);
        System.out.printf("String %10d \n", 1);
        System.out.printf("String %10.3f", 24.455497);
 */