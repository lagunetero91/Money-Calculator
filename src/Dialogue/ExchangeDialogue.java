package Dialogue;

import Model.Money;

public class ExchangeDialogue {
    int amount;
    int currency;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }
    
    Money money= new Money(amount,currency);
    
}
