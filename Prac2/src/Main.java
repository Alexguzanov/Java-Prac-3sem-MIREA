import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of strings: ");
        int n = scanner.nextInt();
        String[] str = new String[n];
        System.out.println("Enter strings: ");
        for (int i = 0; i < n; i++){
            String temp = scanner.nextLine();
            str[i] = temp;
        }

        str = reverser(str);
        System.out.println("Reversed strings: " + "\n");
        for (int i = 0; i < n; i++){
            System.out.println(str[i]);
        }
    }



    public static String[] reverser(String[] arr){
        int n = arr.length;
        for (int i = 0; i < n / 2; i++){
            String temp = arr[i];
            arr[i] = arr[n-(i + 1)];
            arr[n-(i + 1)] = temp;
        }
        return arr;
    }
}