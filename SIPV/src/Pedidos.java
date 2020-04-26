import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Pedidos extends JPanel {

	/**
	 * Create the panel.
	 */
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
		lblNewLabel_2.setBounds(349, 21, 95, 255);
		add(lblNewLabel_2);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(228, 181, 67, 29);
		add(spinner_1);
		
		JLabel lblBebidas = new JLabel("Bebidas");
		lblBebidas.setBounds(26, 157, 61, 21);
		lblBebidas.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		add(lblBebidas);
		
		JComboBox platillos = new JComboBox();
		platillos.setModel(new DefaultComboBoxModel(new String[] {"Hamburguesa", "Hot Dog", "Torta de asado", "Torta de jam\u00F3n y queso", "Ensalada", "Pizza de pastor"}));
		platillos.setBounds(26, 117, 140, 22);
		add(platillos);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Jamaica", "Horchata", "Coca cola", "Limonada", "Agua", "Cerveza"}));
		comboBox_1.setBounds(26, 188, 140, 22);
		add(comboBox_1);
	}
}
