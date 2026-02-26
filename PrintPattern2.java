import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();

        if (size >= 1 && size <= 5) {
            for (int i = 1; i <= size; i++) {
                for (int j = i; j <= (size+i-1); j++) {
                    System.out.print(j);
                }
                for (int j = size; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();

            }
            for (int i = size; i >= 1; i--) {
                for (int j = i; j <= (size+i-1); j++) {
                    System.out.print(j);
                }
                for (int j = size; j >= 1; j--) {
                    System.out.print(j);
                }
                System.out.println();
            }
        } else if (size < 1) {
            System.out.println("too small!");
        } else {
            System.out.println("too big!");
        }

        



    }
}



