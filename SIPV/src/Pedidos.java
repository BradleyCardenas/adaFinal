import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Pedidos extends JPanel {

	/* Creacion de arreglos */
	
	alimentos[] arrayBebidas = new alimentos[] { 
			new alimentos("Seleccione uno", 0),
			new alimentos("Coca Cola", 15),
			new alimentos("SevenUp",15),
			new alimentos("Manzanita",16),
			new alimentos("Mirinda", 14)
	};

	alimentos[] arrayComidas = new alimentos[] { 
			new alimentos("Seleccione uno", 0),
			new alimentos("Sopa Nissin", 20),
			new alimentos("Filete de pescado",90),
			new alimentos("Sopa fria",30),
			new alimentos("Pozole", 20)
	};
	
	mesas[] arrayMesas = new mesas[] { 
			new mesas(1),
			new mesas(2),
			new mesas(3),
			new mesas(4),
			new mesas(5),
			new mesas(6),
			new mesas(7)
	};
	
	
	/* Creacion de objetos */
	JPanel Pedidos = new JPanel();
	Historial panelHistorial = new Historial();
	alimentos[] platos = new alimentos[5];
	
	JLabel lblNewLabel = new JLabel("Lista De Pedidos");
	JLabel lblNewLabel_1 = new JLabel("Platillos");
	JLabel lblNewLabel_2 = new JLabel("");
	JLabel lblBebidas = new JLabel("Bebidas");
	JLabel lblMesaAAtender = new JLabel("Mesa a atender");
	
	JSpinner spinnerComida = new JSpinner();
	JSpinner spinnerBebida = new JSpinner();
	
	JComboBox cbxMesas = new JComboBox();
	JComboBox cbxPlatillo = new JComboBox();
	JComboBox cbxBebidas = new JComboBox();
	
	JButton btnEnviar = new JButton("Solicitar");
	JButton btnCancelar = new JButton("Cancelar");
	
	alimentos objBebida = (alimentos)cbxBebidas.getSelectedItem();
	alimentos objComida = (alimentos)cbxPlatillo.getSelectedItem();
	mesas objMesaElegida = (mesas)cbxMesas.getSelectedItem();
	int cantidadComida = (Integer)spinnerComida.getValue();
	int cantidadBebida = (Integer)spinnerBebida.getValue();
	
	public Pedidos() {
		
		/* Configuraciones */
		
		Pedidos.setBackground(Color.WHITE);
		Pedidos.setBounds(147, 6, 597, 410);
		Pedidos.setLayout(null);
		setLayout(null);
		
		
		lblNewLabel.setBounds(33, 44, 333, 61);
		lblNewLabel.setFont(new Font("Arial Hebrew Scholar", Font.BOLD, 35));
		add(lblNewLabel);
		
		lblNewLabel_1.setBounds(40, 154, 61, 21);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		add(lblNewLabel_1);
		
		lblNewLabel_2.setIcon(new ImageIcon("/Users/bradleycardenas/git/adaFinal/recursos/waiters2.png"));
		lblNewLabel_2.setBounds(378, 10, 196, 165);
		add(lblNewLabel_2);
		
		lblBebidas.setBounds(40, 243, 61, 21);
		lblBebidas.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		add(lblBebidas);
		
		lblMesaAAtender.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblMesaAAtender.setBounds(442, 216, 119, 37);
		add(lblMesaAAtender);
		
		
		spinnerComida.setBounds(320, 183, 67, 29);
		add(spinnerComida);
		
		spinnerBebida.setBounds(320, 272, 67, 29);
		add(spinnerBebida);
		
		
		cbxMesas.setBounds(442, 249, 106, 37);
		add(cbxMesas);
		for (int i=0; i<arrayMesas.length; i++)
			cbxMesas.addItem(arrayMesas[i]);
		
		cbxPlatillo.setBounds(63, 187, 215, 22);
		add(cbxPlatillo);
		for (int i=0; i <arrayComidas.length; i++)
			cbxPlatillo.addItem(arrayComidas[i]);
			
		cbxBebidas.setBounds(63, 276, 215, 22);
		add(cbxBebidas);
		for (int i=0; i <arrayBebidas.length; i++)
		     cbxBebidas.addItem(arrayBebidas[i]);

		
		btnEnviar.setBounds(151, 350, 98, 29);
		add(btnEnviar);
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				solicitar();
				imprimirPedidos();
				resetElements();
			}
		});
		
		btnCancelar.setBounds(347, 350, 98, 29);
		add(btnCancelar);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetElements();
			}
		});
	
		
	}/* fin main Pedidos */
	
	
	public void resetElements() {
		spinnerComida.setValue(0);
		spinnerBebida.setValue(0);
		cbxBebidas.setSelectedIndex(0);
		cbxPlatillo.setSelectedIndex(0);
	}//fin resetElements
	
	public void guardarBebida() {
		alimentos objBebida = (alimentos)cbxBebidas.getSelectedItem();
		int cantidadBebida = (Integer)spinnerBebida.getValue();
		
		for(int h=0; h<platos.length; h++) {
			if(platos[h] == null) {
				platos[h] = new alimentos(objBebida.getDescription(),objBebida.getPrecio(), cantidadBebida);
				break;
			}
		}
	}//fin guardarBebida
	
	public void guardarComida() {
		alimentos objComida = (alimentos)cbxPlatillo.getSelectedItem();
		int cantidadComida = (Integer)spinnerComida.getValue();
		
		for(int j=0; j<platos.length; j++) {
			if(platos[j] == null) {
				platos[j] = new alimentos(objComida.getDescription(),objComida.getPrecio(), cantidadComida);
				break;
			} 
		}
	}//fin guardarComida
	
	public void imprimirPedidos() {
		mesas objMesaElegida = (mesas)cbxMesas.getSelectedItem();
		
		for(int i=0; i<arrayMesas.length; i++) {
			if(objMesaElegida.getClave() == arrayMesas[i].getClave()) {
				for(int j=0; j<platos.length;j++) {
					if(platos[j] != null) {
						JOptionPane.showMessageDialog(null, "El pedido de la mesa "+arrayMesas[i].getClave()+" ha sido "+arrayMesas[i].getPedidosMesa(j).getCantidad()+" de " +arrayMesas[i].getPedidosMesa(j).getDescription());
					}
				}	
			}
		}
	}//fin imprimirPedidos
	
	public void solicitar() {
		mesas objMesaElegida = (mesas)cbxMesas.getSelectedItem();
		
		for(int i=0; i<arrayMesas.length; i++) {
			if(objMesaElegida.getClave() == arrayMesas[i].getClave()) {
				platos = arrayMesas[i].getPedidosMesa();
				
				guardarComida();
				arrayMesas[i].setPedidosMesa(platos);
				
				guardarBebida();
				arrayMesas[i].setPedidosMesa(platos);
			} 
		};
	}//fin solicitar
	
	
}
