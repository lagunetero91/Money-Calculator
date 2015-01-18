package Control;

import Dialogue.ExchangeDialog;

public class ExchangeOperation {
    private final ExchangeDialog exchangeDialog;

    public ExchangeOperation(ExchangeDialog exchangeDialog) {
        this.exchangeDialog = exchangeDialog;
    }
    
    public void execute(){
        exchangeDialog.setLabel("" + exchangeDialog.getExchange().getMoney().getAmount()*exchangeDialog.getExchangeRate().getRate());
    }
    
}
