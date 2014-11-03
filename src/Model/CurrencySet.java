package Model;

import java.util.HashMap;

public class CurrencySet {
  
    HashMap <String,Currency> set = new HashMap<>();
    public CurrencySet(){
        set.load();
    }
    public Currency getCurrency(String key){
        return set.get(key);
        }
    
    public void addCurrency(String key,Currency currency){
        set.put(key, currency);
    }
}
