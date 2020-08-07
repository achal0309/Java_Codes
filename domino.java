import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int domino = 0;
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        if(m%2==0 && n%2==0)
            domino=(n/2)*m;
        else if(m%2==1 && n%2==1)
            domino=(n/2)*m+(m/2);
        else if (m%2==1 && n%2==0)
            domino=(n/2)*m;
        else if(m%2==0 && n%2==1)
            domino=(m/2)*n;
        System.out.println(""+domino);
    }
}