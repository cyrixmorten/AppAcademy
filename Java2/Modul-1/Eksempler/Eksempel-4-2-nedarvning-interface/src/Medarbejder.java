	

public interface Medarbejder extends Person {
	public int getMedarbejderId();
	
	public Afregning.LØN_TYPE getLønType();

	public String getPrintableLønType();
}
