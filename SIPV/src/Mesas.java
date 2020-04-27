
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import java.awt.Checkbox;
import javax.swing.JInternalFrame;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Mesas extends JPanel {
	
	
	
	
	public Mesas() {
	
		JPanel panelMesas = new JPanel();
		panelMesas.setBackground(Color.WHITE);
		panelMesas.setBounds(147, 6, 597, 410);
		panelMesas.setVisible(true);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setBounds(353, 281, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panelMesas.setLayout(null);
		panelMesas.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Log\u00EDstica De Mesas");
		lblNewLabel.setBounds(222, 11, 238, 23);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panelMesas.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5"}));
		comboBox.setBounds(359, 104, 126, 25);
		panelMesas.add(comboBox);
		
		JLabel lblOpMesas = new JLabel("Seleccione la mesa ");
		lblOpMesas.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblOpMesas.setBounds(73, 102, 191, 27);
		panelMesas.add(lblOpMesas);
		
		JButton btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBounds(452, 281, 89, 23);
		panelMesas.add(btnNewButton_1);
		
		JLabel lblOporden = new JLabel("\u00BFLevantar orden?");
		lblOporden.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblOporden.setBounds(73, 168, 191, 27);
		panelMesas.add(lblOporden);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("S\u00ED");
		rdbtnNewRadioButton.setBounds(359, 172, 50, 23);
		panelMesas.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1.setBounds(432, 172, 50, 23);
		panelMesas.add(rdbtnNewRadioButton_1);
		
		
	}
}
