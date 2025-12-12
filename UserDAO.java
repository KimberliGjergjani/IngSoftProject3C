import java.sql.*;

public class UserDAO {

    public Perdoruesi registerUser(Perdoruesi user) {
        String sql = "INSERT INTO perdoruesi (emri, mbiemri, email, fjalkalimi, numri_tel, status, data_regjistrimit) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            pstmt.setString(1, user.getEmri());
            pstmt.setString(2, user.getMbiemri());
            pstmt.setString(3, user.getEmail());
            pstmt.setString(4, user.getPassword()); // ose hashed password
            pstmt.setString(5, user.getNumriTel());
            pstmt.setInt(6, user.getStatus());
            pstmt.setTimestamp(7, new Timestamp(user.getDataReg().getTime()));

            int affectedRows = pstmt.executeUpdate();

            if (affectedRows == 0) {
                throw new SQLException("Creating user failed, no rows affected.");
            }

            try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    user.setUserId(generatedKeys.getInt(1));
                } else {
                    throw new SQLException("Creating user failed, no ID obtained.");
                }
            }

            return user;

        } catch (SQLException e) {
            System.out.println("Register error: " + e.getMessage());
            return null;
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

    public Perdoruesi findByEmail(String email) {

        String sql = "SELECT * FROM perdoruesi WHERE email = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, email);
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
            }

            return null;

        } catch (SQLException e) {
            System.out.println("Email doesn't exists error: " + e.getMessage());
            return null;
        }
    }

}
