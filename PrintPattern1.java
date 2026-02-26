// Enter the size: 5

// 1
// 12
// 123 
// 1234 
// 12345

import java.util.Scanner;

public class PrintPattern1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        input.close();
    }
}