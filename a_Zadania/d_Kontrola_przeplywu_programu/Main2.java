
public class Main2 {

	public static void main(String[] args) {
        int nr1 = 14;
        int nr2 = 12;
        int nr3 = 19;
        if (nr1 > nr2) {
            if (nr1 > nr3) {
                System.out.println("Największa z liczb " + nr1 + ", " + nr2 + ", " + nr3 + " to " + nr1 + ".");
            } else {
                System.out.println("Największa z liczb " + nr1 + ", " + nr2 + ", " + nr3 + " to " + nr3 + ".");
            }
        } else if (nr2 > nr3) {
            System.out.println("Największa z liczb " + nr1 + ", " + nr2 + ", " + nr3 + " to " + nr2 + ".");
        } else {
            System.out.println("Największa z liczb " + nr1 + ", " + nr2 + ", " + nr3 + " to " + nr3 + ".");
        }
	}

}
