package dk.appacademy.opg431;

public class Main {
	public static void main(String[] args) {
		StatistikModel model = new StatistikModel();
		StatistikController controller = new StatistikController();
		StatistikView view = new StatistikView();
		
		controller.setModel(model);
		controller.setView(view);
		view.setController(controller);
		
		view.setVisible(true);
	}
}
