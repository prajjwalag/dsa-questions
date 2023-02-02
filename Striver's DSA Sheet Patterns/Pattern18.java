import java.util.Scanner;

public class Main {
    static void printPattern(int n) {

        for(int i = 0; i < n; i++) {
            char alphabet = (char)('A' + n - i - 1) ;

            for(int j = 0; j <= i; j++) {
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
