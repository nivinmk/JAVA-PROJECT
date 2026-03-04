import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomeGardeningAssistant {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Home Gardening Assistant");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Title
        JLabel title = new JLabel("🌱 Home Gardening Assistant", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        frame.add(title, BorderLayout.NORTH);

        // Panel for inputs
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Dropdown options
        String[] sunlightOptions = {"Low", "Medium", "High"};
        String[] waterOptions = {"Low", "Medium", "High"};
        String[] spaceOptions = {"Small", "Medium", "Large"};

        JComboBox<String> sunlightBox = new JComboBox<>(sunlightOptions);
        JComboBox<String> waterBox = new JComboBox<>(waterOptions);
        JComboBox<String> spaceBox = new JComboBox<>(spaceOptions);

        panel.add(new JLabel("Sunlight:"));
        panel.add(sunlightBox);

        panel.add(new JLabel("Watering:"));
        panel.add(waterBox);

        panel.add(new JLabel("Space:"));
        panel.add(spaceBox);

        JButton recommendButton = new JButton("Recommend Plants");
        panel.add(recommendButton);

        frame.add(panel, BorderLayout.CENTER);

        // Output area
        JTextArea resultArea = new JTextArea(5, 30);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        frame.add(scrollPane, BorderLayout.SOUTH);

        // Button action
        recommendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String sunlight = (String) sunlightBox.getSelectedItem();
                String water = (String) waterBox.getSelectedItem();
                String space = (String) spaceBox.getSelectedItem();

                // Simple recommendation logic (for demo)
                resultArea.setText("Recommended Plants:\n\n");

                if (sunlight.equals("Low")) {
                    resultArea.append("• Snake Plant\n");
                    resultArea.append("• Peace Lily\n");
                } else if (sunlight.equals("Medium")) {
                    resultArea.append("• Aloe Vera\n");
                    resultArea.append("• Basil\n");
                } else {
                    resultArea.append("• Tomato\n");
                    resultArea.append("• Lavender\n");
                }
            }
        });

        frame.setVisible(true);
    }
}