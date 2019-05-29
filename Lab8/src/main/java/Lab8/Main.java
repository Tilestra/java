package Lab8;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBConnector connector = new DBConnector();
        try {
            connector.SetConnection();
            ResultSet queryResult = connector.ExecuteQuery(connector.SELECT_PERSONS_BY_LANG);
            connector.DisplayRows(queryResult, connector.SELECT_PERSONS_BY_LANG, connector.NAME_COL);

            queryResult = connector.ExecuteQuery(connector.SELECT_CITY_BY_NAME);
            connector.DisplayRows(queryResult, connector.SELECT_CITY_BY_NAME, connector.CITY_COL);

            queryResult = connector.ExecuteQuery(connector.SELECT_CITY_BY_POPULATION);
            connector.DisplayRows(queryResult, connector.SELECT_CITY_BY_POPULATION, connector.CITY_NAME_COL);


            connector.CloseConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
