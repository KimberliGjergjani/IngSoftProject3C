import java.util.Date;

public class Rating {
    private int reviewId;
    private int transaksioniId;
    private int vleresim;
    private String komente;
    private Date timestamp;


    public Rating(int reviewId, int transaksioniId, int vleresim, String komente, Date timestamp) {
        this.reviewId = reviewId;
        this.transaksioniId = transaksioniId;
        this.vleresim = vleresim;
        this.komente = komente;
        this.timestamp = timestamp;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public int getTransaksioniId() {
        return transaksioniId;
    }

    public void setTransaksioniId(int transaksioniId) {
        this.transaksioniId = transaksioniId;
    }

    public int getVleresim() {
        return vleresim;
    }

    public void setVleresim(int vleresim) {
        this.vleresim = vleresim;
    }

    public String getKomente() {
        return komente;
    }

    public void setKomente(String komente) {
        this.komente = komente;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
