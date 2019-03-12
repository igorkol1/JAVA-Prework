
public class Main7 {

	public static void main(String[] args) {
		int nr1 = 7, nr2 = 4, result;
		result = nr1+nr2;
		System.out.println(result);
		nr1 = 10;
		result = nr1+nr2;
		System.out.println(result); 
		// Wynik jest inny poniewaz zwiekszyliśmy wartość zmiennej nr1 i 
		//ponownie obliczyliśmy result korzystając juz z nowej wartosci zmiennej nr 1 
	}

}
