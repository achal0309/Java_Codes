package Sum_Array;

import java.util.Scanner;

class Sum{
    int row;
    int coulmn;
    int[][] input()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE DIMENSIONS OF ARRAY\n");
        row = input.nextInt();
        coulmn = input.nextInt();
        int[][] array = new int[row][coulmn];
        System.out.println("ENTER THE ELEMENTS OF ARRAY\n");
        for(int x=0;x<row;x++)
        {
            for(int y=0;y<coulmn;y++)
            {
                array[x][y] = input.nextInt();
            }
        }
        return array;
    }
    void output(int array[][])
    {
        System.out.println("THE 2-D ARRAY IS\n");
        for(int x=0;x<row;x++)
        {
            for(int y=0;y<coulmn;y++)
            {
                System.out.print(array[x][y]+"\t");
            }
            System.out.print("\n");
        }
    }
    int[][] Add(int a_array[][],int b_array[][])
    {
        row = a_array.length;
        coulmn = b_array.length;
        int[][] c_array = new int[row][coulmn];
        for(int x=0;x<a_array.length;x++)
        {
            for(int y=0;y<a_array[x].length;y++)
                c_array[x][y]=a_array[x][y] + b_array[x][y];
        }
        return c_array;
    }
}
public class Sum_Array {
    public static void main(String args[])
    {
      Sum object1 = new Sum();
      Sum object2 = new Sum();
      Sum object3 = new Sum();
      int[][] temp1=object1.input();
      object1.output(temp1);
      int[][]  temp2=object2.input();
      object2.output(temp2);
      int[][] result=object3.Add(temp1,temp2);
      object3.output(result);
    }
}
