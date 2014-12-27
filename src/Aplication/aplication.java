package Aplication;

import Model.CurrencySet;
import Persistence.CurrencySetLoader;
import Persistence.database.DataBase;
import swing.AplicationFrame;

public class aplication {
    public static void main (String [] Args){
        CurrencySet currencySet= new CurrencySet();
        AplicationFrame frame = new AplicationFrame(currencySet);
        
    }
}
