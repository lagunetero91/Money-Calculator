package swing;

import Dialogue.ExchangeDialog;
import Model.Currency;
import Model.CurrencySet;
import Model.Exchange;
import Model.Money;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExchangeDialogPanel extends JPanel implements ExchangeDialog{
    private final CurrencySet currencySet;

    public ExchangeDialogPanel(CurrencySet currencySet){
        this.currencySet=currencySet;
        this.add(createAmountField());
        //this.add(createSourceCurrencyField());
       // this.add(createTargetCurrencyField());
    }

    private JTextField createAmountField() {
        JTextField text = new JTextField();
        text.addInputMethodListener(new InputMethodListener(){

            @Override
            public void inputMethodTextChanged(InputMethodEvent event) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void caretPositionChanged(InputMethodEvent event) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
                
        
                
            
        });
        return text;
    }

    private JComboBox<Currency> createSourceCurrencyField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private JComboBox<Currency> createTargetCurrencyField() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Exchange getExchange() {
        return null;
    }
}
