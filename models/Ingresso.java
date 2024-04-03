package models;
import java.util.UUID;

public class Ingresso {
    private String codigoBarras;
    private Mergulhador mergulhador;
    private SaidaMergulho saidaMergulho;

    public Ingresso(SaidaMergulho saidaMergulho, Mergulhador mergulhador) {
        this.codigoBarras = UUID.randomUUID().toString();
        this.mergulhador = mergulhador;
        this.saidaMergulho = saidaMergulho;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public Mergulhador getMergulhador() {
        return mergulhador;
    }

    public SaidaMergulho getSaidaMergulho() {
        return saidaMergulho;
    }

    public Mergulhador setMergulhador(Mergulhador mergulhador) {
        this.mergulhador = mergulhador;
        return mergulhador;
    }

    public SaidaMergulho setSaidaMergulho(SaidaMergulho saidaMergulho) {
        this.saidaMergulho = saidaMergulho;
        return saidaMergulho;
    }

    @Override

    public String toString() {
        return "Ingresso{" +
                ", codigoBarras='" + codigoBarras + '\'' +
                ", mergulhador=" + mergulhador +
                ", saidaMergulho=" + saidaMergulho +
                '}';
    }
    
}