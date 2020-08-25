package Basic;
import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);
        int[] array = new int[8];
        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        for(int loop=0;loop<array.length;loop++)
        {
            array[loop] = input.nextInt();
        }
        for(int loop = 0;loop < (array.length-1); loop++)
            for(int sloop=0 ; sloop < (array.length-loop-1);sloop++)
            {
                if(array[sloop]<array[sloop+1])
                {
                    temp=array[sloop];
                    array[sloop]=array[sloop+1];
                    array[sloop+1]=temp;
                }
            }
        System.out.println("THE REVERSED ARRAY IS");
        for (int loop: array) {
            System.out.println(loop);
        }
    }
}