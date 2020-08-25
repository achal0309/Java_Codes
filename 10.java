package Basic;
import java.util.Scanner;
class Basic
{
    public static void main(String[] args)
    {
        int count=0;
        Scanner input = new Scanner(System.in);
        int[] marks = new int[3];
        System.out.println("ENTER THE MARKS OF THREE STUDENTS SEQUENTIALLY");
        for(int loop=0;loop<marks.length;loop++)
           marks[loop]=input.nextInt();
        for(int loop=0;loop<marks.length;loop++)
            if(marks[loop]>=35)
                count=count+1;
        System.out.println(count);
    }
}