package swing;

import Dialogue.ExchangeDialog;
import Model.CurrencySet;
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
    
    public AplicationFrame(CurrencySet currencySet) {
        this.currencySet=currencySet;
        this.setTitle("Moneycalculator");
        this.setSize(500,500);
        this.createWidgets();  
    }

    private Component createExchangePanel() {
        ExchangeDialogPanel panel = new ExchangeDialogPanel(currencySet);
        this.exchangeDialog= panel;
        return panel;
    }

    private PopupMenu createMoneyPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
       // this.add(createMoneyPanel());
        this.add(createCalculateButton()); }

    public void register(ActionListener actionListener) {
        this.actionListener=actionListener;
    }
    
    public ExchangeDialog getDialog(){
        return exchangeDialog;
    }
    }
