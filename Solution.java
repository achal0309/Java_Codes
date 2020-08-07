import java.io.*;
import java.lang.Math;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double m = input.nextDouble();
        double a = input.nextDouble();
        double tile_l = Math.ceil(n/a);
        double tile_b = Math.ceil(m/a);
        double req = tile_l*tile_b;
        int result = (int)req;
        System.out.println(""+result);
    }