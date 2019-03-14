
public class Main5 {

	public static void main(String[] args) {
		int[] numbers = {-1,-34,-56,-76,-34,-46,-71,-22,-90,-10};
		int max = numbers[0];
		for(int i = 0;i<numbers.length;i++){
			if(max<numbers[i]){
				max=numbers[i];
				
			}
		}
		System.out.println(max);
	}

}
