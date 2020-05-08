import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Historial extends JPanel {
	
	private JTable table;
	
	mesas[] estudio = new mesas[] { //Seccion mesas
			new mesas(1),
			new mesas(2),
			new mesas(3),
			new mesas(4),
			new mesas(5),
			new mesas(6),
			new mesas(7)
	};
	
	
	public Historial() {
		setBackground(Color.GRAY);
		setLayout(null);
		
		JLabel lblHistorial = new JLabel("Historial ");
		lblHistorial.setBounds(41, 55, 175, 38);
		lblHistorial.setFont(new Font("Arial Hebrew Scholar", Font.BOLD, 35));
		add(lblHistorial);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/bradleycardenas/git/adaFinal/recursos/cuenta.png"));
		lblNewLabel.setBounds(405, 6, 175, 207);
		add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(41, 167, 356, 154);
		add(table);
		
		JLabel lblNewLabel_1 = new JLabel("Pedido de la mesa:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(58, 129, 197, 20);
		add(lblNewLabel_1);
		
		JComboBox cbxMesas = new JComboBox();
		cbxMesas.setBounds(247, 128, 127, 27);
		add(cbxMesas);
		for (int i=0; i<estudio.length; i++)
			cbxMesas.addItem(estudio[i]);
		
		JLabel lblNewLabel_2 = new JLabel("Total:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(123, 348, 63, 16);
		add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(183, 345, 133, 20);
		add(textArea);
		
	}
}
