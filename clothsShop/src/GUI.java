import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JPasswordField password;
    private JLabel pass_entered = new JLabel("Enter password");
    private JFrame sign_in;  // Declare sign_in as a class member

    public GUI() {
        sign_in = new JFrame("Sign In");  // Initialize sign_in here
        JButton sign_in_button = new JButton("Sign In");
        password = new JPasswordField();
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        panel.add(new Label("Enter password:"));
        panel.add(password);
        password.addActionListener(this);
        panel.add(sign_in_button);
        panel.add(pass_entered);

        sign_in.add(panel, BorderLayout.CENTER);
        sign_in.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sign_in.pack();
        sign_in.setVisible(true);

        sign_in_button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        char[] passwordChars = password.getPassword();
        String passwordString = new String(passwordChars);
        pass_entered.setText(passwordString);

        if (passwordString.equals("Admin123")) {
            JFrame ClothShop = new JFrame("ClothShop");
            JMenuBar menu = new JMenuBar();

            JPanel store_panel = new JPanel();
            store_panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
            store_panel.setLayout(new GridLayout(0, 1));

            store_panel.add(new JLabel("Welcome to the Cloth Shop!"));
            ClothShop.add(store_panel, BorderLayout.CENTER);
            ClothShop.setJMenuBar(menu);
            ClothShop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ClothShop.pack();
            ClothShop.setVisible(true);
            sign_in.setVisible(false);  // Use the class member here
        }
    }

    public static void main(String[] args) {
        new GUI();
    }
}
