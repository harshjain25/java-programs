import java.util.Scanner;
class stu{
    int rollno;
    String name;
    public stu(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
}
public class Test234 {
    public static void main(String[] args) {
        stu arr[]=new stu[10];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new stu(sc.nextInt(),sc.next());
        }
    }
}
