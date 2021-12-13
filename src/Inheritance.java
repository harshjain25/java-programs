class Base{
    int x;

    public void setX(int x){
        System.out.println("setting value of x"); 
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void printme(){
        System.out.println("hello my name is harsh jain.");
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
         Derived b =new Derived();
         b.setX(4);
         System.out.println(b.getX());
    }
}
