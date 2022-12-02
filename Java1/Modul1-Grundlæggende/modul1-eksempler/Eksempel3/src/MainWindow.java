import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;

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
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnKlikHer = new JButton("Klik her");
		btnKlikHer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double a = 100;
				double b = 22;
				double resultat = 0;
				
				resultat = a + b;
				System.out.println("Plus: " + resultat);
				
				resultat = a - b;
				System.out.println("Minus: " + resultat);
				
				resultat = a * b;
				System.out.println("Gange: " + resultat);
				
				resultat = a / b;
				System.out.println("Division: " + resultat);
				
			}
		});
		contentPane.add(btnKlikHer, BorderLayout.CENTER);
	}

}
