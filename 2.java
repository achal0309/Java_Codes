package Basic;
import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        int temp,max,max_1;
        Scanner input = new Scanner(System.in);
       int[] array = new int[10];
       System.out.println("ENTER THE ELEMENTS OF ARRAY");
       for(int loop=0;loop<array.length;loop++)
       {
          array[loop] = input.nextInt();
       }
       for(int loop = 0;loop < (array.length-1); loop++)
           for(int sloop=0 ; sloop < (array.length-loop-1);sloop++)
           {
               if(array[sloop]>array[sloop+1])
               {
                   temp=array[sloop];
                   array[sloop]=array[sloop+1];
                   array[sloop+1]=temp;
               }
           }
       max=array[9];
       max_1=array[8];
       System.out.println("THE MAXIMUM ELEMENT IS:"+max);
       System.out.println("THE SECOND MAXIMUM ELEMENT IS:"+max_1);
    }
}