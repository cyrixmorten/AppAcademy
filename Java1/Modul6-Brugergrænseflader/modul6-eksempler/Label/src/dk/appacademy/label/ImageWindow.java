package dk.appacademy.label;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageWindow extends JFrame {
	public ImageWindow() {
		super("Image window");
		ImageIcon icon = createImageIcon("/ok.jpg", "OK");
		JLabel label = new JLabel(icon);
		add(label);
		setVisible(true);
		setSize(200,200);
	}
	
	private ImageIcon createImageIcon(String path, String description) {
		java.net.URL imgURL = getClass().getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL, description);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}
	
	public static void main(String[] args) {
		new ImageWindow();
	}
}
