import java.sql.*;

public class EmployeeJDBC {
    public static void main(String[] args) {
        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/fullstackjava", "root", "sweety@12");

            System.out.println("Connected successfully!");

            // 3. Create Statement
            Statement stmt = con.createStatement();

            // 4. Create Employee Table
            String createTable = "CREATE TABLE IF NOT EXISTS employee_jdbc (" +
                                 "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                 "name VARCHAR(50), " +
                                 "salary DOUBLE, " +
                                 "department VARCHAR(50))";

            stmt.executeUpdate(createTable);
            System.out.println("Employee table created!");

            // 5. Insert Records
            String insert1 = "INSERT INTO employee_jdbc(name, salary, department) VALUES('Amit', 50000, 'IT')";
            String insert2 = "INSERT INTO employee_jdbc(name, salary, department) VALUES('Neha', 60000, 'HR')";

            stmt.executeUpdate(insert1);
            stmt.executeUpdate(insert2);

            System.out.println("Records inserted!");

            // 6. Fetch and Display Data
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee_jdbc");

            System.out.println("\nEmployee Data:");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " " +
                    rs.getString("name") + " " +
                    rs.getDouble("salary") + " " +
                    rs.getString("department")
                );
            }

            // 7. Close connection
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}