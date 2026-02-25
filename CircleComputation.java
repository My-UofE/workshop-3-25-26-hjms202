// Add your code below

public class CircleComputation {
    public static void main(String[] args) {
        // Demonstration of the increment operator
        
        final double PI = 3.141592653589;
        float radius = Float.parseFloat(args[0]);
        float area = radius * radius * PI;
        float circumference = 2 * radius * PI;

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}


