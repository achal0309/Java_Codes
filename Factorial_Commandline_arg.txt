package Hello_World;
import java.util.Scanner;
public class Hello_World {
    public static void main(String args[])
    {
        //THE FOLLOWING CODE USES COMMANDLINE ARGUMENTS TO FIND FACTORIAL OF A NUMBER
        int number,size;
        int product = 1;
                size = Integer.parseInt(args[0]);
     for(number=1;number<=size;number++)
     {

         product = product * number;
     }
     System.out.println("THE FACTORIAL IS::\n"+product);
    }
}
