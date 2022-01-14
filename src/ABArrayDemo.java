import java.util.Scanner;

public class ABArrayDemo {
    static int arr[];// class variable , declaration of array
    //main method se pehle se static block execute hota hai
    static{
        arr=new int[5];//creation of array
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //initialization of array
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
    }
        for (int res:arr
             ) {
            System.out.println(res);

        }
//    int arr[];//instance variable
//    public ABArrayDemo(){
//        Scanner sc=new Scanner(System.in);
//        arr=new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        ABArrayDemo obj=new ABArrayDemo();
//        for (int result:obj.arr
//             ) {
//            System.out.println(result);
//
//        }
//        int[] arr= new int[5];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }
}
