import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class Admin extends JPanel {

	/**
	 * Create the panel.
	 */
	public Admin() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(153, 229, 117, 29);
		add(btnNewButton);
		
		JLabel lblImagen = new JLabel("Imagen");
		lblImagen.setBackground(Color.RED);
		lblImagen.setBounds(282, 163, 116, 95);
		add(lblImagen);
		

	}
}
