
import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
		Random generator = new Random();
		int[] randNumbers = new int[100];
		int sum = 0;
		String randNumbersInString="";
		for(int i = 0;i<randNumbers.length-1;i++){
			int randNumber = generator.nextInt(21);
			randNumbers[i] = randNumber;
			sum+=randNumber;
			randNumbersInString+=randNumber+", ";
		}
		System.out.println(randNumbersInString);
		System.out.println("Suma 100 losowych liczb od 0 do 20 to: "+sum);
	}

}
