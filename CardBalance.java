package sberbank;

import java.sql.*;

public class CardBalance {
    ReadCard rc = new ReadCard();
    int read_pin = Integer.parseInt(rc.read(Share.patchtocard()));

    String balance() {
        String pub_return = "";
        Connection connection = null;
        try {
            // Step 1: Load the JDBC driver.
            Class.forName("org.postgresql.Driver");

            // Step 2: Establish the connection to the database.
            String url = "jdbc:postgresql://localhost:5432/java_one";
            connection = DriverManager.getConnection(url, "postgres", "Qwerty78");

            // Step 3: Create a statement.
            Statement statement = connection.createStatement();

            // Step 4: Execute a query.
            ResultSet resultSet = statement.executeQuery("SELECT * from card where pin =" + read_pin);

            // Step 5: Process the results.
            while (resultSet.next()) {
                String id = resultSet.getString(1);
                String number = resultSet.getString(2);
                String owner = resultSet.getString(3);
                String balance = resultSet.getString(4);
                String pin = resultSet.getString(5);

                pub_return = balance;

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            // Step 6: Close the connection.
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return pub_return;

    }
}
