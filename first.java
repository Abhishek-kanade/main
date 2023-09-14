import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.sum");
        System.out.println("2.sub");
        System.out.println("3.mult");
        System.out.println("4.div");
        System.out.println("5.reminder");
        int x = sc.nextInt();
        System.out.println("enter n");
        double n = sc.nextDouble();
        System.out.println("enter y");
        double y = sc.nextDouble();
        switch (x) {
            case 1:
                System.out.print("sum is : ");
                System.out.println((int) (n + y));
                break;
            case 2:
                System.out.print("sub is : ");
                System.out.println((int) (n - y));
                break;

        }
        sc.close();
    }
}