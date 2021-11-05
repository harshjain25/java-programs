import java.util.Scanner;

public class email_id_check {
    public static void main(String[] args) {
        String str;
        int c;

        int p;
        Scanner s=new Scanner(System.in);
        str=s.nextLine();
        c=(str.indexOf("ac"));

        p=(str.indexOf("in"));

        if(c>=0 && c<=str.length()) {
            System.out.println("Academic");
        }
        else if(p>=0 && p<=str.length())
        {
            System.out.println("Indian");
        }
        else
        {
            System.out.println("Neither academic not indian");
        }
    }
}
