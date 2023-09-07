import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        System.out.println("Enter words: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int n = line.length();
        int k = 1;
        for (int i = 0; i < n - 1; i++){
            if (line.charAt(i) == ' ' && line.charAt(i + 1) != ' '){
                k++;
            }
        }
        System.out.print("You have entered ");
        System.out.print(k);
        System.out.println(" words!");
    }
}
