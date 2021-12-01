public class Try_Catch {
    public static void main(String[] args){
        int a=1000;
        int b=10;
        try{
            int c=a/b;
            System.out.println("The result is "+c);
        }
        catch(Exception obj){
            System.out.println("Failure Reason: "+obj);
        }
    }
}
