package dk.appacademy.lommeregner;

public class Controller {
	private Model model;
	private View view;
	
	public void plusKlik() {
		int tal = getTalFraView();
		
		model.plus(tal);
		view.visResultat(model.getResultat());
	}

	private int getTalFraView() {
		String text = view.getText();
		int tal = Integer.parseInt(text);
		return tal;
	}

	public void minusKlik() {
		int tal = getTalFraView();
		
		model.minus(tal);
		view.visResultat(model.getResultat());
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public void setView(View view) {
		this.view = view;
	}
	
	

}
