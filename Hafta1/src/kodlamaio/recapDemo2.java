package kodlamaio;

public class recapDemo2 {

	public static void main(String[] args) {
		
		double[] myList = {1.2,6.3,4.3,5.6};
			for(double number:myList) {
				System.out.print(number+"\t");
			}
		
		double total = 0;
			for(double number:myList) {
				total += number;
			}
			System.out.println("\nToplam sonucu :"+total);
			
		double max = myList[0];
			for(double number:myList) {
				if(max<number) max=number;
			}
			System.out.println("\nEn buyuk sayi :"+max);
		
	}

}
