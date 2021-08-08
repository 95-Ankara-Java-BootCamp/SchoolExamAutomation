import java.util.HashMap;
import java.util.Random;
public class Questions {

	public static int indexOfIntArray(int[] array, int key) {
        int returnvalue = -1;
        for (int i = 0; i < array.length; ++i) {
            if (key == array[i]) {
                returnvalue = i;
                break;
            }
        }
        return returnvalue;
    }
	public static int[] RandomNumbers()
	{
		Random rand = new Random();
		int[] numbers = new int[8];
		int randomSayi;
		int x = 0;
        while (x < 8) {
        	randomSayi = rand.nextInt(14);
            int yoksa = indexOfIntArray(numbers, randomSayi);
            if (yoksa == -1) {
            	numbers[x] = randomSayi;
                x++;
            }
        }
		return numbers;
	}
	public static int[] answer = {2,1,3,2,2,1,3,1,2,3,2,1,3,1};
	public static HashMap<String, Integer>MapExam()
	{
		HashMap<Integer, String> questionMap = new HashMap<Integer, String>();
		questionMap.put(1,"Fatih Sultan Mehmet’in babasý kimdir?\n 1-2. Murat 2-Yýldýrým Beyazýt 3-1. Mehmet");
		questionMap.put(2,"Magna Carta hangi ülkenin kralýyla yapýlmýþ bir sözleþmedir?\n 1-Fransa 2-Ýspanya 3-Ýngiltere");
		questionMap.put(3,"Hangisi periyodik tabloda bulunan bir element deðildir?\n 1-Azot 2-Su 3-Oksijen");
		questionMap.put(4,"Hangisi bir doðal sayýdýr?\n 1- -1 2- 0 3- 2,5");
		questionMap.put(5,"Hangisi tarihteki Türk devletlerinden biri deðildir?\n 1-Avar Kaðanlýðý 2- Hun Ýmparatorluðu 3-Emevi Devleti ");
		questionMap.put(6,"Galatasaray hangi yýl UEFA kupasýný almýþtýr?\n 1-2000 2-2001 3-2002");
		questionMap.put(7,"Kýbrýs Barýþ harekatý hangi tarihte gerçekleþmiþtir?\n 1-1970 2-1972 3-1974");
		questionMap.put(8,"Hangi ülke Asya kýtasýndadýr?\n 1-Singapur 2-Madagaskar 3-Peru");
		questionMap.put(9,"ABD baþkanlarýndan John Fitzgerald Kennedy’e suikast düzenleyerek öldüren kimdir?\n 1-Clay Shaw 2-Jack Ruby 3-Lee Harvey Oswald");
		questionMap.put(10,"Aþaðýdaki hangi Anadolu takýmý Türkiye Süper Liginde þampiyon olmuþtur?\n 1-Eskiþehirspor 2-Bursaspor 3-Kocaelispor");
		questionMap.put(11,"Hangisi Kanuni Sultan Süleyman’ýn eþidir?\n 1-Safiye Sultan 2-Kösem Sultan 3-Hürrem Sultan");
		questionMap.put(12,"Hangisi bir hücrede bulunan organeldir?\n 1-RNA 2-Lizozom 3-DNA");
		questionMap.put(13,"Tarihçilerin Kutbu olarak bilinen dünyaca ünlü tarihçimiz kimdir?\n 1-Ýlber Ortaylý 2-Mehmet Fuat Köprülü 3-Halil Ýnalcýk");
		questionMap.put(14,"Cristiano Ronaldo daha önce hangi futbol takýmýnda oynamýþtýr?\n 1-Manchester United 2-Liverpool 3-Bayern Munich");
		String[] question = new String[8];
		int[] tAnswer = new int[8];
		int[] dizi= RandomNumbers();
		for(int i=0;i<8;i++)
		{
			question[i] =questionMap.get(dizi[i]);
			tAnswer[i]=answer[dizi[i]];
		}	

		HashMap<String, Integer> MapQ = new HashMap<String, Integer>();
		for(int i=0;i<8;i++)
		{
			MapQ.put(question[i], tAnswer[i]);
		}
		return MapQ;
	}	
}

