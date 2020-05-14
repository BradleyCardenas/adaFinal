import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 642, 351);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		JLabel lblLogin = new JLabel("Iniciar sesion");
		lblLogin.setFont(new Font("Geeza Pro", Font.BOLD, 30));
		lblLogin.setBounds(47, 33, 224, 54);
		getContentPane().add(lblLogin);
		
		JLabel lblNewLabel_1 = new JLabel("User");
		lblNewLabel_1.setBounds(47, 111, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(47, 179, 85, 16);
		getContentPane().add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("Combinacion de letras y simbolos que conforman su password");
		passwordField.setBounds(47, 197, 248, 26);
		getContentPane().add(passwordField);
		
		textUsuario = new JTextField();
		textUsuario.setToolTipText("Nombre de usuario");
		textUsuario.setBounds(47, 131, 248, 26);
		getContentPane().add(textUsuario);
		textUsuario.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.setBackground(new Color(255, 255, 255));
		btnIniciarSesion.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					iniciarLogin();
				}
			}
		});
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				iniciarLogin();
			}
		});
		contentPane.setLayout(null);
		btnIniciarSesion.setBounds(50, 253, 147, 39);
		getContentPane().add(btnIniciarSesion);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/bradleycardenas/git/adaFinal/recursos/inicio.jpg"));
		lblNewLabel.setBounds(318, 33, 300, 264);
		contentPane.add(lblNewLabel);
		
		
		
	}
	
	private void iniciarLogin() {
		String User = textUsuario.getText();
		char[] passC = passwordField.getPassword();
		String clave = new String(passC);
		
		if(User.equals("admin") && clave.equals("admin")) {
			JOptionPane.showMessageDialog(null, "Bienvenido admin");
			this.dispose();
			Menus nuevo = new Menus();
			nuevo.setVisible(true);
		}else 
			if(User.equals("mesero") && clave.equals("mesero")) {
				JOptionPane.showMessageDialog(null, "Bienvenido mesero");
				this.dispose();
				Menus nuevo = new Menus();
				nuevo.setVisible(true);
			}else 
				if(User.equals("cocinero") && clave.equals("cocinero")) {
					JOptionPane.showMessageDialog(null, "Bienvenido cocinero");
					this.dispose();
					Menus nuevo = new Menus();
					nuevo.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Acceso denegado:\nFavor de ingresar un usuario o contraseña correctos!");
					textUsuario.setText("");
					passwordField.setText("");
					textUsuario.grabFocus();
				}
	}
}


