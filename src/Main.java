import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //fibonacci lenght input.
        System.out.print("Fibonacci serisinin uzunluğunu girin: ");
        int length = scanner.nextInt();
        System.out.print("Fibonacci serisi: ");
        for (int i = 0; i < length; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
//formula with else-if code to calculate fibonacci for result. 
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
