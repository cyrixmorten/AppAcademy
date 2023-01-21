import java.io.FileReader;

public class FileNotFoundException {

	public static void main(String[] args) throws java.io.FileNotFoundException {	
		FileReader reader = new FileReader("denne_fil_findes_ikke.txt"); 
	}

}
