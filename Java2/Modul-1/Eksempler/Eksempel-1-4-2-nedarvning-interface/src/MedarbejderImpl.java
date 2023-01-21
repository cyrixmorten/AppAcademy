/*
 * En medarbejder er en lidt mere specifik person. 
 * 
 * Her siger vi at medarbejder tildeles et medarbejderId, og hvilken lønType medarbejderen modtager. 
 * 
 * Hverken medarbejderId eller lønType har Setters idet de ikke er tiltænkt at kunne overskrives. 
 */

public class MedarbejderImpl implements Medarbejder {
	
	private int medarbejderId;
	private Afregning.LØN_TYPE lønType; 
	private Person person;
	
	MedarbejderImpl(Person person, int medarbejderId, Afregning.LØN_TYPE lønType) {
		this.person = person;
		this.medarbejderId = medarbejderId;
		this.lønType = lønType;
	}

	@Override
	public int getMedarbejderId() {
		return medarbejderId;
	}
	
	@Override
	public Afregning.LØN_TYPE getLønType() {
		return lønType;
	}
	
	@Override
	public String getPrintableLønType() {
		switch (lønType) {
			case MÅNEDSLØNNET: {
				return "Måneslønnet";
			}
			case TIMELØNNET: {
				return "Timelønnet";
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + lønType);
			}
	}


	@Override
	public String getNavn() {
		return person.getNavn();
	}


	@Override
	public void setNavn(String navn) {
		person.setNavn(navn);
	}

}
