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
import javax.swing.JList;

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
	/*
	 * Paneles		 
	 */
		
		/* Inicio */
		JPanel panelInicio = new JPanel();
		panelInicio.setBounds(147, 6, 597, 410);
		contentPane.add(panelInicio);
		
		JLabel lblInicio1 = new JLabel("Inicio");
		lblInicio1.setBounds(32, 29, 61, 16);
		panelInicio.add(lblInicio1);
		
		JList list = new JList();
		list.setBounds(221, 113, 136, 26);
		panelInicio.add(list);
		
		/* Mesas */
		JPanel panelMesas = new JPanel();
		panelMesas.setLayout(null);
		panelMesas.setBounds(147, 6, 597, 410);
		contentPane.add(panelMesas);
		
		JLabel lblMesas = new JLabel("label");
		lblMesas.setBounds(32, 29, 61, 16);
		panelMesas.add(lblMesas);
		
		JList listMesas = new JList();
		listMesas.setBounds(221, 113, 136, 26);
		panelMesas.add(listMesas);	
			
			
		/* Pedidos */
		JPanel panelPedidos = new JPanel();
		panelPedidos.setLayout(null);
		panelPedidos.setBounds(147, 6, 597, 410);
		contentPane.add(panelPedidos);
		
		JLabel lblPedidos = new JLabel("label");
		lblPedidos.setBounds(32, 29, 61, 16);
		panelPedidos.add(lblPedidos);
		
		JList list_1 = new JList();
		list_1.setBounds(221, 113, 136, 26);
		panelPedidos.add(list_1);
		
		/* Historial */
		JPanel panelHistorial = new JPanel();
		panelHistorial.setLayout(null);
		panelHistorial.setBounds(147, 6, 597, 410);
		contentPane.add(panelHistorial);
		
		/* Configuracion */
		JPanel panelConfig = new JPanel();
		panelConfig.setLayout(null);
		panelConfig.setBounds(147, 6, 597, 410);
		contentPane.add(panelConfig);
	
		/* Admin */
		JPanel panelAdmin = new JPanel();
		panelInicio.setLayout(null);
		panelAdmin.setBounds(147, 6, 597, 410);
		contentPane.add(panelAdmin);
		
		
		
	
	/*
	 * Botones principales
	 */
		JButton btnMesas = new JButton("Mesas");
		btnMesas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInicio.setVisible(false);
				panelPedidos.setVisible(false);
				panelMesas.setVisible(true);
				panelHistorial.setVisible(false);
				panelAdmin.setVisible(false);
				panelConfig.setVisible(false);
				
			}
		});
		btnMesas.setBounds(6, 84, 129, 77);
		contentPane.add(btnMesas);
		
		
		JButton btnPedidos = new JButton("Pedidos");
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInicio.setVisible(false);
				panelPedidos.setVisible(true);
				panelMesas.setVisible(false);
				panelHistorial.setVisible(false);
				panelAdmin.setVisible(false);
				panelConfig.setVisible(false);
				
			}
		});
		btnPedidos.setBounds(6, 6, 129, 77);
		contentPane.add(btnPedidos);
		
		JButton btnHistorial = new JButton("Historial");
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInicio.setVisible(false);
				panelPedidos.setVisible(false);
				panelMesas.setVisible(false);
				panelHistorial.setVisible(true);
				panelAdmin.setVisible(false);
				panelConfig.setVisible(false);
					
			}
		});
		btnHistorial.setBounds(6, 162, 129, 77);
		contentPane.add(btnHistorial);
		
		JButton btnConfig = new JButton("Configuración");
		btnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInicio.setVisible(false);
				panelPedidos.setVisible(false);
				panelMesas.setVisible(false);
				panelHistorial.setVisible(false);
				panelAdmin.setVisible(false);
				panelConfig.setVisible(true);
				
			}
		});
		btnConfig.setBounds(6, 339, 129, 77);
		contentPane.add(btnConfig);
		
		JButton btnAdmin = new JButton("Administración");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panelInicio.setVisible(false);
				panelPedidos.setVisible(false);
				panelMesas.setVisible(false);
				panelHistorial.setVisible(false);
				panelAdmin.setVisible(true);
				panelConfig.setVisible(false);
				
			}
		});
		btnAdmin.setBounds(6, 240, 129, 77);
		contentPane.add(btnAdmin);
		
		
	}
	
}
