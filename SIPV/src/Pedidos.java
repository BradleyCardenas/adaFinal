import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pedidos extends JPanel {

	/**
	 * Create the panel.
	 */
	
	
	Pedidos [] ArreBebidas = new Pedidos[] {
			new Pedidos ("Coca Cola",30),
			new Pedidos ("Horchata",25),
			new Pedidos ("Jamaica",20),
			new Pedidos ("Cerveza",50),
			new Pedidos ("Agua",15),
	};
	        Pedidos objBebida;
	        
	Pedidos [] ArreComidas = new Pedidos[] {
		
		    new Pedidos ("Pizza al pastor gde",180),
		    new Pedidos ("Pizza al pastor chica",100),
		    new Pedidos ("Hamburguesa",50),
		    new Pedidos ("Hot dog",35),
		    new Pedidos ("Nachos gde",140),
		    new Pedidos ("Nachos chico",80),
		    
		};
	        Pedidos objComida;
			
		

	
	
	public Pedidos() {
		

		JPanel Pedidos = new JPanel();
		Pedidos.setBackground(Color.WHITE);
		Pedidos.setBounds(147, 6, 597, 410);
		Pedidos.setLayout(null);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista De Pedidos");
		lblNewLabel.setBounds(26, 11, 229, 29);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(26, 247, 98, 29);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(157, 247, 98, 29);
		add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Platillos");
		lblNewLabel_1.setBounds(26, 82, 61, 21);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(228, 114, 67, 29);
		add(spinner);
		
		JLabel lblNewLabel_2 = new JLabel("imagen");
		lblNewLabel_2.setBounds(349, 21, 95, 66);
		add(lblNewLabel_2);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(228, 181, 67, 29);
		add(spinner_1);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setBounds(26, 157, 61, 21);
		lblBebidas.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		add(lblBebidas);
		
		JComboBox Plati = new JComboBox();
		Plati.setBounds(26, 117, 140, 22);
		add(Plati);
		
		for (int i=0; i <ArreComidas.length; i++)
			Plati.addItem(ArreComidas[i]);
			
		
		JComboBox  Bebi = new JComboBox();
		Bebi.setBounds(26, 188, 140, 22);
		add(Bebi);
		
		for (int i=0; i <ArreBebidas.length; i++)
		     Bebi.addItem(ArreBebidas[i]);
		
		
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objComida = (Pedidos) Plati.getSelectedItem();
			}
		});
		
		
		btnAgregar.setBounds(340, 117, 89, 23);
		add(btnAgregar);
		
		
		JButton btnAgregarbeb = new JButton("Agregar");
		btnAgregarbeb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				objBebida =(Pedidos) Bebi.getSelectedItem();
			}
		});
		btnAgregarbeb.setBounds(340, 184, 89, 23);
		add(btnAgregarbeb);
	}





	public Pedidos(String string, int i) {
		// TODO Auto-generated constructor stub
	}
}
