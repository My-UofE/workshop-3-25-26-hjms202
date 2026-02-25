public class Factorial {
    public static void main(String[] args) {

        int n = 6, factorial = 1;

        do {
            factorial *= n--;
        } while (n > 1);

        System.out.println("Factorial: " + factorial);

    }
}