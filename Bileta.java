import java.util.*;
public class Bileta {
    private int biletaId;
    private int userId;
    private int itinerariId;
    private Date dataRezervimit;
    private double cmimi;
    private int seat;
    private String status;

    public Bileta(int biletaId, int userId, int itinerariId, Date dataRezervimit, double cmimi, int seat, String status) {
        this.biletaId = biletaId;
        this.userId = userId;
        this.itinerariId = itinerariId;
        this.dataRezervimit = dataRezervimit;
        this.cmimi = cmimi;
        this.seat = seat;
        this.status = status;
    }

    public int getBiletaId() {
        return biletaId;
    }

    public void setBiletaId(int biletaId) {
        this.biletaId = biletaId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getItinerariId() {
        return itinerariId;
    }

    public void setItinerariId(int itinerariId) {
        this.itinerariId = itinerariId;
    }

    public Date getDataRezervimit() {
        return dataRezervimit;
    }

    public void setDataRezervimit(Date dataRezervimit) {
        this.dataRezervimit = dataRezervimit;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
