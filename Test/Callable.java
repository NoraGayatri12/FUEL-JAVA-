import java.sql.*;

public class Callable {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/fullstackjava", "root", "sweety@12");

            System.out.println("Connected successfully!");

            CallableStatement cs = con.prepareCall("{call getStudent()}");

            ResultSet rs = cs.executeQuery();

            boolean hasData = false;

            while (rs.next()) {
                hasData = true;
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getInt("age") + " " +
                    rs.getString("name") + " " +
                    rs.getInt("student_id")
                );
            }

            if (!hasData) {
                System.out.println("No data found!");
            }

            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}