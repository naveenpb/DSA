import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessGame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChessUI().setVisible(true));
    }
}

class ChessUI extends JFrame {
    private final JPanel boardPanel = new JPanel(new GridLayout(8, 8));
    private final JLabel statusLabel = new JLabel("Welcome to Chess");
    private final JButton[][] squares = new JButton[8][8];
    private boolean whiteTurn = true;
    private String player1, player2;
    
    public ChessUI() {
        setTitle("Chess Game");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        player1 = JOptionPane.showInputDialog("Enter Player 1 Name:");
        player2 = JOptionPane.showInputDialog("Enter Player 2 Name:");
        
        String[] options = {"White", "Black"};
        int choice = JOptionPane.showOptionDialog(null, player1 + " choose your color", "Choose Color",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        boolean player1IsWhite = (choice == 0);
        whiteTurn = player1IsWhite;
        
        add(statusLabel, BorderLayout.NORTH);
        add(boardPanel, BorderLayout.CENTER);
        initializeBoard();
        
        statusLabel.setText(player1 + " (" + (player1IsWhite ? "White" : "Black") + ") vs " + player2);
    }
    
    private void initializeBoard() {
        String[][] initialSetup = {
            {"♜", "♞", "♝", "♛", "♚", "♝", "♞", "♜"},
            {"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""},
            {"", "", "", "", "", "", "", ""},
            {"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"},
            {"♖", "♘", "♗", "♕", "♔", "♗", "♘", "♖"}
        };

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                squares[row][col] = new JButton(initialSetup[row][col]);
                squares[row][col].setFont(new Font("Arial", Font.BOLD, 24));
                squares[row][col].setPreferredSize(new Dimension(75, 75));
                squares[row][col].setBackground((row + col) % 2 == 0 ? Color.WHITE : Color.GRAY);
                boardPanel.add(squares[row][col]);
            }
        }
    }
}
