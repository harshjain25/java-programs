import java.util.Scanner;
public class Emp_max_sal {
    int id;
    String name;
    String c_name;
    int sal;
    public Emp_max_sal(String c_name,String name,int id,int sal)
    {
        this.id=id;
        this.name=name;
        this.c_name=c_name;
        this.sal=sal;
    }
    public static void result(Emp_max_sal arr1[])
    {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        int a=0,b=0;
        for(int i=0;i<arr1.length;i++)
        {
            if((arr1[i].c_name.equals("A"))&& (arr1[i].sal>max1))
            {
                max1=arr1[i].sal;
                a=i;
            }
            if(arr1[i].c_name.equals("B")&& arr1[i].sal>max2)
            {
                max2=arr1[i].sal;
                b=i;
            }
        }
        System.out.println(arr1[a].name+" "+ "sal ="+arr1[a].sal+" Company name ="+arr1[a].c_name);
        System.out.println(arr1[b].name+" "+"sal ="+arr1[b].sal+" Company name ="+arr1[b].c_name);
    }

}
class Emp_max_salmain{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //Emp_max_sal obj=new Emp_max_sal();
        int n=s.nextInt();
        Emp_max_sal arr[]=new Emp_max_sal[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=new Emp_max_sal(s.next(),s.next(),s.nextInt(),s.nextInt());
        }
        Emp_max_sal.result(arr);

    }
}
