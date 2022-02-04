import java.util.Random;

public class New10 {
    public static void main(String[]args){
        Random randomNumber = new Random();
        int newRandomNumber = randomNumber.nextInt(30);
        System.out.println(newRandomNumber+15);
    }


}