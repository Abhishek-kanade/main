import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        System.out.print(n);
        if (n % 2 == 0) {

            System.out.println(" is even");

        } else {
            System.out.println(" is odd");
        }
        sc.close();
    }
}
