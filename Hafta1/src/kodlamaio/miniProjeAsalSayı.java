package kodlamaio;

public class miniProjeAsalSayı {

	public static void main(String[] args) {
		
		int number = 1;
		boolean isPrime = true;
		
			if(number >= 2) {
			for(int i = 2 ; i <= number/2 ; i++) {
				if(number % i == 0) isPrime = false;
			}
			
			if(isPrime == true) System.out.println("Sayi asaldir.");
			else System.out.println("Sayi asal degildir.");
			}
			
			else if(number == 1) System.out.println("Sayi asal degildir.");
			else System.out.println("Gecersiz sayi");
	}

}
