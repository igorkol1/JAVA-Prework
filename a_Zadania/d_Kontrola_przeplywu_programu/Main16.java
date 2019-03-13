
public class Main16 {

    public static void main(String[] args) {
        int x = 420;
        int y = 168;
        String answer = "Dla liczb "+x+" i "+y+" GDC to: ";
        while (y != 0) {
            int tmp = x;
            x = y;
            y = tmp % y;
        }
        System.out.println(answer+x);
    }

}
