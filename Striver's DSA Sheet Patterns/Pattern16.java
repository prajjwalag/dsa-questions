import java.util.Scanner;

public class Main {
    static void printPattern(int n) {
        char alphabet = 'A';
        for(int i = 0; i < n; i++, alphabet++) {
            for(int j = 0; j <= i; j++) {
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
