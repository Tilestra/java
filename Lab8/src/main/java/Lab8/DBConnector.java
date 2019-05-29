package Lab8;

import java.sql.*;

public class DBConnector {

    public final String SELECT_PERSONS_BY_LANG = "SELECT name FROM persontype WHERE language='Russian'";
    public final String SELECT_CITY_BY_NAME = "SELECT city FROM persontype WHERE Name='Nastya'";
    public final String SELECT_CITY_BY_POPULATION = "SELECT name FROM city WHERE population > 8000";

    public final String NAME_COL = "name";
    public final String CITY_COL = "city";
    public final String CITY_NAME_COL = "name";


    private final String ADDITIONAL_ARGS = "?verifyServerCertificate=false&useSSL=false&requireSSL=false&useLegacyDatetimeCode=false&amp&serverTimezone=UTC";

    private final String HOST_NAME = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "default_java_db";

    private final String USERNAME = "ilya";
    private final String PASSWORD = "password";
    private final String CONNECTION_URI = "jdbc:mysql://" + HOST_NAME + ":" + DB_PORT + "/" + DB_NAME + ADDITIONAL_ARGS;

    private static Connection connection;

    public void SetConnection() throws SQLException {
        connection = DriverManager.getConnection(CONNECTION_URI, USERNAME, PASSWORD);
    }

    public ResultSet ExecuteQuery(String query) throws SQLException{
        return connection.createStatement().executeQuery(query);
    }

    public void DisplayRows(ResultSet set, String sourceQuery, String column) throws SQLException{
        System.out.println("Source query: " + sourceQuery);
        while (set.next()){
            System.out.println(set.getString(column));
        }
        System.out.println();
        System.out.println();
    }

    public void CloseConnection() throws SQLException{
        connection.close();
    }

}
