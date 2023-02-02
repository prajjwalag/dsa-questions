import java.util.Scanner;

public class Main {
    static void printPattern(int n) {

        for(int i = 0; i < n; i++) {
            char alphabet = 'A';
            for(int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < i*2+1; j++) {
                System.out.print(alphabet + " ");
                if(j < i) {
                    alphabet++;
                } else {
                    alphabet--;
                }
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
