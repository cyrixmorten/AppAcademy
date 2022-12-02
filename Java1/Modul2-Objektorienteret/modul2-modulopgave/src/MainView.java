import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField belobTextField;

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
		Bankkonto minKonto = new Bankkonto();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel saldoLabel = new JLabel("Saldo:");
		contentPane.add(saldoLabel, BorderLayout.NORTH);
		
		belobTextField = new JTextField();
		contentPane.add(belobTextField, BorderLayout.CENTER);
		belobTextField.setColumns(10);
		
		JButton haevButton = new JButton("H\u00E6v penge");
		haevButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String text = belobTextField.getText();
				double belob = Double.parseDouble(text);
				minKonto.haevPenge(belob);
				saldoLabel.setText("Saldo: " + minKonto.getSaldo());
			}
		});
		contentPane.add(haevButton, BorderLayout.EAST);
		
		JButton indsaetButton = new JButton("Inds\u00E6t penge");
		indsaetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = belobTextField.getText();
				double belob = Double.parseDouble(text);
				minKonto.indsaetPenge(belob);
				saldoLabel.setText("Saldo: " + minKonto.getSaldo());
				
			}
		});
		contentPane.add(indsaetButton, BorderLayout.WEST);
	}

}
