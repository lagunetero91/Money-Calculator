package Model;


import Model.Currency;

public class ExchangeRate {
private final Currency from;
private final Currency to;
private int rate;
  public ExchangeRate(Currency from, Currency to, int rate) {
        this.from = from;
        this.to = to;
    }
    public void setRate(int rate) {
        this.rate = rate;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public int getRate() {
        return rate;
    }

  

}
