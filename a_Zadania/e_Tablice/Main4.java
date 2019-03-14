
public class Main4 {

	public static void main(String[] args) {
		int[] numbers = {1,34,56,76,34,46,71,22,90,0};
		int sumOdd = 0;
		for(int i = 0;i<numbers.length;i++){
			if(numbers[i]%2==0){
				System.out.println(numbers[i]);
				
			}else{
				sumOdd+=numbers[i];
			}
		}
		System.out.println("Suma liczb nieparzystych to:"+sumOdd);
	}

}
