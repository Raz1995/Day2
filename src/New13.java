import java.util.Scanner;

public class New13 {
    public static void main(String[] args) {
        Scanner firstDigit = new Scanner(System.in);
        System.out.println("Type 3 Digit Number");
        int threeDigitNumber = firstDigit.nextInt();
        int a = threeDigitNumber/100;
        System.out.println(a);

    }
}
