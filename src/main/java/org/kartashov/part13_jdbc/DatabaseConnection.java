package org.kartashov.part13_jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        List<Value> list = new ArrayList<>();

        String url = "jdbc:postgresql://localhost:5432/sandbox";
        try (Connection conn = DriverManager.getConnection(url, "postgres", "postgres");
             Statement stmt = conn.createStatement();
             // scroll and concur types
//             Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
        ) {

            conn.setAutoCommit(false);
            Class.forName("org.postgresql.Driver");

            ResultSet rs = stmt.executeQuery("SELECT U.venue_id, U.name as vanue_name, c.name as city_name " +
                    "FROM venues U INNER JOIN cities c ON U.postal_code=c.postal_code AND U.country_code=c.country_code;\n");

//            ResultSet rs = stmt.executeQuery("select * from events;");
            while (rs.next()) {
                list.add(new Value(rs.getInt("venue_id"), rs.getString(2), rs.getString(3)));
            }

            list.forEach(System.out::println);
        }
    }
}
