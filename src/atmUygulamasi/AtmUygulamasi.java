package atmUygulamasi;

import java.util.Scanner;

public class AtmUygulamasi {

	public static void main(String[] args) {
	      String userName, password;
	      Scanner scanner = new Scanner(System.in);
	      int right =3;
	      int balance = 1500;
	      int select;
	      while (right >0) {
			System.out.print("Kullanici adiniz: ");
			userName = scanner.nextLine();
			System.out.print("Parolaniz: ");
			password = scanner.nextLine();
			
			
			if (userName.equals("Merve")&& password.equals("Merve123")) {
				System.out.println("Merhaba X Bankasina Hosgeldiniz");
				
				do {
					System.out.println("1- Para yatirma\n"+
				                       "2- Para cekme\n"+
							           "3- Bakiye sorgula\n"+
				                       "4- Cikis yap");
					System.out.println("Lutfen yapmak istediginiz islemi seciniz: ");
					
					select = scanner.nextInt();
					if (select == 1) {
						System.out.println("Para miktari: ");
						int price = scanner.nextInt();
						balance +=price;
					} else if (select == 2) {
						System.out.print("Para miktari: ");
						int price = scanner.nextInt();
						if (price > balance) {
							System.out.println("Bakiyeniz yetersiz.");
							
						} else {
							balance -= price;
						}
					} else if (select == 3) {
						System.out.println("Bakiyeniz: " + balance);
						
					}
					
				} while (select != 4);
				System.out.println("Tekrar gorusmek uzere.");
				break;
				
			} else {
				right --;
				System.out.println("Hatali kullanici adi veya sifre girdiniz. Tekrar deneyiniz");
				if (right == 0) {
					System.out.println("Hesabiniz bloke olmustur. Lutfen musteri hizmetleri ile iletisime geciniz.");
					
				} else {
					System.out.println("Kalan hakkiniz: " + right);
				}
			}
			
		}
	

	}

}
