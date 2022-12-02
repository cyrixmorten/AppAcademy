import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PersonView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonView frame = new PersonView();
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
	public PersonView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNavn = new JLabel("Navn");
		contentPane.add(lblNavn);
		
		JLabel navnLabel = new JLabel("New label");
		contentPane.add(navnLabel);
		
		JLabel lblAlder = new JLabel("Alder");
		contentPane.add(lblAlder);
		
		JLabel alderLabel = new JLabel("New label");
		contentPane.add(alderLabel);
		
		JLabel lblNewLabel = new JLabel("Telefonnummer");
		contentPane.add(lblNewLabel);
		
		JLabel telefonnummerLabel = new JLabel("New label");
		contentPane.add(telefonnummerLabel);
		
		JLabel lblErGift = new JLabel("Er gift");
		contentPane.add(lblErGift);
		
		JLabel giftLabel = new JLabel("New label");
		contentPane.add(giftLabel);
		
		JLabel lblHjdemeter = new JLabel("H\u00F8jde (meter)");
		contentPane.add(lblHjdemeter);
		
		JLabel hojdeLabel = new JLabel("New label");
		contentPane.add(hojdeLabel);
		
		String navn = "Kristian";
		int alder = 29;
		String telefonnummer = "80808080";
		boolean erGift = true;
		double hojde = 1.85;
		
		navnLabel.setText(navn);
		alderLabel.setText(String.valueOf(alder));
		telefonnummerLabel.setText(telefonnummer);
		giftLabel.setText(erGift ? "Ja" : "Nej");
		hojdeLabel.setText(String.valueOf(hojde));
		

	}

}
