class MyThreadR implements Runnable{
    @Override
    public void run(){
        System.out.println("thread1");
    }
}
class MyThreadR2 implements Runnable{
    @Override
    public void run(){
        System.out.println("thread2");
    }
}
public class RunnableThread {
    public static void main(String[] args) {
        MyThreadR bullet1 =new MyThreadR();
        MyThreadR2 bullet2=new MyThreadR2();
        Thread gun1 =new Thread(bullet1);
        Thread gun2=new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
