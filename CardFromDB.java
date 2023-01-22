package sberbank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


class CardFromDB {
    protected String pub_balance = "";
    public String pub_pin = "";

    ReadCard rc = new ReadCard();
    int read_pin = Integer.parseInt(rc.read(Share.patchtocard()));

    public void cardFromDB() {
        //int pin_read = 2379;

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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM card WHERE pin=" + read_pin);

            // Step 5: Process the results.
            while (resultSet.next()) {
                String id = resultSet.getString(1);
                String number = resultSet.getString(2);
                String owner = resultSet.getString(3);
                String balance = resultSet.getString(4);
                String pin = resultSet.getString(5);
                System.out.println(id + " " + number + " " + owner + " " + balance + " " + pin);
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
    }

    String balance() {
        String pub_balance = "";
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
            ResultSet resultSet = statement.executeQuery("SELECT * FROM card WHERE pin=" + read_pin);

            // Step 5: Process the results.
            while (resultSet.next()) {
                String balance = resultSet.getString(4);

                pub_balance = balance;

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
        return pub_balance;

    }
}
