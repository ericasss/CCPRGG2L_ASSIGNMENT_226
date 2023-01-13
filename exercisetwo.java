import java.util.Scanner;

public class exercisetwo {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive();
        scan.close();
    }

    static void drive() {

        System.out.println("Learning how to drive! enrolled in driving school");
        learn();

        String feedback = getFeedBack();

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            improveDriving();

            // Recursive call
            drive();
        } else if (feedback.equals("yes")) {
            System.out.println("I passed!!");
        }
    }

    static void learn() {
        System.out.println("Taking lessons!");
    }

    static String getFeedBack() {
        System.out.println("Is the student good enough to drive? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void improveDriving() {
        System.out.print("Enter skill to improve:");
        String skill = scan.next();
        System.out.println("Added skill: " + skill);
    }
}