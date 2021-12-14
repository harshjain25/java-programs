import java.sql.*;
import java.util.Scanner;

public class JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database1","root","");
        Statement s=con.createStatement();
        //PreparedStatement s = con.prepareStatement("INSERT INTO table1 VALUES(?,?,?,?)");
        //Scanner sc=new Scanner(System.in);
//        s.setString(1,sc.nextLine());
//        s.setString(2,sc.nextLine());
//        s.setInt(3,sc.nextInt());
//        sc.nextLine();
//        s.setString(4,sc.nextLine());
//        s.executeUpdate();

        String sql = "INSERT INTO table1 VALUES ('HARSH','A',1,'AGRA')";
        s.executeUpdate(sql);
        sql = "INSERT INTO table1 VALUES ('KAUSHAL','A',2,'FIROZABAD')";
        s.executeUpdate(sql);
        //sql="UPDATE table1"+"SET Roll_no = 3 WHERE Name in HARSH";
        s.executeUpdate("UPDATE table1 SET Roll_no = 3 WHERE Name = 'HARSH'");
        ResultSet rs = s.executeQuery("Select * from table1");

        while(rs.next()){
            System.out.println(rs.getString("Name")+" "+rs.getString("Sec")+" "+rs.getInt("Roll_no")+" "+rs.getString("City"));
        }
        con.close();
    }
}
