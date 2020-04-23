package org.example;

/* public class Task2 {
    public static void main(String[] args) {
        double x=5.62;
        int y=5;
        System.out.println(x-y);
    }
}*/
//отдельный метод чтобы возвращать разницу
//лучше приводить к одному виду
public class Task2 {
    public static int myMethod(int x, int y) {
        return x-y;
    }
   public static void main(String[] args) {
        int z= myMethod(7,5);
       System.out.println(z);
   }
}