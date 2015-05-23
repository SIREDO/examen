package Vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FramePrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu delincuentes, principal;
	private JMenuItem delincuentesItem, principalItem;
	private VistaPrincipal vPrincipal;
	private VistaDelincuentes vDelincuentes;
	private VistaAntecedentes vAntecedentes;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	public FramePrincipal() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 600);
		
		vPrincipal = new VistaPrincipal();
		vDelincuentes = new VistaDelincuentes();
		vAntecedentes = new VistaAntecedentes();
		
	
		getContentPane().setLayout(new CardLayout(0,0));	
		getContentPane().add(vPrincipal,"VistaPrincipal");
		getContentPane().add(vDelincuentes,"VistaDelincuentes");
		getContentPane().add(vAntecedentes, "VistaAntecedentes");
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		//agregamos en el menu 3 opciones con sus respectivos items
		
		principal = new JMenu("Principal");
		menuBar.add(principal);
	
			principalItem = new JMenuItem("Principal");
			principalItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					CardLayout c1 = (CardLayout) getContentPane().getLayout();
					c1.show(getContentPane(), "VistaPrincipal");
				}
			});
			principal.add(principalItem);
	
		delincuentes = new JMenu("Delincuentes");
		menuBar.add(delincuentes);
		
		
			delincuentesItem = new JMenuItem("Delincuentes");
			delincuentesItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CardLayout c1 = (CardLayout) getContentPane().getLayout();
					c1.show(getContentPane(), "VistaDelincuentes");
				}
			});
			delincuentes.add(delincuentesItem);
			
		
			
		
			
	}
}
