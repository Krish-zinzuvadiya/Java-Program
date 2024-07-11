import java.util.Scanner;
import java.sql.*;

public class PreparedStatementEx {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dburl = "jdbc:mysql://localhost:3306/exam";
        String dbuser = "root";
        String dbpass = "";

        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);
        if (con != null) {
            System.out.println("Connected to the database!");
            String sql1 = "insert into student (std_name, std_pass, std_marks) values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql1);
            pst.setString(1, "Rahul");
            pst.setString(2, "rahul123");
            pst.setFloat(3, 90);
            int rs1 = pst.executeUpdate();

            pst.setString(1, "Kunjesh");
            pst.setString(2, "123");
            pst.setFloat(3, 78);
            int rs2 = pst.executeUpdate();

            String sql2 = "update student set std_marks=?, std_pass=? where std_name=?";
            pst = con.prepareStatement(sql2);
            pst.setFloat(1, 10.15f);
            pst.setString(2, "pass123");
            pst.setString(3, "Kunjesh");
            pst.execute();
        } else {
            System.out.println("Failed to connect to the database!");
        }
    }
}