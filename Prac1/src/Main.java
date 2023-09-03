import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // Task 1-3
        System.out.println("Task 1-3");
        System.out.println();
        int[] mas = {1, 2, 3, 4, 5};
        int n = mas.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mas[i];
        }
        System.out.print("Sum: ");
        System.out.println(sum);
        System.out.print("Mean: ");
        System.out.println(sum/n);

        // Task 4
        System.out.println();
        System.out.println("Task 4");
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter elements: ");

        int max = -10000000, min = 100000000;

        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
            if (nums[i] > max){
                max = nums[i];
            }
            if (nums[i] < min){
                min = nums[i];
            }
        }

        System.out.print("Min: ");
        System.out.println(min);
        System.out.print("Max: ");
        System.out.println(max);


        int i = 0;
        sum = 0;
        while (i < size) {
            sum += nums[i];
            i++;
        }
        System.out.println("While sum: " + sum);

        i = 0;
        sum = 0;
        do {
            sum += nums[i];
            i++;
        } while (i < size);
        System.out.println("Do while sum: " + sum);


        // Task 5
        System.out.println();
        System.out.print("Task 5");
        System.out.println();
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        // Task 6
        System.out.println();
        System.out.println("Task 6");
        System.out.println();

        System.out.println("Here's first 10 harmonic numbers");
        for (i = 1; i <= 10; i++) {
            System.out.print(1.0 / i + "\t");
        }

        // Task 7
        System.out.println();
        System.out.println("Task 7");
        System.out.println();

        System.out.print("Enter number to find factorial: ");
        n = scanner.nextInt();
        System.out.println(n + "! = " + factorial(n));

    }

    // For Task 7
    private static long factorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}