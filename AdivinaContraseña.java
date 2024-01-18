
import javax.swing.*;

public class AdivinaContraseña {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sistema de Validación");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            frame.getContentPane().add(panel);
            placeComponents(panel);

            frame.setSize(300, 150);
            frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
            frame.setVisible(true);
        });
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("Usuario:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Iniciar sesión");
        loginButton.setBounds(10, 80, 130, 25);
        panel.add(loginButton);

        JLabel resultLabel = new JLabel("");
        resultLabel.setBounds(10, 110, 250, 25);
        panel.add(resultLabel);

        // Acción del botón
        loginButton.addActionListener(e -> {
            String usuario = userText.getText();
            String contrasena = new String(passwordText.getPassword());

            // Verificar el usuario y la contraseña
            if (usuario.equals("admin") && contrasena.equals("admin1234")) {
                resultLabel.setText("La contraseña es correcta");
            } else {
                resultLabel.setText("La contraseña no es correcta");
            }
        });
    }
}