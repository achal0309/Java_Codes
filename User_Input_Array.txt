package Hello_World;
import java.util.Scanner;
public class Hello_World {
    public static void main(String args[])
    {
        //THE FOLLOWING CODE ACCEPTS AND PRINTS THE ELEMENTS OF A 1-D ARRAY
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY\n");
        int numberx = input.nextInt();
        int[] numbers = new int[numberx];
        int number;
        System.out.println("ENTER THE ELEMENTS OF ARRAY\n");
        for(number=0;number<numbers.length;number++)
        {
            numbers[number]=input.nextInt();
        }
        System.out.println("THE ENTERED ELEMENTS OF ARRAY ARE\n");
        for(number=0;number<numbers.length;number++)
        {
            System.out.println(numbers[number]);
        }

    }
}
