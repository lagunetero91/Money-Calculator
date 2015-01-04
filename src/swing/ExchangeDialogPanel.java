package swing;

import Dialogue.ExchangeDialog;
import Model.Currency;
import Model.CurrencySet;
import Model.Exchange;
import Model.Money;
import java.awt.PopupMenu;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExchangeDialogPanel extends JPanel implements ExchangeDialog{
    private final CurrencySet currencySet;

    public ExchangeDialogPanel(CurrencySet currencySet){
        this.currencySet=currencySet;
        this.createWidget();
        //this.add(createSourceCurrencyField());
       // this.add(createTargetCurrencyField());
    }

    

    @Override
    public Exchange getExchange() {
        return null;
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
}
