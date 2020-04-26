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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

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
		panelInicio.setBackground(Color.WHITE);
		contentPane.add(panelInicio);
		panelInicio.setLayout(null);
		
		JLabel lblInicio1 = new JLabel("INICIO");
		lblInicio1.setFont(new Font("Arial Hebrew Scholar", Font.PLAIN, 22));
		lblInicio1.setBounds(28, 6, 85, 61);
		panelInicio.setLayout(null);
		panelInicio.add(lblInicio1);
		
		JLabel lblBienvenido = new JLabel("Bienvenido ");
		lblBienvenido.setFont(new Font("Arial Hebrew Scholar", Font.PLAIN, 17));
		lblBienvenido.setBounds(248, 72, 106, 52);
		panelInicio.add(lblBienvenido);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/bradleycardenas/git/adaFinal/recursos/Minicio.JPG"));
		lblNewLabel.setBounds(106, 137, 375, 267);
		panelInicio.add(lblNewLabel);
		
		JLabel lblSeleccioneUnaDe = new JLabel("Seleccione una de las ventas para comenzar a trabajar ");
		lblSeleccioneUnaDe.setFont(new Font("Arial Hebrew Scholar", Font.PLAIN, 17));
		lblSeleccioneUnaDe.setBounds(86, 107, 455, 52);
		panelInicio.add(lblSeleccioneUnaDe);
	}
}
		
			
		
		