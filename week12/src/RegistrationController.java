import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationController {
    private final RegistrationView view;


    public RegistrationController(RegistrationView view) {
        this.view = view;

        view.getSubmitButton().addActionListener(e -> submitForm());
        view.getResetButton().addActionListener(e -> resetForm());
    }

    private void submitForm() {
        try (Connection conn = new DatabaseConnection().getConnection()) {
            String sql = "INSERT INTO students (student_id, first_name, last_name, email, phone, date_of_birth, gender, address, course, semester) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, view.getStudentIdField().getText());
            stmt.setString(2, view.getFirstNameField().getText());
            stmt.setString(3, view.getLastNameField().getText());
            stmt.setString(4, view.getEmailField().getText());
            stmt.setString(5, view.getPhoneField().getText());
            stmt.setString(6, view.getDateOfBirthField().getText());
            stmt.setString(7, (String) view.getGenderCombo().getSelectedItem());
            stmt.setString(8, view.getAddressField().getText());
            stmt.setString(9, (String) view.getCourseCombo().getSelectedItem());
            stmt.setString(10, (String) view.getSemesterCombo().getSelectedItem());

            if (!view.getEmailField().getText().contains("@"))
                JOptionPane.showMessageDialog(view, "Email is not in correct format");


            stmt.executeUpdate();
            JOptionPane.showMessageDialog(view, "Student registered successfully!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Error: " + ex.getMessage());
        }
    }

    private void resetForm() {
        view.getStudentIdField().setText("");
        view.getFirstNameField().setText("");
        view.getLastNameField().setText("");
        view.getEmailField().setText("");
        view.getPhoneField().setText("");
        view.getDateOfBirthField().setText("");
        view.getGenderCombo().setSelectedIndex(0);
        view.getAddressField().setText("");
        view.getCourseCombo().setSelectedIndex(0);
        view.getSemesterCombo().setSelectedIndex(0);
    }
}
