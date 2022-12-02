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

public class KedeligQuizView extends JFrame {

	private JPanel contentPane;
	private JTextField talTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KedeligQuizView frame = new KedeligQuizView();
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
	public KedeligQuizView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("G\u00E6t p\u00E5 et tal");
		contentPane.add(lblNewLabel);
		
		talTextField = new JTextField();
		contentPane.add(talTextField);
		talTextField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String talString = talTextField.getText();
				int tal = Integer.parseInt(talString);
				if (tal == 42) {
					System.out.println("Tillykke! Du gættede rigtigt");
				} else {
					System.out.println("Desværre - det var forkert");
				}
			}
		});
		contentPane.add(btnOk);
	}

}
