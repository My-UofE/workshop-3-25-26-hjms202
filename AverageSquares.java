import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for input
        // System.out.print("Enter your name: ");

        // Read in line from standard input
        // String name = input.nextLine();

        // System.out.println("Hi " + name + "!");


        System.out.print("Please enter the start value: ");
        int startNum = input.nextInt(); // Reads in an int from standard input
        
        System.out.print("Please enter the end value: ");
        int endNum = input.nextInt();

        System.out.println("Average of squares from " + startNum + " to " + endNum + ":");
        
        double tally = 0;
        int numNum = 1 + endNum - startNum;

        // while (startNum <= endNum) {
            // tally += (startNum * startNum++);
        // }

        do {
            tally += (startNum * startNum++);
        } while (startNum <= endNum);

        System.out.println(tally/numNum);

        // System.out.println("You entered: " + startNum + " and " + endNum);
    }
}