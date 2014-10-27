
package UI;

import Dialogue.ExchangeDialogue;
import Model.Exchange;

public class MoneyDisplay {
    public void Execute(){
      
    }
    private Exchange ReadExchange(){
        ExchangeDialogue dialog =new ExchangeDialogue();
        dialog.execute();
        return dialog;
    }
}
