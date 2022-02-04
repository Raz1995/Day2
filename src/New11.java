import java.util.Scanner;

public class New11 {

        public static void main(String[] args) {

            Scanner oddOrEvenNumber = new Scanner(System.in);

            System.out.print("Enter a number ");
            int num = oddOrEvenNumber.nextInt();

            String result = (num % 2 == 0) ? "even" : "odd";

            System.out.println(num + " is " + result);

        }
    }
