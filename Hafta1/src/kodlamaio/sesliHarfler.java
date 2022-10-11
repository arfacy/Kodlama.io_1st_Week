package kodlamaio;

public class sesliHarfler {

	public static void main(String[] args) {
		
		char harf = 'A';
		
			switch(harf) {
			
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalin sesli harftir");
				break;
			default:
				System.out.println("Ince sesli harftir.");
			}

	}

}
