import java.util.Scanner;
public class OneDArray {

    public static void main(String [] args){

        Scanner scan= new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int s= scan.nextInt();
        int arr[]=new int[s];

        System.out.print("Enter array elements : ");
        for(int i=0; i<s; i++){
            arr[i]= scan.nextInt();
        }

        System.out.println("The entered array is : ");
        for(int i=0; i<s; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nAfter adding 5 to each element : ");
        for(int i =0; i<s; i++){
            System.out.print((arr[i]+5)+" ");
        }
    }
}