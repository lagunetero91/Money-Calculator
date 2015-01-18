package Model;


import Model.Currency;

public class ExchangeRate {
private final Currency from;
private final Currency to;
private Double rate;
  public ExchangeRate(Currency from, Currency to, Double rate) {
        this.from = from;
        this.to = to;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public Currency getFrom() {
        return from;
    }

    public Currency getTo() {
        return to;
    }

    public double getRate() {
        return rate;
    }

  

}
