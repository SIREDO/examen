package Vista;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import javax.swing.JScrollPane;

public class VistaDelincuentes extends JPanel {
	private JTextField txtFNomDelincuente, textFEdad, textFSexo, textFNacionalidad, textFDireccion, textFPoblacion;
	private JLabel lblNombre,lblEdad, lblSexo, lblNacionalidad, lblDireccion, lblPoblacion;
	private JButton btnAntecedentes; 
	private JList list;
	/**
	 * Create the panel.
	 */
	public VistaDelincuentes() {
		setLayout(null);
		
		
		
		list = new JList();
		list.setBounds(10, 63, 200, 438);
		add(list);
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 63, 200, 438);
		add(scrollPane);
		
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(244, 94, 46, 14);
		add(lblNombre);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(244, 150, 46, 14);
		add(lblEdad);
		
		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(358, 150, 46, 14);
		add(lblSexo);
		
		txtFNomDelincuente = new JTextField();
		txtFNomDelincuente.setBounds(244, 119, 189, 20);
		add(txtFNomDelincuente);
		txtFNomDelincuente.setColumns(10);
		
		textFEdad = new JTextField();
		textFEdad.setBounds(244, 175, 75, 20);
		add(textFEdad);
		textFEdad.setColumns(10);
		
		textFSexo = new JTextField();
		textFSexo.setColumns(10);
		textFSexo.setBounds(358, 175, 75, 20);
		add(textFSexo);
		
		lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(244, 247, 86, 14);
		add(lblNacionalidad);
		
		lblDireccion = new JLabel("Direcci\u00F3n");
		lblDireccion.setBounds(244, 324, 46, 14);
		add(lblDireccion);
		
		lblPoblacion = new JLabel("Poblaci\u00F3n");
		lblPoblacion.setBounds(244, 394, 56, 14);
		add(lblPoblacion);
		
		btnAntecedentes = new JButton("Antecedentes >>");
		btnAntecedentes.setHorizontalAlignment(SwingConstants.LEFT);
		btnAntecedentes.setBounds(244, 478, 230, 23);
		add(btnAntecedentes);
		
		textFNacionalidad = new JTextField();
		textFNacionalidad.setColumns(10);
		textFNacionalidad.setBounds(244, 272, 230, 20);
		add(textFNacionalidad);
		
		textFDireccion = new JTextField();
		textFDireccion.setColumns(10);
		textFDireccion.setBounds(244, 349, 230, 20);
		add(textFDireccion);
		
		textFPoblacion = new JTextField();
		textFPoblacion.setColumns(10);
		textFPoblacion.setBounds(244, 421, 230, 20);
		add(textFPoblacion);

	}
}
