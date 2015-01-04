package Persistence.database;
import Model.Currency;
import Model.CurrencySet;
import Persistence.CurrencySetLoader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBase implements CurrencySetLoader{
private final Connection connection;

private final CurrencySet set = new CurrencySet();

    public DataBase(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public CurrencySet load(){
        try{
            return processQuery(connection.createStatement().executeQuery("SELECT * FROM currencys"));
            
        }catch(SQLException ex){
            return new CurrencySet();
        }
    }
    
    private CurrencySet processQuery(ResultSet resultSet) throws SQLException{
        CurrencySet currencySet = new CurrencySet();
        while(resultSet.next()){
            currencySet.addCurrency(processCurrency(resultSet));
        }
            Currency Euro = new Currency(1,"Euro","E");
            currencySet.addCurrency(Euro);
            return currencySet;
    }

    private Currency processCurrency(ResultSet resultSet) throws SQLException {
    return new Currency(
        new Integer(resultSet.getString("code")),
        resultSet.getString("name"),
        resultSet.getString("symbol"));
    
    }
    
}
