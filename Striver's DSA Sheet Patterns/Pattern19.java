import java.util.Scanner;

public class Main {
    static void printPattern(int n) {

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < i*2; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < (n-i-1)*2; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
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
