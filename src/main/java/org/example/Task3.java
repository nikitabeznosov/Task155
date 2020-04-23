package org.example;

/*public class Task3 {
    public static void main(String[] args) {
       System.out.println(Task3.findMax(10,23,11));
    }
    public static int findMax(int first, int second, int third){
        return Math.max(first, Math.max(second, third));
    }
}*/
//написать этот метод своими руками
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Max value is " + myMethod());
        }
    static int myMethod() {
        int x = 75, y = 70, z = 80;
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }
}