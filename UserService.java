
import java.sql.SQLException;
import java.sql.Timestamp;

public class UserService {

    private final UserDAO userDao;

    public UserService(UserDAO userDao) {
        this.userDao = userDao;
    }

    public Perdoruesi registerUser(
            String emri,
            String mbiemri,
            String email,
            String password,
            String numriTel,
            int status,
            Timestamp dataRegjistrimit
    ) throws SQLException {

        if (emri == null || emri.isBlank()) {
            throw new IllegalArgumentException("Emri nuk mund te jete bosh");
        }

        if (mbiemri == null || mbiemri.isBlank()) {
            throw new IllegalArgumentException("Mbiemri nuk mund te jete bosh");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email nuk mund te jete bosh");
        }

        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password nuk mund te jete bosh");
        }

        if (numriTel == null || numriTel.isBlank()) {
            throw new IllegalArgumentException("Numri i telefonit nuk mund te jete bosh");
        }

        Perdoruesi user = new Perdoruesi(
                emri,
                mbiemri,
                email,
                password,
                numriTel,
                status,
                dataRegjistrimit
        );

        return userDao.registerUser(user);
    }

    public Perdoruesi loginUser(String email, String password) {

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email nuk mund te jete bosh");
        }

        if (password == null || password.isBlank()) {
            throw new IllegalArgumentException("Password nuk mund te jete bosh");
        }

        Perdoruesi user = userDao.findByEmail(email);

        if (user == null) {
            throw new IllegalArgumentException("Email ose fjalekalim i pasakte");
        }

        if (!user.getPassword().equals(password)) {
            throw new IllegalArgumentException("Email ose fjalekalim i pasakte");
        }

        return user;
    }


}
