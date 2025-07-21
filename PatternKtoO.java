import java.util.Scanner;

public class PatternKtoO {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the alphabet : ");
        int n = sc.nextInt();
        System.out.println();

        // To print the alphabet K
        System.out.println("The alphabet K will look like this : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i + j == (n - 1) / 2 || i - j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // To print the alphabet L
        System.out.println("The alphabet L will look like this : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // To print the alphabet M
        System.out.println("The alphabet M will look like this : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j && i <= (n - 1) / 2 || i + j == n - 1 && i <= (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // To print the alphabet N
        System.out.println("The alphabet N will look like this : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // To print the alphabet O
        System.out.println("The alphabet O will look like this : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j > 0 && j < n - 1 || i == n - 1 && j > 0 && j < n - 1 || j == 0 && i > 0 && i < n - 1 || j == n - 1 && i > 0 && i < n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
