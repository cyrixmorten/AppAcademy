
public class NullPointer {

	public static void main(String[] args) {
		
		Object data = null; 

		// kunne forestille sig at programmet forsøger at hente data fra server, men 
		// det fejler, hvormed data variablen forbliver en nullpointer
		
		System.out.println(data.toString());
	}

}
