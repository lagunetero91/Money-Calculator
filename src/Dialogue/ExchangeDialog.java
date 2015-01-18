package Dialogue;


import Model.Exchange;
import Model.ExchangeRate;
    public interface ExchangeDialog {
        
        public Exchange getExchange();
        public ExchangeRate getExchangeRate();

        public void setLabel(String string);
    }
