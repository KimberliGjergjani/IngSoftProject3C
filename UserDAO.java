import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class UserDAO {

    public boolean registerUser(Perdoruesi user) {
        String sql = "INSERT INTO perdoruesi (emri, mbiemri, email, fjalkalimi, numri_tel, status, data_regjistrimit) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, user.getEmri());
            pstmt.setString(2, user.getMbiemri());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword());
            pstmt.setString(5, user.getNumriTel());
            pstmt.setInt(6, user.getStatus());
            pstmt.setTimestamp(7, new Timestamp(user.getDataReg().getTime()));

            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            System.out.println("Register error: " + e.getMessage());
            return false;
        }
    }

    public Perdoruesi loginUser(String email, String password) {
        String sql = "SELECT * FROM perdoruesi WHERE email = ? AND fjalkalimi = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, email);
            pstmt.setString(2, password);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Perdoruesi(
                        rs.getInt("status"),
                        rs.getTimestamp("data_regjistrimit"),
                        rs.getString("fjalkalimi"),
                        rs.getString("numri_tel"),
                        rs.getString("email"),
                        rs.getString("mbiemri"),
                        rs.getString("emri"),
                        rs.getInt("user_id")
                );
            } else {
                return null;
            }

        } catch (SQLException e) {
            System.out.println("Log in error: " + e.getMessage());
            return null;
        }
    }

    public boolean emailExists(String email) {
        String sql = "SELECT 1 FROM perdoruesi WHERE email = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
            return true;
        }
    }
}
