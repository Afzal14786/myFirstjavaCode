import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your Name");
        String name=scan.next();
        System.out.println("My name is " + name);

        System.out.println("enter your age");
        int age=scan.nextInt();
        System.out.println("my age is " + age);

        System.out.println("Enter your average");
        double avg=scan.nextDouble();
        System.out.println("Your average is " + avg);

        System.out.println("Enter your E-mail");
        String mail =scan.nextLine();
        System.out.println("Your E-mail :-" + mail);
    }
}
