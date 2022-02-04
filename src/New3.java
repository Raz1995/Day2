import java.util.Scanner;

public class New3 {
    public static void main(String[] args) {
        Scanner inputTwoNumbers = new Scanner(System.in);
        System.out.print("Type your first number");
        int number1 = inputTwoNumbers.nextInt();
        System.out.print("Type your second number");
        int number2 = inputTwoNumbers.nextInt();
        System.out.print("Type your third number");
        int number3 =inputTwoNumbers.nextInt();
        int sum = (number1+number2+number3);
        int average = (sum/3);
        System.out.println("The sum will be "+ sum);
        System.out.println("The average will be " + average);
    }
}
