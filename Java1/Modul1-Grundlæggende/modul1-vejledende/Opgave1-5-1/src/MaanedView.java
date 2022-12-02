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

public class MaanedView extends JFrame {

	private JPanel contentPane;
	private JTextField maanedTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MaanedView frame = new MaanedView();
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
	public MaanedView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Indtast nummeret på en måned (1-12)");
		contentPane.add(lblNewLabel);
		
		maanedTextField = new JTextField();
		contentPane.add(maanedTextField);
		maanedTextField.setColumns(10);
		
		String[] maaneder = {"Januar", "Februar", "Marts", "April", "Maj", "Juni", "Juli", "August", "September", "Oktober", "November", "December" };
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String maanedString = maanedTextField.getText();
				int maaned = Integer.parseInt(maanedString);
				if (maaned < 1 || maaned > 12) {
					System.out.println("Ugyldig måned");
				} else {
					System.out.println(maaneder[maaned-1]);
					// Husk -1 fordi månedsnummeret starter ved 1, men arrayet starter ved 0
				}
			}
		});
		contentPane.add(btnOk);
	}

}
