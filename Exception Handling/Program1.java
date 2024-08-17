import java.util.Scanner;

public class Program1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int r = a/b;
        try {
            System.out.println("Your answer is "+r);
        } catch (ArithmeticException e) {
            System.out.println("Divisor can't be 0");
        }
    }
    
}
