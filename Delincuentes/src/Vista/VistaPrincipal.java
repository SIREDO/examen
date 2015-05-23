package Vista;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VistaPrincipal extends JPanel {
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public VistaPrincipal() {
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(88, 89, 169, 20);
		add(comboBox);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(88, 159, 169, 20);
		add(passwordField);
		
		JButton btnLogin = new JButton("LogIn");
		btnLogin.setBounds(164, 225, 93, 23);
		add(btnLogin);
		
		JButton btnLogout = new JButton("LogOut");
		btnLogout.setBounds(164, 272, 93, 23);
		add(btnLogout);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(0, 0, 484, 541);
		add(lblNewLabel);

	}
}
