package banka;

public class Kullaniciadivesifrekontrol {
	private String kullaniciadi="ravza";
	private String sifre="1234";
	
	public boolean kullaniciadikontrol(String girilenkullaniciadi,String girilensifre)
	{
		if(girilenkullaniciadi.equalsIgnoreCase(kullaniciadi))
			{
			if(girilensifre.equalsIgnoreCase(sifre))
				{
				
				return true;
				}
			else
				System.out.println("sifre yanlıs");
			    return false;
			}
		else
				System.out.println("kullanıcı adi yanlıs");return false;
	}
}
	


