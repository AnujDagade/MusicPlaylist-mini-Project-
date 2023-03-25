import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = 99;
        Scanner sc  = new Scanner(System.in);

        do {
            System.out.println("1: Add Song\n2: Delete Song\n");
            choice = sc.nextInt();

            switch (choice){
                case 1:

                default:
                    System.out.println("\nUnknown command");
            }
        }while (choice != 9);
    }
}