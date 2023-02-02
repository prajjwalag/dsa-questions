import java.util.Scanner;

public class Main {
    static void printPattern(int n) {
        int size=1;
        for(int i = 0; i < n*2-1; i++) {
            for(int j = 0; j < size; j++) {
                System.out.print("*");
            }
            if(i < n-1) {
                size++;
            }
            else {
                size--;
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
