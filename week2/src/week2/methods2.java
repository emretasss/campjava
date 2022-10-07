package week2;
//Variable Arguments
public class methods2 {
 public static void main(String[] args) {
	int toplanackdizi=diziTopla(0,2,3,4,5,6,3,23);
	System.out.println(toplanackdizi);
 }
 public static int  diziTopla(int... sayi) {
	 int toplam=0;
	 for(int i:sayi)
	 {
		 toplam+=i;
		 
	 }
	 return toplam;
	
}
 
 
}
