package bot;
import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2019");
        System.out.println("Please, remind me your name.");

        String input = scanner.next();

        System.out.println("What a great name you have, " + input + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        Integer age1 = scanner.nextInt();
        Integer age2 = scanner.nextInt();
        Integer age3 = scanner.nextInt();

        Integer outputAge = (age1*70 + age2*21 + age3*15) % 105;

        System.out.println("Your age is " + outputAge + "; that's a good time to start programming!");




    }
}
