package dk.appacademy.billet;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MainWindow extends JFrame {

	public MainWindow() {
		super("Billet");
		
		// Tilvalg
		JPanel felter = new JPanel();
		felter.setLayout(new GridLayout(2, 1));
		
		JCheckBox cykel = new JCheckBox("Cykel");
		JCheckBox barnevogn = new JCheckBox("Barnevogn");
		
		felter.add(cykel);
		felter.add(barnevogn);
		
		// Tur/retur
		JPanel turRetur = new JPanel();
		turRetur.setLayout(new GridLayout(2, 1));
		
		JRadioButton enkelt = new JRadioButton("Enkeltbillet");
		JRadioButton retur = new JRadioButton("Retur");
		enkelt.setSelected(true);
		
		ButtonGroup turReturGroup = new ButtonGroup();
		turReturGroup.add(enkelt);
		turReturGroup.add(retur);
		
		turRetur.add(enkelt);
		turRetur.add(retur);
		
		// Destinationer
		String[] destinationer = {"København", "Århus", "Fredericia", "Aalborg"};
		JList<String> destination = new JList<>(destinationer);
		destination.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scrollPane = new JScrollPane(destination);
		
		// Samlet layout
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(3, 1));
		mainPanel.add(felter);
		mainPanel.add(turRetur);
		mainPanel.add(scrollPane);
		
		add(mainPanel);
		pack();
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainWindow();
	}

}
