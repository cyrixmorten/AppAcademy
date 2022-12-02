package dk.appacademy.opg421;

import java.awt.Color;

import javax.swing.JPanel;

public class PanelColorChangeObserver implements ColorChangeObserver{
	private JPanel panel;
	
	public PanelColorChangeObserver(JPanel panel) {
		this.panel = panel;
	}

	@Override
	public void colorChanged(Color color) {
		panel.setBackground(color);
	}

}
