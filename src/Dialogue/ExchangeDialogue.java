package Dialogue;

import Model.Currency;
import Model.Money;

public class ExchangeDialogue {
    int amount;
    Currency currency;

    public ExchangeDialogue(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
     
    public void execute(){
    }
    }
