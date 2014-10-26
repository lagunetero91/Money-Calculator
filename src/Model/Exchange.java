package Model;

public class Exchange {
    private final Money money;
    private final ExchangeRate exchangeRate;

    public Exchange(Money money, ExchangeRate exchangeRate) {
        this.money = money;
        this.exchangeRate = exchangeRate;
    }

    public Money getMoney() {
        return money;
    }

    public ExchangeRate getExchangeRate() {
        return exchangeRate;
    }
    
}
