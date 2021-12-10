import java.util.Scanner;
public class array_of_array {
    public static void main(String[] args) {
        //int n;
        Scanner s= new Scanner(System.in);
        //n=s.nextInt();
        int arr[] []=new int[3][];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new int [s.nextInt()];
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        //output
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }



}
