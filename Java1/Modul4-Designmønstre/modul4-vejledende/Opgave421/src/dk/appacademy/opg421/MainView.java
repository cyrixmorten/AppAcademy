package dk.appacademy.opg421;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {
	private ColorChangeObserver observer;
	
	private JPanel contentPane;

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
		setTitle("Farvev\u00E6lger");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton redButton = new JButton("R\u00F8d");
		redButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				observer.colorChanged(Color.RED);
			}
		});
		panel.add(redButton);
		
		JButton yellowButton = new JButton("Gul");
		yellowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				observer.colorChanged(Color.YELLOW);
			}
		});
		panel.add(yellowButton);
		
		JButton greenButton = new JButton("Gr\u00F8n");
		greenButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				observer.colorChanged(Color.GREEN);
			}
		});
		panel.add(greenButton);
		
		JPanel colorPanel = new JPanel();
		contentPane.add(colorPanel, BorderLayout.CENTER);

		observer = new PanelColorChangeObserver(colorPanel);
		
	}

}
