package Hello_World;
class Constructor{
    int value;
    String text;
    public Constructor()
    {
        this(10);               //PASSES ONE CONSTRUCTOR TO ANOTHER
        value = 10;
        text = "\nFIRST CONSTRUCTOR";
        System.out.println("THE VALUE IS "+value+" AND STRING IS "+text);
    }
    public Constructor(int number)
    {
        this.value = value;          //COPIES THE VALUE OF ONE CONSTRUCTOR TO ANOTHER
        text = "\nSECOND CONSTRUCTOR";
        System.out.println("THE VALUE PASSED IS "+value+ " THE STRING IS "+text);
    }

}
public class Hello_World
{
    public static void main(String args[])
    {
        Constructor object = new Constructor();
        new Constructor(6);
    }
}
