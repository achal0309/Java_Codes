package Hello_World;
import java.util.Scanner;
public class Hello_World {
    public static void main(String args[])
    {
        //THE FOLLOWING CODE ACCEPTS A USER TYPED INTEGER 
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE USER INPUT\n");
        int number = input.nextInt();
        System.out.println("THE ENTERED INPUT IS\n"+number);

    }
}
