class Base1{
    Base1(){
        System.out.println("constructor of base1 class");
    }
    Base1(int x){
        System.out.println("overloaded constructor of base1 class with value of x as: "+x);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("i am a constructor of derived class");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("overloaded constructor of derived class with value fo x and y as: "+x+" "+y);
    }
}
class subderived extends Derived1 {
    subderived(){
        System.out.println("constructor of subderived class");
    }
    subderived(int x,int y,int z){
        super(x,y);
        System.out.println("overloaded constructor of subderived class");
    }
}

public class ConstructorInInheritance {
    public static void main(String[] args) {
        subderived sd=new subderived(10,20,30);

    }
}
