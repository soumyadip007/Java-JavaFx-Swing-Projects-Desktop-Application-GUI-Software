package Textbook_selling_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddOldBooks extends JFrame {

    private JPanel contentPane;
    private JTextField bookNameField;
    private JTextField writerNameField;
    private JTextField publisherField;
    private JTextField priceField;
    private JTextField sourceField;
    private JComboBox<String> dateComboBox;
    private JComboBox<String> monthComboBox;
    private JComboBox<String> yearComboBox;
    private JComboBox<String> subjectComboBox;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                AddOldBooks frame = new AddOldBooks();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public AddOldBooks() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Soumyadeep\\Desktop\\Book Hub\\0 (Custom).jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 319, 1014, 460);
        setResizable(false);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        contentPane.add(new JLabel("Book's name: "), gbc);

        gbc.gridx = 1;
        bookNameField = new JTextField(20);
        contentPane.add(bookNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        contentPane.add(new JLabel("Writer's name: "), gbc);

        gbc.gridx = 1;
        writerNameField = new JTextField(20);
        contentPane.add(writerNameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        contentPane.add(new JLabel("Condition: "), gbc);

        gbc.gridx = 1;
        JPanel conditionPanel = new JPanel();
        JRadioButton oldRadioButton = new JRadioButton("Old");
        oldRadioButton.setSelected(true);
        oldRadioButton.setEnabled(false);
        JRadioButton newRadioButton = new JRadioButton("New");
        newRadioButton.setEnabled(false);
        ButtonGroup conditionGroup = new ButtonGroup();
        conditionGroup.add(oldRadioButton);
        conditionGroup.add(newRadioButton);
        conditionPanel.add(oldRadioButton);
        conditionPanel.add(newRadioButton);
        contentPane.add(conditionPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        contentPane.add(new JLabel("Published Date: "), gbc);

        gbc.gridx = 1;
        JPanel datePanel = new JPanel();
        dateComboBox = new JComboBox<>();
        for (int i = 1; i <= 31; i++) {
            dateComboBox.addItem(String.valueOf(i));
        }
        monthComboBox = new JComboBox<>(new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"});
        yearComboBox = new JComboBox<>();
        for (int i = 1901; i <= 2018; i++) {
            yearComboBox.addItem(String.valueOf(i));
        }
        datePanel.add(dateComboBox);
        datePanel.add(monthComboBox);
        datePanel.add(yearComboBox);
        contentPane.add(datePanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        contentPane.add(new JLabel("Subject's name: "), gbc);

        gbc.gridx = 1;
        subjectComboBox = new JComboBox<>(new String[]{"English", "Hindi", "Bengali", "Maths", "Physics", "Chemistry", "Biology", "Computer", "History", "Geography", "Others"});
        contentPane.add(subjectComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        contentPane.add(new JLabel("Publisher name: "), gbc);

        gbc.gridx = 1;
        publisherField = new JTextField(20);
        contentPane.add(publisherField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        contentPane.add(new JLabel("Price (INR): "), gbc);

        gbc.gridx = 1;
        priceField = new JTextField(20);
        contentPane.add(priceField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        contentPane.add(new JLabel("Source: "), gbc);

        gbc.gridx = 1;
        sourceField = new JTextField(20);
        contentPane.add(sourceField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        JButton addButton = new JButton("Add");
        addButton.setFont(new Font("Segoe UI", Font.PLAIN, 30));
        addButton.addActionListener(new AddButtonActionListener());
        contentPane.add(addButton, gbc);
    }

    private class AddButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?");
            if (confirm == JOptionPane.YES_OPTION) {
                String name = bookNameField.getText().trim();
                String writer = writerNameField.getText().trim();
                String condition = "Old";
                String source = sourceField.getText().trim();
                String publisher = publisherField.getText().trim();
                String subject = (String) subjectComboBox.getSelectedItem();
                String price = priceField.getText().trim();
                String date = (String) dateComboBox.getSelectedItem();
                String month = (String) monthComboBox.getSelectedItem();
                String year = (String) yearComboBox.getSelectedItem();

                if (!name.isEmpty() && !writer.isEmpty() && !source.isEmpty() && !price.isEmpty() && !publisher.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Congratulations!\nBook is added successfully.\nThank you.");
                } else {
                    JOptionPane.showMessageDialog(null, "Please, enter all the required information.");
                }
            }
        }
    }
}
