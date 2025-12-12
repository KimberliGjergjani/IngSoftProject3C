public class Autobus {
    private int autobusiId;
    private int kompaniaId;
    private String targa;
    private String modeli;
    private int kapaciteti;
    private int viti_prodhimit;
    private String status;
    private String pergjegjes;

    public Autobus(int autobusiId, int kompaniaId, String targa, String modeli, int kapaciteti, int viti_prodhimit, String status, String pergjegjes) {
        this.autobusiId = autobusiId;
        this.kompaniaId = kompaniaId;
        this.targa = targa;
        this.modeli = modeli;
        this.kapaciteti = kapaciteti;
        this.viti_prodhimit = viti_prodhimit;
        this.status = status;
        this.pergjegjes = pergjegjes;
    }

    public int getAutobusiId() {
        return autobusiId;
    }

    public void setAutobusiId(int autobusiId) {
        this.autobusiId = autobusiId;
    }

    public int getKompaniaId() {
        return kompaniaId;
    }

    public void setKompaniaId(int kompaniaId) {
        this.kompaniaId = kompaniaId;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModeli() {
        return modeli;
    }

    public void setModeli(String modeli) {
        this.modeli = modeli;
    }

    public int getKapaciteti() {
        return kapaciteti;
    }

    public void setKapaciteti(int kapaciteti) {
        this.kapaciteti = kapaciteti;
    }

    public int getViti_prodhimit() {
        return viti_prodhimit;
    }

    public void setViti_prodhimit(int viti_prodhimit) {
        this.viti_prodhimit = viti_prodhimit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPergjegjes() {
        return pergjegjes;
    }

    public void setPergjegjes(String pergjegjes) {
        this.pergjegjes = pergjegjes;
    }
}
