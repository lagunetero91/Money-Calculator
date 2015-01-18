
package Persistence;

import Model.CurrencySet;
import Model.ExchangeRate;

public class ExchangeRateLoader {
   public ExchangeRate load(CurrencySet currencySet) {
        return new ExchangeRate(currencySet.toArray()[0], currencySet.toArray()[1], 1.5);
    } 
}
