package dk.kortspil;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private JPanel contentPane;
	private Kort aktueltKort;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainView() {
		Kortspil kortspil = new Kortspil();
		kortspil.bland();
		aktueltKort = kortspil.traekKort();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel aktueltKortLabel = new JLabel("New label");
		contentPane.add(aktueltKortLabel, BorderLayout.NORTH);
		
		JButton lavereButton = new JButton("Lavere");
		lavereButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Kort nytKort = kortspil.traekKort();
				if (nytKort.getVaerdi() <= aktueltKort.getVaerdi()) {
					String text = lavTekstTilLabel(nytKort);
					aktueltKort = nytKort;
					aktueltKortLabel.setText(text);
				} else {
					aktueltKortLabel.setText("Det var forkert");
				}
			}
		});
		contentPane.add(lavereButton, BorderLayout.WEST);
		
		JButton hojereButton = new JButton("H\u00F8jere");
		hojereButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Kort nytKort = kortspil.traekKort();
				if (nytKort.getVaerdi() >= aktueltKort.getVaerdi()) {
					String text = lavTekstTilLabel(nytKort);
					aktueltKort = nytKort;
					aktueltKortLabel.setText(text);
				} else {
					aktueltKortLabel.setText("Det var forkert");
				}
				
			}
		});
		contentPane.add(hojereButton, BorderLayout.EAST);
		
		String text = lavTekstTilLabel(aktueltKort);
		aktueltKortLabel.setText(text);

	}

	private String lavTekstTilLabel(Kort kort) {
		return kort.getKulor() + " " + kort.getVaerdi();
		
	}
}
