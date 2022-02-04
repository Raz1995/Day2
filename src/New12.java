import java.util.Scanner;

public class New12 {
    public static void main(String[] args) {
        Scanner threeDigitNumber= new Scanner(System.in);
        System.out.println("Type 3 digit number");
        int a = threeDigitNumber.nextInt();
        if (a < 100) {
            System.out.println("Try again");
        } else {
            int b= a%100/10;
            System.out.println(b);
        }

    }
}
