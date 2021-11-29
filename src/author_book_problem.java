import java.util.Scanner;
import java.lang.String;

public class author_book_problem {
    String authorname;
    String bookname;
    int price;
    int qstock;
    author_book_problem(String a,String b,int p,int q)
    {
        authorname=a;
        bookname=b;
        price=p;
        qstock=q;
    }
    author_book_problem()
    {
        super();
    }

    public String getbookname() {
        return bookname;
    }

    public String getauthorname() {
        return authorname;
    }

    public int getPrice() {
        return price;
    }

    public int getQstock() {
        return qstock;
    }
}
class author_book_problemMain
{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        author_book_problem obj=new author_book_problem();
        System.out.println("Enter author name:");
        obj.authorname=s.nextLine();
        System.out.println("Enter book name:");
        obj.bookname=s.nextLine();
        System.out.println("Enter the price of book:");
        obj.price=s.nextInt();
        System.out.println("Enter the q.in stock:");
        obj.qstock=s.nextInt();
        author_book_problem obj1=new author_book_problem( obj.authorname,obj.bookname,obj.price, obj.qstock);
        System.out.println("book name="+obj.getbookname());
        System.out.println("Author name="+obj.getauthorname());
        System.out.println("Price ="+obj.getPrice());
        System.out.println("Qstock="+obj.getQstock());
    }
}
