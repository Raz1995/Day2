import java.util.*;

 class New{
    public static <string> void main(String[] args) {
                Scanner input  = new Scanner(System.in);
                System.out.print("Input minutes");
                int minutes = input.nextInt();
                int p1 = minutes / 60;
                int p2 = minutes % 60;
                System.out.print( p1 +" "+ "hour " + p2 +"minutes ");
            }
        }


