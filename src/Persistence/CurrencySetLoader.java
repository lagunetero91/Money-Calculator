package Persistence;
import Model.Currency;
import Model.CurrencySet;

public class CurrencySetLoader {
private final CurrencySet currencyset;

    public CurrencySetLoader(CurrencySet currencyset) {
        this.currencyset = currencyset;
    }
    
    public CurrencySet Load(){
        Currency Euro = new Currency (1,"Euro","€");
        Currency Dolar = new Currency(2,"Dolar","$");
        currencyset.addCurrency("Euro",Euro);
        currencyset.addCurrency("Dolar",Dolar);
        return currencyset;
    }
}
