package Hello_World;
import java.util.Scanner;
class Box {
    int length;
    int breath;
    int height;
    void volume() {
        int Volume;
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE DIMENSIONS\n");
        length = input.nextInt();
        breath = input.nextInt();
        height = input.nextInt();
        Volume = length * breath * height;
        System.out.println("THE VOLUME OF BOX IS::" + Volume);
    }
}
    public class Hello_World{
        public static void main(String args[])
        {
            Box Sample = new Box();
            Sample.volume();
        }
    }
