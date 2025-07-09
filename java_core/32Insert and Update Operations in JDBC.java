import java.sql.*;

public class StudentDAO {
    private static final String URL = "jdbc:sqlite:students.db";

    public void insertStudent(int id, String name, int age) {
        String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            stmt.executeUpdate();

            System.out.println("Student inserted successfully.");
        } catch (SQLException e) {
            System.out.println("Insert error: " + e.getMessage());
        }
    }

    public void updateStudent(int id, String newName, int newAge) {
        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, newName);
            stmt.setInt(2, newAge);
            stmt.setInt(3, id);
            stmt.executeUpdate();

            System.out.println("Student updated successfully.");
        } catch (SQLException e) {
            System.out.println("Update error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(3, "Kavi", 22);
        dao.updateStudent(3, "Kavitha", 23);
    }
}
