import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.print("Enter the number to find its factorial : ");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        int fact=1;
        for (int i=1; i<=n; i++){
            fact= fact*i;
        }
        System.out.println("The factorial of the entered number is : "+ fact);
    }
}
