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

	
	alimentos[] arreBebidas = new alimentos[] { // Seccion de las bebidas
			new alimentos("Seleccione uno", 0),
			new alimentos("Coca Cola", 15),
			new alimentos("SevenUp",15),
			new alimentos("Manzanita",16),
			new alimentos("Mirinda", 14)
	};

	alimentos[] arreComidas = new alimentos[] { //Seccion de la comida
			new alimentos("Seleccione uno", 0),
			new alimentos("Sopa Nissin", 20),
			new alimentos("Filete de pescado",90),
			new alimentos("Sopa fria",303),
			new alimentos("Pozole", 20)
	};
	
	mesas[] estudio = new mesas[] { //Seccion mesas
			new mesas(1),
			new mesas(2),
			new mesas(3),
			new mesas(4),
			new mesas(5),
			new mesas(6),
			new mesas(7)
	};
	
	public Pedidos() {
		
		/*
		 * Elementos del Panel
		 */
		JPanel Pedidos = new JPanel();
		Pedidos.setBackground(Color.WHITE);
		Pedidos.setBounds(147, 6, 597, 410);
		Pedidos.setLayout(null);
		setLayout(null);
		
		JSpinner spinnerComida = new JSpinner();
		spinnerComida.setBounds(320, 183, 67, 29);
		add(spinnerComida);
		
		JSpinner spinnerBebida = new JSpinner();
		spinnerBebida.setBounds(320, 272, 67, 29);
		add(spinnerBebida);
		
		JLabel lblNewLabel = new JLabel("Lista De Pedidos");
		lblNewLabel.setBounds(33, 44, 333, 61);
		lblNewLabel.setFont(new Font("Arial Hebrew Scholar", Font.BOLD, 35));
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Platillos");
		lblNewLabel_1.setBounds(40, 154, 61, 21);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("/Users/bradleycardenas/git/adaFinal/recursos/waiters2.png"));
		lblNewLabel_2.setBounds(378, 10, 196, 165);
		add(lblNewLabel_2);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setBounds(40, 243, 61, 21);
		lblBebidas.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		add(lblBebidas);
		
		JLabel lblMesaAAtender = new JLabel("Mesa a atender");
		lblMesaAAtender.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblMesaAAtender.setBounds(442, 216, 119, 37);
		add(lblMesaAAtender);
		
		
		JComboBox cbxMesas = new JComboBox();
		cbxMesas.setBounds(442, 249, 106, 37);
		add(cbxMesas);
		for (int i=0; i<estudio.length; i++)
			cbxMesas.addItem(estudio[i]);
		
		//Seccion comida
		JComboBox Platillo = new JComboBox();
		Platillo.setBounds(63, 187, 215, 22);
		add(Platillo);
		for (int i=0; i <arreComidas.length; i++)
			Platillo.addItem(arreComidas[i]);
			
		//Seccon bebidas
		JComboBox Bebidas = new JComboBox();
		Bebidas.setBounds(63, 276, 215, 22);
		add(Bebidas);
		for (int i=0; i <arreBebidas.length; i++)
		     Bebidas.addItem(arreBebidas[i]);

		/*
		 * Botones
		 */
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				alimentos[] platos = new alimentos[5];
				
				alimentos objBebida = (alimentos)Bebidas.getSelectedItem();
				alimentos objComida = (alimentos)Platillo.getSelectedItem();
				mesas objMesaElegida = (mesas)cbxMesas.getSelectedItem();
				int cantidadComida = (Integer)spinnerComida.getValue();
				int cantidadBebida = (Integer)spinnerBebida.getValue();
				
				for(int i=0; i<estudio.length; i++) {
					if(objMesaElegida.getClave() == estudio[i].getClave()) {
						platos = estudio[i].getPedidosMesa();
						
						for(int j=0; j<platos.length; j++) {
							if(platos[j] == null) {
								platos[j] = new alimentos(objComida.getDescription(),objComida.getPrecio(), cantidadComida);
							} 
						}
						estudio[i].setPedidosMesa(platos);
						for(int j=0; j<platos.length; j++) {
							if(platos[j] == null) {
								platos[j] = new alimentos(objBebida.getDescription(),objBebida.getPrecio(), cantidadBebida);
							} 
						}
						i++;
						estudio[i].setPedidosMesa(platos);
					} 
				};
				
				for(int i=0; i<estudio.length; i++) {
					if(objMesaElegida.getClave() == estudio[i].getClave()) {
						JOptionPane.showMessageDialog(null, "La comida de la mesa "+estudio[i].getClave()+" es "+estudio[i].getPedidosMesa(i).getDescription()+" con "+estudio[i].getPedidosMesa(i).getCantidad()+" pedidos");
					}
				}
				for(int i=0; i<estudio.length; i++) {
					if(objMesaElegida.getClave() == estudio[i].getClave()) {
						JOptionPane.showMessageDialog(null, "La bebida de la mesa "+estudio[i].getClave()+" es "+estudio[i].getPedidosMesa(i).getDescription()+" con "+estudio[i].getPedidosMesa(i).getCantidad()+" pedidos");
					}
				}
				spinnerComida.setValue(0);
				spinnerBebida.setValue(0);
				Bebidas.setSelectedIndex(0);
				Platillo.setSelectedIndex(0);
			}
		});
		btnEnviar.setBounds(151, 350, 98, 29);
		add(btnEnviar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spinnerComida.setValue(0);
				spinnerBebida.setValue(0);
			}
		});
		btnCancelar.setBounds(347, 350, 98, 29);
		add(btnCancelar);
	
	
	}
}
