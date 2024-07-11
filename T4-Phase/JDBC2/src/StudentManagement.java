import java.sql.*;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        String dburl = "jdbc:mysql://localhost:3306/exam";
        String dbuser = "root";
        String dbpass = "";

        Connection con = DriverManager.getConnection(dburl, dbuser, dbpass);
        if (con != null) {
            System.out.println("Connected to the database!");
            Statement st = con.createStatement();
            int ch;
            do {
                System.out.println("========================================================================");
                System.out.println("1. Insert \t 2. Update \t 3. Delete \t 4. View \t 5. Exit");
                System.out.println("========================================================================");
                System.out.print("Enter Choice :- ");
                ch = sc.nextInt();

                switch (ch) {
                    case 1: // INSERT AN RECORD IN STUDENT TABLE.
                        System.out.print("Enter Student UserName:- ");
                        String stdName = sc.next();
                        System.out.print("Enter Student Password:- ");
                        String stdPass = sc.next();
                        System.out.print("Enter Student Marks:- ");
                        float stdMarks = sc.nextFloat();

                        String insQuery = "insert into student(std_name, std_pass, std_marks) values('" + stdName
                                + "','" + stdPass + "'," + stdMarks + ")";
                        int rs1 = st.executeUpdate(insQuery);
                        if (rs1 > 0) {
                            System.out.println("Record Inserted Successfully!");
                        } else {
                            System.out.println("Record Not Inserted!");
                        }
                        break;
                    case 2: // UPDATE PASSWORD & MARKS BY STUDENT_NAME.
                        System.out.print("Enter Student Username:- ");
                        String UpdateUserName = sc.next();
                        System.out.print("Enter New Password:- ");
                        String UpdatePass = sc.next();
                        System.out.print("Enter New Marks:- ");
                        float UpdateMarks = sc.nextFloat();

                        String UpdateQuery = "update student set std_pass='" + UpdatePass + "', std_marks="
                                + UpdateMarks + " where std_name = '" + UpdateUserName + "'";
                        int rs2 = st.executeUpdate(UpdateQuery);
                        if (rs2 > 0) {
                            System.out.println("Record Updated Successfully!");
                        } else {
                            System.out.println("Record Not Found! Or Username is Invalid!");
                        }

                        break;
                    case 3: // DELETE RECORD BY STUDENT_NAME.
                        System.out.print("Enter Student Username:- ");
                        String deleteUserName = sc.next();
                        String deleteQuery = "delete from student where std_name = '" + deleteUserName + "'";
                        int rs3 = st.executeUpdate(deleteQuery);
                        if (rs3 > 0) {
                            System.out.println("Record Deleted Successfully!");
                        } else {
                            System.out.println("Record Not Found! Or Username is Invalid!");
                        }
                        break;
                    case 4: // VIEW RECORD FROM STUDENT TABLE.
                        String viewQuery = "select * from student";
                        ResultSet rs4 = st.executeQuery(viewQuery);
                        while (rs4.next()) {
                            System.out.println("--------------------------");
                            System.out.println("Student Id= " + rs4.getInt(1));
                            System.out.println("Student Name= " + rs4.getString(2));
                            System.out.println("Student Password= " + rs4.getString(3));
                            System.out.println("Student Marks= " + rs4.getFloat(4));
                            System.out.println("--------------------------");
                        }
                        break;
                    case 5:
                        System.out.println("Thankyou For Using StudentManagement System. ");
                        break;

                    default:
                        System.out.println();
                        System.out.println("Invalid Choice!");
                        break;
                }
            } while (ch != 5);
        } else {
            System.out.println("Failed to connect to the database!");
        }
    }
}
