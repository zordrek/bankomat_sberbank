package sberbank;

import java.sql.*;

public class CardBalanceUpdate {
    ReadCard rc = new ReadCard();
    ChangeBalance cb = new ChangeBalance();

    int read_pin = Integer.parseInt(rc.read(Share.patchtocard()));

    String balanceplus() {
        String pub_return = "";
        Connection connection = null;
        String content = cb.nowmuchplus();
        try {
            // Step 1: Load the JDBC driver.
            Class.forName("org.postgresql.Driver");

            // Step 2: Establish the connection to the database.
            String url = "jdbc:postgresql://localhost:5432/java_one";
            connection = DriverManager.getConnection(url, "postgres", "Qwerty78");

            // Step 3: Create a statement.
            Statement statement = connection.createStatement();

            // Step 4: Execute a query.

            String updateBalance = "UPDATE card SET balance =" + content + " WHERE pin =" + read_pin;
            PreparedStatement preparedStatement = connection.prepareStatement(updateBalance);


            // Step 5: Process the results.
            preparedStatement.executeUpdate();

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

    String balanceminus() {
        String pub_return = "";
        Connection connection = null;
        String content = cb.nowmuchminus();
        try {
            // Step 1: Load the JDBC driver.
            Class.forName("org.postgresql.Driver");

            // Step 2: Establish the connection to the database.
            String url = "jdbc:postgresql://localhost:5432/java_one";
            connection = DriverManager.getConnection(url, "postgres", "Qwerty78");

            // Step 3: Create a statement.
            Statement statement = connection.createStatement();

            // Step 4: Execute a query.

            String updateBalance = "UPDATE card SET balance =" + content + " WHERE pin =" + read_pin;
            PreparedStatement preparedStatement = connection.prepareStatement(updateBalance);


            // Step 5: Process the results.
            preparedStatement.executeUpdate();

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
