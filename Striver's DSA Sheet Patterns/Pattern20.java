import java.util.Scanner;

public class Main {
    static void printPattern(int n) {

        int counter = 1;
        for(int i = 0; i < n*2-1; i++) {

            for(int j = 0; j < counter; j++) {
                System.out.print("* ");
            }
            for(int j = 0; j < 2*(n-counter); j++) {
                System.out.print("  ");
            }
            for(int j = 0; j < counter; j++) {
                System.out.print("* ");
            }
            System.out.println();
            if(i < n-1) {
                counter++;
            } else {
                counter--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        printPattern(n);
    }
}
