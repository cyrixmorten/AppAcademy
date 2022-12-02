import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField breddeTextField;
	private JTextField hojdeTextField;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblBredde = new JLabel("Bredde");
		contentPane.add(lblBredde);
		
		breddeTextField = new JTextField();
		contentPane.add(breddeTextField);
		breddeTextField.setColumns(10);
		
		JLabel lblHjde = new JLabel("H\u00F8jde");
		contentPane.add(lblHjde);
		
		hojdeTextField = new JTextField();
		contentPane.add(hojdeTextField);
		hojdeTextField.setColumns(10);

		JLabel resultatLabel = new JLabel("Resultat");
		contentPane.add(resultatLabel);

		JButton btnBeregn = new JButton("Beregn");
		btnBeregn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int bredde = Integer.parseInt(breddeTextField.getText());
				int hojde = Integer.parseInt(hojdeTextField.getText());
				
				Firkant minFirkant = new Firkant(bredde, hojde);
				
				int areal = minFirkant.getAreal();
				resultatLabel.setText(String.valueOf(areal));
			}
		});
		contentPane.add(btnBeregn);
		
		
	}

}
