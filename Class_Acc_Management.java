package Hello_World;

import java.util.Scanner;

class Account_Management{
    int Acc_no;
    String Name;
    int total_money;
    void input()
    {
        Scanner input = new Scanner(System.in);
        Scanner input_str = new Scanner(System.in);
        System.out.println("ENTER THE ACCOUNT NUMBER\n");
        Acc_no = input.nextInt();
        System.out.println("ENTER THE NAME OF ACCOUNT HOLDER\n");
        Name = input_str.nextLine();
        System.out.println("ENTER THE TOTAL AMOUNT IN ACCOUNT\n");
        total_money = input.nextInt();
    }
    void output()
    {
        System.out.println("THE DETAILS OF THE ACCOUNT IS::\n");
        System.out.println(Acc_no+"\n"+Name+"\n"+total_money);
    }
}
public class Hello_World{
    public static void main(String args[])
    {
        Account_Management object = new Account_Management();
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF RECORDS\n");
        int number = input.nextInt();
        for(int x = 0; x<number ;x++) {
            object.input();
            object.output();
        }
    }
}
