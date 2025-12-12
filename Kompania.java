import java.util.Date;

public class Kompania {
    private int kompaniaId;
    private String kompaniaName;
    private String email;
    private String password;
    private String numriTel;
    private String adresa;
    private String nipt;
    private String status;
    private Date dataRegj;

    public Kompania(int kompaniaId, String kompaniaName, String email, String password, String numriTel, String adresa, String nipt, String status, Date dataRegj) {
        this.kompaniaId = kompaniaId;
        this.kompaniaName = kompaniaName;
        this.email = email;
        this.password = password;
        this.numriTel = numriTel;
        this.adresa = adresa;
        this.nipt = nipt;
        this.status = status;
        this.dataRegj = dataRegj;
    }

    public int getKompaniaId() {
        return kompaniaId;
    }

    public void setKompaniaId(int kompaniaId) {
        this.kompaniaId = kompaniaId;
    }

    public String getKompaniaName() {
        return kompaniaName;
    }

    public void setKompaniaName(String kompaniaName) {
        this.kompaniaName = kompaniaName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumriTel() {
        return numriTel;
    }

    public void setNumriTel(String numriTel) {
        this.numriTel = numriTel;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getNipt() {
        return nipt;
    }

    public void setNipt(String nipt) {
        this.nipt = nipt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataRegj() {
        return dataRegj;
    }

    public void setDataRegj(Date dataRegj) {
        this.dataRegj = dataRegj;
    }
}
