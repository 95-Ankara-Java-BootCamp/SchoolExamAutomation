import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
public class MainClass {
	public static Scanner scan = new Scanner(System.in);
	public static Questions QuestionGet = new Questions();
	public static String UserInformation()
	{
		System.out.println("Adýnýzý Girin:");
	    String username = scan.nextLine();
	    return username;
	}
	public static String[] Shaking(int category)
	{
		return null;
	}	
	public static void main(String[] args) {	
		String isim = UserInformation();
		int dogru=0;
		int yanlis=0;
		HashMap<String, Integer> questionMap = new HashMap<String, Integer>();
		questionMap=QuestionGet.MapExam();
		for (String i : questionMap.keySet()) {
			  System.out.println(i + " value: " + questionMap.get(i));
			    int cevap = scan.nextInt();
			    if(cevap==questionMap.get(i))
			    {
			    	dogru++;
			    }
			    else
			    {
			    	yanlis++;
			    }
			}
		System.out.println(isim +"= Doðru Sayýsý: " + dogru + "Yanlýþ Sayýsý "+yanlis);
	}

}
