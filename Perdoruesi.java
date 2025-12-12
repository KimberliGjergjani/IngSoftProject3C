import java.util.Date;

public class Perdoruesi {
    private int userId;
    private String emri;
    private String mbiemri;
    private String email;
    private String numriTel;
    private String password;
    private Date dataReg;
    private int status; // 1 if aktiv, 0 inaktiv

    public Perdoruesi(int status, Date dataReg, String password, String numriTel, String email, String mbiemri, String emri, int userId) {
        this.status = status;
        this.dataReg = dataReg;
        this.password = password;
        this.numriTel = numriTel;
        this.email = email;
        this.mbiemri = mbiemri;
        this.emri = emri;
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumriTel() {
        return numriTel;
    }

    public void setNumriTel(String numriTel) {
        this.numriTel = numriTel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDataReg() {
        return dataReg;
    }

    public void setDataReg(Date dataReg) {
        this.dataReg = dataReg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
