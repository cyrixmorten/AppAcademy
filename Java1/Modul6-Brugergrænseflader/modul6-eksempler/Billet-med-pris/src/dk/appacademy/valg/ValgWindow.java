package dk.appacademy.valg;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

@SuppressWarnings("serial")
public class ValgWindow extends JFrame {

	public ValgWindow() {
		super("Billet");

		JPanel rootPanel = new JPanel();
		rootPanel.setLayout(new BorderLayout());
		add(rootPanel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(1,3));
		rootPanel.add(BorderLayout.CENTER, mainPanel);
		
		// Tilvalg
		JPanel felter = new JPanel();
		felter.setLayout(new GridLayout(2, 1));
		JCheckBox cykel = new JCheckBox("Cykel");
		JCheckBox barnevogn = new JCheckBox("Barnevogn");
		felter.add(cykel);
		felter.add(barnevogn);
		mainPanel.add(felter);

		// Tur/retur
		JPanel turRetur = new JPanel();
		turRetur.setLayout(new GridLayout(2, 1));
		JRadioButton enkelt = new JRadioButton("Enkelt billet");		
		JRadioButton retur = new JRadioButton("Retur");
		
		enkelt.setSelected(true);
		
		ButtonGroup turReturGroup = new ButtonGroup();
		turReturGroup.add(enkelt);
		turReturGroup.add(retur);
		
		turRetur.add(enkelt);
		turRetur.add(retur);
		mainPanel.add(turRetur);
		
		String[] destinationer = {"København", "Århus", "Fredericia", "Aalborg"};
		JList<String> destination = new JList<>(destinationer);
		destination.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scrollPane = new JScrollPane(destination);
		mainPanel.add(scrollPane);

		// Bestil-knap
		JButton bestil = new JButton("Bestil");
		rootPanel.add(BorderLayout.SOUTH, bestil);
		pack();
		
		bestil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int pris;
				String valgtDestination = destination.getSelectedValue();
				if (valgtDestination == null) {
					JOptionPane.showMessageDialog(ValgWindow.this, "Du skal vælge en destination", "Fejl", JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				if (valgtDestination.equals("København")) {
					pris = 429;
				} else {
					pris = 200;
				}
				
				if (cykel.isSelected()) {
					pris += 25;
				}
				
				if (barnevogn.isSelected()) {
					pris += 35;
				}
					
				
				if (retur.isSelected()) {
					pris = pris * 2;
				}
				
				JOptionPane.showMessageDialog(ValgWindow.this, "Det koster " + pris + " kroner", "Pris", JOptionPane.INFORMATION_MESSAGE);
			}
		});
	}
	
	
	public static void main(String[] args) {
		ValgWindow vindue = new ValgWindow();
		vindue.setVisible(true);
	}

}
