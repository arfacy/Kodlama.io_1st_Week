package kodlamaio;

public class sayiBulma {

	public static void main(String[] args) {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi = false;
				
			for (int i = 0; i < sayilar.length; i++) {
				if(sayilar[i] == aranacak) {
					varMi = true;
					break;
				}
			}
			
			if(varMi == true) System.out.println("Aranan sayi dizide vardir.");
			else System.out.println("Aranan sayi dizide yoktur.");
	}

}
