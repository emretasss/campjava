package week2;

import java.util.Iterator;

public class method {
public static void main(String[] args) {
	
	int [] sayi = new int[] {0,1,2,3,4};
	int aranacak=32;
	for (int i = 0; i < sayi.length;i++) {
		if (aranacak==i) {
			mesajver("sayı mevcut :"+aranacak);
			break;
		}
		else {
			mesajver("sayı mevcut değil :"+aranacak);
			break;
		}
		
	}
}

public static void mesajver(String aranacak)
{
	System.out.println (aranacak);


}

}
