import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;

public class menu {

	private JFrame frmMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu window = new menu();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setBounds(100, 100, 750, 444);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JButton btnMesas = new JButton("Mesas");
		btnMesas.setBounds(6, 84, 129, 77);
		frmMenu.getContentPane().add(btnMesas);
		
		JButton btnPedidos = new JButton("Pedidos");
		btnPedidos.setBounds(6, 6, 129, 77);
		frmMenu.getContentPane().add(btnPedidos);
		
		JButton btnHistorial = new JButton("Historial");
		btnHistorial.setBounds(6, 162, 129, 77);
		frmMenu.getContentPane().add(btnHistorial);
		
		JButton btnConfig = new JButton("Configuración");
		btnConfig.setBounds(6, 339, 129, 77);
		frmMenu.getContentPane().add(btnConfig);
		
		JButton btnAdmin = new JButton("Administración");
		btnAdmin.setBounds(6, 240, 129, 77);
		frmMenu.getContentPane().add(btnAdmin);
	}
}
