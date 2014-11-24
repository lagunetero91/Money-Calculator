package Persistence;
import Model.Currency;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CurrencySetLoader {
private final Connection connection;

    public CurrencySetLoader(Connection connection) {
        this.connection = connection;
    }
    
    public Currency[] load(){
        try{
            return processQuery(connection.createStatement().executeQuery("SELECT * FROM currencys"));
            
        }catch(SQLException ex){
            return new Currency[0];
        }
    }
    
    private Currency[] processQuery(ResultSet resultSet) throws SQLException{
        ArrayList<Currency> currencySet = new ArrayList<>();
        while(resultSet.next())
            currencySet.add(processPeron(resultSet));
        return currencySet.toArray(new Currency[currencySet.size()]);
    }

    private Currency processPeron(ResultSet resultSet) throws SQLException {
    return new Currency(
        new Integer(resultSet.getString("code")),
        resultSet.getString("name"),
        resultSet.getString("symbol"));
    
    }
    
}
