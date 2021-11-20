public class box {
    public int l;
    public int b;
    public int h;
    public int a;
    public int v;


    public box()
    {
        l=2;
        b=3;
        h=6;
    }
    public void area()
    {
        a=2*(l*b+b*h+h*l);
        v=l*b*h;

    }
    public void display()
    {
        System.out.println(a);
        System.out.println(v);

    }
}
class box3 extends box{
    public int height;
    box3()
    {
        height=5;
    }
    public void volume()
    {
        System.out.println(l*b*height);
    }


}
class boxmain{
    public static void main(String[] args) {

        box3 obj1=new box3();
        obj1.volume();
        obj1.area();
        obj1.area();



    }
}
