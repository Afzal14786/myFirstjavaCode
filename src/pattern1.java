import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        
        /*User input in java
         * how in java we take inputs.....
         */
        // Syntex____:-

        Scanner scan=new Scanner(System.in);                
        System.out.println("Enter your age");
        int age=scan.nextInt();
        System.out.println("My age is\n" + age);
        System.out.println("Enter the avg");
        double avg=scan.nextDouble();
        System.out.println("Average is\n" + avg);

        /*for taking input from user in jave we use 
        "scan.nextInt" :- only for integer values like 1,2,3,13,23,33,
        "scan.Double" is used for taking floats and double values like:- 91.4, 91.40,,,,etc
         */

        // ----------Lets take name and email as a input as a input-------------
        /*
         * for name and password we use "scan.next" or scan.nextLine
         */
        System.out.println("Your Good Name");
        String name=scan.next();
        System.out.println("My name is\n" + name);

        System.out.println("Enter your mail");
        String mail=scan.next();
        System.out.println(" My Email\n" + mail);
        
    }
}
