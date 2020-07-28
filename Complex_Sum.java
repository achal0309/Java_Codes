package Basic;
import java.util.Scanner;
class Fibbo{
    void Fibbonacci()
    {
        int first=1,second=1,sum;
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF FIBBONACCI SERIES");
        int size = input.nextInt();
        if(size==1)
            System.out.println(first);
        else if(size==2)
            System.out.println(first+"\n"+second);
        else if(size>2)
        {
            System.out.print(first+"\t");
            System.out.print(second+"\t");
            for(int loop=0;loop<size-2;loop++)
            {
                sum = first + second;
                first = second;
                second = sum;
                System.out.print(sum+"\t");
            }
        }
    }
}
class Basic{
    public static void main(String[] args)
    {
     Fibbo object = new Fibbo();
     object.Fibbonacci();
    }
}
