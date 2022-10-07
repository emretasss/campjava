package week2;
import java.util.*;
public class ReCapdemo {
public static void main(String[] args) {
	Scanner next =new Scanner(System.in);
	ReCapclass recap=new ReCapclass();
	double sayi1,sayi2;
	System.out.println("1.sayiyi giriniz");
	sayi1=next.nextDouble();
	System.out.println("2.sayiyi giriniz");
	sayi2=next.nextDouble();
	
	System.out.println("toplamları :"+recap.toplama(sayi1, sayi2));
	System.out.println("cıkarma :"+recap.cıkarma(sayi1, sayi2));
	System.out.println("carpma :"+recap.carp(sayi1, sayi2));
	System.out.println("bolme :"+recap.bol(sayi1, sayi2));

}
}
