import java.awt.Container;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Font;

public class Mesas extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Mesas() {
		JPanel panelMesas = new JPanel();
		panelMesas.setBackground(Color.PINK);
		panelMesas.setBounds(147, 6, 524, 276);
		panelMesas.setLayout(null);
		Contentpane().add(panelMesas);
		panelMesas.setVisible(false);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(411, 242, 89, 23);
		panelMesas.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Logistica de mesas");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(167, 22, 238, 14);
		panelMesas.add(lblNewLabel);
		
	}

	private Container Contentpane() {
		// TODO Auto-generated method stub
		return null;
	}
}
