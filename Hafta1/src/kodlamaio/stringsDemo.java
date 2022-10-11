package kodlamaio;

import java.util.Iterator;

public class stringsDemo {

	public static void main(String[] args) {
		
		String mesaj = "Bugun hava cok guzel.";
		
			System.out.println(mesaj);
		
		/*	System.out.println("Eleman sayisi :" + mesaj.length()); //Karakter sayisini yazdirir.
			System.out.println("5. eleman :" + mesaj.charAt(4)); //Metnin 4. indisindeki elemanı yazdırır.
			System.out.println(mesaj.concat(" Yasasin!")); //2 strng ifadeyi birleştirir.Parantez içi tırnakla yazılan cümle de olabilir,atılmış değişken de yazılabilir.
			System.out.println(mesaj); //concat fonksiyonu mesaj değişkenini değiştirmez.);
			System.out.println(mesaj.startsWith("B")); //sonuç booleandır.parantez içine girilen karakter ile başlıyor mu cevabını verir.
			System.out.println(mesaj.endsWith("a"));   //tek tırnak değil çift tırnak kullan
			
		char[] karakterler = new char[5];
			mesaj.getChars(0, 5,karakterler , 0); //mesaj stringindeki karakterleri kaçtan kopyalamaya başlayayım,kaç karakter kopyalayayım,hangi char değişkenine atayayım,atadığım değişkenin kaçıncı karakterinden başlayayım.
			System.out.println(karakterler);	  //getChars ilk virgülden sonraki kısıma indeks sayısı değil kaçıncı karaktere kadar kopyalanması gerektiği yazılmalıdır.
			
			System.out.println(mesaj.indexOf('a')); //girilen karakter kaçıncı indekste,aramaya baştan başlar.Tek çift tırnak fark etmez.
			System.out.println(mesaj.lastIndexOf('e'));*/ //sondan aramaya başlar,baştan kaçıncı indeks olduğunu yazar.
		
		String yeniMesaj = mesaj.replace(' ', '-'); //İlgili metindeki bazı karakterleri değiştirebiliriz.
			System.out.println(yeniMesaj);
			System.out.println(mesaj.substring(2)); //Yazılan indeksten itibaren yazdırır.
			System.out.println(mesaj.substring(2,7)); //Yazılan indeksler arasındaki karakterleri yazdırır.Başlangıç dahildir,bitiş dahil değildir.
			
			for(String kelime : mesaj.split(" ")) { //Parantez içine girilen karakteri dikkate alarak metni böler ve soldaki karakter yazısına atar.for ile yazdırırız.
				System.out.println(kelime);
			}
			
			System.out.println(mesaj.toLowerCase()); //metindeki büyük harfleri küçük harfe çevirir.
			System.out.println(mesaj.toUpperCase()); //Metindeki küçük haaarfleri büyük harfe çevirir.
			System.out.println(mesaj.trim()); //Metnin başındaki ve sonundaki boşlukları atar.
			
			
	}

}
