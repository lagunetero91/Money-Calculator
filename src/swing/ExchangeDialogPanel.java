package swing;

import Dialogue.ExchangeDialog;
import Model.Currency;
import Model.CurrencySet;
import Model.Exchange;
import Model.ExchangeRate;
import Model.Money;
import java.awt.PopupMenu;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExchangeDialogPanel extends JPanel implements ExchangeDialog{
    private final CurrencySet currencySet;
    private final ExchangeRate exchangeRate;
    private JTextField amount;
    private JComboBox<Currency> fromCurrency;
    private JComboBox<Currency> toCurrency;
    private JLabel label;
    
    public ExchangeDialogPanel(CurrencySet currencySet, ExchangeRate exchangeRate){
        this.currencySet=currencySet;
        this.exchangeRate=exchangeRate;
        this.createWidget();
        //this.add(createSourceCurrencyField());
       // this.add(createTargetCurrencyField());
    }

    
    public ExchangeRate getExchangeRate(){
        return exchangeRate;
    }

    

    @Override
    public Exchange getExchange() {
        return new Exchange(new Money(getAmount(), getFromCurrency()),getToCurrency());
    }

    private void createWidget() {
        this.add(amountWidget());
        this.add(fromCurrencyWidget());
        this.add(toCurrencyWidget());
    }

    private JTextField amountWidget() {
        JTextField amount = new JTextField();
        amount.setColumns(15);
        return amount;
    }

    private JComboBox fromCurrencyWidget() {
        JComboBox<Currency> box = new JComboBox<>(currencySet.toArray());
        return box;
    }

    private JComboBox toCurrencyWidget() {
        JComboBox<Currency> box = new JComboBox<>(currencySet.toArray());
        return box;    
    }

    private double getAmount() {
        return Double.parseDouble(amount.getText());
    }

    private Currency getFromCurrency() {
        return fromCurrency.getItemAt(fromCurrency.getSelectedIndex());
    }

    private Currency getToCurrency() {
        return toCurrency.getItemAt(toCurrency.getSelectedIndex());
    }
}
