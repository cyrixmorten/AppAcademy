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

public class KvadratView extends JFrame {

	private JPanel contentPane;
	private JTextField sideTextfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KvadratView frame = new KvadratView();
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
	public KvadratView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblIndtastSidelngde = new JLabel("Indtast sidel\u00E6ngde");
		contentPane.add(lblIndtastSidelngde);
		
		sideTextfield = new JTextField();
		contentPane.add(sideTextfield);
		sideTextfield.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String sideString = sideTextfield.getText();
				double side = Double.parseDouble(sideString);
				System.out.println("Arealet af kvadratet er " + side * side);
			}
		});
		contentPane.add(btnOk);
	}

}
