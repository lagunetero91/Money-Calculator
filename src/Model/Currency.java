package Model;

public class Currency {
private final int code;
private final String name;
private final String simbol;

    public Currency(int code, String name, String simbol) {
        this.code = code;
        this.name = name;
        this.simbol = simbol;
    }

    public int getCode() {
        return code;
    }
            
    public String getName() {
        return name;
    }

    public String getSimbol() {
        return simbol;
    }
    
    
}
