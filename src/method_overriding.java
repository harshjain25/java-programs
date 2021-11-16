class A{
    public int a;
    public int harsh(){
        return 4;
    }
    public void meth2(){
        System.out.println("method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("method of class B");
    }
    public void meth3(){
        System.out.println("method of class B");
    }
}
public class method_overriding {
    public static void main(String[] args){
        A ac =new A();
        B bc =new B();
        bc.meth2();
        ac.meth2();
    }
}
