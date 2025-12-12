public class Transaksion {
private int transaksionId;
private int biletaId;
private int counterparty_id;
private String counterparty_type;
private String lloji_transaksionit;
private String metoda;
private double shuma;
private String monedha;
private int statusi;
private String transaction_token;
private String pershkrimi;

    public Transaksion(int transaksionId, int biletaId, int counterparty_id, String counterparty_type, String lloji_transaksionit, String metoda, double shuma, String monedha, int statusi, String transaction_token, String pershkrimi) {
        this.transaksionId = transaksionId;
        this.biletaId = biletaId;
        this.counterparty_id = counterparty_id;
        this.counterparty_type = counterparty_type;
        this.lloji_transaksionit = lloji_transaksionit;
        this.metoda = metoda;
        this.shuma = shuma;
        this.monedha = monedha;
        this.statusi = statusi;
        this.transaction_token = transaction_token;
        this.pershkrimi = pershkrimi;
    }

    public int getTransaksionId() {
        return transaksionId;
    }

    public void setTransaksionId(int transaksionId) {
        this.transaksionId = transaksionId;
    }

    public int getBiletaId() {
        return biletaId;
    }

    public void setBiletaId(int biletaId) {
        this.biletaId = biletaId;
    }

    public int getCounterparty_id() {
        return counterparty_id;
    }

    public void setCounterparty_id(int counterparty_id) {
        this.counterparty_id = counterparty_id;
    }

    public String getCounterparty_type() {
        return counterparty_type;
    }

    public void setCounterparty_type(String counterparty_type) {
        this.counterparty_type = counterparty_type;
    }

    public String getLloji_transaksionit() {
        return lloji_transaksionit;
    }

    public void setLloji_transaksionit(String lloji_transaksionit) {
        this.lloji_transaksionit = lloji_transaksionit;
    }

    public String getMetoda() {
        return metoda;
    }

    public void setMetoda(String metoda) {
        this.metoda = metoda;
    }

    public double getShuma() {
        return shuma;
    }

    public void setShuma(double shuma) {
        this.shuma = shuma;
    }

    public String getMonedha() {
        return monedha;
    }

    public void setMonedha(String monedha) {
        this.monedha = monedha;
    }

    public int getStatusi() {
        return statusi;
    }

    public void setStatusi(int statusi) {
        this.statusi = statusi;
    }

    public String getTransaction_token() {
        return transaction_token;
    }

    public void setTransaction_token(String transaction_token) {
        this.transaction_token = transaction_token;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public void setPershkrimi(String pershkrimi) {
        this.pershkrimi = pershkrimi;
    }
}
