package dk.appacademy.window;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
@SuppressWarnings("serial")
public class MitVindue extends JFrame {
	public MitVindue() {
		super("Mit program");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JLabel navnLabel = new JLabel("Hvad hedder du?");
		panel.add(navnLabel);
		
		JTextField navnField = new JTextField(20);
		panel.add(navnField);
		
		JButton okButton = new JButton("OK");
		panel.add(okButton);
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hej " + navnField.getText());
			}
		});
		
		add(panel);
		setVisible(true);
	} 
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		MitVindue vindue = new MitVindue();
	}
}
