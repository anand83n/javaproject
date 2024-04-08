import java.util.Scanner;

/**********getting input from user************/

public class getinput{
public static void main (String args[]){

    try (Scanner scanner = new Scanner(System.in)) {

        System.out.println("What is your name? "); 

        String name = scanner.nextLine();

        System.out.println("What is your rating from 1 to 5?");

        short rating = scanner.nextShort();

        scanner.nextLine();

        System.out.println("Enter email");     

        String email = scanner.nextLine();

        System.out.println("hello " + name);

        System.out.println("You rated us " + rating);

        System.out.println("Email is " + email);
    }
}

}
