package Basic;
import java.util.Scanner;
class Basic
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        if(ch >= 'a' && ch<= 'z')
            System.out.println(ch+"->"+Character.toUpperCase(ch));
        if(ch >= 'A' && ch<= 'Z')
            System.out.println(ch+"->"+Character.toLowerCase(ch));
    }
}