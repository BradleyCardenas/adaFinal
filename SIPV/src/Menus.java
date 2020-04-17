import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Menus extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menus frame = new Menus();
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
	public Menus() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMesas = new JButton("Mesas");
		btnMesas.setBounds(6, 84, 129, 77);
		contentPane.add(btnMesas);
		
		JButton btnPedidos = new JButton("Pedidos");
		btnPedidos.setBounds(6, 6, 129, 77);
		contentPane.add(btnPedidos);
		
		JButton btnHistorial = new JButton("Historial");
		btnHistorial.setBounds(6, 162, 129, 77);
		contentPane.add(btnHistorial);
		
		JButton btnConfig = new JButton("Configuración");
		btnConfig.setBounds(6, 339, 129, 77);
		contentPane.add(btnConfig);
		
		JButton btnAdmin = new JButton("Administración");
		btnAdmin.setBounds(6, 240, 129, 77);
		contentPane.add(btnAdmin);
		
		
	}
}
