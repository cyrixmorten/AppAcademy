import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class SjovereQuizView extends JFrame {

	private JPanel contentPane;
	private JTextField talTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SjovereQuizView frame = new SjovereQuizView();
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
	public SjovereQuizView() {
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

		int mitTal = new Random().nextInt(10);
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String talString = talTextField.getText();
				int tal = Integer.parseInt(talString);
				if (tal == mitTal) {
					System.out.println("Tillykke! Du gættede rigtigt");
				} else if (tal < mitTal){
					System.out.println("Desværre - det var for lavt");
				} else {
					System.out.println("Desværre - det var for højt");
				}
			}
		});
		contentPane.add(btnOk);
	}

}
