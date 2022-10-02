package ders1_odev2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner inport = new Scanner(System.in);
		int b = 1;
		while (b != 0) {
			System.out.println("**************************************");
			System.out.println("secim yapiniz");
			System.out.println("1-asal sayi");
			System.out.println("2-ince ve kalin harf");
			System.out.println("3-mukemmel sayi");
			System.out.println("4-arkadas sayi");
			System.out.println("5-sayi bulma");
			System.out.println("0-cikis");
			System.out.println("**************************************");
			int secim = inport.nextInt();
			switch (secim) {
			case 0:
				System.out.println("******************* Cikis yapildi *******************");
				b = 0;
				break;
			case 1:
				System.out.println("******************* Asal Sayi *******************");
				if (asalSayi()) {
					System.out.println("asal sayi");
				} else
					System.out.println("asal sayi degil");
				break;
			case 2:
				System.out.println("******************* Sesli Harf *******************");
				if (sesliHarfler() == 0) {
					System.out.println("Kalin harf girdiniz");
				} else if (sesliHarfler() == 1) {
					System.out.println("ince harf girdiniz");
				} else {
					System.out.println("Gecersiz karakter girdiniz");
				}
				break;
			case 3:
				System.out.println("******************* Mukemmel Sayi *******************");
				if (mukemmelSayi()) {
					System.out.println("mukemmel sayi");
				} else
					System.out.println("mukemmel sayi degil");

				break;
			case 4:
				System.out.println("******************* Arkadas Sayi *******************");
				if (arkadasSayi()) {
					System.out.println("arkadas sayi");
				} else
					System.out.println("arkadas sayi degil");

				break;
			case 5:
				System.out.println("******************* Sayi bulma *******************");
				if (sayiBulma()) {
					System.out.println("dizide aranan sayi var");
				} else
					System.out.println("dizide aranan sayi yok");

				break;
			default:
				System.out.println("Gecersiz Secim");
				break;
			}
		}
	}

	public static boolean asalSayi() {
		Scanner inport = new Scanner(System.in);
		System.out.println("Lutfen Sayi giriniz");
		int sayi = inport.nextInt();
		boolean kontrol = true;
		if (sayi >= 2)
			for (int i = 2; i <= sayi - 1; i++) {
				if (sayi % i == 0) {
					kontrol = false;
					break;
				}
			}
		else
			kontrol = false;
		return kontrol;
	}

	public static int sesliHarfler() {
		Scanner inport = new Scanner(System.in);
		System.out.println("Lutfen sesli harf giriniz");
		char karakter = inport.next().charAt(0);
		karakter = Character.toUpperCase(karakter);
		int kontrol;

		switch (karakter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			kontrol = 0;
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			kontrol = 1;
			break;
		default:
			kontrol = 2;
		}
		return kontrol;
	}

	public static boolean mukemmelSayi() {
		Scanner inport = new Scanner(System.in);
		System.out.println("Lutfen Sayi giriniz");
		int sayi = inport.nextInt();
		int toplam = 0;
		;
		boolean kontrol = true;
		for (int i = 1; i <= sayi - 1; i++) {
			if (sayi % i == 0) {
				toplam = toplam + i;
			}
		}
		if (toplam == sayi)
			kontrol = true;
		else
			kontrol = false;
		return kontrol;
	}
	public static boolean arkadasSayi() {
		Scanner inport = new Scanner(System.in);
		System.out.println("Lutfen Sayi1'i giriniz");
		int sayi1 = inport.nextInt();
		System.out.println("Lutfen Sayi2'i giriniz");
		int sayi2 = inport.nextInt();
		int toplam1 = 0,toplam2=0;
		;
		boolean kontrol = true;
		for (int i = 1; i <= sayi1 - 1; i++) {
			if (sayi1 % i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		for (int i = 1; i <= sayi2 - 1; i++) {
			if (sayi2 % i == 0) {
				toplam2 = toplam2 + i;
			}
		}
		if (toplam1 == sayi2&& toplam2==sayi1)
			kontrol = true;
		else
			kontrol = false;
		return kontrol;
	}
	public static boolean sayiBulma() {
		int [] dizi= {1,5,7,10,17,15,20,25,32,16,23,48,58,76,43,35,19,21,29,62,67,4,9,2,43,63,61,73,84,86,88,91,92,95,97,100};
		Scanner inport =new Scanner(System.in);
		System.out.println("Lutfen Sayi giriniz");
		int sayi = inport.nextInt();
		boolean kontrol=false;
		for(int i=0;i<dizi.length;i++) {
			if(dizi[i]==sayi) {
				kontrol=true;
				break;
			}
		}
		return kontrol;
	}
}
