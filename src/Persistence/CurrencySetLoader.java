package Persistence;

import Model.Currency;
import Model.CurrencySet;

public class CurrencySetLoader {
        
    public CurrencySet load(){
    CurrencySet currencySet = new CurrencySet();
    currencySet.addCurrency(new Currency("EUR","Euro","€"));
    currencySet.addCurrency(new Currency("USD","Dolar","$"));
    currencySet.addCurrency(new Currency("GBP","Libra","₤"));
    currencySet.addCurrency(new Currency("RP","Rupia","♦"));
    return currencySet;
    }
}
