package Basic;
import java.util.Scanner;
class Power{
    float Power_for_loop(float base,float exponent)
    {
        float product = 1;
        for(int loop = 0 ; loop<exponent; loop++)
        {
            product = product * base;
        }
        return product;
    }
}
public class Basic{
    public static  void main(String[] args)
    {
        Power object = new Power();
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE BASE NUMBER");
        float base = input.nextFloat();
        System.out.println("ENTER THE POWER TO BE RAISED");
        float exponent = input.nextFloat();
        float product = object.Power_for_loop(base,exponent);
        System.out.println("THE FINAL OUTPUT IS\n"+product);
    }
}
