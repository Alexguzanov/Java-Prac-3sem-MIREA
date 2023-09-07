import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {

        String[] coloda = {"2 Kresti", "2 Booby", "2 Chervy", "2 Piki",
                "3 Kresti", "3 Booby", "3 Chervy", "3 Piki",
                "4 Kresti", "4 Booby", "4 Chervy", "4 Piki",
                "5 Kresti", "5 Booby", "5 Chervy", "5 Piki",
                "6 Kresti", "6 Booby", "6 Chervy", "6 Piki",
                "7 Kresti", "7 Booby", "7 Chervy", "7 Piki",
                "8 Kresti", "8 Booby", "8 Chervy", "8 Piki",
                "9 Kresti", "9 Booby", "9 Chervy", "9 Piki",
                "T Kresti", "T Booby", "T Chervy", "T Piki",
                "J Kresti", "J Booby", "J Chervy", "J Piki",
                "Q Kresti", "Q Booby", "Q Chervy", "Q Piki",
                "K Kresti", "K Booby", "K Chervy", "K Piki",
                "A Kresti", "A Booby", "A Chervy", "A Piki",
                "Black Joker", "Red Joker"};


        System.out.println("Enter count of players: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < 5; j++){
                int index = (int) (Math.random() * 54);
                System.out.print(coloda[index]);
                System.out.print(", ");
            }
            System.out.println();
            System.out.println();
        }
    }
}
