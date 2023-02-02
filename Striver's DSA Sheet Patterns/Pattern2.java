import java.util.Scanner;

public class Main {
    static void printPattern(int n) {
        System.out.println();
        for(int i=0; i<n; i++) {
            for(int j = 0; j<i+1; j++) {
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
