import java.util.*;
class boys_problem_2D_array {

    String name;

}
class boys_problem_2D_arraymain{
    public static void main(String[] args) {
        int arr[][]=new int[3][3];
        Scanner s=new Scanner(System.in);


        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the height of"+(i+1)+"student:");
            arr[0][i]=s.nextInt();

            System.out.println("Enter the age of"+(i+1)+"student:");
            arr[1][i]=s.nextInt();

            System.out.println("Enter the weight of"+(i+1)+"student:");
            arr[2][i]=s.nextInt();
        }
        int maxa=0;
        int maxh=0;
        int maxw=0;
        // check Max age heing weitgh
        for(int i=0;i<3;i++)
        {
            if(arr[0][i]>maxh)
            {
                maxh=arr[0][i];
            }
            if(arr[1][i]>maxa)
            {
                maxa=arr[1][i];
            }
            if(arr[2][i]>maxw)
            {
                maxw=arr[2][i];
            }
        }
        System.out.println("the maximum height="+maxh);
        System.out.println("the maximum age="+maxa);
        System.out.println("the maximum weight="+maxw);
    }
}
