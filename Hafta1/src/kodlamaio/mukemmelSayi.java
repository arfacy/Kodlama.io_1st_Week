package kodlamaio;

public class mukemmelSayi {

	public static void main(String[] args) {
		
		int number = 28 , total = 0;
		
			for(int i=1 ; i<=number/2 ; i++) {
				if(number % i == 0) total += i;
			}
			
			if(number == total) System.out.println(number + " sayisi mukemmel sayidir");
			else System.out.println(number + " sayisi mukemmel sayi degildir.");

	}

}
