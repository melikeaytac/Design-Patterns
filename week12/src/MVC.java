import javax.swing.*;

public class MVC {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DatabaseConnection.initializeDatabase();
            RegistrationView view = new RegistrationView();
            new RegistrationController(view);
            view.setVisible(true);
        });
    }
}
