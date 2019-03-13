
public class Main12 {

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 7;

        if(a + b > c && c + b > a && a + c > b){
            System.out.println("Z podanych boków można zbudować trójkąt.");
        }else{
            System.out.println("Z podanych boków nie można zbudować trójkąta.");
        }
    }

}
