package org.example;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
/*        int number= 22;
        if (number % 2== 0) {
            System.out.println("Chislo " +number+ " yavlyaetsa chetnim");
        }
        else {
            System.out.println("Chislo " +number+ " yavlyaetsa nechetnim");
        }
    }
}*/
//можно через сканнер. чтобы вводить числа
        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite chislo");
        int number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Chislo " + number + " yavlyaetsa chetnim");
        } else {
            System.out.println("Chislo " + number + " yavlyaetsa nechetnim");
        }
    }
}
