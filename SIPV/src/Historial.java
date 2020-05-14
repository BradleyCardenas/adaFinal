import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Historial extends JPanel {

	private JTable table;

	
	mesas[] arrayMesas = new mesas[7]; 
	mesas[] arrayEstudio = new mesas[] {
			new mesas(1),
			new mesas(2),
			new mesas(3),
			new mesas(4),
			new mesas(5),
			new mesas(6),
			new mesas(7)
	};
	
	/* Creacion de los elementos */
	JTable tablaTotal = new JTable();
	
	JLabel lblHistorial = new JLabel("Historial ");
	JLabel lblNewLabel = new JLabel("");
	JLabel lblNewLabel_1 = new JLabel("Pedido de la mesa:");
	
	JComboBox cbxMesas = new JComboBox();
	
	JTextArea textTotal = new JTextArea();
	
	JButton btnTotal = new JButton("Total");
	JButton btnMostrarPedidos= new JButton("Mostrar Pedidos");
	
	public Historial() {
		
		setBackground(Color.GRAY);
		setLayout(null);
		
		
		/* Configuraciones de los elementos */
		
		tablaTotal.setBounds(41, 194, 356, 127);
		add(tablaTotal);
		
		
		lblHistorial.setBounds(41, 55, 175, 38);
		lblHistorial.setFont(new Font("Arial Hebrew Scholar", Font.BOLD, 35));
		add(lblHistorial);
		
		lblNewLabel.setIcon(new ImageIcon("/Users/bradleycardenas/git/adaFinal/recursos/cuenta.png"));
		lblNewLabel.setBounds(405, 6, 175, 207);
		add(lblNewLabel);
		
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(59, 129, 197, 20);
		add(lblNewLabel_1);
		
		
		cbxMesas.setBounds(247, 128, 127, 27);
		add(cbxMesas);
		for (int i=0; i<arrayMesas.length; i++)
			cbxMesas.addItem(arrayEstudio[i]);
		
		
		textTotal.setBounds(195, 345, 220, 20);
		add(textTotal);
		textTotal.setEditable(false);
		
		
		btnTotal.setBounds(66, 340, 117, 29);
		add(btnTotal);
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				imprimirTotal();
			}
		});
		
		add(btnMostrarPedidos);
		btnMostrarPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
	}// fin main Historial

	public void imprimirTotal() {
		mesas objMesaElegida = (mesas)cbxMesas.getSelectedItem();
		
		int total = 0;
		
		for(int i=0; i<arrayMesas.length; i++) {
			if(objMesaElegida.getClave() == arrayMesas[i].getClave()) {
				for(int j=0; j<arrayMesas.length; j++) {
					if(arrayMesas[i].getPedidosMesa(j) != null) 
						total = total + (arrayMesas[i].getPedidosMesa(j).getPrecio() * arrayMesas[i].getPedidosMesa(j).getCantidad());
					else
						break;
				}
				textTotal.setText("El total ha sido $"+ total+" pesos");
			}
		}
	}// fin imprimirTotal
}


