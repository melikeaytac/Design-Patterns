import javax.swing.*;
import java.awt.*;

public class RegistrationView extends JFrame {
    private JTextField studentIdField, firstNameField, lastNameField, emailField, phoneField, dateOfBirthField, addressField;
    private JComboBox<String> genderCombo, courseCombo, semesterCombo;
    private JButton submitButton, resetButton;


    public RegistrationView() {
        setTitle("Student Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLayout(new GridLayout(12, 2));


        add(new JLabel("Student ID:"));
        studentIdField = new JTextField();

        add(studentIdField);

        add(new JLabel("First Name:"));
        firstNameField = new JTextField();
        add(firstNameField);

        add(new JLabel("Last Name:"));
        lastNameField = new JTextField();
        add(lastNameField);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);


        add(new JLabel("Phone:"));
        phoneField = new JTextField();
        add(phoneField);

        add(new JLabel("Date of Birth (YYYY-MM-DD):"));
        dateOfBirthField = new JTextField();
        add(dateOfBirthField);

        add(new JLabel("Gender:"));
        genderCombo = new JComboBox<>(new String[]{"Male", "Female", "Other"});
        add(genderCombo);

        add(new JLabel("Address:"));
        addressField = new JTextField();
        add(addressField);

        add(new JLabel("Course:"));
        courseCombo = new JComboBox<>(new String[]{"Computer Science", "Engineering", "Business", "Arts","Law"});
        add(courseCombo);

        add(new JLabel("Semester:"));
        semesterCombo = new JComboBox<>(new String[]{"First", "Second", "Third", "Fourth","Fifth","Sixth","Seventh","Eighth"});
        add(semesterCombo);

        submitButton = new JButton("Submit");
        resetButton = new JButton("Reset");
        add(submitButton);
        add(resetButton);
    }

    public JTextField getStudentIdField() {
        return studentIdField;
    }

    public JTextField getFirstNameField() {
        return firstNameField;
    }

    public JTextField getLastNameField() {
        return lastNameField;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JTextField getPhoneField() {
        return phoneField;
    }

    public JTextField getDateOfBirthField() {
        return dateOfBirthField;
    }

    public JComboBox<String> getGenderCombo() {
        return genderCombo;
    }

    public JTextField getAddressField() {
        return addressField;
    }

    public JComboBox<String> getCourseCombo() {
        return courseCombo;
    }

    public JComboBox<String> getSemesterCombo() {
        return semesterCombo;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }
}