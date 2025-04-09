import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CGPA_FINAL_GUI extends JFrame {
    private JTextField[] marksFields;
    private JTextField[] internalFields;
    private JTable resultTable;
    private String[] subjects = {"MATHS", "DDCO", "OS", "JAVA", "DSA", "DVP", "DSALAB", "SCR"};
    private int[] credits = {4, 4, 4, 3, 3, 1, 1, 1};

    public CGPA_FINAL_GUI() {
        setTitle("CGPA Calculator");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel inputPanel = new JPanel(new GridLayout(9, 3, 10, 10));
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        JLabel label;

        internalFields = new JTextField[subjects.length];
        marksFields = new JTextField[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            label = new JLabel("Internal Marks of " + subjects[i] + ":");
            inputPanel.add(label);
            internalFields[i] = new JTextField();
            inputPanel.add(internalFields[i]);
            label = new JLabel("External Marks of " + subjects[i] + ":");
            inputPanel.add(label);
            marksFields[i] = new JTextField();
            inputPanel.add(marksFields[i]);
        }

        JButton calculateButton = new JButton("Calculate CGPA");
        calculateButton.addActionListener(new CalculateCGPAActionListener());
        inputPanel.add(calculateButton);

        add(inputPanel, BorderLayout.NORTH);

        // Set up the result table
        String[] columnNames = {"Subject", "Total Marks", "Grade"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        resultTable = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(resultTable);
        add(tableScrollPane, BorderLayout.CENTER);

        setSize(600, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class CalculateCGPAActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int[] totals = new int[subjects.length];
            int[] externals = new int[subjects.length];
            float totalPoints = 0;
            StringBuilder failedSubjects = new StringBuilder();

            DefaultTableModel tableModel = (DefaultTableModel) resultTable.getModel();
            tableModel.setRowCount(0);  // Clear the previous rows

            for (int i = 0; i < subjects.length; i++) {
                int internalMarks = Integer.parseInt(internalFields[i].getText());
                int externalMarks = Integer.parseInt(marksFields[i].getText()) / 2;
                totals[i] = internalMarks + externalMarks;
                externals[i] = externalMarks;

                String grade;
                int gradePoints;

                if (i >= 5 && i <= 6) { // For DVP and DSALAB
                    if (totals[i] >= 45) {
                        grade = "O";
                        gradePoints = 10;
                    } else if (totals[i] >= 40) {
                        grade = "A+";
                        gradePoints = 9;
                    } else if (totals[i] >= 35) {
                        grade = "A";
                        gradePoints = 8;
                    } else if (totals[i] >= 30) {
                        grade = "B+";
                        gradePoints = 7;
                    } else if (totals[i] >= 25) {
                        grade = "B";
                        gradePoints = 6;
                    } else if (totals[i] >= 20) {
                        grade = "C";
                        gradePoints = 5;
                    } else {
                        grade = "F";
                        gradePoints = 0;
                        failedSubjects.append(subjects[i]).append(", ");
                    }
                } else if (externals[i] < 40) {
                    grade = "F";
                    gradePoints = 0;
                    failedSubjects.append(subjects[i]).append(", ");
                } else {
                    if (totals[i] >= 90) {
                        grade = "O";
                        gradePoints = 10;
                    } else if (totals[i] >= 80) {
                        grade = "A+";
                        gradePoints = 9;
                    } else if (totals[i] >= 70) {
                        grade = "A";
                        gradePoints = 8;
                    } else if (totals[i] >= 60) {
                        grade = "B+";
                        gradePoints = 7;
                    } else if (totals[i] >= 50) {
                        grade = "B";
                        gradePoints = 6;
                    } else if (totals[i] >= 45) {
                        grade = "C";
                        gradePoints = 5;
                    } else {
                        grade = "P";
                        gradePoints = 5;
                    }
                }

                totalPoints += gradePoints * credits[i];

                // Add the results to the table
                tableModel.addRow(new Object[]{subjects[i], totals[i], grade});
            }

            float sgpa = totalPoints / 21;

            if (failedSubjects.length() > 0) {
                // Remove the trailing comma and space
                failedSubjects.setLength(failedSubjects.length() - 2);
                JOptionPane.showMessageDialog(null, "You failed in: " + failedSubjects + "\nSGPA: " + sgpa);
            } else {
                JOptionPane.showMessageDialog(null, "The Total SGPA is: " + sgpa);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CGPA_FINAL_GUI::new);
    }
}
