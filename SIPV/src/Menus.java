import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		btnMesas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnMesas.setBounds(6, 84, 129, 77);
		contentPane.add(btnMesas);
		
		
		JButton btnPedidos = new JButton("Pedidos");
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnPedidos.setBounds(6, 6, 129, 77);
		contentPane.add(btnPedidos);
		
		JButton btnHistorial = new JButton("Historial");
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnHistorial.setBounds(6, 162, 129, 77);
		contentPane.add(btnHistorial);
		
		JButton btnConfig = new JButton("Configuración");
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnConfig.setBounds(6, 339, 129, 77);
		contentPane.add(btnConfig);
		
		JButton btnAdmin = new JButton("Administración");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAdmin.setBounds(6, 240, 129, 77);
		contentPane.add(btnAdmin);
		
		JPanel panelInicio = new JPanel();
		panelInicio.setBounds(147, 6, 597, 410);
		contentPane.add(panelInicio);
		
		JPanel panelPedidos = new JPanel();
		panelPedidos.setBounds(147, 6, 597, 410);
		contentPane.add(panelInicio);
		
		JPanel panelHistorial = new JPanel();
		panelHistorial.setBounds(147, 6, 597, 410);
		contentPane.add(panelInicio);
		
		JPanel panelConfig = new JPanel();
		panelConfig.setBounds(147, 6, 597, 410);
		contentPane.add(panelInicio);
	
		JPanel panelAdmin = new JPanel();
		panelAdmin.setBounds(147, 6, 597, 410);
		contentPane.add(panelInicio);
	}
}
