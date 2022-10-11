package kodlamaio;

public class arraysDemo {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		//ogrenciler[4] = "Ali";
		
		for(int i=0 ; i<ogrenciler.length ; i++) {
			System.out.println((i+1)+". eleman : "+ogrenciler[i]);
		}
		
		for(String ogrenci:ogrenciler) {//Yukarıdaki kullanımın aynısıdır.ogerenci kısmını istediğin şey yazılabilir.
			System.out.println(ogrenci);
		}

	}

}
