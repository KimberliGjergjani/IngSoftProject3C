import java.util.Date;

public class Itinerari {
    private int itinerariId;
    private int autobusiId;
    private String qytetiDestiancion;
    private String qytetiNisje;
    private Date kohaNisje;
    private int numriVendeve;
    private double cmimi;
    private String status;

    public Itinerari(int itinerariId, int autobusiId, String qytetiDestiancion, String qytetiNisje, Date kohaNisje, int numriVendeve, double cmimi, String status) {
        this.itinerariId = itinerariId;
        this.autobusiId = autobusiId;
        this.qytetiDestiancion = qytetiDestiancion;
        this.qytetiNisje = qytetiNisje;
        this.kohaNisje = kohaNisje;
        this.numriVendeve = numriVendeve;
        this.cmimi = cmimi;
        this.status = status;
    }

    public int getItinerariId() {
        return itinerariId;
    }

    public void setItinerariId(int itinerariId) {
        this.itinerariId = itinerariId;
    }

    public int getAutobusiId() {
        return autobusiId;
    }

    public void setAutobusiId(int autobusiId) {
        this.autobusiId = autobusiId;
    }

    public String getQytetiDestiancion() {
        return qytetiDestiancion;
    }

    public void setQytetiDestiancion(String qytetiDestiancion) {
        this.qytetiDestiancion = qytetiDestiancion;
    }

    public String getQytetiNisje() {
        return qytetiNisje;
    }

    public void setQytetiNisje(String qytetiNisje) {
        this.qytetiNisje = qytetiNisje;
    }

    public Date getKohaNisje() {
        return kohaNisje;
    }

    public void setKohaNisje(Date kohaNisje) {
        this.kohaNisje = kohaNisje;
    }

    public int getNumriVendeve() {
        return numriVendeve;
    }

    public void setNumriVendeve(int numriVendeve) {
        this.numriVendeve = numriVendeve;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
