
public class Main8 {

	public static void main(String[] args) {
		int black = 16, white = 15;
		boolean blackOrWhite,goodOrBad,comparison;
		boolean good = true,bad = false;
		blackOrWhite = black < white;
		goodOrBad = good || bad;
		comparison = blackOrWhite && goodOrBad;
		System.out.println(blackOrWhite);
		System.out.println(goodOrBad);
		System.out.println(comparison);
		/*
			Wynik :
			false
			true
			false

			Analiza
			1. Zmienna blackOrWhite = false poniewaz 16 nie jest mniejsze od 15;
			2. Zmienna goodOrBad jest true poniewaz wyrazenie 'prawda lub fałsz' z logiki daje wartość prawda
			3. Zmienna comparison jest false poniewaz wyrazenie 'prawda i fałsz' z logiki daje wartość fałsz
		*/
	}

}
