package Basic;
class Basic{

    public static  void main(String args[])
    {
        int[][] array = {{1,-2,3},{-4,-5,6,9},{7}};
        for(int[] innerArray: array)
        {
            for(int data:innerArray)
            {
                System.out.print(data+"\t");
            }
            System.out.print("\n");
        }
    }
}
