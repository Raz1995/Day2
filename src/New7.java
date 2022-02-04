import java.util.Scanner;

public class New7 {
    public static void main(String[] args) {
        Scanner mine = new Scanner(System.in);
        System.out.println("Type your first number");
        int inputNumber1 = mine.nextInt();
        System.out.println("Type your second ");
        int inputNumber2= mine.nextInt();
        int reminder = inputNumber1%inputNumber2;
        System.out.println(reminder);


    }
}
