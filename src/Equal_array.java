import java.util.*;
public class Equal_array {

    public void check(int arr[],int ar[]){
        if(Arrays.equals(arr,ar))
            System.out.println("Arrays are Equal. ");
        else
            System.out.println("Arrays are not Equal. ");
    }
}
class Equal_array_main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Equal_array obj=new Equal_array();
        System.out.println("Enter the number of elements in array:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array 1:");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int arr1[]=new int[n];
        System.out.println("Enter the elements of array 2:");
        for(int i=0;i<n;i++)
        {
            arr1[i]=s.nextInt();
        }


        obj.check(arr,arr1);

    }
}
