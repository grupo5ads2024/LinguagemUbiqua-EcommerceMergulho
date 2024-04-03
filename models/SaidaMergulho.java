package models;

import javax.swing.UIDefaults;

public class SaidaMergulho {
    @Id
    private long id;
    OperadoraMergulho operadoraMergulho;
    String local;
    Integer quorum;
    Double price;

    public SaidaMergulho(OperadoraMergulho operadoraMergulho, String local, Integer quorum, Double price) {
        this.operadoraMergulho = operadoraMergulho;
        this.local = local;
        this.quorum = quorum;
        this.price = price;
    }

    public OperadoraMergulho getOperadoraMergulho() {
        return operadoraMergulho;
    }

    public void setOperadoraMergulho(OperadoraMergulho operadoraMergulho) {
        this.operadoraMergulho = operadoraMergulho;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getQuorum() {
        return quorum;
    }

    public void setQuorum(Integer quorum) {
        this.quorum = quorum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}
