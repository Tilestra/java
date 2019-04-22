package Lab8;

import java.sql.*;

public class DBConnector {

    public final String PARAMS_LIST_FOR_PHONE_GROUP = "SELECT Parameters_value FROM PRODUCTS WHERE Group_name = 'Phone'";
    public final String PRODUCT_LIST_WITHOUT_ONE_PARAMETER = "SELECT Name FROM PRODUCTS WHERE Parameters_value NOT LIKE '%6.2%'";
    public final String DESCRIPTION_FOR_ONE_GROUP = "SELECT Description FROM PRODUCTS WHERE Group_name = 'Laptop'";

    public final String PARAM_VALUE_COL = "Parameters_value";
    public final String PROD_NAME_COL = "Name";
    public final String DESCRIPTION_COL = "Description";

    private final String hostName = "localhost";
    private final String dbPort = "3306";
    private final String dbName = "JavaDBTest";

    private final String username = "IlyaUser";
    private final String password = "password";
    private final String connectionURI = "jdbc:mysql://" + hostName + ":" + dbPort + "/" + dbName;
    private static Connection connection;

    public void SetConnection() throws SQLException {
        connection = DriverManager.getConnection(connectionURI, username, password);
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
