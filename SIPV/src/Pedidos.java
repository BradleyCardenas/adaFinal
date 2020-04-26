import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Pedidos extends JPanel {

	/**
	 * Create the panel.
	 */
	public Pedidos() {
		setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lista de pedidos");
		lblNewLabel.setBounds(150, 11, 97, 17);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBounds(310, 232, 89, 23);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(210, 232, 89, 23);
		add(btnNewButton_1);

	}
}
