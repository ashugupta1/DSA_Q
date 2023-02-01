import java.util.Scanner;

public class hollow_pattern {
    public static void main(String[] args) {

        System.out.println("enter row and colom ");

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colom = sc.nextInt();

        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < colom; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
