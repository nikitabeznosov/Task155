package org.example;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        System.out.println ("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println ("Введите операцию +-*/ : ");
        String operation = scanner.next();
        System.out.println ("Введите второе число: ");
        int number2 = scanner.nextInt();
        switch (operation) {
            case "+":
                int summa=number1+number2;
                System.out.println(number1+"+"+number2+"="+summa);
                break;
            case "-":
                int raznica=number1-number2;
                System.out.println(number1+"-"+number2+"="+raznica);
                break;
                case "/":
                    if (number2==0){
                        System.out.println("На ноль делить нельзя!");
                        break;
                    }
                    double delenie=Double.valueOf(number1)/Double.valueOf(number2);
                    System.out.println(number1+"/"+number2+"="+delenie);
                    break;
                    case "*":
                        long umnozhenie=number1*number2;
                        System.out.println(number1 + "*" + number2 + "="+umnozhenie);
                        break;
            default:
                System.out.println("Вы ввели неправильные данные");
        }

    }
}
