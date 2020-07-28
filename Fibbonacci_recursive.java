package Basic;
import java.util.Scanner;
public class Basic{
    static int Fibbonacci(int num)
    {
        if(num==1)
            return 1;
        else if(num==2)
            return 1;
        else
            return(Fibbonacci(num-1)+Fibbonacci(num-2));
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE TERM OF FIBBONACCI SERIES");
        int num = input.nextInt();
        int hold = Basic.Fibbonacci(num);
        System.out.println("THE Nth TERM IS\n"+hold);

    }
}
