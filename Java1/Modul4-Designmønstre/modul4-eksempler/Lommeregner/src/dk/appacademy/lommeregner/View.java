package dk.appacademy.lommeregner;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame {
	private Controller controller;
	
	private JPanel contentPane;
	private JTextField talField;
	private JLabel resultatLabel;


	/**
	 * Create the frame.
	 */
	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton plusButton = new JButton("PLUS");
		plusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.plusKlik();
			}
		});
		contentPane.add(plusButton, BorderLayout.WEST);
		
		JButton minusButton = new JButton("MINUS");
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.minusKlik();
			}
		});
		contentPane.add(minusButton, BorderLayout.EAST);
		
		talField = new JTextField();
		contentPane.add(talField, BorderLayout.CENTER);
		talField.setColumns(10);
		
		resultatLabel = new JLabel("0");
		resultatLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(resultatLabel, BorderLayout.NORTH);
	}
	
	public void visResultat(int resultat) {
		resultatLabel.setText(String.valueOf(resultat));
	}
	
	public String getText() {
		return talField.getText();
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
}
