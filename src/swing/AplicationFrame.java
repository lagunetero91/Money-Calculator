package swing;

import Dialogue.ExchangeDialog;
import java.awt.PopupMenu;
import javax.swing.JFrame;

public class AplicationFrame  extends JFrame{
    private ExchangeDialog exchangeDialog;
    
    public AplicationFrame() {
        this.setTitle("Moneycalculator");
        this.setSize(500,500);
        this.add(createExchangePanel());
        this.add(createMoneyPanel());
        this.add(createCalculateButton());
    }

    private PopupMenu createExchangePanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private PopupMenu createMoneyPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private PopupMenu createCalculateButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public ExchangeDialog getExchangeDialog(){
       return exchangeDialog;
   }
}
