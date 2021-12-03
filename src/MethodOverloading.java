public class MethodOverloading {
    static void m1(){
        System.out.println("hello my name is harsh jain....");
    }
    static int m2(int b){
        int i = 25;
        return i;
    }
    static void m2(int [] arr){
        arr[0]=100;

    }
        public static void main(String[] args){
            m1();
            int b=10;
            m2(b);
            System.out.println("The value of b after applying m2 function is : "+b);
            int[] marks = {1,2,3,4,5};
            m2(marks);
            System.out.println(marks[0]);
        }
}
