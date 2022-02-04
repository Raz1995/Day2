import java.io.*;
import java.util.Scanner;

class New15 {

    public static void main(String a[])
    {
        Scanner swapTwoNumbers = new Scanner(System.in);
        System.out.println("Type first number");
        int inputNumber1= swapTwoNumbers.nextInt();
        System.out.println("Type second number");
        int inputNumber2 = swapTwoNumbers.nextInt();
        inputNumber1= inputNumber1 + inputNumber2;
        inputNumber2 = inputNumber1 - inputNumber2;
        inputNumber1 = inputNumber1 - inputNumber2;
        System.out.println(inputNumber1);
        System.out.println(inputNumber2);
    }
}

