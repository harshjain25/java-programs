abstract class Base2{
    public Base2(){
        System.out.println("constructor of base2");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
}
class child2 extends Base2{
    @Override
    public void greet(){
        System.out.println("good evening");
    }
}
public class abstract_class {
    public static void main(String[] args) {
        child2 c= new child2();
        c.greet();
    }
}
