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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	private JFrame frame;
	private JPasswordField passwordContraseña;
	private JTextField textUsuario;
	private JFrame frmMenu;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login ");
		lblNewLabel.setFont(new Font("Geeza Pro", Font.BOLD, 20));
		lblNewLabel.setBounds(38, 38, 70, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(60, 82, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setBounds(60, 141, 85, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		passwordContraseña = new JPasswordField();
		passwordContraseña.setToolTipText("Combinación de letras y simbolos que conforman su contraseña");
		passwordContraseña.setBounds(133, 136, 180, 26);
		frame.getContentPane().add(passwordContraseña);
		
		textUsuario = new JTextField();
		textUsuario.setToolTipText("Nombre de usuario");
		textUsuario.setBounds(133, 77, 180, 26);
		frame.getContentPane().add(textUsuario);
		textUsuario.setColumns(10);
		
		JButton btnIniciarSesion = new JButton("Iniciar sesión");
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
		btnIniciarSesion.setBounds(133, 194, 180, 37);
		frame.getContentPane().add(btnIniciarSesion);
	}

	
	/**
	 * Funciones extra
	*/
	private void iniciarLogin() {
		String User = textUsuario.getText();
		char[] passC = passwordContraseña.getPassword();
		String clave = new String(passC);
		
		if(User.equals("admin") && clave.equals("admin")) {
			JOptionPane.showMessageDialog(null, "Bienvenido admin");
			frame.dispose();
			Menus nuevo = new Menus();
			nuevo.setVisible(true);
		}else 
			if(User.equals("mesero") && clave.equals("mesero")) {
				JOptionPane.showMessageDialog(null, "Bienvenido mesero");
			}else 
				if(User.equals("cocinero") && clave.equals("cocinero")) {
					JOptionPane.showMessageDialog(null, "Bienvenido cocinero");
				}else {
					JOptionPane.showMessageDialog(null, "Acceso denegado:\nFavor de ingresar un usuario o contraseña correctos!");
					textUsuario.setText("");
					passwordContraseña.setText("");
					textUsuario.grabFocus();
				}
	}
	
	
}
