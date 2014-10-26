package Model;


import Model.Currency;

public class Money {
private final int amount;
private final Currency my_currency;

    public Money(int amount, Currency my_currency) {
        this.amount = amount;
        this.my_currency = my_currency;
    }

    public int getAmount() {
        return amount;
    }

    public Currency getMy_currency() {
        return my_currency;
    }

}
