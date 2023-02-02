import java.util.Scanner;

public class Main {
    static void printPattern(int n) {
        int top, left, right, bottom, distance, printNum;
        for(int i = 0; i < n*2-1; i++) {

            for(int j = 0; j < n*2-1; j++) {
                top = i;
                left = j;
                right = 2*n-2 - j;
                bottom = 2*n-2 - i;
                distance = Math.min(Math.min(left, right), Math.min(top, bottom));
                printNum = n-distance;
                System.out.print(printNum);
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
