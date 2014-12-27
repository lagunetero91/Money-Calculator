package Aplication;

import Control.ExchangeOperation;
import Model.CurrencySet;
import Persistence.CurrencySetLoader;
import Persistence.database.DataBase;
import UI.MoneyDisplay;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import swing.AplicationFrame;

public class aplication {
    public static void main (String [] Args){
        CurrencySet currencySet= new CurrencySet();
        AplicationFrame frame = new AplicationFrame(currencySet);
        frame.register(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                new ExchangeOperation(frame.getExchangeDialog()).execute();
            }
            
            
        });
    }
}
