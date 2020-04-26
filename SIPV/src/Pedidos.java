import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JSpinner;

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
		
		JLabel lblNewLabel = new JLabel("Lista de pedidos");
		lblNewLabel.setBounds(78, 11, 229, 29);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(80, 265, 82, 29);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(250, 265, 98, 29);
		add(btnNewButton_1);
		
		JList list = new JList();
		list.setBounds(78, 139, 186, 29);
		add(list);
		
		JLabel lblNewLabel_1 = new JLabel("Platillos");
		lblNewLabel_1.setBounds(74, 111, 61, 16);
		add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(289, 142, 61, 26);
		add(spinner);
		
		JLabel lblNewLabel_2 = new JLabel("imagen");
		lblNewLabel_2.setBounds(349, 69, 95, 143);
		add(lblNewLabel_2);
	}
}
