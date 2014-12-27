package Process;

import Model.ExchangeRate;
import Model.Money;

public class Exchanger {
    
    public Money exchangeRate(Money money, ExchangeRate exchangeRate){
        return new Money(rateCalculator(money,exchangeRate),exchangeRate.getTo());
    }
    
    public int rateCalculator(Money money,ExchangeRate exchangeRate){
        return money.getAmount() * exchangeRate.getRate();
        
    }
}
