package dk.appacademy.opg431;

public class StatistikModel {
	private int antalJaStemmer;
	private int antalNejStemmer;
	
	public void stemNej() {
		antalNejStemmer++;
	}
	
	public void stemJa() {
		antalJaStemmer++;
	}
	
	public int getAntalJaStemmer() {
		return antalJaStemmer;
	}
	
	public int getAntalNejStemmer() {
		return antalNejStemmer;
	}
}
