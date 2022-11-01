package week1;

import java.util.Iterator;

public class Main {
  
	public static void main(String[] args) {
//		int sayi1 = 20;
//		int sayi2 = 25;
//		int sayi3 = 2;
//
//		int enBuyukSayi = sayi1;
//
//		if (enBuyukSayi < sayi2) {
//			enBuyukSayi = sayi2;
//		}
//		if (enBuyukSayi < sayi3) {
//			enBuyukSayi = sayi3;
//		}
//
//		System.out.println("En Buyük = " + enBuyukSayi);
//
//		// reCapDemo2
//
//		double[] myList = { 1.2, 6.3, 4.3, 5.6 };
//		double total = 0;
//		double max = myList[0];
//		for (double number : myList) {
//			if (max < number) {
//				max = number;
//			}
//			total = total + number;
//			System.out.println(number);
//		}
//		System.out.println("Toplam = " + total);
//		System.out.println("En büyük sayý = " + max);
//
//		
//		
//		
//	    //multiDimensionalArrayDemo
//		
//		String[][] sehirler = new String[3][3];
//		
//		sehirler[0][0] = "istanbul";
//		sehirler[0][1] = "Bursa";
//		sehirler[0][2] = "Bilecik";
//		sehirler[1][0] = "Ankara";
//		sehirler[1][1] = "Konya";
//		sehirler[1][2] = "Kayseri";
//		sehirler[2][0] = "Diyarbakýr";
//		sehirler[2][1] = "şanlıurfa";
//		sehirler[2][2] = "Gaziantep";
//		
//		for(int i = 0; i<=2; i++) {
//			System.out.println("------------------------------");
//			for(int j = 0; j<=2; j++) {
//				System.out.println(sehirler[i][j]);
//				
//			}
//		}
//		
//		//Strings Demo
//		
//		String mesaj = "Bugün hava çok güzel.";
//		System.out.println("Eleman sayýsý = " + mesaj.length());
////		System.out.println("5. Eleman = " + mesaj.charAt(4));
////		System.out.println(mesaj.concat(" Yaþasýn!"));
////		System.out.println(mesaj);
////		System.out.println(mesaj.startsWith("B")); //true/false 
////		System.out.println(mesaj.endsWith("."));
////		
////		char[] karakterler = new char[5];
////		mesaj.getChars(0, 5, karakterler,0);
////		System.out.println(karakterler);
//		System.out.println(mesaj.indexOf('a'));
//		System.out.println(mesaj.lastIndexOf('a'));
//		
//		String yeniMesaj = mesaj.replace(' ', '-');
//		System.out.println(yeniMesaj);
//		System.out.println(mesaj.substring(2));
//		System.out.println(mesaj.substring(2, 5));
//
//		for (String kelime : mesaj.split(" ")) {
//			System.out.println(kelime);
//		}
//		
//		System.out.println(mesaj.toLowerCase());
//		System.out.println(mesaj.toUpperCase());
//		
//		System.out.println(mesaj.trim());
//		
//		//asalSayilar
//		
//		int number = 1;
//		int remainder = number % 2;
//		System.out.println(remainder);
//		boolean isPrime = true;
//		
//		if(number == 1) {
//			System.out.println("Sayi asal deðildir.");
//			return;
//		}
//		
//		if(number < 1) {
//			System.out.println("Geçersiz sayý.");
//		}
//		
//		for (int i = 2; i < number; i++) {
//			if(number % i == 0) {
//				isPrime = false;
//			}
//			
//		}
//		
//		if(isPrime) {
//			System.out.println("Sayi asaldýr.");
//		}else {
//			System.out.println("Sayi asal deðildir.");
//		}
//		
		
		//sesliHarfler
		
//		char harf = 'L';
//		
//		switch (harf) {
//		case 'A': 
//		case 'I':
//		case 'O':
//		case 'U':
//			System.out.println("Kalýn sesli harf");
//			break;
//		case 'E': 
//		case 'Ý':
//		case 'Ö':
//		case 'Ü':
//			System.out.println("Ýnce sesli harf");
//			break;
//		default:
//			System.out.println("Sessiz harf");
//		}
		
		//mukemmelSayi
		
//		int mSayi = 28;
//		int total = 0;
//		for (int i = 1; i < mSayi; i++) {
//			if(mSayi % i == 0) {
//			  total = total + i;
//			}
//		}
//		
//		if(total == mSayi) {
//			 System.out.println("Mükemmel sayi.");
//		}else {
//			System.out.println("Mükemmel sayi deðildir.");
//		}
	
		//arkadasSayilar
		
//		int sayi1= 222;
//		int sayi2 = 284;
//		int toplam1 = 0;
//		int toplam2 = 0;
//		
//		for (int i = 1; i <sayi1; i++) {
//			if( sayi1 % i == 0) {
//				toplam1 =  toplam1 + i;
//			}
//		}
//		
//		for (int i = 1; i <sayi2; i++) {
//			if( sayi2 % i == 0) {
//				toplam2 = toplam2 + i;
//			}
//		}
//		
//		if(sayi1 == toplam2 && sayi2 == toplam1) {
//			System.out.println("Arkadaþ sayilardýr.");
//		}
//		else {
//			System.out.println("Arkadaþ sayý deðillerdir.");
//		}
		
		//Sayý bulma
		
//		int[] sayilar = new int[] {1,2,5,7,9,0};
//		int aranacak = 17;
//		boolean varMi = false;
//		for (int sayi : sayilar) {
//			if(aranacak == sayi) {
//				varMi = true;
//				break;
//			}
//		}
//		
//		if(varMi) {
//			System.out.println("Var!");
//		}
//		else {
//			System.out.println("Yok!");
//		}
//		
//		
//		
//		
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
