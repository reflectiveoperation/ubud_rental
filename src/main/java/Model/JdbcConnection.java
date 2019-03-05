package Model;

import View.Movies;

import java.sql.*;

public class JdbcConnection {

    static final String DATABASE_NAME = "ubud_videostore";
    static final String DB_URL = "jdbc:mysql://localhost/".concat(DATABASE_NAME);

    static final String USERNAME = "ubudrental";
    static final String PASSWORD = "12345";

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public void establishConnectionWithDatabase() {
        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            //TODO: Delete sout
//            System.out.println("Connection Successful!");
        } catch (SQLException exc) {
            System.out.println("Exception while connecting to database... " + exc);
        }
    }

    public ResultSet executeSqlQuery(String sqlQuery) {
        try {
            this.statement = this.connection.createStatement();
            this.resultSet = this.statement.executeQuery(sqlQuery);
            return this.resultSet;
        } catch (SQLException exc) {
            System.out.println("Exception while executing SQL Query... ");
            return (ResultSet) exc;
        }
    }

    public void extractDataFromResultSet(ResultSet resultSet, Movies movies, String columnLabel) {
        try {
            while (resultSet.next()) {
                movies.setMovieTitle(resultSet.getString(columnLabel));
                //TODO:Delete sout
                System.out.println(movies.getMovieTitle());
            }
        } catch (SQLException exc) {
            System.out.println("Exception while collecting result set... " + exc);
        }
    }
}

