package Vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class VistaAntecedentes extends JPanel {
	private JTextField textGenero;

	/**
	 * Create the panel.
	 */
	public VistaAntecedentes() {
		setLayout(null);
		
		JLabel lblAntecedentes = new JLabel("Antecedentes");
		lblAntecedentes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAntecedentes.setBounds(47, 52, 117, 30);
		add(lblAntecedentes);
		
		textGenero = new JTextField();
		textGenero.setBounds(47, 93, 361, 361);
		add(textGenero);
		textGenero.setColumns(10);
		
		JButton btnSalvar = new JButton("Salvar >>");
		btnSalvar.setBounds(319, 465, 89, 23);
		add(btnSalvar);

	}

}
