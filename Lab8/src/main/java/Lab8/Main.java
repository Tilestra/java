package Lab8;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        DBConnector connector = new DBConnector();
        try {
            connector.SetConnection();
            ResultSet queryResult = connector.ExecuteQuery(connector.PARAMS_LIST_FOR_PHONE_GROUP);
            connector.DisplayRows(queryResult, connector.PARAMS_LIST_FOR_PHONE_GROUP, connector.PARAM_VALUE_COL);

            queryResult = connector.ExecuteQuery(connector.PRODUCT_LIST_WITHOUT_ONE_PARAMETER);
            connector.DisplayRows(queryResult, connector.PRODUCT_LIST_WITHOUT_ONE_PARAMETER, connector.PROD_NAME_COL);

            queryResult = connector.ExecuteQuery(connector.DESCRIPTION_FOR_ONE_GROUP);
            connector.DisplayRows(queryResult, connector.DESCRIPTION_FOR_ONE_GROUP, connector.DESCRIPTION_COL);


            connector.CloseConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
