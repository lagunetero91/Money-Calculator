package Persistence;


import Model.Currency;
import Model.ExchangeRate;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExchangeRateLoader {
    private final Connection connection;
    public ExchangeRateLoader(Connection connection) {
        this.connection = connection;
    }
    

    public ExchangeRate load(Currency from, Currency to){
        try{
           return processQuery(connection.createStatement().executeQuery(
                   "SELECT * FROM exchangeRate"+
                   "WHERE from=" +from+ 
                   "AND to="+ to)); 
        }catch(SQLException ex){
        return null;
    }
}

    private ExchangeRate processQuery(ResultSet resultSet) throws SQLException {
        return processExchangeRate(resultSet);
    }

    private ExchangeRate processExchangeRate(ResultSet resultSet, Currency from, Currency to) throws SQLException {
        return new ExchangeRate(
        from,
        to,
        Integer.parseInt(resultSet.getString("rate")));
     
    }
}
        
