package Persistence;


import Model.Currency;

public class CurrencySetLoader {
private final Currency currency;

    public CurrencySetLoader(Currency currency) {
        this.currency = currency;
    }
    
    public Currency Load(){
        Currency Euro = new Currency (1,"Euro","E");
        Currency Dolar = new Currency(2,"Dolar","D");
        return null;
    }
}
