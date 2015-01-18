package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class CurrencySet implements Iterable<Currency>{
    
    private final ArrayList <Currency> set;
    
    public CurrencySet() {
        this.set = new ArrayList<>();
    }
    
    public Currency getCurrency(int indice){
        return set.get(indice);
        }
    
    public void addCurrency(Currency currency){
        set.add(currency);
    }
    
    public Currency[] toArray(){
        return set.toArray(new Currency[set.size()]);
    }

    @Override
    public Iterator<Currency> iterator() {
        return set.iterator();
    }
}
