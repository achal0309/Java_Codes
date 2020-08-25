package Basic;
public class Basic {
    public static void main(String[] args) {
         if(args.length>0)
             for(int index=0;index<args.length;index++)
             {
                 System.out.print(args[index]+", ");
             }

         else{
             System.out.println("NO COMMAND LINE ARGUMENTS");
         }
        }
}