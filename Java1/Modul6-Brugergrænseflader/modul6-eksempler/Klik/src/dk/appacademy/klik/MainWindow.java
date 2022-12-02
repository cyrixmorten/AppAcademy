package dk.appacademy.klik;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainWindow extends JFrame {
	private int taeller = 0;
	
	public MainWindow() {
		super("Klik");
		
		JPanel mainPanel = new JPanel();
		JLabel antal = new JLabel("Tallet kommer her");
		mainPanel.add(antal);
		
		JButton klik = new JButton("Klik");
		mainPanel.add(klik);
		
		add(mainPanel);
		setSize(200,200);
		
		setVisible(true);
		
		klik.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				taeller++;
				antal.setText(String.valueOf(taeller));
			}
		});
	}
	
	public static void main(String[] args) {
		new MainWindow();
	}

}
