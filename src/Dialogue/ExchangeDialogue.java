package Dialogue;

import Model.Currency;
import Model.Exchange;
import Model.Money;

public class ExchangeDialogue {
    Currency currency;
    Exchange exchange;
    Money money;

    public ExchangeDialogue(Money money, Currency currency) {
        this.money = money;
        this.currency = currency;
        exchange=new Exchange(money,currency);
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
     
    public void execute(){
    }
    }
