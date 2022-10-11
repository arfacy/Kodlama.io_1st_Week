package kodlamaio;

public class loopDemo {

	public static void main(String[] args) {
		
		//for
			for(int i=0 ; i<=10 ; i++) System.out.print(i);
			System.out.println("\nfor dongusu bitti");
		
			for(int i=1 ; i<=10 ; i+=2) System.out.print(i);
			System.out.println("\nfor dongusu 2 bitti");
		
			
		//while
		int a=1;
			
			while(a<10) {
				System.out.print(a);
				a+=2;
			}
			System.out.println("\nwhile dongusu bitti");
		
		
		//do while
		int b=0;
			do {
				System.out.print(b);
				b++;
			} while (b<10);
			System.out.println("\nDo while dongusu bitti");
		
	}

}
