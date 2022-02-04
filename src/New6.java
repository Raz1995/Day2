import java.util.Scanner;

public class New6 {
    public static void main(String[] args) {
        Scanner lastDigit = new Scanner(System.in);
        System.out.println("Type new number");
        int imputNumber = lastDigit.nextInt();
        int theLastDigit= imputNumber%10;
        System.out.println(theLastDigit);

    }

}
