import java.util.Arrays;

public class Main8 {

	public static void main(String[] args) {
		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, -15};
		double sum  = 0;
		double avg;
		for (int i = 0;i<temps.length-1;i++){
			temps[i]=temps[i]*1.8+32;
			sum+=temps[i];
		}
		avg = sum/temps.length;
		System.out.println("Średnia temperatura to: "+String.format( "%.2f", avg ));
	}

}
