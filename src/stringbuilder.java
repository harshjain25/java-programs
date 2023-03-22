import java.util.Scanner;

public class stringbuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.next());
        System.out.println(sb.charAt(0));
        sb.setCharAt(0, 'P');
        System.out.println(sb);
        System.out.println(sb.insert(2,'n'));
    }
}
