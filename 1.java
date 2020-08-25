package Basic;
public class Basic {
    public static void main(String[] args) {
        String gender = args[0];
        String temp = args[1];
        int age = Integer.parseInt(temp);
        if (gender.equals("female")) {
            if (age > 1 && age < 58)
                System.out.println("THE PERCENTAGE OF INTREST IS 8.2%");
            else if (age > 59 && age < 100)
                System.out.println("THE PERCENTAGE OF INTREST IS 9.2%");
        } else if (gender.equals("male")) {
            if (age > 1 && age < 58)
                System.out.println("THE PERCENTAGE OF INTREST IS 8.4%");
            else if (age > 59 && age < 100)
                System.out.println("THE PERCENTAGE OF INTREST IS 10.5%");
        }

    }
}