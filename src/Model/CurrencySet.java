package Model;

import java.util.ArrayList;

public class CurrencySet {
    private final ArrayList <Currency> set = new ArrayList<>();
    
    
    public Currency getCurrency(int indice){
        return set.get(indice);
        }
    
    public void addCurrency(Currency currency){
        set.add(currency);
    }
    
    public Currency[] toArray(){
        return set.toArray(new Currency[set.size()]);
    }
}
