import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
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

	//Creación de los paneles
	Pedidos panelPedidos = new Pedidos();
	Historial panelHistorial = new Historial();
	public mesas[] arrayMesas = new mesas[7];
	
	//Creación de los elementos
	JPanel panelInicio = new JPanel();
	
	JLabel lblInicio1 = new JLabel("INICIO");
	JLabel lblBienvenido = new JLabel("Bienvenido ");
	JLabel lblNewLabel = new JLabel("");
	JLabel lblSeleccioneUnaDe = new JLabel("Seleccione una de las ventas para comenzar a trabajar ");
	
	JButton btnPedidos = new JButton("Pedidos");
	JButton btnHistorial = new JButton("Historial");
	JButton btnAdmin = new JButton("Administration");
	JButton btnSettings = new JButton("Settings");
	
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
	
		
		/* Configuración de elementos*/
		
		panelInicio.setBounds(147, 6, 597, 410);
		panelInicio.setBackground(Color.WHITE);
		contentPane.add(panelInicio);
		panelInicio.setLayout(null);
		
		
		lblInicio1.setFont(new Font("Arial Hebrew Scholar", Font.PLAIN, 22));
		lblInicio1.setBounds(28, 6, 85, 61);
		panelInicio.setLayout(null);
		panelInicio.add(lblInicio1);
		
		lblBienvenido.setFont(new Font("Arial Hebrew Scholar", Font.PLAIN, 17));
		lblBienvenido.setBounds(248, 72, 106, 52);
		panelInicio.add(lblBienvenido);
		
		lblNewLabel.setIcon(new ImageIcon("/Users/bradleycardenas/git/adaFinal/recursos/Minicio.JPG"));
		lblNewLabel.setBounds(106, 137, 375, 267);
		panelInicio.add(lblNewLabel);
		
		lblSeleccioneUnaDe.setFont(new Font("Arial Hebrew Scholar", Font.PLAIN, 17));
		lblSeleccioneUnaDe.setBounds(86, 107, 455, 52);
		panelInicio.add(lblSeleccioneUnaDe);
		
		
		btnPedidos.setBounds(6, 17, 129, 70);
		contentPane.add(btnPedidos);
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configurarPanel("panelPedidos");
				mostrarPanel("panelPedidos");
			}
		});
		
		
		btnHistorial.setBounds(6, 120, 129, 70);
		contentPane.add(btnHistorial);
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				configurarPanel("panelHistorial");
				mostrarPanel("panelHistorial");	
				panelHistorial.arrayMesas = panelPedidos.arrayMesas;
			}
		});
		
		btnAdmin.setBounds(6, 223, 129, 70);
		contentPane.add(btnAdmin);
		
		btnSettings.setBounds(6, 330, 129, 70);
		contentPane.add(btnSettings);
	
	}/* fin main Menus */ 
	
	public void mostrarPanel(String panel) {
		if(panel == "panelInicio") {
			panelInicio.setVisible(true);
			panelPedidos.setVisible(false);
			panelHistorial.setVisible(false);
		}
		if(panel == "panelPedidos") {
			panelInicio.setVisible(false);
			panelPedidos.setVisible(true);
			panelHistorial.setVisible(false);
		}
		if(panel == "panelHistorial") {
			panelInicio.setVisible(false);
			panelPedidos.setVisible(false);
			panelHistorial.setVisible(true);
		}	
	}//fin mostrarPanel
	
	public void configurarPanel(String panel) {
		if(panel == "panelHistorial") {
			contentPane.add(panelHistorial);
			panelHistorial.setBounds(147, 6, 597, 410);
			panelHistorial.setBackground(Color.WHITE);
		}
		
		if(panel == "panelPedidos") {
			contentPane.add(panelPedidos);
			panelPedidos.setBounds(147, 6, 597, 410);
			panelPedidos.setBackground(Color.WHITE);
		}
	}//fin configurarPanel
	
}
		
			
		
		