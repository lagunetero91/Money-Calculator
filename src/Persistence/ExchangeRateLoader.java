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
    

    public ExchangeRate[] load(){
        try{
           return processQuery(connection.createStatement().executeQuery("SELECT * FROM exchange")); 
        }catch(SQLException ex){
        return new ExchangeRate [0];
    }
}

    private ExchangeRate[] processQuery(ResultSet resultSet) throws SQLException {
        ArrayList<ExchangeRate> ExchangeRateSet = new ArrayList<>();
        while(resultSet.next())
            ExchangeRateSet.add(processExchangeRate(resultSet));
        return ExchangeRateSet.toArray(new ExchangeRate[ExchangeRateSet.size()]);
    }

    private ExchangeRate processExchangeRate(ResultSet resultSet, Currency from, Currency to) throws SQLException {
        return new ExchangeRate(
        from,
        to,
        Integer.parseInt(resultSet.getString("rate")));
     
    }
}
        
