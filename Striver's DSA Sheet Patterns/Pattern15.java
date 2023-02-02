import java.util.Scanner;

public class Main {
    static void printPattern(int n) {
        for(int i = 0; i < n; i++) {
            char alphabet = 'A';
            for(int j = 0; j < n-i; j++, alphabet++) {
                System.out.print(alphabet + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        printPattern(n);
    }
}
