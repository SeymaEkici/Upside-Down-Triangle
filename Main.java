import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int digitNum = input.nextInt();
        
        for (int i = 0; i < digitNum; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (digitNum-i)-1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        input.close();
    }
}
}
