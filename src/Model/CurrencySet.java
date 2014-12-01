package Model;

import java.util.HashMap;

public class CurrencySet {
  
    private final HashMap <String,Currency> set;
    public CurrencySet(HashMap <String,Currency> set){
        this.set=set;
    }
    
    public Currency getCurrency(String key){
        return set.get(key);
        }
    
    public void addCurrency(String key,Currency currency){
        set.put(key, currency);
    }
}
