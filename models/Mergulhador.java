package models;

public class Mergulhador {
    
    String name;
    Number credencial;
    
    public Mergulhador(String name, Number credencial) {
        this.name = name;
        this.credencial = credencial;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Number getCredencial() {
        return credencial;
    }
    public void setCredencial(Number credencial) {
        this.credencial = credencial;
    }
}
