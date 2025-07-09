import java.sql.*;

public class BankTransaction {
    private static final String URL = "jdbc:sqlite:bank.db";

    public void transferMoney(int fromId, int toId, int amount) {
        String debitSQL = "UPDATE accounts SET balance = balance - ? WHERE id = ?";
        String creditSQL = "UPDATE accounts SET balance = balance + ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL)) {
            conn.setAutoCommit(false);

            try (PreparedStatement debitStmt = conn.prepareStatement(debitSQL);
                 PreparedStatement creditStmt = conn.prepareStatement(creditSQL)) {

                debitStmt.setInt(1, amount);
                debitStmt.setInt(2, fromId);
                debitStmt.executeUpdate();

                creditStmt.setInt(1, amount);
                creditStmt.setInt(2, toId);
                creditStmt.executeUpdate();

                conn.commit();
                System.out.println("Transfer successful.");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Transfer failed. Rolled back.");
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        BankTransaction bt = new BankTransaction();
        bt.transferMoney(1, 2, 500);
    }
}
