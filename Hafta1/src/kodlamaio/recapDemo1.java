package kodlamaio;

public class recapDemo1 {

	public static void main(String[] args) {
		
		int sayi1 = 20 , sayi2 = 25 , sayi3 = 2;
		
		if(sayi1 > sayi2 && sayi1 > sayi3) System.out.println("En buyuk sayi :"+sayi1);
		else if(sayi2 > sayi1 && sayi2 > sayi3) System.out.println("En buyuk sayi :"+sayi2);
		else System.out.println("En buyuk sayi :"+sayi3);;
	
		int enBuyuk = sayi1;
		
		if(enBuyuk < sayi2) enBuyuk = sayi2;
		if(enBuyuk < sayi3) enBuyuk = sayi3;
		
		System.out.println("En buyuk sayi : "+enBuyuk);
	}

}
