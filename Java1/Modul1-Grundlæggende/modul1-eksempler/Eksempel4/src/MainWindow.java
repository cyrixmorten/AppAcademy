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

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField timerTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
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
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHvadErKlokken = new JLabel("Hvad er klokken?");
		lblHvadErKlokken.setBounds(10, 11, 81, 14);
		contentPane.add(lblHvadErKlokken);
		
		timerTextField = new JTextField();
		timerTextField.setBounds(102, 8, 86, 20);
		contentPane.add(timerTextField);
		timerTextField.setColumns(10);

		JLabel resultatLabel = new JLabel("Her kommer resultatet");
		resultatLabel.setBounds(10, 76, 124, 14);

		JButton okButton = new JButton("OK");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int timetal = Integer.parseInt(timerTextField.getText());
				if (timetal < 12) {
					resultatLabel.setText("Godmorgen");
				} else if (timetal < 18) {
					resultatLabel.setText("God eftermiddag");
				} else {
					resultatLabel.setText("God aften");
				}
			}
		});
		okButton.setBounds(10, 38, 89, 23);
		contentPane.add(okButton);
		
		contentPane.add(resultatLabel);
	}
}
