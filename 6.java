package Basic;
import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num = input.nextInt();
         if(num > 0)
         {
             System.out.println("Postive Number");
         }
        else if(num == 0)
        {
            System.out.println("Number is Zero");
        }
        else
            System.out.println("Negative Number");
        }
}