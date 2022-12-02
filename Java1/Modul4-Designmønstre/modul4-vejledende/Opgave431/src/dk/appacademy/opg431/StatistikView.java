package dk.appacademy.opg431;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StatistikView extends JFrame {

	private JPanel contentPane;
	private JLabel jaLabel;
	private JLabel nejLabel;
	private StatistikController controller;

	
	/**
	 * Create the frame.
	 */
	public StatistikView() {
		setTitle("Statistik");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton jaButton = new JButton("JA");
		jaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controller.klikJa();
			}
		});
		
		
		contentPane.add(jaButton, BorderLayout.WEST);
		
		JButton nejButton = new JButton("NEJ");
		nejButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.klikNej();
			}
		});
		contentPane.add(nejButton, BorderLayout.EAST);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		jaLabel = new JLabel("New label");
		panel.add(jaLabel);
		
		nejLabel = new JLabel("New label");
		panel.add(nejLabel);
	}

	public void setJaLabel(String text) {
		jaLabel.setText(text);
	}

	public void setNejLabel(String text) {
		nejLabel.setText(text);
	}

	public void setController(StatistikController controller) {
		this.controller = controller;
	}
}
