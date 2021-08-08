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
		questionMap.put(1,"Fatih Sultan Mehmet�in babas� kimdir?\n 1-2. Murat 2-Y�ld�r�m Beyaz�t 3-1. Mehmet");
		questionMap.put(2,"Magna Carta hangi �lkenin kral�yla yap�lm�� bir s�zle�medir?\n 1-Fransa 2-�spanya 3-�ngiltere");
		questionMap.put(3,"Hangisi periyodik tabloda bulunan bir element de�ildir?\n 1-Azot 2-Su 3-Oksijen");
		questionMap.put(4,"Hangisi bir do�al say�d�r?\n 1- -1 2- 0 3- 2,5");
		questionMap.put(5,"Hangisi tarihteki T�rk devletlerinden biri de�ildir?\n 1-Avar Ka�anl��� 2- Hun �mparatorlu�u 3-Emevi Devleti ");
		questionMap.put(6,"Galatasaray hangi y�l UEFA kupas�n� alm��t�r?\n 1-2000 2-2001 3-2002");
		questionMap.put(7,"K�br�s Bar�� harekat� hangi tarihte ger�ekle�mi�tir?\n 1-1970 2-1972 3-1974");
		questionMap.put(8,"Hangi �lke Asya k�tas�ndad�r?\n 1-Singapur 2-Madagaskar 3-Peru");
		questionMap.put(9,"ABD ba�kanlar�ndan John Fitzgerald Kennedy�e suikast d�zenleyerek �ld�ren kimdir?\n 1-Clay Shaw 2-Jack Ruby 3-Lee Harvey Oswald");
		questionMap.put(10,"A�a��daki hangi Anadolu tak�m� T�rkiye S�per Liginde �ampiyon olmu�tur?\n 1-Eski�ehirspor 2-Bursaspor 3-Kocaelispor");
		questionMap.put(11,"Hangisi Kanuni Sultan S�leyman��n e�idir?\n 1-Safiye Sultan 2-K�sem Sultan 3-H�rrem Sultan");
		questionMap.put(12,"Hangisi bir h�crede bulunan organeldir?\n 1-RNA 2-Lizozom 3-DNA");
		questionMap.put(13,"Tarih�ilerin Kutbu olarak bilinen d�nyaca �nl� tarih�imiz kimdir?\n 1-�lber Ortayl� 2-Mehmet Fuat K�pr�l� 3-Halil �nalc�k");
		questionMap.put(14,"Cristiano Ronaldo daha �nce hangi futbol tak�m�nda oynam��t�r?\n 1-Manchester United 2-Liverpool 3-Bayern Munich");
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

