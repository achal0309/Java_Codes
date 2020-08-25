package Basic;
import java.util.Scanner;
class Basic
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("ENTER THE ELEMENTS");
        for(int index=0;index<array.length;index++)
            array[index]=input.nextInt();
        for(int index=0;index<array.length;index++)
        {
            if(index%2==0)
                sum=sum+array[index];
        }
        System.out.println(sum);
    }
}