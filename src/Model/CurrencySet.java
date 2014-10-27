package Model;

import java.util.HashMap;

public class CurrencySet {
  
    HashMap <String,Currency> set = new HashMap<>();
    
    public Currency getCurrency(String key){
        return set.get(key);
        }
    
}
