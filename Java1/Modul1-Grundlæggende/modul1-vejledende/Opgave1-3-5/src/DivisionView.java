import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class DivisionView extends JFrame {

	private JPanel contentPane;
	private JTextField talTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisionView frame = new DivisionView();
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
	public DivisionView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblIndtastEtTal = new JLabel("Indtast et tal:");
		contentPane.add(lblIndtastEtTal);
		
		talTextField = new JTextField();
		contentPane.add(talTextField);
		talTextField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String talString = talTextField.getText();
				int tal = Integer.parseInt(talString);
				
				System.out.println("Resultatet er " + (5 / tal));
				// Resultatet bliver altid et helt tal (rundet ned), fordi vi deler to hele tal med hinanden
				// Skulle det virke med decimaler, skulle vi bruge double i stedet
			}
		});
		contentPane.add(btnOk);
	}

}
