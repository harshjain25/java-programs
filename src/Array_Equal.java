import java.util.*;
public class  Array_Equal {

    public void check(int arr[],int ar[],int n){
        int c=0;
        for(int i=0;i<n;i++)
            if(arr[i]!=ar[i])
                c++;

        if(c==0)
            System.out.println("Arrays are Equal. ");
        else
            System.out.println("Arrays are not Equal. ");
    }
}
class  Array_Equal_main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Array_Equal obj=new  Array_Equal();
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


        obj.check(arr,arr1,n);

    }
}
