package org.kartashov.part21_network.rmi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Implementing the remote interface
public class ImplExample implements Hello {

    // Implementing the interface method
    public List<Student> getStudents() throws Exception {
        List<Student> list = new ArrayList<Student>();

        // JDBC driver name and database URL
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/details";

        // Database credentials
        String USER = "myuser";
        String PASS = "password";

        Connection conn = null;
        Statement stmt = null;

        //Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");

        //Open a connection
        System.out.println("Connecting to a selected database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Connected database successfully...");

        //Execute a query
        System.out.println("Creating statement...");

        stmt = conn.createStatement();
        String sql = "SELECT * FROM student_data";
        ResultSet rs = stmt.executeQuery(sql);

        //Extract data from result set
        while(rs.next()) {
            // Retrieve by column name
            int id  = rs.getInt("id");

            String name = rs.getString("name");
            String branch = rs.getString("branch");

            int percent = rs.getInt("percentage");
            String email = rs.getString("email");

            // Setting the values
            Student student = new Student();
            student.setID(id);
            student.setName(name);
            student.setBranch(branch);
            student.setPercent(percent);
            student.setEmail(email);
            list.add(student);
        }
        rs.close();
        return list;
    }
}
