import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GardeningAssistantGUI {

    public static void main(String[] args) {

        // Create Frame (like main window)
        JFrame frame = new JFrame("AI Home Gardening Assistant");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Title Label
        JLabel title = new JLabel("🌱 AI Home Gardening Assistant", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(title, BorderLayout.NORTH);

        // Panel to hold buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 10, 10));

        // Buttons
        JButton recommendButton = new JButton("Recommend Plants");
        JButton survivalButton = new JButton("Predict Survival Score");

        panel.add(recommendButton);
        panel.add(survivalButton);

        frame.add(panel, BorderLayout.CENTER);

        // Action for Recommend
        recommendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "You selected: Recommend Plants");
            }
        });

        // Action for Survival Score
        survivalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                        "You selected: Predict Survival Score");
            }
        });

        frame.setVisible(true);
    }
}