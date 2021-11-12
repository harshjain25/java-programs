class ThreadA extends Thread
{
    int total = 0;
    public void run()
    {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                total = total + 1;
            }
            this.notify();
        }
    }
}
public class WaitDemo {
    public static void main(String[] args) {
        ThreadA  obj = new ThreadA();
        obj.start();
        synchronized (obj)
        {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(obj.total);
        }
    }
}