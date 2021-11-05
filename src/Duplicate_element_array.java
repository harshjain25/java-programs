import java.util.*;
public class Duplicate_element_array {

    public static void main(String[] args) {
        //Initialize array
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the size of array:");
        n=sc.nextInt();
        System.out.println("Enter the elements:");
        int [] arr = new int [n];
        for(int i = 0; i < n; i++) {

            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate elements in given array: ");


        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
