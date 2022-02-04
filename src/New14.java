import java.util.Scanner;

public class New14 {
    public static void main(String[] args) {
        Scanner threeDigitNumber= new Scanner(System.in);
        System.out.println("Type 3 digit number");
        int a = threeDigitNumber.nextInt();
        int firstDigit = a/100;
        int secondDigit =a%100/10;
        int lastDigit = a%10;
        System.out.println(firstDigit+secondDigit+lastDigit);

        }

    }

