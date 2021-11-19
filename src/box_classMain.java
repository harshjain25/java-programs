import java.util.Scanner;

public class box_class {
    int width;
    int height;
    int depth;
    int volume;
    box_class(int w,int h,int d)
    {
        width=w;
        height=h;
        depth=d;
    }
    int  get_volume()
    {
        return volume;
    }
    int cal_volume()
    {
        volume=width*depth*height;
        return get_volume();
    }
    box_class()
    {
        super();
    }
}
class box_classMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        box_class obj = new box_class();
        obj.width = s.nextInt();
        obj.height = s.nextInt();
        obj.depth = s.nextInt();
        box_class obj1 = new box_class(obj.width, obj.height, obj.depth);
        int c=obj.cal_volume();
        System.out.println("the volume is"+c);
    }
}