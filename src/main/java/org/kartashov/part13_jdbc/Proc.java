package org.kartashov.part13_jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Proc {
    public static void main(String[] args) throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");

        CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");
        stmt.setInt(1,1011);
        stmt.setString(2,"Amit");
        stmt.execute();

        System.out.println("success");
    }
}
