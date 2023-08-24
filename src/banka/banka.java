package banka;

import java.util.Scanner;
public class banka {
	
	static int hesaptakipara = 1000;

	public static void main(String[] args) {
		Scanner ad=new Scanner(System.in);
		Scanner sifre= new Scanner(System.in);
		
		String isim;
		String password;
		boolean dogrumu;
		
		System.out.println("\nKullanıcı adı giriniz:");
		isim=ad.nextLine();
     	
		System.out.println("\nŞifreyi girin:");
		password = sifre.nextLine();
		Kullaniciadivesifrekontrol kontrol = new Kullaniciadivesifrekontrol();
		dogrumu = kontrol.kullaniciadikontrol(isim, password);
		if (dogrumu == true) {
			System.out.print("Giris Yapildi.\n");
			System.out.print("Hosgeldiniz " + isim);
			menu();

		} else {
			
				System.out.print("işlem başarısız..");
		}

	}
		
	
	
    
		

	
	public static void menu() {
		Scanner secenekoku = new Scanner(System.in);
		Scanner menuyuoku = new Scanner(System.in);
		Scanner yatırılanparaoku = new Scanner(System.in);
		Scanner cekilenparaoku = new Scanner(System.in);
		
		int secenek, menuyegit, yatırılanpara, cekilenpara;
		

		System.out.print("\n1.HESABIMDAKI PARA\n");
		System.out.print("2.HESABIMA PARA YATIRMA\n");
		System.out.print("3.PARA CEKME\n");
		System.out.print("4.CIKIS\n\n");
		secenek = secenekoku.nextInt();
		
		switch (secenek) 
		{
		case 1:
			
            System.out.print("\nHesabimdaki Para = " + hesaptakipara + " TL\n\n(menu = 0 cikis = 4)\n\n");
			menuyegit = menuyuoku.nextInt();
			fonksiyonmenuyegit(menuyegit);
			break;
		case 2:
			
			System.out.print("\nHesabimdaki Para = " + hesaptakipara+ " TL\n");
			System.out.print("\nYatirmak istediginiz para miktarini giriniz = ");
			yatırılanpara = yatırılanparaoku.nextInt();
			hesaptakipara += yatırılanpara;
			System.out.print("\nISLEM BASARILI!!\n\nGüncel Hesabimdaki Para = "+ hesaptakipara+ " TL\n\n(menu = 0 cikis = 4)\n\n");
			menuyegit = menuyuoku.nextInt();
			fonksiyonmenuyegit(menuyegit);
			break;
		case 3:
			
			System.out.print("\nHesabimdaki Para = " + hesaptakipara+ " TL\n");
			System.out.print("\nCekmek istediginiz para miktarini giriniz = ");
			cekilenpara = cekilenparaoku.nextInt();
			if (hesaptakipara< cekilenpara)
				System.out.print("\nYETERLİ PARA YOK!!");
			else {
				hesaptakipara -= cekilenpara;
				System.out.print("\nISLEM BASARILI!!\n\nGüncel Hesabimdaki Para = "+ hesaptakipara + " TL");
			      }
			System.out.print("\n\n(menu = 0 cikis = 4)\n\n");
			menuyegit = menuyuoku.nextInt();
			fonksiyonmenuyegit(menuyegit);
			break;
		case 4:
			System.out.print("\ncıkıs yapıldı..");
			System.exit(1);/*programı sonlandırmaya yarar*/
			break;
		default:
			System.out.print("1,2,3,4 sayilarindan birini giriniz\n");
			menu();
			break;
		}
	}
	public static void fonksiyonmenuyegit(int menuyegit) {
		
		Scanner menuyegitokuburda=new Scanner(System.in);
		if (menuyegit == 0) {
			
			menu();
		}
		else if (menuyegit == 5) {
			
			System.out.print("\ncıkıs yapıldı..");
			System.exit(1);
		}
		else 
			{
			System.out.print("\nyanlıs giris yaptınız");
			System.out.print("\n\n(menu = 0 cikis = 4)\n\n");
			menuyegit = menuyegitokuburda.nextInt();
			fonksiyonmenuyegit(menuyegit);
			}
	}
}
		
		
		
			

			

	


