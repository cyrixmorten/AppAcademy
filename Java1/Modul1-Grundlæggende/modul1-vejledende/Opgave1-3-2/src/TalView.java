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

public class TalView extends JFrame {

	private JPanel contentPane;
	private JTextField tal1TextField;
	private JTextField tal2TextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TalView frame = new TalView();
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
	public TalView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblSkrivToTal = new JLabel("Skriv to tal:");
		contentPane.add(lblSkrivToTal);
		
		tal1TextField = new JTextField();
		contentPane.add(tal1TextField);
		tal1TextField.setColumns(10);
		
		JLabel lblOg = new JLabel("og");
		contentPane.add(lblOg);
		
		tal2TextField = new JTextField();
		contentPane.add(tal2TextField);
		tal2TextField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String tal1String = tal1TextField.getText();
				double tal1 = Double.parseDouble(tal1String);
				
				String tal2String = tal2TextField.getText();
				double tal2 = Double.parseDouble(tal2String);
				
				System.out.println("Er første tal størst? " + (tal1 > tal2));
			}
		});
		contentPane.add(btnOk);
	}

}
