package Basic;
import java.util.Scanner;
class Binary_Search{
    int number;
    void Search(int number,int array[])
    {
        int loop;
        for(loop=0;loop<array.length;loop++)
        {
            if(array[loop]==number)
            {
                System.out.println("THE ELEMENT FOUND AT INDEX\n"+(loop+1));
            }
        }
    }
}
class Basic{
    public static void main(String args[])
    {
        Binary_Search object = new Binary_Search();
        Scanner input = new Scanner(System.in);
        int size,loop;
        System.out.println("ENTER THE SIZE OF ARRAY\n");
        size = input.nextInt();
        int[] array = new int[size];
        System.out.println("ENTER THE ELEMENTS OF ARRAY\n");
        for(loop=0;loop<size;loop++)
       {
           array[loop]=input.nextInt();
       }
        System.out.println("ENTER THE ELEMENT TO BE SEARCHED\n");
        object.number = input.nextInt();
        object.Search(object.number,array);
    }
}
