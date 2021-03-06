package swing;

import Dialogue.ExchangeDialog;
import Model.CurrencySet;
import Model.ExchangeRate;
import static java.awt.BorderLayout.NORTH;
import static java.awt.BorderLayout.SOUTH;
import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class AplicationFrame  extends JFrame{
    private ExchangeDialog exchangeDialog;
    private final CurrencySet currencySet;
    private ActionListener actionListener;
    private final ExchangeRate exchangeRate;
    
    public AplicationFrame(CurrencySet currencySet,ExchangeRate exchangeRate) {
        this.exchangeRate=exchangeRate;
        this.currencySet=currencySet;
        this.setTitle("Moneycalculator");
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createWidgets();  
    }

    private Component createExchangePanel() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel(currencySet,exchangeRate);
        this.exchangeDialog= panel;
        return panel;
    }


    private JButton createCalculateButton() {
        JButton button = new JButton ("Calculate Exchange");
        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                actionListener.actionPerformed(e);
            }
            
        });
        return button;
    }

   public ExchangeDialog getExchangeDialog(){
       return exchangeDialog;
   }

    private void createWidgets() {
        this.add(createExchangePanel());
        this.add(createCalculateButton(),SOUTH);
    }

    public void register(ActionListener actionListener) {
        this.actionListener=actionListener;
    }
    
    public ExchangeDialog getDialog(){
        return exchangeDialog;
    }
    }
