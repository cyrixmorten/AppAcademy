package dk.appacademy.opg431;

public class StatistikController {
	private StatistikView view;
	private StatistikModel model;
		
	public void klikJa() {
		model.stemJa();
		view.setJaLabel(String.valueOf(model.getAntalJaStemmer())); 
	}
	
	public void klikNej() {
		model.stemNej();
		view.setNejLabel(String.valueOf(model.getAntalNejStemmer())); 
	}
	
	public void setView(StatistikView view) {
		this.view = view;
	}
	
	public void setModel(StatistikModel model) {
		this.model = model;
	}
}
